package lambdas;

public class RunnableLambdaExample {

    public static void main(String[] args) {

        /*
        * prior Java 8
        * */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("inside runnable 1");
            }
        };

        new Thread(runnable).start();

        /*
        * jave 8 Lambda
        * Syntax : () -> {}
        * */
        Runnable runnableLambda2 = ()->{
            System.out.println("inside runnable Lambda 2");
        };
        new Thread(runnableLambda2).start();

        //Clean Code 3 : withour curly braces
        Runnable runnableLambda3 = ()->System.out.println("inside runnable Lambda 3");
        new Thread(runnableLambda3).start();

        //Clean Code 4
        new Thread(()->System.out.println("inside runnable Lambda 4")).start();


    }
}
