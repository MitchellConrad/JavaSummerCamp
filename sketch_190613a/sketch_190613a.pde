double sum = 0;
double highestGrade = 0;
double [] myGrades = {88.5, 100, 67, 72.5, 80, 81.5, 85, 99, 95, 100, 50, 45, 85, 89.5, 92};
for (int i = 0; i < myGrades.length; i++) {
sum = myGrades[i] + sum;
}
int average = (int)(sum / myGrades.length);
println("The class average was: " + average);
for (int c = 0; c < myGrades.length; c++) {
if (myGrades[c] > highestGrade) {
highestGrade = myGrades[c];
}
}
println("The highest grade was: " + highestGrade);
double lowestGrade = 100;
for (int d = 0; d < myGrades.length; d++) {
if (myGrades[d] <= lowestGrade) {
lowestGrade = myGrades[d];
}
}
println("The lowest grade was: " + lowestGrade);

double median = myGrades.length / 2;
String med = String.format ("%.1f", median);
if (med.lastIndexOf('5') > med.indexOf('.')) {
int median1 = myGrades.length / 2 - 0.5;
int median2 = myGrades.length / 2 + 0.5;
double median3 = (myGrades[median1] + myGrades[median2]) / 2;
}
else {
median = myGrades[median];
println("The median score of the class was:" + median);
}
