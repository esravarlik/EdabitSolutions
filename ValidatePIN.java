/* 
Create a function that will test if a string is a valid PIN or not via a regular expression.

A valid PIN has:

Exactly 4 or 6 characters.
Only numeric characters (0-9).
No whitespace

validate("121317") ➞ true
validate("1234") ➞ true
validate("45135") ➞ false
validate("89abc1") ➞ false
validate("900876") ➞ true
validate(" 4983") ➞ false
*/


//Solution;

public class PersonalIdNumber {
  public static boolean validate(String p) {
    return p.matches("\\d{4}|\\d{6}");
  }
}
