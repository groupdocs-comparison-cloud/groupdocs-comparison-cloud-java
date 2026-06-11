/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PutChangesRequest.java">
 *   Copyright (c) Aspose Pty Ltd
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

import java.io.File;
import java.util.List;

/**
 * Request model for putChanges operation.
 */
public class PutChangesRequest {
    private File sourceFile;
    private List<File> targetFiles;
    private String settings;
    private String changeType;

    public PutChangesRequest() {
    }

    public PutChangesRequest(File sourceFile, List<File> targetFiles) {
        this.sourceFile = sourceFile;
        this.targetFiles = targetFiles;
    }

    public File getsourceFile() {
        return sourceFile;
    }

    public void setsourceFile(File sourceFile) {
        this.sourceFile = sourceFile;
    }

    public List<File> gettargetFiles() {
        return targetFiles;
    }

    public void settargetFiles(List<File> targetFiles) {
        this.targetFiles = targetFiles;
    }

    public String getsettings() {
        return settings;
    }

    public void setsettings(String settings) {
        this.settings = settings;
    }

    public String getchangeType() {
        return changeType;
    }

    public void setchangeType(String changeType) {
        this.changeType = changeType;
    }
}
