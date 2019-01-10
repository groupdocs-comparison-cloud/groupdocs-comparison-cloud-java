/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="ChangesApiTest.java">
 * Copyright (c) 2003-2018 Aspose Pty Ltd
 * </copyright>
 * <summary>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
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
import com.groupdocs.cloud.comparison.model.ComparisonChange;
import com.groupdocs.cloud.comparison.model.ComparisonChangesCategoryDto;

import java.io.File;

import com.groupdocs.cloud.comparison.model.Link;
import com.groupdocs.cloud.comparison.model.requests.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Ignore;

import java.util.List;

/**
 * API tests for ChangesApi
 */

public class ChangesApiTest extends TestsSetter {


    /**
     * Posts the categories changes.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postCategoriesChangesTest() throws ApiException {
        String outPath = "result.docx",
                sourceName = "source.docx",
                targetName = "target.docx";
        PostCategoriesChangesRequest request = new PostCategoriesChangesRequest();
        request.setRequest(GetComparisonRequest(sourceName, targetName));
        request.setCategoriesType("ByNodeType");
        List<ComparisonChangesCategoryDto> response = changesApi.postCategoriesChanges(request);
        for (ComparisonChangesCategoryDto comparisonChangesCategoryDto : response) {
            Assert.assertNotNull(comparisonChangesCategoryDto);
            Assert.assertTrue(comparisonChangesCategoryDto instanceof ComparisonChangesCategoryDto);
        }
    }

    /**
     * Returns json result with set of changes between documents
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postChangesTest() throws ApiException {
        String sourceName = "source.docx",
                targetName = "target.docx";
        PostChangesRequest request = new PostChangesRequest();
        request.setRequest(GetComparisonRequest(sourceName, targetName));
        List<ComparisonChange> response = changesApi.postChanges(request);
        for (ComparisonChange comparisonChange : response) {
            Assert.assertNotNull(comparisonChange);
            Assert.assertTrue(comparisonChange instanceof ComparisonChange);
        }
    }

    /**
     * Applies changes to the document and returns document with the result of comparison
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putChangesDocumentTest() throws ApiException {
        String outPath = "result.docx",
                sourceName = "source.docx",
                targetName = "target.docx";
        PutChangesDocumentRequest request = new PutChangesDocumentRequest();
        request.setRequest(GetComparisonRequest(sourceName, targetName));
        request.setOutPath(outPath);
        Link response = changesApi.putChangesDocument(request);
        Assert.assertNotNull(response);
        Assert.assertTrue(response instanceof Link);
    }

    /**
     * Applies changes to the document and returns stream of document with the result of comparison
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putChangesDocumentStreamTest() throws ApiException {
        String  sourceName = "source.docx",
                targetName = "target.docx";
        PutChangesDocumentStreamRequest request = new PutChangesDocumentStreamRequest();
        request.setRequest(GetComparisonRequest(sourceName, targetName));
        File response = changesApi.putChangesDocumentStream(request);
        Assert.assertNotNull(response);
        Assert.assertTrue(response instanceof File);
    }

    /**
     * Applies changes to the document and returns images of document with the result of comparison
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putChangesImagesTest() throws ApiException {
        String outPath = "result.docx",
                sourceName = "source.docx",
                targetName = "target.docx";
        PutChangesImagesRequest request = new PutChangesImagesRequest();
        request.setRequest(GetComparisonRequest(sourceName,targetName));
        request.setOutFolder(outPath);
        List<Link> response = changesApi.putChangesImages(request);
        for (Link link : response) {
            Assert.assertNotNull(link);
            Assert.assertTrue(link instanceof Link);
        }
    }

    /**
     * Applies changes to the document and returns image&#39;s streams of document with the result of comparison
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void putChangesImagesStreamTest() throws ApiException {
        PutChangesImagesStreamRequest request = new PutChangesImagesStreamRequest();
        request.setRequest(GetComparisonRequest("source.docx", "target.docx"));
        Object response = changesApi.putChangesImagesStream(request);
        Assert.assertTrue(response instanceof File);
    }

}
