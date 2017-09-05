package seedu.addressbook.data.person;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddressComponent {
    
    private final String value;

    public AddressComponent(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
    
    protected static String extractValueFromAddress(String address, String regex) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(address);
        if (m.find()) {
            // From javadoc: Capturing groups are indexed from left to right, starting at one.
            return m.group(1);
        } else {
            return null;
        }
    }
}

