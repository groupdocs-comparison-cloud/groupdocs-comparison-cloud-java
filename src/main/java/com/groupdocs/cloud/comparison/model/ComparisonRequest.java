/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="ComparisonRequest.java">
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

package com.groupdocs.cloud.comparison.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.groupdocs.cloud.comparison.model.ComparisonChange;
import com.groupdocs.cloud.comparison.model.ComparisonFileInfo;
import com.groupdocs.cloud.comparison.model.ComparisonRequestSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ComparisonRequest
 */
@ApiModel(description = "ComparisonRequest")
public class ComparisonRequest {
  @SerializedName("SourceFile")
  private ComparisonFileInfo sourceFile = null;

  @SerializedName("TargetFiles")
  private List<ComparisonFileInfo> targetFiles = null;

  @SerializedName("Settings")
  private ComparisonRequestSettings settings = null;

  @SerializedName("Changes")
  private List<ComparisonChange> changes = null;

  public ComparisonRequest sourceFile(ComparisonFileInfo sourceFile) {
    this.sourceFile = sourceFile;
    return this;
  }

   /**
   * The source name
   * @return sourceFile
  **/
  @ApiModelProperty(value = "The source name")
  public ComparisonFileInfo getSourceFile() {
    return sourceFile;
  }

  public void setSourceFile(ComparisonFileInfo sourceFile) {
    this.sourceFile = sourceFile;
  }

  public ComparisonRequest targetFiles(List<ComparisonFileInfo> targetFiles) {
    this.targetFiles = targetFiles;
    return this;
  }

  public ComparisonRequest addTargetFilesItem(ComparisonFileInfo targetFilesItem) {
    if (this.targetFiles == null) {
      this.targetFiles = new ArrayList<ComparisonFileInfo>();
    }
    this.targetFiles.add(targetFilesItem);
    return this;
  }

   /**
   * The files names
   * @return targetFiles
  **/
  @ApiModelProperty(value = "The files names")
  public List<ComparisonFileInfo> getTargetFiles() {
    return targetFiles;
  }

  public void setTargetFiles(List<ComparisonFileInfo> targetFiles) {
    this.targetFiles = targetFiles;
  }

  public ComparisonRequest settings(ComparisonRequestSettings settings) {
    this.settings = settings;
    return this;
  }

   /**
   * The settings
   * @return settings
  **/
  @ApiModelProperty(value = "The settings")
  public ComparisonRequestSettings getSettings() {
    return settings;
  }

  public void setSettings(ComparisonRequestSettings settings) {
    this.settings = settings;
  }

  public ComparisonRequest changes(List<ComparisonChange> changes) {
    this.changes = changes;
    return this;
  }

  public ComparisonRequest addChangesItem(ComparisonChange changesItem) {
    if (this.changes == null) {
      this.changes = new ArrayList<ComparisonChange>();
    }
    this.changes.add(changesItem);
    return this;
  }

   /**
   * The changes
   * @return changes
  **/
  @ApiModelProperty(value = "The changes")
  public List<ComparisonChange> getChanges() {
    return changes;
  }

  public void setChanges(List<ComparisonChange> changes) {
    this.changes = changes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComparisonRequest comparisonRequest = (ComparisonRequest) o;
    return Objects.equals(this.sourceFile, comparisonRequest.sourceFile) &&
        Objects.equals(this.targetFiles, comparisonRequest.targetFiles) &&
        Objects.equals(this.settings, comparisonRequest.settings) &&
        Objects.equals(this.changes, comparisonRequest.changes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceFile, targetFiles, settings, changes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComparisonRequest {\n");
    
    sb.append("    sourceFile: ").append(toIndentedString(sourceFile)).append("\n");
    sb.append("    targetFiles: ").append(toIndentedString(targetFiles)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
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

