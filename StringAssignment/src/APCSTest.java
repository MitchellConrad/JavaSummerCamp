//HIT CTRL+A to select all
//Then CTRL+C to copy
// StringTest
// Functions for Manipulating Strings
// Complete Function Stubs
// Test in function in main

public class APCSTest {
    
    // 1.
    public static String writeFirstLast(String name) {
        String fullName = "";
        //TODO: Complete function code
        int n = name.indexOf(",");
        fullName = (fullName + name.substring(n + 1, name.length()) + " " + name.substring(0, n));
        return fullName;
    }
    
    // 2.
    public static String reverse(String str) {
        String out = "";
        //TODO: Complete function code
        for (int i = 0; i < str.length(); i++) {
        	out = out +str.substring(str.length() - i - 1, str.length() - i);
        	

        }
        return out;
        	
            }
    
    // 3.
    public static boolean isPalindrome(String str) {
        boolean out = true;
        String word = "";
        //TODO: Complete function code
        for (int i = 0; i < str.length(); i++) {
        	word = word + str.substring(str.length() - i - 1, str.length() - i);
        	word = word.toLowerCase();
        	int n = word.indexOf(",");
        	if (n >= 0) {
        		word = word.substring(0, n) + word.substring(n + 1, word.length());
        	}
        	else {
        		word = word;
        	}
        	int b = str.indexOf(",");
        	if (b >= 0) {
        		str = str.substring(0, b) + str.substring(b + 1, str.length());
        	}
        	else {
        		str = str;
        	}
        	int c = str.indexOf(" ");
        	if (c >= 0) {
        		str = str.substring(0, c) + str.substring(c + 1, str.length());
        	}
        	else {
        		str = str;
        	}
        	int a = word.indexOf(" ");
        	if (a >= 0) {
        		word = word.substring(0, a) + word.substring(a + 1, word.length());
        	}
        	else {
        		word = word;
        	}
        	int e = str.indexOf("'");
        	if (e >= 0) {
        		str = str.substring(0, e) + str.substring(e + 1, str.length());
        	}
        	else {
        		str = str;
        	}
        	int g = word.indexOf(",");
        	if (g >= 0) {
        		word = word.substring(0, g) + word.substring(g + 1, word.length());
        	}
        	else {
        		word = word;
        	}
        	}
        	
        	

        	str = str.toLowerCase();
        	if (str.equals(word)) {
        		out = true;
        	}
        	else {
        		out = false;
        	}
        

        System.out.println(str);
        System.out.println(word);
        
        return out;
    }
    
    
    // 4.
    public static String removeDashes(String ssn) {
        String out = "";
        //TODO: Complete function code
        for (int h = 0; h < ssn.length(); h++) { 
        	char y = ssn.charAt(0 + h);
        	if (y == '-') {
        		out = out + ssn.charAt(0 + h + 1);
        		h++;
        	}
        	else {
        		out = out + ssn.charAt(0 + h);
        }
        }
        
        return out;
    }
    
    // 5a and 5b.
    public static String changeDateFormat(String dateStr) {
        String out = "";
        //TODO: Complete function code
        if (dateStr.charAt(1) == '/') {
        	if (dateStr.charAt(3) == '/') {
        		out = "0" + dateStr.substring(0,1) + "-" + "0" + dateStr.substring(2, 3) + "-" + dateStr.substring(4, 8);
        	}
        	else {
        		out = "0" + dateStr.substring(0,1) + "-" + dateStr.substring(2, 4) + "-" + dateStr.substring(5, 9);	
        	}
        }
        else { 
        	if (dateStr.charAt(4) == '/') {
        		out = dateStr.substring(0,2) + "-" + "0" + dateStr.substring(3, 4) + "-" + dateStr.substring(5, 9);	
        	}
        	else {
        		out = dateStr.substring(0,2) + "-" + dateStr.substring(3, 5) + "-" + dateStr.substring(6, 10);
        	}
        	
        }        	
       return(out);
        
    }
    
    // 6a.
    public static String lastFour(String ccNumber) {
        String out = "";
        //TODO: Complete function code
        out = ccNumber.substring(ccNumber.length() - 4, ccNumber.length()); 
        
        
        return out;
    }
    
    // 6b.
    public static String lastFive(String ccNumber) {
        String out = "";
        //TODO: Complete function code
        out = out + ccNumber.substring(ccNumber.length() - 6, ccNumber.length() - 5) + ccNumber.substring(ccNumber.length() - 4, ccNumber.length());
        return out;
    }
    
    // 7.
    public static String scroll(String str) {
        String out = "";
        //TODO: Complete function code
        out = str.substring(1, str.length()) + (str.substring(0, 1));
        return out;
    }
    
    // 8.
    public static String removeComments(String str) {
        String out = "";
        //TODO: Complete function code
        int z = (str.indexOf("/"));
        int b = (str.indexOf("*"));
        int a = (str.lastIndexOf("/"));
        int c = (str.lastIndexOf("*"));
        if ((b - z == 1) && (a - c == 1) && (c > b)) {
            out = out + str.substring(0, z) + str.substring(a + 1, str.length());
            
        }
        else {
        	return str;
        }
        return(out);
        
    }
    // 9.
    public static String removeTag(String html) {
        String out = "";
        //TODO: Complete function code
        
        return out;
    }
    
    // 10.
    public boolean isValidISBN(String isbn) {
        boolean valid = true;
        //TODO: Complete function code
        
        return valid;
    }
    
    

    public static void main(String[] args) {
        // Test your functions here
        // For example
        // 1.
        System.out.println("Testing Number 1");
        String name = "Twain, Mark";
        System.out.println(writeFirstLast(name));
        System.out.println("Testing Number 2");
        String name2 = "Twain, Mark";
        System.out.println(reverse(name2));
        System.out.println("Testing Number 3");
        System.out.println(isPalindrome("Racecar"));
        System.out.println("Testing Number 4");
        System.out.println(removeDashes("987-65-4321"));
        System.out.println("Testing Number 5");
        System.out.println(changeDateFormat("25/1/2017"));
        System.out.println("Testing Number 6a");
        System.out.println(lastFour("4111 1111 1111 2345"));
        System.out.println("Testing Number 6b"); 
        System.out.println(lastFive("4111 1111 1111 2345"));
        System.out.println(scroll("lcoo"));
        System.out.println(removeComments("Hello sir/* You shouldnt see this */ Bye!"));
       
    }
}

