import java.util.Arrays;
import java.util.Scanner;

class Contact {


 private    String    name  ;
    private int   cod  ;
 private int   number  ;

    public Contact(String name, int cod, int number) {
        this.name = name;
        this.cod = cod;
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCod() {
        return cod;
    }
    public void setCod(int cod) {
        this.cod = cod;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    void number (){

        System.out.println("выберите  контактов    aleks   0700344322 ,igor 0705234243, atabek 0707345434, aman 0555342342 " );
        Scanner sc = new Scanner(System.in);
        System.out.println("выберите номер ");
        number = sc.nextInt();
        switch (number){
            case 1 :
                System.out.println(" igor  0705234243");
                break;
            case 2:
                System.out.println("atabek 0707345434");
                break;
            case 3:
                System.out.println("aman 0555342342");
                break;
            default:
                System.out.println(number);

        }
    }
  void enter (){
      System.out.println(" доступные коды 0700 ,  0550 ,  0774 вы можете выбрать одно из них");
      System.out.println( " ведите код который хотите сохранить");
      Scanner scanner = new Scanner(System.in);
      cod = scanner.nextInt();
      switch (cod){
          case 1:
              System.out.println(700);
          break;
          case  2:
              System.out.println(550);
              break;
          case 3:
               System.out.println(774);

          default:
              System.out.println(cod);
      }
      System.out.println("ведите номер сох");
      number = scanner.nextInt();
  }
  void  name(){
      System.out.println("ведите имя контакт ");
      Scanner sc = new Scanner(System.in);
      name = sc.nextLine();
      System.out.println( " ваш контакт успешно сохранен "+ name + "  " + number);
  }
    @Override
    public String toString() {
        return "Contact{" +
                " имя контактов ='" +this. name + '\'' +
                ", cod который вы должны дать =" + this.cod +
                ",номер телефона number=" +this.number +
                '}';
    }
}