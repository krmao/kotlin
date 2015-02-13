/*
 * Copyright 2010-2015 JetBrains s.r.o.
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

package org.jetbrains.kotlin.idea.imports;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.JetTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/editor/optimizeImports")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class OptimizeImportsTestGenerated extends AbstractOptimizeImportsTest {
    public void testAllFilesPresentInOptimizeImports() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("idea/testData/editor/optimizeImports"), Pattern.compile("^([^\\.]+)$"), false);
    }

    @TestMetadata("AlreadyOptimized")
    public void testAlreadyOptimized() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/AlreadyOptimized/");
        doTest(fileName);
    }

    @TestMetadata("ArrayAccessExpression")
    public void testArrayAccessExpression() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/ArrayAccessExpression/");
        doTest(fileName);
    }

    @TestMetadata("ClassMemberImported")
    public void testClassMemberImported() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/ClassMemberImported/");
        doTest(fileName);
    }

    @TestMetadata("ComponentFunction")
    public void testComponentFunction() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/ComponentFunction/");
        doTest(fileName);
    }

    @TestMetadata("CurrentPackage")
    public void testCurrentPackage() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/CurrentPackage/");
        doTest(fileName);
    }

    @TestMetadata("DefaultJsImports")
    public void testDefaultJsImports() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/DefaultJsImports/");
        doTest(fileName);
    }

    @TestMetadata("DuplicatedImports")
    public void testDuplicatedImports() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/DuplicatedImports/");
        doTest(fileName);
    }

    @TestMetadata("Enums")
    public void testEnums() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/Enums/");
        doTest(fileName);
    }

    @TestMetadata("InvokeFunction")
    public void testInvokeFunction() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/InvokeFunction/");
        doTest(fileName);
    }

    @TestMetadata("IteratorFunction")
    public void testIteratorFunction() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/IteratorFunction/");
        doTest(fileName);
    }

    @TestMetadata("JavaStaticField")
    public void testJavaStaticField() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/JavaStaticField/");
        doTest(fileName);
    }

    @TestMetadata("KotlinPackage")
    public void testKotlinPackage() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/KotlinPackage/");
        doTest(fileName);
    }

    @TestMetadata("Kt1850FullQualified")
    public void testKt1850FullQualified() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/Kt1850FullQualified/");
        doTest(fileName);
    }

    @TestMetadata("Kt1850InnerClass")
    public void testKt1850InnerClass() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/Kt1850InnerClass/");
        doTest(fileName);
    }

    @TestMetadata("Kt2488EnumEntry")
    public void testKt2488EnumEntry() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/Kt2488EnumEntry/");
        doTest(fileName);
    }

    @TestMetadata("Kt2709")
    public void testKt2709() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/Kt2709/");
        doTest(fileName);
    }

    @TestMetadata("MembersInScope")
    public void testMembersInScope() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/MembersInScope/");
        doTest(fileName);
    }

    @TestMetadata("PartiallyQualified")
    public void testPartiallyQualified() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/PartiallyQualified/");
        doTest(fileName);
    }

    @TestMetadata("RemoveImportsIfGeneral")
    public void testRemoveImportsIfGeneral() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/RemoveImportsIfGeneral/");
        doTest(fileName);
    }

    @TestMetadata("RemoveImportsIfGeneralBefore")
    public void testRemoveImportsIfGeneralBefore() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/RemoveImportsIfGeneralBefore/");
        doTest(fileName);
    }

    @TestMetadata("SamConstructor")
    public void testSamConstructor() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/SamConstructor/");
        doTest(fileName);
    }

    @TestMetadata("UnusedImports")
    public void testUnusedImports() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/UnusedImports/");
        doTest(fileName);
    }

    @TestMetadata("WithAliases")
    public void testWithAliases() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("idea/testData/editor/optimizeImports/WithAliases/");
        doTest(fileName);
    }
}
