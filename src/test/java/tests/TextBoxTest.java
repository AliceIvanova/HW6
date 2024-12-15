package tests;

import org.junit.jupiter.api.Test;
import pages.TextBoxPage;
import pages.components.Utils;

public class TextBoxTest extends TestBase {
  TextBoxPage textBoxPage=new TextBoxPage();

  @Test
  void fillTextBoxTest() {

    textBoxPage.openTextBox("/text-box");
    Utils.removeBanner();
      textBoxPage.setFullName("Alice")
      .setEmail("A1@mail.ru")
      .setCurrentAddress("address")
      .setPermanentAddress("address2");
    textBoxPage.submitButton2();

    textBoxPage.checkInput("Name:","Alice")
      .checkInput("Email:","A1@mail.ru")
      .checkInput("Current Address :","address")
      .checkInput("Permananet Address :","address2");
  }
}
