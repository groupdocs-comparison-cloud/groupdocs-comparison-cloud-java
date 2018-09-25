package com.groupdocs.cloud.comparison.api;

import com.aspose.storage.api.StorageApi;
import com.groupdocs.cloud.comparison.client.Configuration;
import com.groupdocs.cloud.comparison.client.JSON;
import com.groupdocs.cloud.comparison.model.*;
import org.junit.After;
import org.junit.Before;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class TestsSetter {
    protected String _appSid = Config.AppSID;
    protected String _appKey = Config.AppKey;
    protected String _apiBaseUrl = Config.ApiBaseUrl;
    protected ComparisonApi comparisonApi;
    protected ChangesApi changesApi;
    protected StorageApi storageApi;
    private static String resourcesPath = Paths.get("resources").toAbsolutePath().toString();

    public TestsSetter() {
        Configuration configuration = new Configuration(_appSid, _appKey);
        configuration.setApiBaseUrl(Config.ApiBaseUrl);
        comparisonApi = new ComparisonApi(configuration);
        changesApi = new ChangesApi(configuration);
        changesApi.getApiClient().setConnectTimeout(300 * 1000);
        changesApi.getApiClient().setReadTimeout(300 * 1000);
        comparisonApi.getApiClient().setConnectTimeout(300 * 1000);
        comparisonApi.getApiClient().setReadTimeout(300 * 1000);
        storageApi = new StorageApi(this._apiBaseUrl + "/v1", this._appKey, this._appSid);
    }

    protected com.groupdocs.cloud.comparison.model.ComparisonRequest GetComparisonRequest(String sourceName, String targetName) {
        com.groupdocs.cloud.comparison.model.ComparisonRequest comparisonRequest = new com.groupdocs.cloud.comparison.model.ComparisonRequest();
        ComparisonRequestSettings comparisonRequestSettings = new ComparisonRequestSettings();
        comparisonRequestSettings.setGenerateSummaryPage(true);
        comparisonRequestSettings.setShowDeletedContent(true);
        comparisonRequestSettings.setStyleChangeDetection(true);
        comparisonRequestSettings.setUseFramesForDelInsElements(false);
        comparisonRequestSettings.setDetailLevel("Low");
        //Set style values
        //delete items style
        StyleSettingsValues deletedItemsStyle = new StyleSettingsValues();
        deletedItemsStyle.color(new Color().getRed());
        deletedItemsStyle.setBeginSeparatorString("");
        deletedItemsStyle.setEndSeparatorString("");
        comparisonRequestSettings.deletedItemsStyle(deletedItemsStyle);

        //inserted items style
        StyleSettingsValues insertedItemsStyle = new StyleSettingsValues();
        insertedItemsStyle.color(new Color().getBlue());
        insertedItemsStyle.setBeginSeparatorString("");
        insertedItemsStyle.setEndSeparatorString("");
        comparisonRequestSettings.insertedItemsStyle(insertedItemsStyle);

        //style change style
        StyleSettingsValues styleChangedStyle = new StyleSettingsValues();
        styleChangedStyle.color(new Color().getGreen());
        styleChangedStyle.setBeginSeparatorString("");
        styleChangedStyle.setEndSeparatorString("");
        comparisonRequestSettings.styleChangedItemsStyle(styleChangedStyle);

        comparisonRequestSettings.setCalculateComponentCoordinates(false);
        comparisonRequestSettings.setCloneMetadata("Source");
        comparisonRequestSettings.markDeletedInsertedContentDeep(false);

        ComparisonMetadataValues comparisonMetadataValues = new ComparisonMetadataValues();
        comparisonMetadataValues.author("GroupDocs");
        comparisonMetadataValues.company("GroupDocs");
        comparisonMetadataValues.lastSaveBy("GroupDocs");

        comparisonRequestSettings.metaData(comparisonMetadataValues);

        comparisonRequestSettings.password("1111");
        comparisonRequestSettings.passwordSaveOption("User");

        ComparisonFileInfo sourceFileInfo = new ComparisonFileInfo();

        sourceFileInfo.folder("");
        sourceFileInfo.name(sourceName);
        sourceFileInfo.password("");

        comparisonRequest.addTargetFilesItem(sourceFileInfo);

        ComparisonFileInfo targetFile = new ComparisonFileInfo();

        targetFile.folder("");
        targetFile.name(targetName);
        targetFile.password("");

        List<ComparisonFileInfo> targetFiles = Arrays.asList(targetFile);

        comparisonRequest.targetFiles(targetFiles);
        //Set Comparison settings
        comparisonRequest.settings(comparisonRequestSettings);

        ComparisonChange[] change = new ComparisonChange[2];
        change[0] = new ComparisonChange();
        change[0].id(0);
        change[0].action("Accept");
        change[1] = new ComparisonChange();
        change[1].id(1);
        change[1].action("Reject");
        comparisonRequest.changes(Arrays.asList(change));
        comparisonRequest.sourceFile(sourceFileInfo);

        return comparisonRequest;
    }

    @Before
    public void setUp() {
        uploadTestData();
    }

    private void uploadTestData() {
        uploadFiles(resourcesPath);
    }

    public void uploadFiles(String path) {
        File directory = new File(path);

        File[] files = directory.listFiles();
        for (File file : files) {
            String relativePath = getRelativePath(file.getAbsolutePath(), resourcesPath);
            if (file.isFile()) {
                uploadFile(file, relativePath);
            } else if (file.isDirectory()) {
                uploadFiles(file.getAbsolutePath().toString());
            }
        }
    }

    private String getRelativePath(String absolutePath, String basePath) {
        Path absolute = Paths.get(absolutePath);
        Path base = Paths.get(basePath);
        Path relative = base.relativize(absolute);

        return relative.toString();
    }

    private void uploadFile(File file, String relativePath) {
        String filePath = relativePath.replace("\\", "/");
        storageApi.PutCreate(filePath, null, null, file);
    }

    @After
    public void cleanup() {
        removeTempFiles();
    }

    private void removeTempFiles() {
        deleteFolderFromStorage("cache");
        deleteFolderFromStorage("tests");
    }

    private void deleteFolderFromStorage(String folderName) {
        storageApi.DeleteFolder(folderName, null, true);
    }

    public File getTestFile(TestFile testFile) throws FileNotFoundException {
        Path filePath = Paths.get("resources", testFile.getFolder(), testFile.getFileName());
        File file = filePath.toFile();
        if (!file.exists())
            throw new FileNotFoundException(file.getAbsolutePath());

        return file;
    }

    public File toJsonFile(Object obj) throws IOException {
        JSON json = new JSON();
        String content = json.serialize(obj);

        File file = File.createTempFile("java", ".json");
        FileWriter fileWriter = new FileWriter(file.getAbsoluteFile(), true);
        fileWriter.write(content);
        fileWriter.close();

        return file;
    }
}
