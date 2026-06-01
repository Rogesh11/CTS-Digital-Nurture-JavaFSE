module-info.java (com.utils)
module com.utils {
    exports com.utils;
}
Utility.java
package com.utils;

public class Utility {

    public static String greet() {
        return "Hello from Utility Module";
    }
}
module-info.java (com.greetings)
module com.greetings {
    requires com.utils;
}
Main.java
package com.greetings;

import com.utils.Utility;

public class Main {

    public static void main(String[] args) {
        System.out.println(Utility.greet());
    }
}

/*
Output:

Hello from Utility Module
*/






