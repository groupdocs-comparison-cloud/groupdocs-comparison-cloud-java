///**
// * --------------------------------------------------------------------------------------------------------------------
// * <copyright company="Aspose Pty Ltd">
// * Copyright (c) 2003-2019 Aspose Pty Ltd
// * </copyright>
// * <summary>
// * Permission is hereby granted, free of charge, to any person obtaining a copy
// * of this software and associated documentation files (the "Software"), to deal
// * in the Software without restriction, including without limitation the rights
// * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
// * copies of the Software, and to permit persons to whom the Software is
// * furnished to do so, subject to the following conditions:
// *
// * The above copyright notice and this permission notice shall be included in
// * all copies or substantial portions of the Software.
// *
// * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
// * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
// * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
// * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
// * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
// * SOFTWARE.
// * </summary>
// * --------------------------------------------------------------------------------------------------------------------
// */
//package com.groupdocs.cloud.comparison.api;
//
//import com.groupdocs.cloud.comparison.client.ApiException;
//import com.groupdocs.cloud.comparison.model.ComparisonCategoryChanges;
//import com.groupdocs.cloud.comparison.model.ComparisonOptionsBase;
//import com.groupdocs.cloud.comparison.model.requests.PostCategoryChangesRequest;
//import java.util.Arrays;
//import java.util.List;
//import static org.junit.Assert.assertEquals;
//import org.junit.Test;
//
//public class CategoryChangesNoteTests extends BaseApiTest
//{
//    @Test
//    public void categoryNoteByType() throws ApiException
//    {
//        ComparisonOptionsBase comparisonOptions = GetComparisonOptions(TestFiles.SourceNote, Arrays.asList(TestFiles.TargetNote));
//        comparisonOptions.setOutputPath("/resultFilePath/result.one");
//        comparisonOptions.setCategoryType("ByTypeChanged");
//        PostCategoryChangesRequest request = new PostCategoryChangesRequest(comparisonOptions);
//        List<ComparisonCategoryChanges> changeList = comparisonApi.postCategoryChanges(request);
//        assertEquals(3, changeList.size());
//    }
//    
//    @Test
//    public void categoryNoteByTypePassword() throws ApiException
//    {
//        ComparisonOptionsBase comparisonOptions = GetComparisonOptions(TestFiles.SourceNoteProtected, Arrays.asList(TestFiles.TargetNoteProtected));
//        comparisonOptions.setOutputPath("/resultFilePath/result.one");
//        comparisonOptions.setCategoryType("ByTypeChanged");
//        PostCategoryChangesRequest request = new PostCategoryChangesRequest(comparisonOptions);
//        List<ComparisonCategoryChanges> changeList = comparisonApi.postCategoryChanges(request);
//        assertEquals(3, changeList.size());
//    }
//    
//    @Test
//    public void categoryNoteByNodeType() throws ApiException
//    {
//        ComparisonOptionsBase comparisonOptions = GetComparisonOptions(TestFiles.SourceNote, Arrays.asList(TestFiles.TargetNote));
//        comparisonOptions.setOutputPath("/resultFilePath/result.one");
//        comparisonOptions.setCategoryType("ByNodeType");
//        PostCategoryChangesRequest request = new PostCategoryChangesRequest(comparisonOptions);
//        List<ComparisonCategoryChanges> changeList = comparisonApi.postCategoryChanges(request);
//        assertEquals(3, changeList.size());
//    }
//    
//    @Test
//    public void categoryNoteByNodeTypePassword() throws ApiException
//    {
//        ComparisonOptionsBase comparisonOptions = GetComparisonOptions(TestFiles.SourceNoteProtected, Arrays.asList(TestFiles.TargetNoteProtected));
//        comparisonOptions.setOutputPath("/resultFilePath/result.one");
//        comparisonOptions.setCategoryType("ByNodeType");
//        PostCategoryChangesRequest request = new PostCategoryChangesRequest(comparisonOptions);
//        List<ComparisonCategoryChanges> changeList = comparisonApi.postCategoryChanges(request);
//        assertEquals(3, changeList.size());
//    }
//    
//    @Test
//    public void categoryNoteContainsNumbers() throws ApiException
//    {
//        ComparisonOptionsBase comparisonOptions = GetComparisonOptions(TestFiles.SourceNote, Arrays.asList(TestFiles.TargetNote));
//        comparisonOptions.setOutputPath("/resultFilePath/result.one");
//        comparisonOptions.setCategoryType("ContainsNumbers");
//        PostCategoryChangesRequest request = new PostCategoryChangesRequest(comparisonOptions);
//        List<ComparisonCategoryChanges> changeList = comparisonApi.postCategoryChanges(request);
//        assertEquals(1, changeList.size());
//    }
//    
//    @Test
//    public void categoryNoteContainsNumbersPassword() throws ApiException
//    {
//        ComparisonOptionsBase comparisonOptions = GetComparisonOptions(TestFiles.SourceNoteProtected, Arrays.asList(TestFiles.TargetNoteProtected));
//        comparisonOptions.setOutputPath("/resultFilePath/result.one");
//        comparisonOptions.setCategoryType("ContainsNumbers");
//        PostCategoryChangesRequest request = new PostCategoryChangesRequest(comparisonOptions);
//        List<ComparisonCategoryChanges> changeList = comparisonApi.postCategoryChanges(request);
//        assertEquals(1, changeList.size());
//    }
//    
//    @Test
//    public void categoryNoteOnlyNumbers() throws ApiException
//    {
//        ComparisonOptionsBase comparisonOptions = GetComparisonOptions(TestFiles.SourceNote, Arrays.asList(TestFiles.TargetNote));
//        comparisonOptions.setOutputPath("/resultFilePath/result.one");
//        comparisonOptions.setCategoryType("OnlyNumbers");
//        PostCategoryChangesRequest request = new PostCategoryChangesRequest(comparisonOptions);
//        List<ComparisonCategoryChanges> changeList = comparisonApi.postCategoryChanges(request);
//        assertEquals(1, changeList.size());
//    }
//    
//    @Test
//    public void categoryNoteOnlyNumbersPassword() throws ApiException
//    {
//        ComparisonOptionsBase comparisonOptions = GetComparisonOptions(TestFiles.SourceNoteProtected, Arrays.asList(TestFiles.TargetNoteProtected));
//        comparisonOptions.setOutputPath("/resultFilePath/result.one");
//        comparisonOptions.setCategoryType("OnlyNumbers");
//        PostCategoryChangesRequest request = new PostCategoryChangesRequest(comparisonOptions);
//        List<ComparisonCategoryChanges> changeList = comparisonApi.postCategoryChanges(request);
//        assertEquals(1, changeList.size());
//    }
//}
