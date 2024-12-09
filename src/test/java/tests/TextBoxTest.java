package tests;

import org.junit.jupiter.api.Test;
import pages.TextBoxPage;

public class TextBoxTest extends TestBase {
  TextBoxPage textBoxPage=new TextBoxPage();

  @Test
  void fillTextBoxTest() {

    textBoxPage.openTextBox("https://demoqa.com/text-box")
      .setFullName("Alice")
      .setEmail("A1@mail.ru")
      .setCurrentAddress("address")
      .setPermanentAddress("address2")
      .submitButton();

    textBoxPage.checkInput("Name:","Alice")
      .checkInput("Email:","A1@mail.ru")
      .checkInput("Current Address :","address")
      .checkInput("Permananet Address :","address2");
  }
}
