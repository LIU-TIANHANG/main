
package seedu.address.model.user;

import static java.util.Objects.requireNonNull;

/**
 * Represents a Password in the loginInfo list.
 */
public class Password {
    /*
     * The password must not contain a whitespace which include " "
     */
    public static final String PASSWORD_VALIDATION_REGEX = "[\\p{Alnum}]*";

    private String password;

    public Password(){}
    public Password(String password) {
        requireNonNull(password);
        this.password = password;
    }

    /**
     * Returns true if a given string is a valid name.
     */
    public static boolean isValidPassword(String test) {
        return test.matches(PASSWORD_VALIDATION_REGEX) && !test.isEmpty ();

    }

    @Override
    public String toString () {
        return password;
    }
    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Password // instanceof handles nulls
                && password.equals(((Password) other).password)); // state check
    }
    public boolean equals(String password) {
        return this.password.equals (password);
    }

}
