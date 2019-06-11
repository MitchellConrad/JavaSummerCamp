/***Conditional Statements***/
/*
Given an integer, n, perform the following actions:
 - If n is odd, print "Weird"
 - If n is even and in the inclusive range 2 to 5,
 print "Not Weird"
 - If n is even and in the inclusive range 6 to 20,
 print "Weird"
 - If n is even and greater than 20, print "Not Weird"
 
 Assume n will be between 1 and 100.
 Complete the function below.
 */

String weirdOrNot(int N) {
  String answer;
  if (N % 2 == 0) {
    if (N >= 2 && N <= 5) {
      answer = "Not Weird";
      return answer;
    } 
    else if (N >= 6 && N <= 20) {
      answer = "Weird";
      return answer;
    } 
    else {
      answer = "Not Weird";
      return answer;
    }
  } 
  else {
    answer = "Weird";
    return answer;
  }
}
