public class Main {
    public static void main(String[] args){
        Contact pd = new Contact("name " , 999, 770855442);
 Contact [] contacts = new Contact[4];
 contacts [0] = new Contact("aleks ", 707, 73333333);
contacts [1]= new Contact("igor " , 556, 555653465);
contacts [2] = new Contact("aman " , 704, 704456723);
contacts[3] = new Contact("andrei" , 7777, 777765432);
for (int i = 0;  i< contacts.length; i++){
    System.out.println(contacts[i]);
    System.out.println();
}
System.out.println(pd);
pd.number();

pd.enter();
        pd.name();










 }

        }


