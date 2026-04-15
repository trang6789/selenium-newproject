package lesson_10_01;

public class LoginTest {

    public static void main(String[] args) {
        LoginPage internalLoginPage = new InternalLoginPage();
        LoginPage externalLoginPage = new ExternalLoginPage();

        LoginTest loginTest = new LoginTest();
        loginTest.testLoginPage(internalLoginPage);
        loginTest.testLoginPage(externalLoginPage);
    }

    public void testLoginPage(LoginPage loginPage){
        loginPage.login();
        loginPage.verifyLoginSuccess();

    }
}
