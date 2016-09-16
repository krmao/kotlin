/*
 * Copyright 2010-2016 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.backend.jvm.lower

import org.jetbrains.kotlin.ir.IrStatement
import org.jetbrains.kotlin.ir.declarations.IrClass
import org.jetbrains.kotlin.ir.declarations.IrDeclaration
import org.jetbrains.kotlin.ir.declarations.IrFile
import org.jetbrains.kotlin.ir.declarations.IrProperty
import org.jetbrains.kotlin.ir.visitors.IrElementTransformerVoid
import org.jetbrains.kotlin.ir.visitors.transformChildrenVoid
import org.jetbrains.kotlin.utils.addIfNotNull
import java.util.*

class PropertiesLowering : IrElementTransformerVoid {
    fun lower(irFile: IrFile) {
        irFile.transformChildrenVoid(this)
    }

    override fun visitFile(declaration: IrFile): IrFile {
        declaration.transformChildrenVoid(this)
        transformDeclarations(declaration.declarations)
        return declaration
    }

    override fun visitClass(declaration: IrClass): IrStatement {
        declaration.transformChildrenVoid(this)
        transformDeclarations(declaration.declarations)
        return declaration
    }

    private fun transformDeclarations(declarations: MutableList<IrDeclaration>) {
        val properties = linkedSetOf<IrProperty>()

        declarations.filterIsInstanceTo(properties)

        declarations.removeAll(properties)

        properties.flatMapTo(declarations) { irProperty ->
            val result = ArrayList<IrDeclaration>(3)
            result.addIfNotNull(irProperty.backingField)
            result.addIfNotNull(irProperty.getter)
            result.addIfNotNull(irProperty.setter)
            result
        }
    }
}
