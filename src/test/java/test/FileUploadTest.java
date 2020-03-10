package test;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.FileUploadPage;

public class FileUploadTest extends BaseTest {

    @Test
    public void testFileUpload() {

        FileUploadPage uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("C:/Users/luis.gr/Documents/Projects/Trainings/chromedriver.exe");
        Assert.assertEquals(uploadPage.getUploadedFiles(), "chromedriver.exe",
                "Upload failed");
    }
}
