/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd">
 * Copyright (c) Aspose Pty Ltd
 * </copyright>
 * <summary>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */
package com.groupdocs.cloud.comparison.api;

import com.groupdocs.cloud.comparison.client.ApiException;
import com.groupdocs.cloud.comparison.model.ChangeInfo;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;

public class PutChangesApiTests extends BaseApiTest {

    @Test
    public void putChangesWord() throws ApiException, FileNotFoundException {
        File sourceFile = getTestFile(TestFiles.SourceWord);
        File targetFile = getTestFile(TestFiles.TargetWord);
        PutChangesRequest request = new PutChangesRequest(sourceFile, Arrays.asList(targetFile));

        List<ChangeInfo> changeList = compareApi.putChanges(request);

        assertNotNull(changeList);
        assertTrue(changeList.size() > 0);
    }

    @Test
    public void putChangesWordMulti() throws ApiException, FileNotFoundException {
        File sourceFile = getTestFile(TestFiles.SourceWord);
        File targetFile1 = getTestFile(TestFiles.TargetWord);
        File targetFile2 = getTestFile(TestFiles.TargetWord1);
        File targetFile3 = getTestFile(TestFiles.TargetWord2);
        PutChangesRequest request = new PutChangesRequest(sourceFile, Arrays.asList(targetFile1, targetFile2, targetFile3));

        List<ChangeInfo> changeList = compareApi.putChanges(request);

        assertNotNull(changeList);
        assertTrue(changeList.size() > 0);
    }

    @Test
    public void putChangesPdf() throws ApiException, FileNotFoundException {
        File sourceFile = getTestFile(TestFiles.SourcePdf);
        File targetFile = getTestFile(TestFiles.TargetPdf);
        PutChangesRequest request = new PutChangesRequest(sourceFile, Arrays.asList(targetFile));

        List<ChangeInfo> changeList = compareApi.putChanges(request);

        assertNotNull(changeList);
        assertTrue(changeList.size() > 0);
    }

    @Test
    public void putChangesWithChangeType() throws ApiException, FileNotFoundException {
        File sourceFile = getTestFile(TestFiles.SourceWord);
        File targetFile = getTestFile(TestFiles.TargetWord);
        PutChangesRequest request = new PutChangesRequest(sourceFile, Arrays.asList(targetFile));
        request.setchangeType("Inserted");

        List<ChangeInfo> changeList = compareApi.putChanges(request);

        assertNotNull(changeList);
    }

    @Test
    public void putChangesMissingSourceFile() {
        PutChangesRequest request = new PutChangesRequest();
        request.settargetFiles(Arrays.asList(new File("target.docx")));

        try {
            compareApi.putChanges(request);
            fail("Expected ApiException for missing sourceFile");
        } catch (ApiException e) {
            assertTrue(e.getMessage().contains("sourceFile"));
        }
    }

    @Test
    public void putChangesMissingTargetFiles() throws FileNotFoundException {
        File sourceFile = getTestFile(TestFiles.SourceWord);
        PutChangesRequest request = new PutChangesRequest();
        request.setsourceFile(sourceFile);

        try {
            compareApi.putChanges(request);
            fail("Expected ApiException for missing targetFiles");
        } catch (ApiException e) {
            assertTrue(e.getMessage().contains("targetFiles"));
        }
    }
}
