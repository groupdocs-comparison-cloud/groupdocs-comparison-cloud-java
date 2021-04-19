/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd">
 * Copyright (c) 2003-2021 Aspose Pty Ltd
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

import com.groupdocs.cloud.comparison.model.*;
import com.groupdocs.cloud.comparison.model.requests.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.groupdocs.cloud.comparison.client.ApiException;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * API tests for ComparisonApi
 */
public class InfoApiTests extends BaseApiTest
{

    /**
     * Retrieves list of supported file formats.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSupportedFileFormatsTest() throws ApiException
    {
        FormatsResult response = infoApi.getSupportedFileFormats();

        assertTrue(response.getFormats().size() > 0);
        for (Format format : response.getFormats())
        {
            assertFalse(format.getFileFormat() == null);
            assertFalse(format.getFileFormat().isEmpty());
            assertFalse(format.getExtension() == null);
            assertFalse(format.getExtension().isEmpty());
        }
    }

    @Test
    public void getInfoReturnsFileNotFoundTest()
    {
        // Arrange
        GetDocumentInfoRequest request = new GetDocumentInfoRequest(TestFiles.NotExist.ToFileInfo());

        // Act & Assert  
        try {
            infoApi.getDocumentInfo(request);
            fail("Expected ApiException was not thrown.");
        } catch (ApiException ex) {
            assertEquals("Can't find file located at 'some-folder\\NotExist.docx'.", ex.getMessage());
        }  
    }

    @Test
    public void getInfoTest() throws ApiException
    {
        // Arrange
        GetDocumentInfoRequest request = new GetDocumentInfoRequest(TestFiles.SourceWord.ToFileInfo());
        
        // Act & Assert  
        InfoResult result = infoApi.getDocumentInfo(request);
        assertEquals((Integer)1, result.getPageCount());
    }    
}