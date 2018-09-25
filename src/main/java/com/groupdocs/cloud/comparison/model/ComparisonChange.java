/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="ComparisonChange.java">
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
import com.groupdocs.cloud.comparison.model.ComparisonStyleChange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ComparisonChange dto
 */
@ApiModel(description = "ComparisonChange dto")
public class ComparisonChange {
  @SerializedName("Id")
  private Integer id = null;

  @SerializedName("Type")
  private String type = null;

  @SerializedName("Text")
  private String text = null;

  @SerializedName("Authors")
  private List<String> authors = null;

  @SerializedName("Action")
  private String action = null;

  @SerializedName("StyleChanges")
  private List<ComparisonStyleChange> styleChanges = null;

  public ComparisonChange id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The identifier
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The identifier")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ComparisonChange type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type change
   * @return type
  **/
  @ApiModelProperty(value = "The type change")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ComparisonChange text(String text) {
    this.text = text;
    return this;
  }

   /**
   * The text
   * @return text
  **/
  @ApiModelProperty(value = "The text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public ComparisonChange authors(List<String> authors) {
    this.authors = authors;
    return this;
  }

  public ComparisonChange addAuthorsItem(String authorsItem) {
    if (this.authors == null) {
      this.authors = new ArrayList<String>();
    }
    this.authors.add(authorsItem);
    return this;
  }

   /**
   * The authors
   * @return authors
  **/
  @ApiModelProperty(value = "The authors")
  public List<String> getAuthors() {
    return authors;
  }

  public void setAuthors(List<String> authors) {
    this.authors = authors;
  }

  public ComparisonChange action(String action) {
    this.action = action;
    return this;
  }

   /**
   * The action
   * @return action
  **/
  @ApiModelProperty(value = "The action")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public ComparisonChange styleChanges(List<ComparisonStyleChange> styleChanges) {
    this.styleChanges = styleChanges;
    return this;
  }

  public ComparisonChange addStyleChangesItem(ComparisonStyleChange styleChangesItem) {
    if (this.styleChanges == null) {
      this.styleChanges = new ArrayList<ComparisonStyleChange>();
    }
    this.styleChanges.add(styleChangesItem);
    return this;
  }

   /**
   * The style changes
   * @return styleChanges
  **/
  @ApiModelProperty(value = "The style changes")
  public List<ComparisonStyleChange> getStyleChanges() {
    return styleChanges;
  }

  public void setStyleChanges(List<ComparisonStyleChange> styleChanges) {
    this.styleChanges = styleChanges;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComparisonChange comparisonChange = (ComparisonChange) o;
    return Objects.equals(this.id, comparisonChange.id) &&
        Objects.equals(this.type, comparisonChange.type) &&
        Objects.equals(this.text, comparisonChange.text) &&
        Objects.equals(this.authors, comparisonChange.authors) &&
        Objects.equals(this.action, comparisonChange.action) &&
        Objects.equals(this.styleChanges, comparisonChange.styleChanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, text, authors, action, styleChanges);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComparisonChange {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    authors: ").append(toIndentedString(authors)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    styleChanges: ").append(toIndentedString(styleChanges)).append("\n");
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

