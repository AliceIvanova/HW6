package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.OutputResult;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxPage {
  private final SelenideElement
    fullNameInput = $("#userName"),
    userEmailInput = $("#userEmail"),
    currentAddressInput = $("#currentAddress"),
    permanentAddressInput = $("#permanentAddress"),
    submitButton = $("#submit");
  OutputResult outputResult=new OutputResult();

  public TextBoxPage openTextBox(String value) {
    open(value);
    return this;
  }

  public TextBoxPage setFullName(String value) {
    fullNameInput.setValue(value);
    return this;
  }

  public TextBoxPage setEmail(String value) {
    userEmailInput.setValue(value);
    return this;
  }
  public TextBoxPage setCurrentAddress(String value) {
    currentAddressInput.setValue(value);
    return this;
  }
  public TextBoxPage setPermanentAddress(String value) {
    permanentAddressInput.setValue(value);
    return this;
  }
  public void submitButton2() {
    submitButton.click();

  }
  public TextBoxPage checkInput(String key, String value) {
   outputResult.outputResult(key, value);
    return this;
  }
}