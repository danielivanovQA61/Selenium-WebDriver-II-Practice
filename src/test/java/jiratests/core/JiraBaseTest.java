package jiratests.core;

import com.jira.pages.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import testframework.PropertiesManager;
import testframework.core.BaseWebTest;

public class JiraBaseTest extends BaseWebTest {
    protected AtlassianLoginPage atlassianLoginPage;
    protected AtlassianHome atlassianHome;
//    protected BaseJiraPage baseJiraPage;
    protected CreateIssueWindow createIssueWindow;
    protected JiraNavigationMenu jiraNavigationMenu;
    protected ProjectsPage projectsPage;

    @BeforeEach
    public void beforeTests() {
        // perform some code before each test starts

        atlassianHome = new AtlassianHome();
        atlassianLoginPage = new AtlassianLoginPage();
//        baseJiraPage = new BaseJiraPage();
        createIssueWindow = new CreateIssueWindow();
        jiraNavigationMenu = new JiraNavigationMenu();
        projectsPage = new ProjectsPage();

        // Navigate to base page
        driver().get(PropertiesManager.getConfigProperties().getProperty("atlassianBaseUrl"));
    }

    @BeforeAll
    public static void beforeAll() {
        // perform some code before all tests start
    }

    // close driver
    @AfterEach
    public void afterTest() {
        driver().close();
        // perform some code after each test has finished
    }

    @AfterAll
    public static void afterAll() {
        // perform some code after all tests have finished
    }

    // Extract methods that use multiple pages
    public void authenticateWithUser(String username, String pass) {
        atlassianLoginPage.authentication(username, pass);
    }

}
