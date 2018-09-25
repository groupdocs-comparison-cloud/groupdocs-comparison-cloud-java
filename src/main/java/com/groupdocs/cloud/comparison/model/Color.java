/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="Color.java">
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
import com.groupdocs.cloud.comparison.model.ValueType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Color
 */
public class Color extends ValueType {
  @SerializedName("transparent")
  private Color transparent = null;

  @SerializedName("aliceBlue")
  private Color aliceBlue = null;

  @SerializedName("antiqueWhite")
  private Color antiqueWhite = null;

  @SerializedName("aqua")
  private Color aqua = null;

  @SerializedName("aquamarine")
  private Color aquamarine = null;

  @SerializedName("azure")
  private Color azure = null;

  @SerializedName("beige")
  private Color beige = null;

  @SerializedName("bisque")
  private Color bisque = null;

  @SerializedName("black")
  private Color black = null;

  @SerializedName("blanchedAlmond")
  private Color blanchedAlmond = null;

  @SerializedName("blue")
  private Color blue = null;

  @SerializedName("blueViolet")
  private Color blueViolet = null;

  @SerializedName("brown")
  private Color brown = null;

  @SerializedName("burlyWood")
  private Color burlyWood = null;

  @SerializedName("cadetBlue")
  private Color cadetBlue = null;

  @SerializedName("chartreuse")
  private Color chartreuse = null;

  @SerializedName("chocolate")
  private Color chocolate = null;

  @SerializedName("coral")
  private Color coral = null;

  @SerializedName("cornflowerBlue")
  private Color cornflowerBlue = null;

  @SerializedName("cornsilk")
  private Color cornsilk = null;

  @SerializedName("crimson")
  private Color crimson = null;

  @SerializedName("cyan")
  private Color cyan = null;

  @SerializedName("darkBlue")
  private Color darkBlue = null;

  @SerializedName("darkCyan")
  private Color darkCyan = null;

  @SerializedName("darkGoldenrod")
  private Color darkGoldenrod = null;

  @SerializedName("darkGray")
  private Color darkGray = null;

  @SerializedName("darkGreen")
  private Color darkGreen = null;

  @SerializedName("darkKhaki")
  private Color darkKhaki = null;

  @SerializedName("darkMagenta")
  private Color darkMagenta = null;

  @SerializedName("darkOliveGreen")
  private Color darkOliveGreen = null;

  @SerializedName("darkOrange")
  private Color darkOrange = null;

  @SerializedName("darkOrchid")
  private Color darkOrchid = null;

  @SerializedName("darkRed")
  private Color darkRed = null;

  @SerializedName("darkSalmon")
  private Color darkSalmon = null;

  @SerializedName("darkSeaGreen")
  private Color darkSeaGreen = null;

  @SerializedName("darkSlateBlue")
  private Color darkSlateBlue = null;

  @SerializedName("darkSlateGray")
  private Color darkSlateGray = null;

  @SerializedName("darkTurquoise")
  private Color darkTurquoise = null;

  @SerializedName("darkViolet")
  private Color darkViolet = null;

  @SerializedName("deepPink")
  private Color deepPink = null;

  @SerializedName("deepSkyBlue")
  private Color deepSkyBlue = null;

  @SerializedName("dimGray")
  private Color dimGray = null;

  @SerializedName("dodgerBlue")
  private Color dodgerBlue = null;

  @SerializedName("firebrick")
  private Color firebrick = null;

  @SerializedName("floralWhite")
  private Color floralWhite = null;

  @SerializedName("forestGreen")
  private Color forestGreen = null;

  @SerializedName("fuchsia")
  private Color fuchsia = null;

  @SerializedName("gainsboro")
  private Color gainsboro = null;

  @SerializedName("ghostWhite")
  private Color ghostWhite = null;

  @SerializedName("gold")
  private Color gold = null;

  @SerializedName("goldenrod")
  private Color goldenrod = null;

  @SerializedName("gray")
  private Color gray = null;

  @SerializedName("green")
  private Color green = null;

  @SerializedName("greenYellow")
  private Color greenYellow = null;

  @SerializedName("honeydew")
  private Color honeydew = null;

  @SerializedName("hotPink")
  private Color hotPink = null;

  @SerializedName("indianRed")
  private Color indianRed = null;

  @SerializedName("indigo")
  private Color indigo = null;

  @SerializedName("ivory")
  private Color ivory = null;

  @SerializedName("khaki")
  private Color khaki = null;

  @SerializedName("lavender")
  private Color lavender = null;

  @SerializedName("lavenderBlush")
  private Color lavenderBlush = null;

  @SerializedName("lawnGreen")
  private Color lawnGreen = null;

  @SerializedName("lemonChiffon")
  private Color lemonChiffon = null;

  @SerializedName("lightBlue")
  private Color lightBlue = null;

  @SerializedName("lightCoral")
  private Color lightCoral = null;

  @SerializedName("lightCyan")
  private Color lightCyan = null;

  @SerializedName("lightGoldenrodYellow")
  private Color lightGoldenrodYellow = null;

  @SerializedName("lightGreen")
  private Color lightGreen = null;

  @SerializedName("lightGray")
  private Color lightGray = null;

  @SerializedName("lightPink")
  private Color lightPink = null;

  @SerializedName("lightSalmon")
  private Color lightSalmon = null;

  @SerializedName("lightSeaGreen")
  private Color lightSeaGreen = null;

  @SerializedName("lightSkyBlue")
  private Color lightSkyBlue = null;

  @SerializedName("lightSlateGray")
  private Color lightSlateGray = null;

  @SerializedName("lightSteelBlue")
  private Color lightSteelBlue = null;

  @SerializedName("lightYellow")
  private Color lightYellow = null;

  @SerializedName("lime")
  private Color lime = null;

  @SerializedName("limeGreen")
  private Color limeGreen = null;

  @SerializedName("linen")
  private Color linen = null;

  @SerializedName("magenta")
  private Color magenta = null;

  @SerializedName("maroon")
  private Color maroon = null;

  @SerializedName("mediumAquamarine")
  private Color mediumAquamarine = null;

  @SerializedName("mediumBlue")
  private Color mediumBlue = null;

  @SerializedName("mediumOrchid")
  private Color mediumOrchid = null;

  @SerializedName("mediumPurple")
  private Color mediumPurple = null;

  @SerializedName("mediumSeaGreen")
  private Color mediumSeaGreen = null;

  @SerializedName("mediumSlateBlue")
  private Color mediumSlateBlue = null;

  @SerializedName("mediumSpringGreen")
  private Color mediumSpringGreen = null;

  @SerializedName("mediumTurquoise")
  private Color mediumTurquoise = null;

  @SerializedName("mediumVioletRed")
  private Color mediumVioletRed = null;

  @SerializedName("midnightBlue")
  private Color midnightBlue = null;

  @SerializedName("mintCream")
  private Color mintCream = null;

  @SerializedName("mistyRose")
  private Color mistyRose = null;

  @SerializedName("moccasin")
  private Color moccasin = null;

  @SerializedName("navajoWhite")
  private Color navajoWhite = null;

  @SerializedName("navy")
  private Color navy = null;

  @SerializedName("oldLace")
  private Color oldLace = null;

  @SerializedName("olive")
  private Color olive = null;

  @SerializedName("oliveDrab")
  private Color oliveDrab = null;

  @SerializedName("orange")
  private Color orange = null;

  @SerializedName("orangeRed")
  private Color orangeRed = null;

  @SerializedName("orchid")
  private Color orchid = null;

  @SerializedName("paleGoldenrod")
  private Color paleGoldenrod = null;

  @SerializedName("paleGreen")
  private Color paleGreen = null;

  @SerializedName("paleTurquoise")
  private Color paleTurquoise = null;

  @SerializedName("paleVioletRed")
  private Color paleVioletRed = null;

  @SerializedName("papayaWhip")
  private Color papayaWhip = null;

  @SerializedName("peachPuff")
  private Color peachPuff = null;

  @SerializedName("peru")
  private Color peru = null;

  @SerializedName("pink")
  private Color pink = null;

  @SerializedName("plum")
  private Color plum = null;

  @SerializedName("powderBlue")
  private Color powderBlue = null;

  @SerializedName("purple")
  private Color purple = null;

  @SerializedName("red")
  private Color red = null;

  @SerializedName("rosyBrown")
  private Color rosyBrown = null;

  @SerializedName("royalBlue")
  private Color royalBlue = null;

  @SerializedName("saddleBrown")
  private Color saddleBrown = null;

  @SerializedName("salmon")
  private Color salmon = null;

  @SerializedName("sandyBrown")
  private Color sandyBrown = null;

  @SerializedName("seaGreen")
  private Color seaGreen = null;

  @SerializedName("seaShell")
  private Color seaShell = null;

  @SerializedName("sienna")
  private Color sienna = null;

  @SerializedName("silver")
  private Color silver = null;

  @SerializedName("skyBlue")
  private Color skyBlue = null;

  @SerializedName("slateBlue")
  private Color slateBlue = null;

  @SerializedName("slateGray")
  private Color slateGray = null;

  @SerializedName("snow")
  private Color snow = null;

  @SerializedName("springGreen")
  private Color springGreen = null;

  @SerializedName("steelBlue")
  private Color steelBlue = null;

  @SerializedName("tan")
  private Color tan = null;

  @SerializedName("teal")
  private Color teal = null;

  @SerializedName("thistle")
  private Color thistle = null;

  @SerializedName("tomato")
  private Color tomato = null;

  @SerializedName("turquoise")
  private Color turquoise = null;

  @SerializedName("violet")
  private Color violet = null;

  @SerializedName("wheat")
  private Color wheat = null;

  @SerializedName("white")
  private Color white = null;

  @SerializedName("whiteSmoke")
  private Color whiteSmoke = null;

  @SerializedName("yellow")
  private Color yellow = null;

  @SerializedName("yellowGreen")
  private Color yellowGreen = null;

  @SerializedName("R")
  private Integer R = null;

  @SerializedName("G")
  private Integer G = null;

  @SerializedName("B")
  private Integer B = null;

  @SerializedName("A")
  private Integer A = null;

  @SerializedName("isKnownColor")
  private Boolean isKnownColor = null;

  @SerializedName("isEmpty")
  private Boolean isEmpty = null;

  @SerializedName("isNamedColor")
  private Boolean isNamedColor = null;

  @SerializedName("isSystemColor")
  private Boolean isSystemColor = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("empty")
  private Color empty = null;

  public Color transparent(Color transparent) {
    this.transparent = transparent;
    return this;
  }

   /**
   * Get transparent
   * @return transparent
  **/
  @ApiModelProperty(value = "")
  public Color getTransparent() {
    return transparent;
  }

  public void setTransparent(Color transparent) {
    this.transparent = transparent;
  }

  public Color aliceBlue(Color aliceBlue) {
    this.aliceBlue = aliceBlue;
    return this;
  }

   /**
   * Get aliceBlue
   * @return aliceBlue
  **/
  @ApiModelProperty(value = "")
  public Color getAliceBlue() {
    return aliceBlue;
  }

  public void setAliceBlue(Color aliceBlue) {
    this.aliceBlue = aliceBlue;
  }

  public Color antiqueWhite(Color antiqueWhite) {
    this.antiqueWhite = antiqueWhite;
    return this;
  }

   /**
   * Get antiqueWhite
   * @return antiqueWhite
  **/
  @ApiModelProperty(value = "")
  public Color getAntiqueWhite() {
    return antiqueWhite;
  }

  public void setAntiqueWhite(Color antiqueWhite) {
    this.antiqueWhite = antiqueWhite;
  }

  public Color aqua(Color aqua) {
    this.aqua = aqua;
    return this;
  }

   /**
   * Get aqua
   * @return aqua
  **/
  @ApiModelProperty(value = "")
  public Color getAqua() {
    return aqua;
  }

  public void setAqua(Color aqua) {
    this.aqua = aqua;
  }

  public Color aquamarine(Color aquamarine) {
    this.aquamarine = aquamarine;
    return this;
  }

   /**
   * Get aquamarine
   * @return aquamarine
  **/
  @ApiModelProperty(value = "")
  public Color getAquamarine() {
    return aquamarine;
  }

  public void setAquamarine(Color aquamarine) {
    this.aquamarine = aquamarine;
  }

  public Color azure(Color azure) {
    this.azure = azure;
    return this;
  }

   /**
   * Get azure
   * @return azure
  **/
  @ApiModelProperty(value = "")
  public Color getAzure() {
    return azure;
  }

  public void setAzure(Color azure) {
    this.azure = azure;
  }

  public Color beige(Color beige) {
    this.beige = beige;
    return this;
  }

   /**
   * Get beige
   * @return beige
  **/
  @ApiModelProperty(value = "")
  public Color getBeige() {
    return beige;
  }

  public void setBeige(Color beige) {
    this.beige = beige;
  }

  public Color bisque(Color bisque) {
    this.bisque = bisque;
    return this;
  }

   /**
   * Get bisque
   * @return bisque
  **/
  @ApiModelProperty(value = "")
  public Color getBisque() {
    return bisque;
  }

  public void setBisque(Color bisque) {
    this.bisque = bisque;
  }

  public Color black(Color black) {
    this.black = black;
    return this;
  }

   /**
   * Get black
   * @return black
  **/
  @ApiModelProperty(value = "")
  public Color getBlack() {
    return black;
  }

  public void setBlack(Color black) {
    this.black = black;
  }

  public Color blanchedAlmond(Color blanchedAlmond) {
    this.blanchedAlmond = blanchedAlmond;
    return this;
  }

   /**
   * Get blanchedAlmond
   * @return blanchedAlmond
  **/
  @ApiModelProperty(value = "")
  public Color getBlanchedAlmond() {
    return blanchedAlmond;
  }

  public void setBlanchedAlmond(Color blanchedAlmond) {
    this.blanchedAlmond = blanchedAlmond;
  }

  public Color blue(Color blue) {
    this.blue = blue;
    return this;
  }

   /**
   * Get blue
   * @return blue
  **/
  @ApiModelProperty(value = "")
  public Color getBlue() {
    return blue;
  }

  public void setBlue(Color blue) {
    this.blue = blue;
  }

  public Color blueViolet(Color blueViolet) {
    this.blueViolet = blueViolet;
    return this;
  }

   /**
   * Get blueViolet
   * @return blueViolet
  **/
  @ApiModelProperty(value = "")
  public Color getBlueViolet() {
    return blueViolet;
  }

  public void setBlueViolet(Color blueViolet) {
    this.blueViolet = blueViolet;
  }

  public Color brown(Color brown) {
    this.brown = brown;
    return this;
  }

   /**
   * Get brown
   * @return brown
  **/
  @ApiModelProperty(value = "")
  public Color getBrown() {
    return brown;
  }

  public void setBrown(Color brown) {
    this.brown = brown;
  }

  public Color burlyWood(Color burlyWood) {
    this.burlyWood = burlyWood;
    return this;
  }

   /**
   * Get burlyWood
   * @return burlyWood
  **/
  @ApiModelProperty(value = "")
  public Color getBurlyWood() {
    return burlyWood;
  }

  public void setBurlyWood(Color burlyWood) {
    this.burlyWood = burlyWood;
  }

  public Color cadetBlue(Color cadetBlue) {
    this.cadetBlue = cadetBlue;
    return this;
  }

   /**
   * Get cadetBlue
   * @return cadetBlue
  **/
  @ApiModelProperty(value = "")
  public Color getCadetBlue() {
    return cadetBlue;
  }

  public void setCadetBlue(Color cadetBlue) {
    this.cadetBlue = cadetBlue;
  }

  public Color chartreuse(Color chartreuse) {
    this.chartreuse = chartreuse;
    return this;
  }

   /**
   * Get chartreuse
   * @return chartreuse
  **/
  @ApiModelProperty(value = "")
  public Color getChartreuse() {
    return chartreuse;
  }

  public void setChartreuse(Color chartreuse) {
    this.chartreuse = chartreuse;
  }

  public Color chocolate(Color chocolate) {
    this.chocolate = chocolate;
    return this;
  }

   /**
   * Get chocolate
   * @return chocolate
  **/
  @ApiModelProperty(value = "")
  public Color getChocolate() {
    return chocolate;
  }

  public void setChocolate(Color chocolate) {
    this.chocolate = chocolate;
  }

  public Color coral(Color coral) {
    this.coral = coral;
    return this;
  }

   /**
   * Get coral
   * @return coral
  **/
  @ApiModelProperty(value = "")
  public Color getCoral() {
    return coral;
  }

  public void setCoral(Color coral) {
    this.coral = coral;
  }

  public Color cornflowerBlue(Color cornflowerBlue) {
    this.cornflowerBlue = cornflowerBlue;
    return this;
  }

   /**
   * Get cornflowerBlue
   * @return cornflowerBlue
  **/
  @ApiModelProperty(value = "")
  public Color getCornflowerBlue() {
    return cornflowerBlue;
  }

  public void setCornflowerBlue(Color cornflowerBlue) {
    this.cornflowerBlue = cornflowerBlue;
  }

  public Color cornsilk(Color cornsilk) {
    this.cornsilk = cornsilk;
    return this;
  }

   /**
   * Get cornsilk
   * @return cornsilk
  **/
  @ApiModelProperty(value = "")
  public Color getCornsilk() {
    return cornsilk;
  }

  public void setCornsilk(Color cornsilk) {
    this.cornsilk = cornsilk;
  }

  public Color crimson(Color crimson) {
    this.crimson = crimson;
    return this;
  }

   /**
   * Get crimson
   * @return crimson
  **/
  @ApiModelProperty(value = "")
  public Color getCrimson() {
    return crimson;
  }

  public void setCrimson(Color crimson) {
    this.crimson = crimson;
  }

  public Color cyan(Color cyan) {
    this.cyan = cyan;
    return this;
  }

   /**
   * Get cyan
   * @return cyan
  **/
  @ApiModelProperty(value = "")
  public Color getCyan() {
    return cyan;
  }

  public void setCyan(Color cyan) {
    this.cyan = cyan;
  }

  public Color darkBlue(Color darkBlue) {
    this.darkBlue = darkBlue;
    return this;
  }

   /**
   * Get darkBlue
   * @return darkBlue
  **/
  @ApiModelProperty(value = "")
  public Color getDarkBlue() {
    return darkBlue;
  }

  public void setDarkBlue(Color darkBlue) {
    this.darkBlue = darkBlue;
  }

  public Color darkCyan(Color darkCyan) {
    this.darkCyan = darkCyan;
    return this;
  }

   /**
   * Get darkCyan
   * @return darkCyan
  **/
  @ApiModelProperty(value = "")
  public Color getDarkCyan() {
    return darkCyan;
  }

  public void setDarkCyan(Color darkCyan) {
    this.darkCyan = darkCyan;
  }

  public Color darkGoldenrod(Color darkGoldenrod) {
    this.darkGoldenrod = darkGoldenrod;
    return this;
  }

   /**
   * Get darkGoldenrod
   * @return darkGoldenrod
  **/
  @ApiModelProperty(value = "")
  public Color getDarkGoldenrod() {
    return darkGoldenrod;
  }

  public void setDarkGoldenrod(Color darkGoldenrod) {
    this.darkGoldenrod = darkGoldenrod;
  }

  public Color darkGray(Color darkGray) {
    this.darkGray = darkGray;
    return this;
  }

   /**
   * Get darkGray
   * @return darkGray
  **/
  @ApiModelProperty(value = "")
  public Color getDarkGray() {
    return darkGray;
  }

  public void setDarkGray(Color darkGray) {
    this.darkGray = darkGray;
  }

  public Color darkGreen(Color darkGreen) {
    this.darkGreen = darkGreen;
    return this;
  }

   /**
   * Get darkGreen
   * @return darkGreen
  **/
  @ApiModelProperty(value = "")
  public Color getDarkGreen() {
    return darkGreen;
  }

  public void setDarkGreen(Color darkGreen) {
    this.darkGreen = darkGreen;
  }

  public Color darkKhaki(Color darkKhaki) {
    this.darkKhaki = darkKhaki;
    return this;
  }

   /**
   * Get darkKhaki
   * @return darkKhaki
  **/
  @ApiModelProperty(value = "")
  public Color getDarkKhaki() {
    return darkKhaki;
  }

  public void setDarkKhaki(Color darkKhaki) {
    this.darkKhaki = darkKhaki;
  }

  public Color darkMagenta(Color darkMagenta) {
    this.darkMagenta = darkMagenta;
    return this;
  }

   /**
   * Get darkMagenta
   * @return darkMagenta
  **/
  @ApiModelProperty(value = "")
  public Color getDarkMagenta() {
    return darkMagenta;
  }

  public void setDarkMagenta(Color darkMagenta) {
    this.darkMagenta = darkMagenta;
  }

  public Color darkOliveGreen(Color darkOliveGreen) {
    this.darkOliveGreen = darkOliveGreen;
    return this;
  }

   /**
   * Get darkOliveGreen
   * @return darkOliveGreen
  **/
  @ApiModelProperty(value = "")
  public Color getDarkOliveGreen() {
    return darkOliveGreen;
  }

  public void setDarkOliveGreen(Color darkOliveGreen) {
    this.darkOliveGreen = darkOliveGreen;
  }

  public Color darkOrange(Color darkOrange) {
    this.darkOrange = darkOrange;
    return this;
  }

   /**
   * Get darkOrange
   * @return darkOrange
  **/
  @ApiModelProperty(value = "")
  public Color getDarkOrange() {
    return darkOrange;
  }

  public void setDarkOrange(Color darkOrange) {
    this.darkOrange = darkOrange;
  }

  public Color darkOrchid(Color darkOrchid) {
    this.darkOrchid = darkOrchid;
    return this;
  }

   /**
   * Get darkOrchid
   * @return darkOrchid
  **/
  @ApiModelProperty(value = "")
  public Color getDarkOrchid() {
    return darkOrchid;
  }

  public void setDarkOrchid(Color darkOrchid) {
    this.darkOrchid = darkOrchid;
  }

  public Color darkRed(Color darkRed) {
    this.darkRed = darkRed;
    return this;
  }

   /**
   * Get darkRed
   * @return darkRed
  **/
  @ApiModelProperty(value = "")
  public Color getDarkRed() {
    return darkRed;
  }

  public void setDarkRed(Color darkRed) {
    this.darkRed = darkRed;
  }

  public Color darkSalmon(Color darkSalmon) {
    this.darkSalmon = darkSalmon;
    return this;
  }

   /**
   * Get darkSalmon
   * @return darkSalmon
  **/
  @ApiModelProperty(value = "")
  public Color getDarkSalmon() {
    return darkSalmon;
  }

  public void setDarkSalmon(Color darkSalmon) {
    this.darkSalmon = darkSalmon;
  }

  public Color darkSeaGreen(Color darkSeaGreen) {
    this.darkSeaGreen = darkSeaGreen;
    return this;
  }

   /**
   * Get darkSeaGreen
   * @return darkSeaGreen
  **/
  @ApiModelProperty(value = "")
  public Color getDarkSeaGreen() {
    return darkSeaGreen;
  }

  public void setDarkSeaGreen(Color darkSeaGreen) {
    this.darkSeaGreen = darkSeaGreen;
  }

  public Color darkSlateBlue(Color darkSlateBlue) {
    this.darkSlateBlue = darkSlateBlue;
    return this;
  }

   /**
   * Get darkSlateBlue
   * @return darkSlateBlue
  **/
  @ApiModelProperty(value = "")
  public Color getDarkSlateBlue() {
    return darkSlateBlue;
  }

  public void setDarkSlateBlue(Color darkSlateBlue) {
    this.darkSlateBlue = darkSlateBlue;
  }

  public Color darkSlateGray(Color darkSlateGray) {
    this.darkSlateGray = darkSlateGray;
    return this;
  }

   /**
   * Get darkSlateGray
   * @return darkSlateGray
  **/
  @ApiModelProperty(value = "")
  public Color getDarkSlateGray() {
    return darkSlateGray;
  }

  public void setDarkSlateGray(Color darkSlateGray) {
    this.darkSlateGray = darkSlateGray;
  }

  public Color darkTurquoise(Color darkTurquoise) {
    this.darkTurquoise = darkTurquoise;
    return this;
  }

   /**
   * Get darkTurquoise
   * @return darkTurquoise
  **/
  @ApiModelProperty(value = "")
  public Color getDarkTurquoise() {
    return darkTurquoise;
  }

  public void setDarkTurquoise(Color darkTurquoise) {
    this.darkTurquoise = darkTurquoise;
  }

  public Color darkViolet(Color darkViolet) {
    this.darkViolet = darkViolet;
    return this;
  }

   /**
   * Get darkViolet
   * @return darkViolet
  **/
  @ApiModelProperty(value = "")
  public Color getDarkViolet() {
    return darkViolet;
  }

  public void setDarkViolet(Color darkViolet) {
    this.darkViolet = darkViolet;
  }

  public Color deepPink(Color deepPink) {
    this.deepPink = deepPink;
    return this;
  }

   /**
   * Get deepPink
   * @return deepPink
  **/
  @ApiModelProperty(value = "")
  public Color getDeepPink() {
    return deepPink;
  }

  public void setDeepPink(Color deepPink) {
    this.deepPink = deepPink;
  }

  public Color deepSkyBlue(Color deepSkyBlue) {
    this.deepSkyBlue = deepSkyBlue;
    return this;
  }

   /**
   * Get deepSkyBlue
   * @return deepSkyBlue
  **/
  @ApiModelProperty(value = "")
  public Color getDeepSkyBlue() {
    return deepSkyBlue;
  }

  public void setDeepSkyBlue(Color deepSkyBlue) {
    this.deepSkyBlue = deepSkyBlue;
  }

  public Color dimGray(Color dimGray) {
    this.dimGray = dimGray;
    return this;
  }

   /**
   * Get dimGray
   * @return dimGray
  **/
  @ApiModelProperty(value = "")
  public Color getDimGray() {
    return dimGray;
  }

  public void setDimGray(Color dimGray) {
    this.dimGray = dimGray;
  }

  public Color dodgerBlue(Color dodgerBlue) {
    this.dodgerBlue = dodgerBlue;
    return this;
  }

   /**
   * Get dodgerBlue
   * @return dodgerBlue
  **/
  @ApiModelProperty(value = "")
  public Color getDodgerBlue() {
    return dodgerBlue;
  }

  public void setDodgerBlue(Color dodgerBlue) {
    this.dodgerBlue = dodgerBlue;
  }

  public Color firebrick(Color firebrick) {
    this.firebrick = firebrick;
    return this;
  }

   /**
   * Get firebrick
   * @return firebrick
  **/
  @ApiModelProperty(value = "")
  public Color getFirebrick() {
    return firebrick;
  }

  public void setFirebrick(Color firebrick) {
    this.firebrick = firebrick;
  }

  public Color floralWhite(Color floralWhite) {
    this.floralWhite = floralWhite;
    return this;
  }

   /**
   * Get floralWhite
   * @return floralWhite
  **/
  @ApiModelProperty(value = "")
  public Color getFloralWhite() {
    return floralWhite;
  }

  public void setFloralWhite(Color floralWhite) {
    this.floralWhite = floralWhite;
  }

  public Color forestGreen(Color forestGreen) {
    this.forestGreen = forestGreen;
    return this;
  }

   /**
   * Get forestGreen
   * @return forestGreen
  **/
  @ApiModelProperty(value = "")
  public Color getForestGreen() {
    return forestGreen;
  }

  public void setForestGreen(Color forestGreen) {
    this.forestGreen = forestGreen;
  }

  public Color fuchsia(Color fuchsia) {
    this.fuchsia = fuchsia;
    return this;
  }

   /**
   * Get fuchsia
   * @return fuchsia
  **/
  @ApiModelProperty(value = "")
  public Color getFuchsia() {
    return fuchsia;
  }

  public void setFuchsia(Color fuchsia) {
    this.fuchsia = fuchsia;
  }

  public Color gainsboro(Color gainsboro) {
    this.gainsboro = gainsboro;
    return this;
  }

   /**
   * Get gainsboro
   * @return gainsboro
  **/
  @ApiModelProperty(value = "")
  public Color getGainsboro() {
    return gainsboro;
  }

  public void setGainsboro(Color gainsboro) {
    this.gainsboro = gainsboro;
  }

  public Color ghostWhite(Color ghostWhite) {
    this.ghostWhite = ghostWhite;
    return this;
  }

   /**
   * Get ghostWhite
   * @return ghostWhite
  **/
  @ApiModelProperty(value = "")
  public Color getGhostWhite() {
    return ghostWhite;
  }

  public void setGhostWhite(Color ghostWhite) {
    this.ghostWhite = ghostWhite;
  }

  public Color gold(Color gold) {
    this.gold = gold;
    return this;
  }

   /**
   * Get gold
   * @return gold
  **/
  @ApiModelProperty(value = "")
  public Color getGold() {
    return gold;
  }

  public void setGold(Color gold) {
    this.gold = gold;
  }

  public Color goldenrod(Color goldenrod) {
    this.goldenrod = goldenrod;
    return this;
  }

   /**
   * Get goldenrod
   * @return goldenrod
  **/
  @ApiModelProperty(value = "")
  public Color getGoldenrod() {
    return goldenrod;
  }

  public void setGoldenrod(Color goldenrod) {
    this.goldenrod = goldenrod;
  }

  public Color gray(Color gray) {
    this.gray = gray;
    return this;
  }

   /**
   * Get gray
   * @return gray
  **/
  @ApiModelProperty(value = "")
  public Color getGray() {
    return gray;
  }

  public void setGray(Color gray) {
    this.gray = gray;
  }

  public Color green(Color green) {
    this.green = green;
    return this;
  }

   /**
   * Get green
   * @return green
  **/
  @ApiModelProperty(value = "")
  public Color getGreen() {
    return green;
  }

  public void setGreen(Color green) {
    this.green = green;
  }

  public Color greenYellow(Color greenYellow) {
    this.greenYellow = greenYellow;
    return this;
  }

   /**
   * Get greenYellow
   * @return greenYellow
  **/
  @ApiModelProperty(value = "")
  public Color getGreenYellow() {
    return greenYellow;
  }

  public void setGreenYellow(Color greenYellow) {
    this.greenYellow = greenYellow;
  }

  public Color honeydew(Color honeydew) {
    this.honeydew = honeydew;
    return this;
  }

   /**
   * Get honeydew
   * @return honeydew
  **/
  @ApiModelProperty(value = "")
  public Color getHoneydew() {
    return honeydew;
  }

  public void setHoneydew(Color honeydew) {
    this.honeydew = honeydew;
  }

  public Color hotPink(Color hotPink) {
    this.hotPink = hotPink;
    return this;
  }

   /**
   * Get hotPink
   * @return hotPink
  **/
  @ApiModelProperty(value = "")
  public Color getHotPink() {
    return hotPink;
  }

  public void setHotPink(Color hotPink) {
    this.hotPink = hotPink;
  }

  public Color indianRed(Color indianRed) {
    this.indianRed = indianRed;
    return this;
  }

   /**
   * Get indianRed
   * @return indianRed
  **/
  @ApiModelProperty(value = "")
  public Color getIndianRed() {
    return indianRed;
  }

  public void setIndianRed(Color indianRed) {
    this.indianRed = indianRed;
  }

  public Color indigo(Color indigo) {
    this.indigo = indigo;
    return this;
  }

   /**
   * Get indigo
   * @return indigo
  **/
  @ApiModelProperty(value = "")
  public Color getIndigo() {
    return indigo;
  }

  public void setIndigo(Color indigo) {
    this.indigo = indigo;
  }

  public Color ivory(Color ivory) {
    this.ivory = ivory;
    return this;
  }

   /**
   * Get ivory
   * @return ivory
  **/
  @ApiModelProperty(value = "")
  public Color getIvory() {
    return ivory;
  }

  public void setIvory(Color ivory) {
    this.ivory = ivory;
  }

  public Color khaki(Color khaki) {
    this.khaki = khaki;
    return this;
  }

   /**
   * Get khaki
   * @return khaki
  **/
  @ApiModelProperty(value = "")
  public Color getKhaki() {
    return khaki;
  }

  public void setKhaki(Color khaki) {
    this.khaki = khaki;
  }

  public Color lavender(Color lavender) {
    this.lavender = lavender;
    return this;
  }

   /**
   * Get lavender
   * @return lavender
  **/
  @ApiModelProperty(value = "")
  public Color getLavender() {
    return lavender;
  }

  public void setLavender(Color lavender) {
    this.lavender = lavender;
  }

  public Color lavenderBlush(Color lavenderBlush) {
    this.lavenderBlush = lavenderBlush;
    return this;
  }

   /**
   * Get lavenderBlush
   * @return lavenderBlush
  **/
  @ApiModelProperty(value = "")
  public Color getLavenderBlush() {
    return lavenderBlush;
  }

  public void setLavenderBlush(Color lavenderBlush) {
    this.lavenderBlush = lavenderBlush;
  }

  public Color lawnGreen(Color lawnGreen) {
    this.lawnGreen = lawnGreen;
    return this;
  }

   /**
   * Get lawnGreen
   * @return lawnGreen
  **/
  @ApiModelProperty(value = "")
  public Color getLawnGreen() {
    return lawnGreen;
  }

  public void setLawnGreen(Color lawnGreen) {
    this.lawnGreen = lawnGreen;
  }

  public Color lemonChiffon(Color lemonChiffon) {
    this.lemonChiffon = lemonChiffon;
    return this;
  }

   /**
   * Get lemonChiffon
   * @return lemonChiffon
  **/
  @ApiModelProperty(value = "")
  public Color getLemonChiffon() {
    return lemonChiffon;
  }

  public void setLemonChiffon(Color lemonChiffon) {
    this.lemonChiffon = lemonChiffon;
  }

  public Color lightBlue(Color lightBlue) {
    this.lightBlue = lightBlue;
    return this;
  }

   /**
   * Get lightBlue
   * @return lightBlue
  **/
  @ApiModelProperty(value = "")
  public Color getLightBlue() {
    return lightBlue;
  }

  public void setLightBlue(Color lightBlue) {
    this.lightBlue = lightBlue;
  }

  public Color lightCoral(Color lightCoral) {
    this.lightCoral = lightCoral;
    return this;
  }

   /**
   * Get lightCoral
   * @return lightCoral
  **/
  @ApiModelProperty(value = "")
  public Color getLightCoral() {
    return lightCoral;
  }

  public void setLightCoral(Color lightCoral) {
    this.lightCoral = lightCoral;
  }

  public Color lightCyan(Color lightCyan) {
    this.lightCyan = lightCyan;
    return this;
  }

   /**
   * Get lightCyan
   * @return lightCyan
  **/
  @ApiModelProperty(value = "")
  public Color getLightCyan() {
    return lightCyan;
  }

  public void setLightCyan(Color lightCyan) {
    this.lightCyan = lightCyan;
  }

  public Color lightGoldenrodYellow(Color lightGoldenrodYellow) {
    this.lightGoldenrodYellow = lightGoldenrodYellow;
    return this;
  }

   /**
   * Get lightGoldenrodYellow
   * @return lightGoldenrodYellow
  **/
  @ApiModelProperty(value = "")
  public Color getLightGoldenrodYellow() {
    return lightGoldenrodYellow;
  }

  public void setLightGoldenrodYellow(Color lightGoldenrodYellow) {
    this.lightGoldenrodYellow = lightGoldenrodYellow;
  }

  public Color lightGreen(Color lightGreen) {
    this.lightGreen = lightGreen;
    return this;
  }

   /**
   * Get lightGreen
   * @return lightGreen
  **/
  @ApiModelProperty(value = "")
  public Color getLightGreen() {
    return lightGreen;
  }

  public void setLightGreen(Color lightGreen) {
    this.lightGreen = lightGreen;
  }

  public Color lightGray(Color lightGray) {
    this.lightGray = lightGray;
    return this;
  }

   /**
   * Get lightGray
   * @return lightGray
  **/
  @ApiModelProperty(value = "")
  public Color getLightGray() {
    return lightGray;
  }

  public void setLightGray(Color lightGray) {
    this.lightGray = lightGray;
  }

  public Color lightPink(Color lightPink) {
    this.lightPink = lightPink;
    return this;
  }

   /**
   * Get lightPink
   * @return lightPink
  **/
  @ApiModelProperty(value = "")
  public Color getLightPink() {
    return lightPink;
  }

  public void setLightPink(Color lightPink) {
    this.lightPink = lightPink;
  }

  public Color lightSalmon(Color lightSalmon) {
    this.lightSalmon = lightSalmon;
    return this;
  }

   /**
   * Get lightSalmon
   * @return lightSalmon
  **/
  @ApiModelProperty(value = "")
  public Color getLightSalmon() {
    return lightSalmon;
  }

  public void setLightSalmon(Color lightSalmon) {
    this.lightSalmon = lightSalmon;
  }

  public Color lightSeaGreen(Color lightSeaGreen) {
    this.lightSeaGreen = lightSeaGreen;
    return this;
  }

   /**
   * Get lightSeaGreen
   * @return lightSeaGreen
  **/
  @ApiModelProperty(value = "")
  public Color getLightSeaGreen() {
    return lightSeaGreen;
  }

  public void setLightSeaGreen(Color lightSeaGreen) {
    this.lightSeaGreen = lightSeaGreen;
  }

  public Color lightSkyBlue(Color lightSkyBlue) {
    this.lightSkyBlue = lightSkyBlue;
    return this;
  }

   /**
   * Get lightSkyBlue
   * @return lightSkyBlue
  **/
  @ApiModelProperty(value = "")
  public Color getLightSkyBlue() {
    return lightSkyBlue;
  }

  public void setLightSkyBlue(Color lightSkyBlue) {
    this.lightSkyBlue = lightSkyBlue;
  }

  public Color lightSlateGray(Color lightSlateGray) {
    this.lightSlateGray = lightSlateGray;
    return this;
  }

   /**
   * Get lightSlateGray
   * @return lightSlateGray
  **/
  @ApiModelProperty(value = "")
  public Color getLightSlateGray() {
    return lightSlateGray;
  }

  public void setLightSlateGray(Color lightSlateGray) {
    this.lightSlateGray = lightSlateGray;
  }

  public Color lightSteelBlue(Color lightSteelBlue) {
    this.lightSteelBlue = lightSteelBlue;
    return this;
  }

   /**
   * Get lightSteelBlue
   * @return lightSteelBlue
  **/
  @ApiModelProperty(value = "")
  public Color getLightSteelBlue() {
    return lightSteelBlue;
  }

  public void setLightSteelBlue(Color lightSteelBlue) {
    this.lightSteelBlue = lightSteelBlue;
  }

  public Color lightYellow(Color lightYellow) {
    this.lightYellow = lightYellow;
    return this;
  }

   /**
   * Get lightYellow
   * @return lightYellow
  **/
  @ApiModelProperty(value = "")
  public Color getLightYellow() {
    return lightYellow;
  }

  public void setLightYellow(Color lightYellow) {
    this.lightYellow = lightYellow;
  }

  public Color lime(Color lime) {
    this.lime = lime;
    return this;
  }

   /**
   * Get lime
   * @return lime
  **/
  @ApiModelProperty(value = "")
  public Color getLime() {
    return lime;
  }

  public void setLime(Color lime) {
    this.lime = lime;
  }

  public Color limeGreen(Color limeGreen) {
    this.limeGreen = limeGreen;
    return this;
  }

   /**
   * Get limeGreen
   * @return limeGreen
  **/
  @ApiModelProperty(value = "")
  public Color getLimeGreen() {
    return limeGreen;
  }

  public void setLimeGreen(Color limeGreen) {
    this.limeGreen = limeGreen;
  }

  public Color linen(Color linen) {
    this.linen = linen;
    return this;
  }

   /**
   * Get linen
   * @return linen
  **/
  @ApiModelProperty(value = "")
  public Color getLinen() {
    return linen;
  }

  public void setLinen(Color linen) {
    this.linen = linen;
  }

  public Color magenta(Color magenta) {
    this.magenta = magenta;
    return this;
  }

   /**
   * Get magenta
   * @return magenta
  **/
  @ApiModelProperty(value = "")
  public Color getMagenta() {
    return magenta;
  }

  public void setMagenta(Color magenta) {
    this.magenta = magenta;
  }

  public Color maroon(Color maroon) {
    this.maroon = maroon;
    return this;
  }

   /**
   * Get maroon
   * @return maroon
  **/
  @ApiModelProperty(value = "")
  public Color getMaroon() {
    return maroon;
  }

  public void setMaroon(Color maroon) {
    this.maroon = maroon;
  }

  public Color mediumAquamarine(Color mediumAquamarine) {
    this.mediumAquamarine = mediumAquamarine;
    return this;
  }

   /**
   * Get mediumAquamarine
   * @return mediumAquamarine
  **/
  @ApiModelProperty(value = "")
  public Color getMediumAquamarine() {
    return mediumAquamarine;
  }

  public void setMediumAquamarine(Color mediumAquamarine) {
    this.mediumAquamarine = mediumAquamarine;
  }

  public Color mediumBlue(Color mediumBlue) {
    this.mediumBlue = mediumBlue;
    return this;
  }

   /**
   * Get mediumBlue
   * @return mediumBlue
  **/
  @ApiModelProperty(value = "")
  public Color getMediumBlue() {
    return mediumBlue;
  }

  public void setMediumBlue(Color mediumBlue) {
    this.mediumBlue = mediumBlue;
  }

  public Color mediumOrchid(Color mediumOrchid) {
    this.mediumOrchid = mediumOrchid;
    return this;
  }

   /**
   * Get mediumOrchid
   * @return mediumOrchid
  **/
  @ApiModelProperty(value = "")
  public Color getMediumOrchid() {
    return mediumOrchid;
  }

  public void setMediumOrchid(Color mediumOrchid) {
    this.mediumOrchid = mediumOrchid;
  }

  public Color mediumPurple(Color mediumPurple) {
    this.mediumPurple = mediumPurple;
    return this;
  }

   /**
   * Get mediumPurple
   * @return mediumPurple
  **/
  @ApiModelProperty(value = "")
  public Color getMediumPurple() {
    return mediumPurple;
  }

  public void setMediumPurple(Color mediumPurple) {
    this.mediumPurple = mediumPurple;
  }

  public Color mediumSeaGreen(Color mediumSeaGreen) {
    this.mediumSeaGreen = mediumSeaGreen;
    return this;
  }

   /**
   * Get mediumSeaGreen
   * @return mediumSeaGreen
  **/
  @ApiModelProperty(value = "")
  public Color getMediumSeaGreen() {
    return mediumSeaGreen;
  }

  public void setMediumSeaGreen(Color mediumSeaGreen) {
    this.mediumSeaGreen = mediumSeaGreen;
  }

  public Color mediumSlateBlue(Color mediumSlateBlue) {
    this.mediumSlateBlue = mediumSlateBlue;
    return this;
  }

   /**
   * Get mediumSlateBlue
   * @return mediumSlateBlue
  **/
  @ApiModelProperty(value = "")
  public Color getMediumSlateBlue() {
    return mediumSlateBlue;
  }

  public void setMediumSlateBlue(Color mediumSlateBlue) {
    this.mediumSlateBlue = mediumSlateBlue;
  }

  public Color mediumSpringGreen(Color mediumSpringGreen) {
    this.mediumSpringGreen = mediumSpringGreen;
    return this;
  }

   /**
   * Get mediumSpringGreen
   * @return mediumSpringGreen
  **/
  @ApiModelProperty(value = "")
  public Color getMediumSpringGreen() {
    return mediumSpringGreen;
  }

  public void setMediumSpringGreen(Color mediumSpringGreen) {
    this.mediumSpringGreen = mediumSpringGreen;
  }

  public Color mediumTurquoise(Color mediumTurquoise) {
    this.mediumTurquoise = mediumTurquoise;
    return this;
  }

   /**
   * Get mediumTurquoise
   * @return mediumTurquoise
  **/
  @ApiModelProperty(value = "")
  public Color getMediumTurquoise() {
    return mediumTurquoise;
  }

  public void setMediumTurquoise(Color mediumTurquoise) {
    this.mediumTurquoise = mediumTurquoise;
  }

  public Color mediumVioletRed(Color mediumVioletRed) {
    this.mediumVioletRed = mediumVioletRed;
    return this;
  }

   /**
   * Get mediumVioletRed
   * @return mediumVioletRed
  **/
  @ApiModelProperty(value = "")
  public Color getMediumVioletRed() {
    return mediumVioletRed;
  }

  public void setMediumVioletRed(Color mediumVioletRed) {
    this.mediumVioletRed = mediumVioletRed;
  }

  public Color midnightBlue(Color midnightBlue) {
    this.midnightBlue = midnightBlue;
    return this;
  }

   /**
   * Get midnightBlue
   * @return midnightBlue
  **/
  @ApiModelProperty(value = "")
  public Color getMidnightBlue() {
    return midnightBlue;
  }

  public void setMidnightBlue(Color midnightBlue) {
    this.midnightBlue = midnightBlue;
  }

  public Color mintCream(Color mintCream) {
    this.mintCream = mintCream;
    return this;
  }

   /**
   * Get mintCream
   * @return mintCream
  **/
  @ApiModelProperty(value = "")
  public Color getMintCream() {
    return mintCream;
  }

  public void setMintCream(Color mintCream) {
    this.mintCream = mintCream;
  }

  public Color mistyRose(Color mistyRose) {
    this.mistyRose = mistyRose;
    return this;
  }

   /**
   * Get mistyRose
   * @return mistyRose
  **/
  @ApiModelProperty(value = "")
  public Color getMistyRose() {
    return mistyRose;
  }

  public void setMistyRose(Color mistyRose) {
    this.mistyRose = mistyRose;
  }

  public Color moccasin(Color moccasin) {
    this.moccasin = moccasin;
    return this;
  }

   /**
   * Get moccasin
   * @return moccasin
  **/
  @ApiModelProperty(value = "")
  public Color getMoccasin() {
    return moccasin;
  }

  public void setMoccasin(Color moccasin) {
    this.moccasin = moccasin;
  }

  public Color navajoWhite(Color navajoWhite) {
    this.navajoWhite = navajoWhite;
    return this;
  }

   /**
   * Get navajoWhite
   * @return navajoWhite
  **/
  @ApiModelProperty(value = "")
  public Color getNavajoWhite() {
    return navajoWhite;
  }

  public void setNavajoWhite(Color navajoWhite) {
    this.navajoWhite = navajoWhite;
  }

  public Color navy(Color navy) {
    this.navy = navy;
    return this;
  }

   /**
   * Get navy
   * @return navy
  **/
  @ApiModelProperty(value = "")
  public Color getNavy() {
    return navy;
  }

  public void setNavy(Color navy) {
    this.navy = navy;
  }

  public Color oldLace(Color oldLace) {
    this.oldLace = oldLace;
    return this;
  }

   /**
   * Get oldLace
   * @return oldLace
  **/
  @ApiModelProperty(value = "")
  public Color getOldLace() {
    return oldLace;
  }

  public void setOldLace(Color oldLace) {
    this.oldLace = oldLace;
  }

  public Color olive(Color olive) {
    this.olive = olive;
    return this;
  }

   /**
   * Get olive
   * @return olive
  **/
  @ApiModelProperty(value = "")
  public Color getOlive() {
    return olive;
  }

  public void setOlive(Color olive) {
    this.olive = olive;
  }

  public Color oliveDrab(Color oliveDrab) {
    this.oliveDrab = oliveDrab;
    return this;
  }

   /**
   * Get oliveDrab
   * @return oliveDrab
  **/
  @ApiModelProperty(value = "")
  public Color getOliveDrab() {
    return oliveDrab;
  }

  public void setOliveDrab(Color oliveDrab) {
    this.oliveDrab = oliveDrab;
  }

  public Color orange(Color orange) {
    this.orange = orange;
    return this;
  }

   /**
   * Get orange
   * @return orange
  **/
  @ApiModelProperty(value = "")
  public Color getOrange() {
    return orange;
  }

  public void setOrange(Color orange) {
    this.orange = orange;
  }

  public Color orangeRed(Color orangeRed) {
    this.orangeRed = orangeRed;
    return this;
  }

   /**
   * Get orangeRed
   * @return orangeRed
  **/
  @ApiModelProperty(value = "")
  public Color getOrangeRed() {
    return orangeRed;
  }

  public void setOrangeRed(Color orangeRed) {
    this.orangeRed = orangeRed;
  }

  public Color orchid(Color orchid) {
    this.orchid = orchid;
    return this;
  }

   /**
   * Get orchid
   * @return orchid
  **/
  @ApiModelProperty(value = "")
  public Color getOrchid() {
    return orchid;
  }

  public void setOrchid(Color orchid) {
    this.orchid = orchid;
  }

  public Color paleGoldenrod(Color paleGoldenrod) {
    this.paleGoldenrod = paleGoldenrod;
    return this;
  }

   /**
   * Get paleGoldenrod
   * @return paleGoldenrod
  **/
  @ApiModelProperty(value = "")
  public Color getPaleGoldenrod() {
    return paleGoldenrod;
  }

  public void setPaleGoldenrod(Color paleGoldenrod) {
    this.paleGoldenrod = paleGoldenrod;
  }

  public Color paleGreen(Color paleGreen) {
    this.paleGreen = paleGreen;
    return this;
  }

   /**
   * Get paleGreen
   * @return paleGreen
  **/
  @ApiModelProperty(value = "")
  public Color getPaleGreen() {
    return paleGreen;
  }

  public void setPaleGreen(Color paleGreen) {
    this.paleGreen = paleGreen;
  }

  public Color paleTurquoise(Color paleTurquoise) {
    this.paleTurquoise = paleTurquoise;
    return this;
  }

   /**
   * Get paleTurquoise
   * @return paleTurquoise
  **/
  @ApiModelProperty(value = "")
  public Color getPaleTurquoise() {
    return paleTurquoise;
  }

  public void setPaleTurquoise(Color paleTurquoise) {
    this.paleTurquoise = paleTurquoise;
  }

  public Color paleVioletRed(Color paleVioletRed) {
    this.paleVioletRed = paleVioletRed;
    return this;
  }

   /**
   * Get paleVioletRed
   * @return paleVioletRed
  **/
  @ApiModelProperty(value = "")
  public Color getPaleVioletRed() {
    return paleVioletRed;
  }

  public void setPaleVioletRed(Color paleVioletRed) {
    this.paleVioletRed = paleVioletRed;
  }

  public Color papayaWhip(Color papayaWhip) {
    this.papayaWhip = papayaWhip;
    return this;
  }

   /**
   * Get papayaWhip
   * @return papayaWhip
  **/
  @ApiModelProperty(value = "")
  public Color getPapayaWhip() {
    return papayaWhip;
  }

  public void setPapayaWhip(Color papayaWhip) {
    this.papayaWhip = papayaWhip;
  }

  public Color peachPuff(Color peachPuff) {
    this.peachPuff = peachPuff;
    return this;
  }

   /**
   * Get peachPuff
   * @return peachPuff
  **/
  @ApiModelProperty(value = "")
  public Color getPeachPuff() {
    return peachPuff;
  }

  public void setPeachPuff(Color peachPuff) {
    this.peachPuff = peachPuff;
  }

  public Color peru(Color peru) {
    this.peru = peru;
    return this;
  }

   /**
   * Get peru
   * @return peru
  **/
  @ApiModelProperty(value = "")
  public Color getPeru() {
    return peru;
  }

  public void setPeru(Color peru) {
    this.peru = peru;
  }

  public Color pink(Color pink) {
    this.pink = pink;
    return this;
  }

   /**
   * Get pink
   * @return pink
  **/
  @ApiModelProperty(value = "")
  public Color getPink() {
    return pink;
  }

  public void setPink(Color pink) {
    this.pink = pink;
  }

  public Color plum(Color plum) {
    this.plum = plum;
    return this;
  }

   /**
   * Get plum
   * @return plum
  **/
  @ApiModelProperty(value = "")
  public Color getPlum() {
    return plum;
  }

  public void setPlum(Color plum) {
    this.plum = plum;
  }

  public Color powderBlue(Color powderBlue) {
    this.powderBlue = powderBlue;
    return this;
  }

   /**
   * Get powderBlue
   * @return powderBlue
  **/
  @ApiModelProperty(value = "")
  public Color getPowderBlue() {
    return powderBlue;
  }

  public void setPowderBlue(Color powderBlue) {
    this.powderBlue = powderBlue;
  }

  public Color purple(Color purple) {
    this.purple = purple;
    return this;
  }

   /**
   * Get purple
   * @return purple
  **/
  @ApiModelProperty(value = "")
  public Color getPurple() {
    return purple;
  }

  public void setPurple(Color purple) {
    this.purple = purple;
  }

  public Color red(Color red) {
    this.red = red;
    return this;
  }

   /**
   * Get red
   * @return red
  **/
  @ApiModelProperty(value = "")
  public Color getRed() {
    return red;
  }

  public void setRed(Color red) {
    this.red = red;
  }

  public Color rosyBrown(Color rosyBrown) {
    this.rosyBrown = rosyBrown;
    return this;
  }

   /**
   * Get rosyBrown
   * @return rosyBrown
  **/
  @ApiModelProperty(value = "")
  public Color getRosyBrown() {
    return rosyBrown;
  }

  public void setRosyBrown(Color rosyBrown) {
    this.rosyBrown = rosyBrown;
  }

  public Color royalBlue(Color royalBlue) {
    this.royalBlue = royalBlue;
    return this;
  }

   /**
   * Get royalBlue
   * @return royalBlue
  **/
  @ApiModelProperty(value = "")
  public Color getRoyalBlue() {
    return royalBlue;
  }

  public void setRoyalBlue(Color royalBlue) {
    this.royalBlue = royalBlue;
  }

  public Color saddleBrown(Color saddleBrown) {
    this.saddleBrown = saddleBrown;
    return this;
  }

   /**
   * Get saddleBrown
   * @return saddleBrown
  **/
  @ApiModelProperty(value = "")
  public Color getSaddleBrown() {
    return saddleBrown;
  }

  public void setSaddleBrown(Color saddleBrown) {
    this.saddleBrown = saddleBrown;
  }

  public Color salmon(Color salmon) {
    this.salmon = salmon;
    return this;
  }

   /**
   * Get salmon
   * @return salmon
  **/
  @ApiModelProperty(value = "")
  public Color getSalmon() {
    return salmon;
  }

  public void setSalmon(Color salmon) {
    this.salmon = salmon;
  }

  public Color sandyBrown(Color sandyBrown) {
    this.sandyBrown = sandyBrown;
    return this;
  }

   /**
   * Get sandyBrown
   * @return sandyBrown
  **/
  @ApiModelProperty(value = "")
  public Color getSandyBrown() {
    return sandyBrown;
  }

  public void setSandyBrown(Color sandyBrown) {
    this.sandyBrown = sandyBrown;
  }

  public Color seaGreen(Color seaGreen) {
    this.seaGreen = seaGreen;
    return this;
  }

   /**
   * Get seaGreen
   * @return seaGreen
  **/
  @ApiModelProperty(value = "")
  public Color getSeaGreen() {
    return seaGreen;
  }

  public void setSeaGreen(Color seaGreen) {
    this.seaGreen = seaGreen;
  }

  public Color seaShell(Color seaShell) {
    this.seaShell = seaShell;
    return this;
  }

   /**
   * Get seaShell
   * @return seaShell
  **/
  @ApiModelProperty(value = "")
  public Color getSeaShell() {
    return seaShell;
  }

  public void setSeaShell(Color seaShell) {
    this.seaShell = seaShell;
  }

  public Color sienna(Color sienna) {
    this.sienna = sienna;
    return this;
  }

   /**
   * Get sienna
   * @return sienna
  **/
  @ApiModelProperty(value = "")
  public Color getSienna() {
    return sienna;
  }

  public void setSienna(Color sienna) {
    this.sienna = sienna;
  }

  public Color silver(Color silver) {
    this.silver = silver;
    return this;
  }

   /**
   * Get silver
   * @return silver
  **/
  @ApiModelProperty(value = "")
  public Color getSilver() {
    return silver;
  }

  public void setSilver(Color silver) {
    this.silver = silver;
  }

  public Color skyBlue(Color skyBlue) {
    this.skyBlue = skyBlue;
    return this;
  }

   /**
   * Get skyBlue
   * @return skyBlue
  **/
  @ApiModelProperty(value = "")
  public Color getSkyBlue() {
    return skyBlue;
  }

  public void setSkyBlue(Color skyBlue) {
    this.skyBlue = skyBlue;
  }

  public Color slateBlue(Color slateBlue) {
    this.slateBlue = slateBlue;
    return this;
  }

   /**
   * Get slateBlue
   * @return slateBlue
  **/
  @ApiModelProperty(value = "")
  public Color getSlateBlue() {
    return slateBlue;
  }

  public void setSlateBlue(Color slateBlue) {
    this.slateBlue = slateBlue;
  }

  public Color slateGray(Color slateGray) {
    this.slateGray = slateGray;
    return this;
  }

   /**
   * Get slateGray
   * @return slateGray
  **/
  @ApiModelProperty(value = "")
  public Color getSlateGray() {
    return slateGray;
  }

  public void setSlateGray(Color slateGray) {
    this.slateGray = slateGray;
  }

  public Color snow(Color snow) {
    this.snow = snow;
    return this;
  }

   /**
   * Get snow
   * @return snow
  **/
  @ApiModelProperty(value = "")
  public Color getSnow() {
    return snow;
  }

  public void setSnow(Color snow) {
    this.snow = snow;
  }

  public Color springGreen(Color springGreen) {
    this.springGreen = springGreen;
    return this;
  }

   /**
   * Get springGreen
   * @return springGreen
  **/
  @ApiModelProperty(value = "")
  public Color getSpringGreen() {
    return springGreen;
  }

  public void setSpringGreen(Color springGreen) {
    this.springGreen = springGreen;
  }

  public Color steelBlue(Color steelBlue) {
    this.steelBlue = steelBlue;
    return this;
  }

   /**
   * Get steelBlue
   * @return steelBlue
  **/
  @ApiModelProperty(value = "")
  public Color getSteelBlue() {
    return steelBlue;
  }

  public void setSteelBlue(Color steelBlue) {
    this.steelBlue = steelBlue;
  }

  public Color tan(Color tan) {
    this.tan = tan;
    return this;
  }

   /**
   * Get tan
   * @return tan
  **/
  @ApiModelProperty(value = "")
  public Color getTan() {
    return tan;
  }

  public void setTan(Color tan) {
    this.tan = tan;
  }

  public Color teal(Color teal) {
    this.teal = teal;
    return this;
  }

   /**
   * Get teal
   * @return teal
  **/
  @ApiModelProperty(value = "")
  public Color getTeal() {
    return teal;
  }

  public void setTeal(Color teal) {
    this.teal = teal;
  }

  public Color thistle(Color thistle) {
    this.thistle = thistle;
    return this;
  }

   /**
   * Get thistle
   * @return thistle
  **/
  @ApiModelProperty(value = "")
  public Color getThistle() {
    return thistle;
  }

  public void setThistle(Color thistle) {
    this.thistle = thistle;
  }

  public Color tomato(Color tomato) {
    this.tomato = tomato;
    return this;
  }

   /**
   * Get tomato
   * @return tomato
  **/
  @ApiModelProperty(value = "")
  public Color getTomato() {
    return tomato;
  }

  public void setTomato(Color tomato) {
    this.tomato = tomato;
  }

  public Color turquoise(Color turquoise) {
    this.turquoise = turquoise;
    return this;
  }

   /**
   * Get turquoise
   * @return turquoise
  **/
  @ApiModelProperty(value = "")
  public Color getTurquoise() {
    return turquoise;
  }

  public void setTurquoise(Color turquoise) {
    this.turquoise = turquoise;
  }

  public Color violet(Color violet) {
    this.violet = violet;
    return this;
  }

   /**
   * Get violet
   * @return violet
  **/
  @ApiModelProperty(value = "")
  public Color getViolet() {
    return violet;
  }

  public void setViolet(Color violet) {
    this.violet = violet;
  }

  public Color wheat(Color wheat) {
    this.wheat = wheat;
    return this;
  }

   /**
   * Get wheat
   * @return wheat
  **/
  @ApiModelProperty(value = "")
  public Color getWheat() {
    return wheat;
  }

  public void setWheat(Color wheat) {
    this.wheat = wheat;
  }

  public Color white(Color white) {
    this.white = white;
    return this;
  }

   /**
   * Get white
   * @return white
  **/
  @ApiModelProperty(value = "")
  public Color getWhite() {
    return white;
  }

  public void setWhite(Color white) {
    this.white = white;
  }

  public Color whiteSmoke(Color whiteSmoke) {
    this.whiteSmoke = whiteSmoke;
    return this;
  }

   /**
   * Get whiteSmoke
   * @return whiteSmoke
  **/
  @ApiModelProperty(value = "")
  public Color getWhiteSmoke() {
    return whiteSmoke;
  }

  public void setWhiteSmoke(Color whiteSmoke) {
    this.whiteSmoke = whiteSmoke;
  }

  public Color yellow(Color yellow) {
    this.yellow = yellow;
    return this;
  }

   /**
   * Get yellow
   * @return yellow
  **/
  @ApiModelProperty(value = "")
  public Color getYellow() {
    return yellow;
  }

  public void setYellow(Color yellow) {
    this.yellow = yellow;
  }

  public Color yellowGreen(Color yellowGreen) {
    this.yellowGreen = yellowGreen;
    return this;
  }

   /**
   * Get yellowGreen
   * @return yellowGreen
  **/
  @ApiModelProperty(value = "")
  public Color getYellowGreen() {
    return yellowGreen;
  }

  public void setYellowGreen(Color yellowGreen) {
    this.yellowGreen = yellowGreen;
  }

  public Color R(Integer R) {
    this.R = R;
    return this;
  }

   /**
   * Get R
   * @return R
  **/
  @ApiModelProperty(value = "")
  public Integer getR() {
    return R;
  }

  public void setR(Integer R) {
    this.R = R;
  }

  public Color G(Integer G) {
    this.G = G;
    return this;
  }

   /**
   * Get G
   * @return G
  **/
  @ApiModelProperty(value = "")
  public Integer getG() {
    return G;
  }

  public void setG(Integer G) {
    this.G = G;
  }

  public Color B(Integer B) {
    this.B = B;
    return this;
  }

   /**
   * Get B
   * @return B
  **/
  @ApiModelProperty(value = "")
  public Integer getB() {
    return B;
  }

  public void setB(Integer B) {
    this.B = B;
  }

  public Color A(Integer A) {
    this.A = A;
    return this;
  }

   /**
   * Get A
   * @return A
  **/
  @ApiModelProperty(value = "")
  public Integer getA() {
    return A;
  }

  public void setA(Integer A) {
    this.A = A;
  }

  public Color isKnownColor(Boolean isKnownColor) {
    this.isKnownColor = isKnownColor;
    return this;
  }

   /**
   * Get isKnownColor
   * @return isKnownColor
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsKnownColor() {
    return isKnownColor;
  }

  public void setIsKnownColor(Boolean isKnownColor) {
    this.isKnownColor = isKnownColor;
  }

  public Color isEmpty(Boolean isEmpty) {
    this.isEmpty = isEmpty;
    return this;
  }

   /**
   * Get isEmpty
   * @return isEmpty
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsEmpty() {
    return isEmpty;
  }

  public void setIsEmpty(Boolean isEmpty) {
    this.isEmpty = isEmpty;
  }

  public Color isNamedColor(Boolean isNamedColor) {
    this.isNamedColor = isNamedColor;
    return this;
  }

   /**
   * Get isNamedColor
   * @return isNamedColor
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsNamedColor() {
    return isNamedColor;
  }

  public void setIsNamedColor(Boolean isNamedColor) {
    this.isNamedColor = isNamedColor;
  }

  public Color isSystemColor(Boolean isSystemColor) {
    this.isSystemColor = isSystemColor;
    return this;
  }

   /**
   * Get isSystemColor
   * @return isSystemColor
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsSystemColor() {
    return isSystemColor;
  }

  public void setIsSystemColor(Boolean isSystemColor) {
    this.isSystemColor = isSystemColor;
  }

  public Color name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Color empty(Color empty) {
    this.empty = empty;
    return this;
  }

   /**
   * Get empty
   * @return empty
  **/
  @ApiModelProperty(value = "")
  public Color getEmpty() {
    return empty;
  }

  public void setEmpty(Color empty) {
    this.empty = empty;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Color color = (Color) o;
    return Objects.equals(this.transparent, color.transparent) &&
        Objects.equals(this.aliceBlue, color.aliceBlue) &&
        Objects.equals(this.antiqueWhite, color.antiqueWhite) &&
        Objects.equals(this.aqua, color.aqua) &&
        Objects.equals(this.aquamarine, color.aquamarine) &&
        Objects.equals(this.azure, color.azure) &&
        Objects.equals(this.beige, color.beige) &&
        Objects.equals(this.bisque, color.bisque) &&
        Objects.equals(this.black, color.black) &&
        Objects.equals(this.blanchedAlmond, color.blanchedAlmond) &&
        Objects.equals(this.blue, color.blue) &&
        Objects.equals(this.blueViolet, color.blueViolet) &&
        Objects.equals(this.brown, color.brown) &&
        Objects.equals(this.burlyWood, color.burlyWood) &&
        Objects.equals(this.cadetBlue, color.cadetBlue) &&
        Objects.equals(this.chartreuse, color.chartreuse) &&
        Objects.equals(this.chocolate, color.chocolate) &&
        Objects.equals(this.coral, color.coral) &&
        Objects.equals(this.cornflowerBlue, color.cornflowerBlue) &&
        Objects.equals(this.cornsilk, color.cornsilk) &&
        Objects.equals(this.crimson, color.crimson) &&
        Objects.equals(this.cyan, color.cyan) &&
        Objects.equals(this.darkBlue, color.darkBlue) &&
        Objects.equals(this.darkCyan, color.darkCyan) &&
        Objects.equals(this.darkGoldenrod, color.darkGoldenrod) &&
        Objects.equals(this.darkGray, color.darkGray) &&
        Objects.equals(this.darkGreen, color.darkGreen) &&
        Objects.equals(this.darkKhaki, color.darkKhaki) &&
        Objects.equals(this.darkMagenta, color.darkMagenta) &&
        Objects.equals(this.darkOliveGreen, color.darkOliveGreen) &&
        Objects.equals(this.darkOrange, color.darkOrange) &&
        Objects.equals(this.darkOrchid, color.darkOrchid) &&
        Objects.equals(this.darkRed, color.darkRed) &&
        Objects.equals(this.darkSalmon, color.darkSalmon) &&
        Objects.equals(this.darkSeaGreen, color.darkSeaGreen) &&
        Objects.equals(this.darkSlateBlue, color.darkSlateBlue) &&
        Objects.equals(this.darkSlateGray, color.darkSlateGray) &&
        Objects.equals(this.darkTurquoise, color.darkTurquoise) &&
        Objects.equals(this.darkViolet, color.darkViolet) &&
        Objects.equals(this.deepPink, color.deepPink) &&
        Objects.equals(this.deepSkyBlue, color.deepSkyBlue) &&
        Objects.equals(this.dimGray, color.dimGray) &&
        Objects.equals(this.dodgerBlue, color.dodgerBlue) &&
        Objects.equals(this.firebrick, color.firebrick) &&
        Objects.equals(this.floralWhite, color.floralWhite) &&
        Objects.equals(this.forestGreen, color.forestGreen) &&
        Objects.equals(this.fuchsia, color.fuchsia) &&
        Objects.equals(this.gainsboro, color.gainsboro) &&
        Objects.equals(this.ghostWhite, color.ghostWhite) &&
        Objects.equals(this.gold, color.gold) &&
        Objects.equals(this.goldenrod, color.goldenrod) &&
        Objects.equals(this.gray, color.gray) &&
        Objects.equals(this.green, color.green) &&
        Objects.equals(this.greenYellow, color.greenYellow) &&
        Objects.equals(this.honeydew, color.honeydew) &&
        Objects.equals(this.hotPink, color.hotPink) &&
        Objects.equals(this.indianRed, color.indianRed) &&
        Objects.equals(this.indigo, color.indigo) &&
        Objects.equals(this.ivory, color.ivory) &&
        Objects.equals(this.khaki, color.khaki) &&
        Objects.equals(this.lavender, color.lavender) &&
        Objects.equals(this.lavenderBlush, color.lavenderBlush) &&
        Objects.equals(this.lawnGreen, color.lawnGreen) &&
        Objects.equals(this.lemonChiffon, color.lemonChiffon) &&
        Objects.equals(this.lightBlue, color.lightBlue) &&
        Objects.equals(this.lightCoral, color.lightCoral) &&
        Objects.equals(this.lightCyan, color.lightCyan) &&
        Objects.equals(this.lightGoldenrodYellow, color.lightGoldenrodYellow) &&
        Objects.equals(this.lightGreen, color.lightGreen) &&
        Objects.equals(this.lightGray, color.lightGray) &&
        Objects.equals(this.lightPink, color.lightPink) &&
        Objects.equals(this.lightSalmon, color.lightSalmon) &&
        Objects.equals(this.lightSeaGreen, color.lightSeaGreen) &&
        Objects.equals(this.lightSkyBlue, color.lightSkyBlue) &&
        Objects.equals(this.lightSlateGray, color.lightSlateGray) &&
        Objects.equals(this.lightSteelBlue, color.lightSteelBlue) &&
        Objects.equals(this.lightYellow, color.lightYellow) &&
        Objects.equals(this.lime, color.lime) &&
        Objects.equals(this.limeGreen, color.limeGreen) &&
        Objects.equals(this.linen, color.linen) &&
        Objects.equals(this.magenta, color.magenta) &&
        Objects.equals(this.maroon, color.maroon) &&
        Objects.equals(this.mediumAquamarine, color.mediumAquamarine) &&
        Objects.equals(this.mediumBlue, color.mediumBlue) &&
        Objects.equals(this.mediumOrchid, color.mediumOrchid) &&
        Objects.equals(this.mediumPurple, color.mediumPurple) &&
        Objects.equals(this.mediumSeaGreen, color.mediumSeaGreen) &&
        Objects.equals(this.mediumSlateBlue, color.mediumSlateBlue) &&
        Objects.equals(this.mediumSpringGreen, color.mediumSpringGreen) &&
        Objects.equals(this.mediumTurquoise, color.mediumTurquoise) &&
        Objects.equals(this.mediumVioletRed, color.mediumVioletRed) &&
        Objects.equals(this.midnightBlue, color.midnightBlue) &&
        Objects.equals(this.mintCream, color.mintCream) &&
        Objects.equals(this.mistyRose, color.mistyRose) &&
        Objects.equals(this.moccasin, color.moccasin) &&
        Objects.equals(this.navajoWhite, color.navajoWhite) &&
        Objects.equals(this.navy, color.navy) &&
        Objects.equals(this.oldLace, color.oldLace) &&
        Objects.equals(this.olive, color.olive) &&
        Objects.equals(this.oliveDrab, color.oliveDrab) &&
        Objects.equals(this.orange, color.orange) &&
        Objects.equals(this.orangeRed, color.orangeRed) &&
        Objects.equals(this.orchid, color.orchid) &&
        Objects.equals(this.paleGoldenrod, color.paleGoldenrod) &&
        Objects.equals(this.paleGreen, color.paleGreen) &&
        Objects.equals(this.paleTurquoise, color.paleTurquoise) &&
        Objects.equals(this.paleVioletRed, color.paleVioletRed) &&
        Objects.equals(this.papayaWhip, color.papayaWhip) &&
        Objects.equals(this.peachPuff, color.peachPuff) &&
        Objects.equals(this.peru, color.peru) &&
        Objects.equals(this.pink, color.pink) &&
        Objects.equals(this.plum, color.plum) &&
        Objects.equals(this.powderBlue, color.powderBlue) &&
        Objects.equals(this.purple, color.purple) &&
        Objects.equals(this.red, color.red) &&
        Objects.equals(this.rosyBrown, color.rosyBrown) &&
        Objects.equals(this.royalBlue, color.royalBlue) &&
        Objects.equals(this.saddleBrown, color.saddleBrown) &&
        Objects.equals(this.salmon, color.salmon) &&
        Objects.equals(this.sandyBrown, color.sandyBrown) &&
        Objects.equals(this.seaGreen, color.seaGreen) &&
        Objects.equals(this.seaShell, color.seaShell) &&
        Objects.equals(this.sienna, color.sienna) &&
        Objects.equals(this.silver, color.silver) &&
        Objects.equals(this.skyBlue, color.skyBlue) &&
        Objects.equals(this.slateBlue, color.slateBlue) &&
        Objects.equals(this.slateGray, color.slateGray) &&
        Objects.equals(this.snow, color.snow) &&
        Objects.equals(this.springGreen, color.springGreen) &&
        Objects.equals(this.steelBlue, color.steelBlue) &&
        Objects.equals(this.tan, color.tan) &&
        Objects.equals(this.teal, color.teal) &&
        Objects.equals(this.thistle, color.thistle) &&
        Objects.equals(this.tomato, color.tomato) &&
        Objects.equals(this.turquoise, color.turquoise) &&
        Objects.equals(this.violet, color.violet) &&
        Objects.equals(this.wheat, color.wheat) &&
        Objects.equals(this.white, color.white) &&
        Objects.equals(this.whiteSmoke, color.whiteSmoke) &&
        Objects.equals(this.yellow, color.yellow) &&
        Objects.equals(this.yellowGreen, color.yellowGreen) &&
        Objects.equals(this.R, color.R) &&
        Objects.equals(this.G, color.G) &&
        Objects.equals(this.B, color.B) &&
        Objects.equals(this.A, color.A) &&
        Objects.equals(this.isKnownColor, color.isKnownColor) &&
        Objects.equals(this.isEmpty, color.isEmpty) &&
        Objects.equals(this.isNamedColor, color.isNamedColor) &&
        Objects.equals(this.isSystemColor, color.isSystemColor) &&
        Objects.equals(this.name, color.name) &&
        Objects.equals(this.empty, color.empty) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transparent, aliceBlue, antiqueWhite, aqua, aquamarine, azure, beige, bisque, black, blanchedAlmond, blue, blueViolet, brown, burlyWood, cadetBlue, chartreuse, chocolate, coral, cornflowerBlue, cornsilk, crimson, cyan, darkBlue, darkCyan, darkGoldenrod, darkGray, darkGreen, darkKhaki, darkMagenta, darkOliveGreen, darkOrange, darkOrchid, darkRed, darkSalmon, darkSeaGreen, darkSlateBlue, darkSlateGray, darkTurquoise, darkViolet, deepPink, deepSkyBlue, dimGray, dodgerBlue, firebrick, floralWhite, forestGreen, fuchsia, gainsboro, ghostWhite, gold, goldenrod, gray, green, greenYellow, honeydew, hotPink, indianRed, indigo, ivory, khaki, lavender, lavenderBlush, lawnGreen, lemonChiffon, lightBlue, lightCoral, lightCyan, lightGoldenrodYellow, lightGreen, lightGray, lightPink, lightSalmon, lightSeaGreen, lightSkyBlue, lightSlateGray, lightSteelBlue, lightYellow, lime, limeGreen, linen, magenta, maroon, mediumAquamarine, mediumBlue, mediumOrchid, mediumPurple, mediumSeaGreen, mediumSlateBlue, mediumSpringGreen, mediumTurquoise, mediumVioletRed, midnightBlue, mintCream, mistyRose, moccasin, navajoWhite, navy, oldLace, olive, oliveDrab, orange, orangeRed, orchid, paleGoldenrod, paleGreen, paleTurquoise, paleVioletRed, papayaWhip, peachPuff, peru, pink, plum, powderBlue, purple, red, rosyBrown, royalBlue, saddleBrown, salmon, sandyBrown, seaGreen, seaShell, sienna, silver, skyBlue, slateBlue, slateGray, snow, springGreen, steelBlue, tan, teal, thistle, tomato, turquoise, violet, wheat, white, whiteSmoke, yellow, yellowGreen, R, G, B, A, isKnownColor, isEmpty, isNamedColor, isSystemColor, name, empty, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Color {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    transparent: ").append(toIndentedString(transparent)).append("\n");
    sb.append("    aliceBlue: ").append(toIndentedString(aliceBlue)).append("\n");
    sb.append("    antiqueWhite: ").append(toIndentedString(antiqueWhite)).append("\n");
    sb.append("    aqua: ").append(toIndentedString(aqua)).append("\n");
    sb.append("    aquamarine: ").append(toIndentedString(aquamarine)).append("\n");
    sb.append("    azure: ").append(toIndentedString(azure)).append("\n");
    sb.append("    beige: ").append(toIndentedString(beige)).append("\n");
    sb.append("    bisque: ").append(toIndentedString(bisque)).append("\n");
    sb.append("    black: ").append(toIndentedString(black)).append("\n");
    sb.append("    blanchedAlmond: ").append(toIndentedString(blanchedAlmond)).append("\n");
    sb.append("    blue: ").append(toIndentedString(blue)).append("\n");
    sb.append("    blueViolet: ").append(toIndentedString(blueViolet)).append("\n");
    sb.append("    brown: ").append(toIndentedString(brown)).append("\n");
    sb.append("    burlyWood: ").append(toIndentedString(burlyWood)).append("\n");
    sb.append("    cadetBlue: ").append(toIndentedString(cadetBlue)).append("\n");
    sb.append("    chartreuse: ").append(toIndentedString(chartreuse)).append("\n");
    sb.append("    chocolate: ").append(toIndentedString(chocolate)).append("\n");
    sb.append("    coral: ").append(toIndentedString(coral)).append("\n");
    sb.append("    cornflowerBlue: ").append(toIndentedString(cornflowerBlue)).append("\n");
    sb.append("    cornsilk: ").append(toIndentedString(cornsilk)).append("\n");
    sb.append("    crimson: ").append(toIndentedString(crimson)).append("\n");
    sb.append("    cyan: ").append(toIndentedString(cyan)).append("\n");
    sb.append("    darkBlue: ").append(toIndentedString(darkBlue)).append("\n");
    sb.append("    darkCyan: ").append(toIndentedString(darkCyan)).append("\n");
    sb.append("    darkGoldenrod: ").append(toIndentedString(darkGoldenrod)).append("\n");
    sb.append("    darkGray: ").append(toIndentedString(darkGray)).append("\n");
    sb.append("    darkGreen: ").append(toIndentedString(darkGreen)).append("\n");
    sb.append("    darkKhaki: ").append(toIndentedString(darkKhaki)).append("\n");
    sb.append("    darkMagenta: ").append(toIndentedString(darkMagenta)).append("\n");
    sb.append("    darkOliveGreen: ").append(toIndentedString(darkOliveGreen)).append("\n");
    sb.append("    darkOrange: ").append(toIndentedString(darkOrange)).append("\n");
    sb.append("    darkOrchid: ").append(toIndentedString(darkOrchid)).append("\n");
    sb.append("    darkRed: ").append(toIndentedString(darkRed)).append("\n");
    sb.append("    darkSalmon: ").append(toIndentedString(darkSalmon)).append("\n");
    sb.append("    darkSeaGreen: ").append(toIndentedString(darkSeaGreen)).append("\n");
    sb.append("    darkSlateBlue: ").append(toIndentedString(darkSlateBlue)).append("\n");
    sb.append("    darkSlateGray: ").append(toIndentedString(darkSlateGray)).append("\n");
    sb.append("    darkTurquoise: ").append(toIndentedString(darkTurquoise)).append("\n");
    sb.append("    darkViolet: ").append(toIndentedString(darkViolet)).append("\n");
    sb.append("    deepPink: ").append(toIndentedString(deepPink)).append("\n");
    sb.append("    deepSkyBlue: ").append(toIndentedString(deepSkyBlue)).append("\n");
    sb.append("    dimGray: ").append(toIndentedString(dimGray)).append("\n");
    sb.append("    dodgerBlue: ").append(toIndentedString(dodgerBlue)).append("\n");
    sb.append("    firebrick: ").append(toIndentedString(firebrick)).append("\n");
    sb.append("    floralWhite: ").append(toIndentedString(floralWhite)).append("\n");
    sb.append("    forestGreen: ").append(toIndentedString(forestGreen)).append("\n");
    sb.append("    fuchsia: ").append(toIndentedString(fuchsia)).append("\n");
    sb.append("    gainsboro: ").append(toIndentedString(gainsboro)).append("\n");
    sb.append("    ghostWhite: ").append(toIndentedString(ghostWhite)).append("\n");
    sb.append("    gold: ").append(toIndentedString(gold)).append("\n");
    sb.append("    goldenrod: ").append(toIndentedString(goldenrod)).append("\n");
    sb.append("    gray: ").append(toIndentedString(gray)).append("\n");
    sb.append("    green: ").append(toIndentedString(green)).append("\n");
    sb.append("    greenYellow: ").append(toIndentedString(greenYellow)).append("\n");
    sb.append("    honeydew: ").append(toIndentedString(honeydew)).append("\n");
    sb.append("    hotPink: ").append(toIndentedString(hotPink)).append("\n");
    sb.append("    indianRed: ").append(toIndentedString(indianRed)).append("\n");
    sb.append("    indigo: ").append(toIndentedString(indigo)).append("\n");
    sb.append("    ivory: ").append(toIndentedString(ivory)).append("\n");
    sb.append("    khaki: ").append(toIndentedString(khaki)).append("\n");
    sb.append("    lavender: ").append(toIndentedString(lavender)).append("\n");
    sb.append("    lavenderBlush: ").append(toIndentedString(lavenderBlush)).append("\n");
    sb.append("    lawnGreen: ").append(toIndentedString(lawnGreen)).append("\n");
    sb.append("    lemonChiffon: ").append(toIndentedString(lemonChiffon)).append("\n");
    sb.append("    lightBlue: ").append(toIndentedString(lightBlue)).append("\n");
    sb.append("    lightCoral: ").append(toIndentedString(lightCoral)).append("\n");
    sb.append("    lightCyan: ").append(toIndentedString(lightCyan)).append("\n");
    sb.append("    lightGoldenrodYellow: ").append(toIndentedString(lightGoldenrodYellow)).append("\n");
    sb.append("    lightGreen: ").append(toIndentedString(lightGreen)).append("\n");
    sb.append("    lightGray: ").append(toIndentedString(lightGray)).append("\n");
    sb.append("    lightPink: ").append(toIndentedString(lightPink)).append("\n");
    sb.append("    lightSalmon: ").append(toIndentedString(lightSalmon)).append("\n");
    sb.append("    lightSeaGreen: ").append(toIndentedString(lightSeaGreen)).append("\n");
    sb.append("    lightSkyBlue: ").append(toIndentedString(lightSkyBlue)).append("\n");
    sb.append("    lightSlateGray: ").append(toIndentedString(lightSlateGray)).append("\n");
    sb.append("    lightSteelBlue: ").append(toIndentedString(lightSteelBlue)).append("\n");
    sb.append("    lightYellow: ").append(toIndentedString(lightYellow)).append("\n");
    sb.append("    lime: ").append(toIndentedString(lime)).append("\n");
    sb.append("    limeGreen: ").append(toIndentedString(limeGreen)).append("\n");
    sb.append("    linen: ").append(toIndentedString(linen)).append("\n");
    sb.append("    magenta: ").append(toIndentedString(magenta)).append("\n");
    sb.append("    maroon: ").append(toIndentedString(maroon)).append("\n");
    sb.append("    mediumAquamarine: ").append(toIndentedString(mediumAquamarine)).append("\n");
    sb.append("    mediumBlue: ").append(toIndentedString(mediumBlue)).append("\n");
    sb.append("    mediumOrchid: ").append(toIndentedString(mediumOrchid)).append("\n");
    sb.append("    mediumPurple: ").append(toIndentedString(mediumPurple)).append("\n");
    sb.append("    mediumSeaGreen: ").append(toIndentedString(mediumSeaGreen)).append("\n");
    sb.append("    mediumSlateBlue: ").append(toIndentedString(mediumSlateBlue)).append("\n");
    sb.append("    mediumSpringGreen: ").append(toIndentedString(mediumSpringGreen)).append("\n");
    sb.append("    mediumTurquoise: ").append(toIndentedString(mediumTurquoise)).append("\n");
    sb.append("    mediumVioletRed: ").append(toIndentedString(mediumVioletRed)).append("\n");
    sb.append("    midnightBlue: ").append(toIndentedString(midnightBlue)).append("\n");
    sb.append("    mintCream: ").append(toIndentedString(mintCream)).append("\n");
    sb.append("    mistyRose: ").append(toIndentedString(mistyRose)).append("\n");
    sb.append("    moccasin: ").append(toIndentedString(moccasin)).append("\n");
    sb.append("    navajoWhite: ").append(toIndentedString(navajoWhite)).append("\n");
    sb.append("    navy: ").append(toIndentedString(navy)).append("\n");
    sb.append("    oldLace: ").append(toIndentedString(oldLace)).append("\n");
    sb.append("    olive: ").append(toIndentedString(olive)).append("\n");
    sb.append("    oliveDrab: ").append(toIndentedString(oliveDrab)).append("\n");
    sb.append("    orange: ").append(toIndentedString(orange)).append("\n");
    sb.append("    orangeRed: ").append(toIndentedString(orangeRed)).append("\n");
    sb.append("    orchid: ").append(toIndentedString(orchid)).append("\n");
    sb.append("    paleGoldenrod: ").append(toIndentedString(paleGoldenrod)).append("\n");
    sb.append("    paleGreen: ").append(toIndentedString(paleGreen)).append("\n");
    sb.append("    paleTurquoise: ").append(toIndentedString(paleTurquoise)).append("\n");
    sb.append("    paleVioletRed: ").append(toIndentedString(paleVioletRed)).append("\n");
    sb.append("    papayaWhip: ").append(toIndentedString(papayaWhip)).append("\n");
    sb.append("    peachPuff: ").append(toIndentedString(peachPuff)).append("\n");
    sb.append("    peru: ").append(toIndentedString(peru)).append("\n");
    sb.append("    pink: ").append(toIndentedString(pink)).append("\n");
    sb.append("    plum: ").append(toIndentedString(plum)).append("\n");
    sb.append("    powderBlue: ").append(toIndentedString(powderBlue)).append("\n");
    sb.append("    purple: ").append(toIndentedString(purple)).append("\n");
    sb.append("    red: ").append(toIndentedString(red)).append("\n");
    sb.append("    rosyBrown: ").append(toIndentedString(rosyBrown)).append("\n");
    sb.append("    royalBlue: ").append(toIndentedString(royalBlue)).append("\n");
    sb.append("    saddleBrown: ").append(toIndentedString(saddleBrown)).append("\n");
    sb.append("    salmon: ").append(toIndentedString(salmon)).append("\n");
    sb.append("    sandyBrown: ").append(toIndentedString(sandyBrown)).append("\n");
    sb.append("    seaGreen: ").append(toIndentedString(seaGreen)).append("\n");
    sb.append("    seaShell: ").append(toIndentedString(seaShell)).append("\n");
    sb.append("    sienna: ").append(toIndentedString(sienna)).append("\n");
    sb.append("    silver: ").append(toIndentedString(silver)).append("\n");
    sb.append("    skyBlue: ").append(toIndentedString(skyBlue)).append("\n");
    sb.append("    slateBlue: ").append(toIndentedString(slateBlue)).append("\n");
    sb.append("    slateGray: ").append(toIndentedString(slateGray)).append("\n");
    sb.append("    snow: ").append(toIndentedString(snow)).append("\n");
    sb.append("    springGreen: ").append(toIndentedString(springGreen)).append("\n");
    sb.append("    steelBlue: ").append(toIndentedString(steelBlue)).append("\n");
    sb.append("    tan: ").append(toIndentedString(tan)).append("\n");
    sb.append("    teal: ").append(toIndentedString(teal)).append("\n");
    sb.append("    thistle: ").append(toIndentedString(thistle)).append("\n");
    sb.append("    tomato: ").append(toIndentedString(tomato)).append("\n");
    sb.append("    turquoise: ").append(toIndentedString(turquoise)).append("\n");
    sb.append("    violet: ").append(toIndentedString(violet)).append("\n");
    sb.append("    wheat: ").append(toIndentedString(wheat)).append("\n");
    sb.append("    white: ").append(toIndentedString(white)).append("\n");
    sb.append("    whiteSmoke: ").append(toIndentedString(whiteSmoke)).append("\n");
    sb.append("    yellow: ").append(toIndentedString(yellow)).append("\n");
    sb.append("    yellowGreen: ").append(toIndentedString(yellowGreen)).append("\n");
    sb.append("    R: ").append(toIndentedString(R)).append("\n");
    sb.append("    G: ").append(toIndentedString(G)).append("\n");
    sb.append("    B: ").append(toIndentedString(B)).append("\n");
    sb.append("    A: ").append(toIndentedString(A)).append("\n");
    sb.append("    isKnownColor: ").append(toIndentedString(isKnownColor)).append("\n");
    sb.append("    isEmpty: ").append(toIndentedString(isEmpty)).append("\n");
    sb.append("    isNamedColor: ").append(toIndentedString(isNamedColor)).append("\n");
    sb.append("    isSystemColor: ").append(toIndentedString(isSystemColor)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    empty: ").append(toIndentedString(empty)).append("\n");
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

