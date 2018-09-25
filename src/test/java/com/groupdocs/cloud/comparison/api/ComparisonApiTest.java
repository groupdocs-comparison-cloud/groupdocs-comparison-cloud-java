/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="ComparisonApiTest.java">
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
import com.groupdocs.cloud.comparison.model.Link;
import com.groupdocs.cloud.comparison.model.requests.ComparisonImagesRequest;
import com.groupdocs.cloud.comparison.model.requests.ComparisonImagesStreamRequest;
import com.groupdocs.cloud.comparison.model.requests.ComparisonRequest;
import com.groupdocs.cloud.comparison.model.requests.ComparisonStreamRequest;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.io.File;
import java.util.List;

/**
 * API tests for ComparisonApi
 */
@Ignore
public class ComparisonApiTest extends TestsSetter {

    /**
     * Returns document with the result of comparison
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void comparisonTest() throws ApiException {
        ComparisonRequest request = new ComparisonRequest();
        String outPath = "result.docx",
                sourceName = "source.docx",
                targetName = "target.docx";

        request.setRequest(GetComparisonRequest(sourceName, targetName));
        request.setOutPath(outPath);

        Link response = comparisonApi.comparison(request);
        Assert.assertNotNull(response);
        Assert.assertTrue(response instanceof Link);
    }

    /**
     * Returns images of document with the result of comparison
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void comparisonImagesTest() throws ApiException {
        String outPath = "result.docx",
                sourceName = "source.docx",
                targetName = "target.docx";
        ComparisonImagesRequest request = new ComparisonImagesRequest();
        request.setRequest(GetComparisonRequest(sourceName, targetName));
        request.setOutFolder(outPath);
        List<Link> response = comparisonApi.comparisonImages(request);
        for (Link link : response) {
            Assert.assertNotNull(link);
            Assert.assertTrue(link instanceof Link);
        }
    }

    /**
     * Returns image&#39;s streams of document with the result of comparison
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void comparisonImagesStreamTest() throws ApiException {
        String sourceName = "source.docx",
                targetName = "target.docx";
        ComparisonImagesStreamRequest request = new ComparisonImagesStreamRequest();
        request.setRequest(GetComparisonRequest(sourceName, targetName));
        File response = comparisonApi.comparisonImagesStream(request);
        Assert.assertNotNull(response);
        Assert.assertTrue(response instanceof File);
    }

    /**
     * Returns stream of document with the result of comparison
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void comparisonStreamTest() throws ApiException {
        String sourceName = "source.docx",
                targetName = "target.docx";
        ComparisonStreamRequest request = new ComparisonStreamRequest();
        request.setRequest(GetComparisonRequest(sourceName, targetName));
        File response = comparisonApi.comparisonStream(request);
        Assert.assertNotNull(response);
        Assert.assertTrue(response instanceof File);
    }

}
