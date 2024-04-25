package Demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// import Bai1.*;
import Bai2.Bai1;
import Chuong2Bai2.Employee;

@SuppressWarnings("unused")
public class App {
    public static String capitalize(String x) {
        String[] aa = x.split(" ");
        String res = "";
        for (String string : aa) {
            String temp = String.valueOf(string.charAt(0));
            string = temp.toUpperCase() + string.substring(1);
            res += string + " ";
        }

        return res;
    }

    public static void main(String[] args) throws Exception {
        String x = "asdfasfd asdfasdf asdfased e";
        System.out.println(capitalize(x));
    }
}
