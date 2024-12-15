package tests;

import org.junit.jupiter.api.Test;
import pages.PracticePage;
import pages.components.Utils;

public class RequiredFieldPracticeFormNegativeTest extends TestBase {
  PracticePage practicePage = new PracticePage();


  @Test
  void fillFormTest() {
    practicePage.openTestPage("/automation-practice-form");
    Utils.removeBanner();
      practicePage.setFirstName("Alice")
      .setLastName("Ivanova")
      .setUserNumber("1234567891")
    .submitButton();
    practicePage.checkFormNotAppears();

  }

}
