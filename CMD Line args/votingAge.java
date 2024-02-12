public class votingAge{
public static void main(String[]args){

int age = Integer.parseInt(args[0]);
System.out.println(age);
if(age>=18){
System.out.println(age +" is Eligible");
}
else{
System.out.println(age +" is Not Eligible");
}

}
}