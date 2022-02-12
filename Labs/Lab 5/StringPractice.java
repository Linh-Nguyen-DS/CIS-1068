public class StringPractice {
  /* returns true if c is a punctuation mark or false otherwise
   * 
   * Punctuation mark is defined as:
   * apostrophe '
   * comma ,
   * period .
   * semicolon ;
   * colon :
   * exclamation point !
   * question mark ? 
   * 
   * (You don't have to worry about any others)
   */
  public static boolean isPunct(char c) { // 1
	  if (c == '\'' || c == ',' || c == '.' || c == ';' || c == ':' || c == '!' || c == '?') {
		  return true;
	  } else {
		  return false;
	  }
  }

  /*
   * returns the number of punctuation marks
   * found in s.
   *
   * call your isPunct( ) method. Do not copy and paste
   * the same logic into this function */
  public static int numPunct(String s) { // 2
	  int num_punct_mark = 0;
	  
	  for (int i = 0; i < s.length(); i++) {
		  if (isPunct(s.charAt(i))) {
			  num_punct_mark += 1;
		  }
	  }
	  return num_punct_mark;
  }
  
  /*
   * returns the number of punctuation marks
   * found in s starting at the given index.
   *
   * call your isPunct( ) method. Do not copy and paste
   * the same logic into this function */
  public static int numPunct(String s, int startIndex) { // 3
	  int count = 0;
	  if (startIndex > s.length() - 1 || startIndex < 0) {
		  return count;
	  } else {
		  for (int i = startIndex; i < s.length(); i++) {
			  if (isPunct(s.charAt(i))) {
				  count++;
			  }
		  }
	  }
	  return count;
  }

  /*
   * returns the index of the first occurrence
   * of a punctuation mark in s starting
   * from index startPosition or -1 if there are
   * none at index startPosition or later.
   *
   * When implementing this function, call your isPunct( ) method.
   * Do not simply copy and paste the body of isPunct( ) into this method.
   */
  public static int indexOfFirstPunct(String s, int startPosition) { // 4
	  if (startPosition > s.length() - 1 || startPosition < 0) {
		  return -1;
	  }
	  for (int i = startPosition; i < s.length(); i++) {
		  if (isPunct(s.charAt(i))) {
			  return i;
		  }
	  }
    return -1;
  }

  /*
   * returns the index of the first punctuation mark in s or
   * -1 if s contains no punctuation marks
   *
   * use your solution to indexOfFirstPunct(String s, int startPosition)
   * in this function. Do not repeat the same logic.
   * 
   * Notice that this method has the same name as the
   * previous one, but that it takes a different number of arguments. This is
   * perfectly legal in Java. It's called "method overloading"
   *
   */
  public static int indexOfFirstPunct(String s) { // 5
	  for (int i = 0; i < s.length(); i++) {
		  if (isPunct(s.charAt(i))) {
			  return i;
		  }
	  }
    return -1;
  }

  /*
   * returns the index of the last occurrence of a punctuation
   * mark in s or -1 if s contains no punctuation
   * 
   * When implementing this function, call your isPunct( ) method.
   * Do not simply copy and paste the body of isPunct( ) into this method.
   */
  public static int indexOfLastPunct(String s) { // 6
	  for (int i = s.length() - 1; i >= 0; i--) {
		  if (isPunct(s.charAt(i))) {
			  return i;
		  }
	  }
    return -1;
  }

  /*
   * returns a new String which is the same as s but with
   * each instance of oldChar replaced with newChar
   */
  public static String substitute(String s, char oldChar, char newChar) { // 7
	  String replace_str = "";
	  for (int i = 0; i <= s.length() - 1; i++) {
		  if (s.charAt(i) == oldChar) {
			  replace_str = s.replace(oldChar, newChar);
			  return replace_str;
		  }
	  }
    return s;
  }

  /*
   * returns a new String which is the same as s, but
   * with each instance of a punctuation mark replaced
   * with a single space character
   *
   * Use at least one of your other functions in your
   * solution to this.
   *
   */
  public static String substitutePunct(String s) { // 8
	  String replace_str = "";
      for (int i = 0; i < s.length(); i++) {
          if (isPunct(s.charAt(i))) {
              replace_str += ' ';
          } else {
              replace_str += s.charAt(i);
          }
      }
    return replace_str;
  }
  
  /*
   * returns a new String which is the same as s,
   * but with all of the punctuation
   * marks removed.
   *
   * Use at least one of your other functions
   * in your solution to this one.
   * 
   */
  public static String withoutPunct(String s) { // 9
	  String new_str = "";
	  for (int i = 0; i < s.length(); i++) {
		  if (!isPunct(s.charAt(i))) {
			  new_str += s.charAt(i);
		  }
	  }
    return new_str;
  }

  /* returns true if c is found in s or false otherwise */
  public static boolean foundIn(String s, char c) { // 10
	  for (int i = 0; i < s.length(); i++) {
		  if (s.charAt(i) == c) {
			  return true;
		  }
	  }
    return false;
  }

  /*
   * Returns true of s contains none of the characters
   * found in chars or false otherwise.
   */
  public static boolean containsNone(String s, String chars) { // 11
	  for (int i = 0; i < s.length(); i++) {
		  for (int j = 0; j < chars.length(); j++) {
			  if (s.charAt(i) == chars.charAt(j)) {
				  return false;
			  }
		  }
	  }
    return true;
  }
  
  /*
   * Returns true of s is comprised of only punctuation or
   * false otherwise
   *
   * Use at least one of your other
   * functions in this one.
   */
  public static boolean onlyPunct(String s) { // 12
	  for (int i = 0; i < s.length(); i++) {
		  if (!isPunct(s.charAt(i))) {
			  return false;
		  }
	  }
    return true;
  }

  /*
   * Returns true of s contains no punctuation or
   * false otherwise
   *
   * Use at least one of your other
   * functions in this one.
   */
  public static boolean noPunct(String s) { // 13
	  for (int i = 0; i < s.length(); i++) {
		  if (isPunct(s.charAt(i))) {
			  return false;
		  }
	  }
    return true;
  }

  /*
   * returns true if s has two punctuation marks
   * right next to each other or false otherwise
   *
   * use at least one of your other methods
   * in your solution to this method
   */
  public static boolean consecutivePuncts(String s) { // 14
	  int j = 0;
	  for (int i = 1; i < s.length(); i++) {
		  if (isPunct(s.charAt(i)) && isPunct(s.charAt(j))) {
			  return true;
          }
	      j++;
	  }
	  return false;
  }
}
