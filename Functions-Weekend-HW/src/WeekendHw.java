/**
 * Created by andeski on 6/25/16.
 */
public class WeekendHw {

    public static void main(String[] args){

    }

    public String frontBack(String str) {

        char[] string_array = str.toCharArray();

        if (str.length() > 1) {
            char a = string_array[string_array.length-1];
            char b = string_array[0];
            string_array[0] = a;
            string_array[string_array.length-1] = b;
        }

        String new_string = String.valueOf(string_array);

        return (new_string);
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {

        if (!weekday || vacation) {
            return true;
        }
        else {
            return false;
        }

    }

    public int sumDouble(int a, int b) {
        if (a == b) {
            int num = 2 * (a+ b);
            return num;
        }
        else {
            int number = a + b;
            return number;
        }
    }

    public int close10(int a, int b) {
        int apple = Math.abs(a - 10);
        int banana = Math.abs(b - 10);

        if (apple < banana) {
            return a;
        }

        else if (banana < apple) {
            return b;
        }

        else {
            return 0;
        }

    }

    public String notString(String str) {

        if (str.startsWith("not")) {
            return str;
        }

        else {
            return ("not " + str) ;
        }
    }


}
