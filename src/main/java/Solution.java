public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    public Solution() {}

    public boolean endsLy(String x) {
        //implement code here
        if (x.length() < 2) {
            return false;
        }

        if (x.substring(x.length() - 2).equals("ly")) {
            return true;
        } else {
            return false;
        }
    }

    public String conCat(String s1, String s2) {
        //implement code here
        if (s1.length() == 0 || s2.length() == 0) {
            return s1 + s2;
        }

        String str1Last = s1.substring(s1.length() - 1);
        String str2First = s2.substring(0, 1);

        if (str1Last.equals(str2First)) {
            return s1 + s2.substring(1);
        } else {
            return s1 + s2;
        }
    }

    public String withoutX(String s1) {
        //implement code here
        if (s1.substring(0, 1).equals("x") && s1.substring(s1.length() - 1).equals("x")) {
            return s1.substring(1, s1.length() - 1);
        }

        if (s1.substring(0, 1).equals("x")) {
            return s1.substring(1);
        } else if (s1.substring(s1.length() - 1).equals("x")) {
            return s1.substring(0, s1.length() - 1);
        } else {
            return s1;
        }
    }

    public String fizzString(String s1) {
        //implement code here
        if (s1.substring(0, 1).equals("f") && s1.substring(s1.length() - 1).equals("b")) {
            return "FizzBuzz";
        }

        if (s1.substring(0, 1).equals("f")) {
            return "Fizz";
        } else if (s1.substring(s1.length() - 1).equals("b")) {
            return "Buzz";
        } else {
            return s1;
        }
    }

    public String fizzString2(int x) {
        //implement code here
        if (x % 3 == 0 && x % 5 == 0) {
            return "FizzBuzz!";
        }

        if (x % 3 == 0) {
            return "Fizz!";
        } else if (x % 5 == 0) {
            return "Buzz!";
        } else {
            return x + "!";
        }
    }

}
