//Palindrome Function
String word = "racecar";
String word2 = "";  
void output(String word) {
  println("Normal Word: " + word);
  println("Backwards Word: " + word2);
  if (word2.equals(word)) {
    println(word + " is a palindrome.");
    }
    else {
    println(word + " is not a palindrome.");
  }
}
void setup() { 
  for (int i = 0; i < word.length(); i++) {
     char word3 = (word.charAt(word.length() - 1 - i));
     word2 = word2 + word3; 
  }
  output(word);
}
