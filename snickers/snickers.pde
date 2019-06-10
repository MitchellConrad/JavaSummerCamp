double snickersPrice = 0.97;
double ukPound = 1.0;
double salesTax = 1.12;
double snickersPriceTax = (salesTax * snickersPrice);
double conversionRate = 1.27;
double usDollar = (conversionRate * ukPound);
double ukPoundTotal = 3500;
double usDollarTotal = (ukPoundTotal * usDollar);
double snickersNYC = 2300;
double snickersNYCPrice = (snickersNYC * snickersPriceTax);
int usDollarTotalafterNYC = (int)(usDollarTotal - snickersNYCPrice);
print("Remaining money after New York: ");
 

String numbah = Integer.toString(usDollarTotalafterNYC);
print("$");
for(int i = 0; i < numbah.length(); i++){
  char[] numb = numbah.toCharArray();
  print(numb[i]);
  if(i%3 == 0 && i != numbah.length()-1){
    print(",");
  }
}
println("");


double westAfricanFrancs = 584.80;
double westAfricanFrancsTotal = (usDollarTotalafterNYC * westAfricanFrancs);
double senegalTax = 1.27;
double senegalSnickers = 0.85;
double westAfricanSnickersTax = (senegalSnickers * senegalTax);
int snickersSenegal = (int)(westAfricanFrancsTotal / westAfricanSnickersTax);


print("Snickers Bought in Senegal: ");
String number = Integer.toString(snickersSenegal);
print("$");

for(int i = 0; i < number.length(); i++){
  char[] numb = number.toCharArray();
  print(numb[i]);
  if(i%3 == 0 && i != number.length()-1){
    print(",");
  }
}
println("");
///////////////////////////////
double snickersNJTax = 1.15;
double snickersNJPrice = (snickersPrice * snickersNJTax);
int snickersNJ = (int) (usDollarTotalafterNYC / snickersNJPrice );
print("Snickers Bought in New Jersey: "); 

String numbe = Integer.toString(snickersNJ);


for(int i = 0; i < numbe.length(); i++){
  char[] numb = numbe.toCharArray();
  print(numb[i]);
  if(i%3 == 0 && i != numbe.length()-1){
    print(",");
  }
}
println("");
