/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="StyleSettingsValues.java">
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
import com.groupdocs.cloud.comparison.model.Color;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * StyleSettingsValues dto
 */
@ApiModel(description = "StyleSettingsValues dto")
public class StyleSettingsValues {
  @SerializedName("Color")
  private Color color = null;

  @SerializedName("BeginSeparatorString")
  private String beginSeparatorString = null;

  @SerializedName("EndSeparatorString")
  private String endSeparatorString = null;

  public StyleSettingsValues color(Color color) {
    this.color = color;
    return this;
  }

   /**
   * Gets or sets the color.
   * @return color
  **/
  @ApiModelProperty(required = true, value = "Gets or sets the color.")
  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public StyleSettingsValues beginSeparatorString(String beginSeparatorString) {
    this.beginSeparatorString = beginSeparatorString;
    return this;
  }

   /**
   * Gets or sets the begin separator string.
   * @return beginSeparatorString
  **/
  @ApiModelProperty(value = "Gets or sets the begin separator string.")
  public String getBeginSeparatorString() {
    return beginSeparatorString;
  }

  public void setBeginSeparatorString(String beginSeparatorString) {
    this.beginSeparatorString = beginSeparatorString;
  }

  public StyleSettingsValues endSeparatorString(String endSeparatorString) {
    this.endSeparatorString = endSeparatorString;
    return this;
  }

   /**
   * Gets or sets the end separator string.
   * @return endSeparatorString
  **/
  @ApiModelProperty(value = "Gets or sets the end separator string.")
  public String getEndSeparatorString() {
    return endSeparatorString;
  }

  public void setEndSeparatorString(String endSeparatorString) {
    this.endSeparatorString = endSeparatorString;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StyleSettingsValues styleSettingsValues = (StyleSettingsValues) o;
    return Objects.equals(this.color, styleSettingsValues.color) &&
        Objects.equals(this.beginSeparatorString, styleSettingsValues.beginSeparatorString) &&
        Objects.equals(this.endSeparatorString, styleSettingsValues.endSeparatorString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, beginSeparatorString, endSeparatorString);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StyleSettingsValues {\n");
    
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    beginSeparatorString: ").append(toIndentedString(beginSeparatorString)).append("\n");
    sb.append("    endSeparatorString: ").append(toIndentedString(endSeparatorString)).append("\n");
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

