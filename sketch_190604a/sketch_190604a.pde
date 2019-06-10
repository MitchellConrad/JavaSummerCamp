double snickersPrice = 1.75;
double ukPound = 1.0;
double conversionRate = 1.27;
double usDollar = (conversionRate * ukPound);
double ukPoundTotal = 3500;
double usDollarTotal = (ukPoundTotal * usDollar);
double snickers = (usDollarTotal / snickersPrice);
println(snickers); 
