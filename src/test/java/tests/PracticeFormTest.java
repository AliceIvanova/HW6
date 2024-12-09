package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;
import pages.PracticePage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PracticeFormTest extends TestBase {
  PracticePage practicePage = new PracticePage();

  @Test
  void fillFormTest() {
    practicePage.openTestPage("https://demoqa.com/automation-practice-form")
      .removeBanner()
      .setFirstName("Alice")
      .setLastName("Ivanova")
      .setUserEmailInput("alice-lilo@mail.ru")
      .setGender("Female")
      .setDateOfBirth("28","April","2010")
      .setUserNumber("1234567891").setSubjects("Math").setAddress("1\n 2\n 3\n 4\n 5\n 6")
      .setState("NCR")
      .setCity("Delhi")
      .setUploadPicture("photo_2024-11-07_16-38-58.jpg")
      .setSport("Sports")
      .submitButton();

      //practicePage.checkFormAppears();
      practicePage.checkResult("Student Name","Alice Ivanova")
      .checkResult("Student Email","alice-lilo@mail.ru")
      .checkResult("Gender","Female")
      .checkResult("Mobile","1234567891")
      .checkResult("Date of Birth","28 April,2010")
      .checkResult("Subjects","Maths")
      .checkResult("Hobbies","Sports")
      .checkResult("Picture","photo_2024-11-07_16-38-58.jpg")
      .checkResult("Address","1\n 2\n 3\n 4\n 5\n 6")
      .checkResult("State and City","NCR Delhi");
  }
}