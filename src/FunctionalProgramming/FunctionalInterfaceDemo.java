package FunctionalProgramming;


@FunctionalInterface
interface BookAction{
    void perform();
}

@FunctionalInterface
interface Operation{
    int add(int a,int b);
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args){
        //STEP1
       BookAction action1 =new BookAction(){
           @Override
           public void perform(){
               System.out.println("Hello World!");
           }
       };
      //STEP 2
        BookAction action2 = () ->{
            System.out.println("Action peroformed");
        };
        //STEP 3
        BookAction action3 = () -> System.out.println("Action peroformed");
       action3.perform();

       Operation operation=(int a,int b) -> {
           return a + b;
       };
      System.out.println(operation.add( 1,2));
    }
}
