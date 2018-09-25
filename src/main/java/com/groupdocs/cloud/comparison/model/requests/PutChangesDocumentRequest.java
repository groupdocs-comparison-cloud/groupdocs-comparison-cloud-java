/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PutChangesDocumentRequest.java">
 *   Copyright (c) 2003-2018 Aspose Pty Ltd
 * </copyright>
 * <summary>
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */

package com.groupdocs.cloud.comparison.model.requests;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import com.groupdocs.cloud.comparison.model.ComparisonRequest;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request model for putChangesDocument method.
 */
public class PutChangesDocumentRequest {
    @SerializedName("request")
    private com.groupdocs.cloud.comparison.model.ComparisonRequest request = null;

    @SerializedName("outPath")
    private String outPath = null;

    /**
     * The request.
     * @return The request.
     **/
    @ApiModelProperty(example = "new ComparisonRequest()", value = "The request.")
    public com.groupdocs.cloud.comparison.model.ComparisonRequest getRequest() {
        return request;
    }

    public void setRequest(com.groupdocs.cloud.comparison.model.ComparisonRequest request) {
        this.request = request;
    }

    /**
     * outPath: path to output document on file storage
     * @return outPath: path to output document on file storage
     **/
    @ApiModelProperty(example = "outPath_example", value = "outPath: path to output document on file storage")
    public String getOutPath() {
        return outPath;
    }

    public void setOutPath(String outPath) {
        this.outPath = outPath;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        PutChangesDocumentRequest request = (PutChangesDocumentRequest) o;
        return Objects.equals(this.request, request.request) &&
                Objects.equals(this.outPath, request.outPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(request, outPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutChangesDocument {\n");
        sb.append("    request: ").append(toIndentedString(request)).append("\n");
        sb.append("    outPath: ").append(toIndentedString(outPath)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
