package jiratests.web;

import jiratests.core.JiraBaseTest;
import jiratests.enums.JiraTestData;
import org.junit.jupiter.api.Test;
import saucedemotests.enums.TestData;

public class JiraLogin extends JiraBaseTest {




    @Test
    public void userAuthenticated_when_validCredentialsProvided() throws InterruptedException {
        atlassianLoginPage.navigate();
        Thread.sleep(5000);
        atlassianLoginPage.authentication(JiraTestData.USERNAME.getValue(),JiraTestData.PASSWORD.getValue());
        Thread.sleep(5000);

    }
}
