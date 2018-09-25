/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="ComparisonRequestSettings.java">
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
import com.groupdocs.cloud.comparison.model.ComparisonMetadataValues;
import com.groupdocs.cloud.comparison.model.StyleSettingsValues;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ComparisonRequestSettings dto
 */
@ApiModel(description = "ComparisonRequestSettings dto")
public class ComparisonRequestSettings {
  @SerializedName("GenerateSummaryPage")
  private Boolean generateSummaryPage = null;

  @SerializedName("ShowDeletedContent")
  private Boolean showDeletedContent = null;

  @SerializedName("StyleChangeDetection")
  private Boolean styleChangeDetection = null;

  @SerializedName("InsertedItemsStyle")
  private StyleSettingsValues insertedItemsStyle = null;

  @SerializedName("DeletedItemsStyle")
  private StyleSettingsValues deletedItemsStyle = null;

  @SerializedName("StyleChangedItemsStyle")
  private StyleSettingsValues styleChangedItemsStyle = null;

  @SerializedName("WordsSeparatorChars")
  private List<String> wordsSeparatorChars = null;

  @SerializedName("UseFramesForDelInsElements")
  private Boolean useFramesForDelInsElements = null;

  @SerializedName("DetailLevel")
  private String detailLevel = null;

  @SerializedName("CalculateComponentCoordinates")
  private Boolean calculateComponentCoordinates = null;

  @SerializedName("CloneMetadata")
  private String cloneMetadata = null;

  @SerializedName("MetaData")
  private ComparisonMetadataValues metaData = null;

  @SerializedName("PasswordSaveOption")
  private String passwordSaveOption = null;

  @SerializedName("Password")
  private String password = null;

  @SerializedName("MarkDeletedInsertedContentDeep")
  private Boolean markDeletedInsertedContentDeep = null;

  public ComparisonRequestSettings generateSummaryPage(Boolean generateSummaryPage) {
    this.generateSummaryPage = generateSummaryPage;
    return this;
  }

   /**
   * The generate summary page
   * @return generateSummaryPage
  **/
  @ApiModelProperty(required = true, value = "The generate summary page")
  public Boolean isGenerateSummaryPage() {
    return generateSummaryPage;
  }

  public void setGenerateSummaryPage(Boolean generateSummaryPage) {
    this.generateSummaryPage = generateSummaryPage;
  }

  public ComparisonRequestSettings showDeletedContent(Boolean showDeletedContent) {
    this.showDeletedContent = showDeletedContent;
    return this;
  }

   /**
   * The show deleted content
   * @return showDeletedContent
  **/
  @ApiModelProperty(required = true, value = "The show deleted content")
  public Boolean isShowDeletedContent() {
    return showDeletedContent;
  }

  public void setShowDeletedContent(Boolean showDeletedContent) {
    this.showDeletedContent = showDeletedContent;
  }

  public ComparisonRequestSettings styleChangeDetection(Boolean styleChangeDetection) {
    this.styleChangeDetection = styleChangeDetection;
    return this;
  }

   /**
   * The style change detection
   * @return styleChangeDetection
  **/
  @ApiModelProperty(required = true, value = "The style change detection")
  public Boolean isStyleChangeDetection() {
    return styleChangeDetection;
  }

  public void setStyleChangeDetection(Boolean styleChangeDetection) {
    this.styleChangeDetection = styleChangeDetection;
  }

  public ComparisonRequestSettings insertedItemsStyle(StyleSettingsValues insertedItemsStyle) {
    this.insertedItemsStyle = insertedItemsStyle;
    return this;
  }

   /**
   * The inserted items style
   * @return insertedItemsStyle
  **/
  @ApiModelProperty(value = "The inserted items style")
  public StyleSettingsValues getInsertedItemsStyle() {
    return insertedItemsStyle;
  }

  public void setInsertedItemsStyle(StyleSettingsValues insertedItemsStyle) {
    this.insertedItemsStyle = insertedItemsStyle;
  }

  public ComparisonRequestSettings deletedItemsStyle(StyleSettingsValues deletedItemsStyle) {
    this.deletedItemsStyle = deletedItemsStyle;
    return this;
  }

   /**
   * The deleted items style
   * @return deletedItemsStyle
  **/
  @ApiModelProperty(value = "The deleted items style")
  public StyleSettingsValues getDeletedItemsStyle() {
    return deletedItemsStyle;
  }

  public void setDeletedItemsStyle(StyleSettingsValues deletedItemsStyle) {
    this.deletedItemsStyle = deletedItemsStyle;
  }

  public ComparisonRequestSettings styleChangedItemsStyle(StyleSettingsValues styleChangedItemsStyle) {
    this.styleChangedItemsStyle = styleChangedItemsStyle;
    return this;
  }

   /**
   * The style changed items style
   * @return styleChangedItemsStyle
  **/
  @ApiModelProperty(value = "The style changed items style")
  public StyleSettingsValues getStyleChangedItemsStyle() {
    return styleChangedItemsStyle;
  }

  public void setStyleChangedItemsStyle(StyleSettingsValues styleChangedItemsStyle) {
    this.styleChangedItemsStyle = styleChangedItemsStyle;
  }

  public ComparisonRequestSettings wordsSeparatorChars(List<String> wordsSeparatorChars) {
    this.wordsSeparatorChars = wordsSeparatorChars;
    return this;
  }

  public ComparisonRequestSettings addWordsSeparatorCharsItem(String wordsSeparatorCharsItem) {
    if (this.wordsSeparatorChars == null) {
      this.wordsSeparatorChars = new ArrayList<String>();
    }
    this.wordsSeparatorChars.add(wordsSeparatorCharsItem);
    return this;
  }

   /**
   * The words separator chars
   * @return wordsSeparatorChars
  **/
  @ApiModelProperty(value = "The words separator chars")
  public List<String> getWordsSeparatorChars() {
    return wordsSeparatorChars;
  }

  public void setWordsSeparatorChars(List<String> wordsSeparatorChars) {
    this.wordsSeparatorChars = wordsSeparatorChars;
  }

  public ComparisonRequestSettings useFramesForDelInsElements(Boolean useFramesForDelInsElements) {
    this.useFramesForDelInsElements = useFramesForDelInsElements;
    return this;
  }

   /**
   * The use frames for delete ins elements
   * @return useFramesForDelInsElements
  **/
  @ApiModelProperty(required = true, value = "The use frames for delete ins elements")
  public Boolean isUseFramesForDelInsElements() {
    return useFramesForDelInsElements;
  }

  public void setUseFramesForDelInsElements(Boolean useFramesForDelInsElements) {
    this.useFramesForDelInsElements = useFramesForDelInsElements;
  }

  public ComparisonRequestSettings detailLevel(String detailLevel) {
    this.detailLevel = detailLevel;
    return this;
  }

   /**
   * The detail level
   * @return detailLevel
  **/
  @ApiModelProperty(value = "The detail level")
  public String getDetailLevel() {
    return detailLevel;
  }

  public void setDetailLevel(String detailLevel) {
    this.detailLevel = detailLevel;
  }

  public ComparisonRequestSettings calculateComponentCoordinates(Boolean calculateComponentCoordinates) {
    this.calculateComponentCoordinates = calculateComponentCoordinates;
    return this;
  }

   /**
   * The calculate component coordinates
   * @return calculateComponentCoordinates
  **/
  @ApiModelProperty(required = true, value = "The calculate component coordinates")
  public Boolean isCalculateComponentCoordinates() {
    return calculateComponentCoordinates;
  }

  public void setCalculateComponentCoordinates(Boolean calculateComponentCoordinates) {
    this.calculateComponentCoordinates = calculateComponentCoordinates;
  }

  public ComparisonRequestSettings cloneMetadata(String cloneMetadata) {
    this.cloneMetadata = cloneMetadata;
    return this;
  }

   /**
   * The clone metadata
   * @return cloneMetadata
  **/
  @ApiModelProperty(value = "The clone metadata")
  public String getCloneMetadata() {
    return cloneMetadata;
  }

  public void setCloneMetadata(String cloneMetadata) {
    this.cloneMetadata = cloneMetadata;
  }

  public ComparisonRequestSettings metaData(ComparisonMetadataValues metaData) {
    this.metaData = metaData;
    return this;
  }

   /**
   * The metadata
   * @return metaData
  **/
  @ApiModelProperty(value = "The metadata")
  public ComparisonMetadataValues getMetaData() {
    return metaData;
  }

  public void setMetaData(ComparisonMetadataValues metaData) {
    this.metaData = metaData;
  }

  public ComparisonRequestSettings passwordSaveOption(String passwordSaveOption) {
    this.passwordSaveOption = passwordSaveOption;
    return this;
  }

   /**
   * The password save option
   * @return passwordSaveOption
  **/
  @ApiModelProperty(value = "The password save option")
  public String getPasswordSaveOption() {
    return passwordSaveOption;
  }

  public void setPasswordSaveOption(String passwordSaveOption) {
    this.passwordSaveOption = passwordSaveOption;
  }

  public ComparisonRequestSettings password(String password) {
    this.password = password;
    return this;
  }

   /**
   * The password
   * @return password
  **/
  @ApiModelProperty(value = "The password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public ComparisonRequestSettings markDeletedInsertedContentDeep(Boolean markDeletedInsertedContentDeep) {
    this.markDeletedInsertedContentDeep = markDeletedInsertedContentDeep;
    return this;
  }

   /**
   * The mark deleted inserted content deep
   * @return markDeletedInsertedContentDeep
  **/
  @ApiModelProperty(required = true, value = "The mark deleted inserted content deep")
  public Boolean isMarkDeletedInsertedContentDeep() {
    return markDeletedInsertedContentDeep;
  }

  public void setMarkDeletedInsertedContentDeep(Boolean markDeletedInsertedContentDeep) {
    this.markDeletedInsertedContentDeep = markDeletedInsertedContentDeep;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComparisonRequestSettings comparisonRequestSettings = (ComparisonRequestSettings) o;
    return Objects.equals(this.generateSummaryPage, comparisonRequestSettings.generateSummaryPage) &&
        Objects.equals(this.showDeletedContent, comparisonRequestSettings.showDeletedContent) &&
        Objects.equals(this.styleChangeDetection, comparisonRequestSettings.styleChangeDetection) &&
        Objects.equals(this.insertedItemsStyle, comparisonRequestSettings.insertedItemsStyle) &&
        Objects.equals(this.deletedItemsStyle, comparisonRequestSettings.deletedItemsStyle) &&
        Objects.equals(this.styleChangedItemsStyle, comparisonRequestSettings.styleChangedItemsStyle) &&
        Objects.equals(this.wordsSeparatorChars, comparisonRequestSettings.wordsSeparatorChars) &&
        Objects.equals(this.useFramesForDelInsElements, comparisonRequestSettings.useFramesForDelInsElements) &&
        Objects.equals(this.detailLevel, comparisonRequestSettings.detailLevel) &&
        Objects.equals(this.calculateComponentCoordinates, comparisonRequestSettings.calculateComponentCoordinates) &&
        Objects.equals(this.cloneMetadata, comparisonRequestSettings.cloneMetadata) &&
        Objects.equals(this.metaData, comparisonRequestSettings.metaData) &&
        Objects.equals(this.passwordSaveOption, comparisonRequestSettings.passwordSaveOption) &&
        Objects.equals(this.password, comparisonRequestSettings.password) &&
        Objects.equals(this.markDeletedInsertedContentDeep, comparisonRequestSettings.markDeletedInsertedContentDeep);
  }

  @Override
  public int hashCode() {
    return Objects.hash(generateSummaryPage, showDeletedContent, styleChangeDetection, insertedItemsStyle, deletedItemsStyle, styleChangedItemsStyle, wordsSeparatorChars, useFramesForDelInsElements, detailLevel, calculateComponentCoordinates, cloneMetadata, metaData, passwordSaveOption, password, markDeletedInsertedContentDeep);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComparisonRequestSettings {\n");
    
    sb.append("    generateSummaryPage: ").append(toIndentedString(generateSummaryPage)).append("\n");
    sb.append("    showDeletedContent: ").append(toIndentedString(showDeletedContent)).append("\n");
    sb.append("    styleChangeDetection: ").append(toIndentedString(styleChangeDetection)).append("\n");
    sb.append("    insertedItemsStyle: ").append(toIndentedString(insertedItemsStyle)).append("\n");
    sb.append("    deletedItemsStyle: ").append(toIndentedString(deletedItemsStyle)).append("\n");
    sb.append("    styleChangedItemsStyle: ").append(toIndentedString(styleChangedItemsStyle)).append("\n");
    sb.append("    wordsSeparatorChars: ").append(toIndentedString(wordsSeparatorChars)).append("\n");
    sb.append("    useFramesForDelInsElements: ").append(toIndentedString(useFramesForDelInsElements)).append("\n");
    sb.append("    detailLevel: ").append(toIndentedString(detailLevel)).append("\n");
    sb.append("    calculateComponentCoordinates: ").append(toIndentedString(calculateComponentCoordinates)).append("\n");
    sb.append("    cloneMetadata: ").append(toIndentedString(cloneMetadata)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    passwordSaveOption: ").append(toIndentedString(passwordSaveOption)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    markDeletedInsertedContentDeep: ").append(toIndentedString(markDeletedInsertedContentDeep)).append("\n");
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

