package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.PracticePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static java.lang.Thread.sleep;

public class RequiredFieldPracticeFormNegativeTest extends TestBase {
  PracticePage practicePage = new PracticePage();


  @Test
  void fillFormTest() {
    practicePage.openTestPage("https://demoqa.com/automation-practice-form")
      .setFirstName("Alice")
      .setLastName("Ivanova")
      .setUserNumber("1234567891")
    .submitButton();
    practicePage.checkFormNotAppears();

  }

}
