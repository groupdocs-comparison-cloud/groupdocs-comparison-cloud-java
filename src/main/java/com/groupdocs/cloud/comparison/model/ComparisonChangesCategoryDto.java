/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="ComparisonChangesCategoryDto.java">
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ComparisonChangesCategoryDto
 */
public class ComparisonChangesCategoryDto {
  @SerializedName("category")
  private String category = null;

  @SerializedName("changes")
  private List<ComparisonChange> changes = null;

  public ComparisonChangesCategoryDto category(String category) {
    this.category = category;
    return this;
  }

   /**
   * The identifier
   * @return category
  **/
  @ApiModelProperty(value = "The identifier")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public ComparisonChangesCategoryDto changes(List<ComparisonChange> changes) {
    this.changes = changes;
    return this;
  }

  public ComparisonChangesCategoryDto addChangesItem(ComparisonChange changesItem) {
    if (this.changes == null) {
      this.changes = new ArrayList<ComparisonChange>();
    }
    this.changes.add(changesItem);
    return this;
  }

   /**
   * The type change
   * @return changes
  **/
  @ApiModelProperty(value = "The type change")
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
    ComparisonChangesCategoryDto comparisonChangesCategoryDto = (ComparisonChangesCategoryDto) o;
    return Objects.equals(this.category, comparisonChangesCategoryDto.category) &&
        Objects.equals(this.changes, comparisonChangesCategoryDto.changes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, changes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComparisonChangesCategoryDto {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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

