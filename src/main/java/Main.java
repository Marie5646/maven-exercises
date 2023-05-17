import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;


public class Main {


    static boolean isNumber(String s) {
        for (int i = 0; i < s.length(); i++)
            if (!Character.isDigit(s.charAt(i)))
                return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input");
        String userInput = scanner.nextLine();


//        STRING UTIL

        if (StringUtils.isNumeric(userInput)){
            System.out.println(userInput + " is a number ");
        }else
            System.out.println("This is a string");

           System.out.println(StringUtils.swapCase(userInput));
           System.out.println(StringUtils.reverse(userInput));



      if(isNumber(userInput)){
          System.out.println(userInput + " is a number ");
          }else {
          System.out.println("This is a string");
          int len= userInput.length();
          char c= 0;
          StringBuilder strBuffer = new StringBuilder(len);
          for (int i = 0; i < userInput.length(); i++) {
              c = userInput.charAt(i);
              // title case converted to lower case
              if (Character.isTitleCase(c)) {
                  c = Character.toLowerCase(c);
              }
              // upper case converted to lower case
              if (Character.isUpperCase(c)) {
                  c = Character.toLowerCase(c);
              }
              // lower case converted to upper case
              if (Character.isLowerCase(c)) {
                  c = Character.toUpperCase(c);
              }
              strBuffer.append(c);
          }
          System.out.println("Converting case: "+strBuffer.toString());
          String reverseStr= String.valueOf(new StringBuilder(userInput).reverse());
          System.out.println(reverseStr);
      }
      }
      }
