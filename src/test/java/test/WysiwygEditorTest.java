package test;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.WysiwygEditorPage;

public class WysiwygEditorTest extends BaseTest {

    @Test
    public void testWyysiwyg() {

        WysiwygEditorPage editorPage = homePage.clickWysiwygEditor();
        editorPage.clearTextArea();

        String text1 = "hello ";
        String text2 = "world";

        editorPage.setTextArea(text1);
        editorPage.incraseIndentation();
        editorPage.setTextArea(text2);

        Assert.assertEquals(editorPage.getTextFromEditor(),
                text1 + text2, "Text from editor is incorrect");
    }
}
