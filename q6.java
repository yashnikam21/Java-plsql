package assignment1;

public class q6 {

public static void main(String[] args) {
if(!((args.length)==2)) {
String str = args[0];
getResult(str);
}
else {
System.out.println("Enter only one string.");
}
}
public static void getResult(String str) {
System.out.println("Entered String: "+str);
System.out.println("Length of the string: "+str.length());
System.out.println("Upper Case: "+str.toUpperCase());
String str1 = "";
for(int i=str.length()-1;i>=0;i--) {
str1 = str1 + str.charAt(i); 
}
if(str.equalsIgnoreCase(str1)){
System.out.println("Entered String is Palindrome.");
}
else {
System.out.println("Not a Palindrome.");
}
}

}