package seedu.address.commons.core;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.logging.Level;

/**
 * Config values used by the app
 */
public class Config {

    public static final Path DEFAULT_CONFIG_FILE = Paths.get("config.json");

    // Config values customizable through config file
    private String appTitle = "Drink I/O";
    private Level logLevel = Level.INFO;
    private Path userPrefsFilePath = Paths.get("preferences.json");
    private Path userLoginInfoFilePath = Paths.get("loginInfoList.json");

    private Path loginPagePath = Paths.get ("LoginPage.fxml");


    public String getAppTitle() {
        return appTitle;
    }

    public void setAppTitle(String appTitle) {
        this.appTitle = appTitle;
    }

    public Level getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(Level logLevel) {
        this.logLevel = logLevel;
    }

    public Path getUserPrefsFilePath() {
        return userPrefsFilePath;
    }

    public void setUserPrefsFilePath(Path userPrefsFilePath) {
        this.userPrefsFilePath = userPrefsFilePath;
    }

    public Path getUserLoginInfoFilePath() {
        return userLoginInfoFilePath;
    }

    public void setUserLoginInfoFilePath(Path userLoginInfoFilePath) {
        this.userLoginInfoFilePath = userLoginInfoFilePath;
    };

    public Path getLoginPagePath () {
        return loginPagePath;
    }

    public void setLoginPagePath (Path loginPagePath) {
        this.loginPagePath = loginPagePath;
    };

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Config)) { //this handles null as well.
            return false;
        }

        Config o = (Config) other;

        return Objects.equals(appTitle, o.appTitle)
                && Objects.equals(logLevel, o.logLevel)
                && Objects.equals(userPrefsFilePath, o.userPrefsFilePath)
                && Objects.equals (userLoginInfoFilePath, o.userLoginInfoFilePath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appTitle, logLevel, userPrefsFilePath, userLoginInfoFilePath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("App title : " + appTitle);
        sb.append("\nCurrent log level : " + logLevel);
        sb.append("\nPreference file Location : " + userPrefsFilePath);
        sb.append ("\nLogin info file Location : " + userLoginInfoFilePath);
        return sb.toString();
    }

}
