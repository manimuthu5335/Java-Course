public class votingAge{
public static void main(String[]  args){
 
String Name = args[0];
System.out.println(Name);
int age = Integer.parseInt(args[1]);
System.out.println(age);
if(age>=18){
System.out.println(Name +" is Eligible");
}
else{
System.out.println(Name +" is Not Eligible to vote");
}

}
}
