package artifactory.test;

/**
 * Hello world!
 */
public class Multi1 {
    public static void main(String[] args) {
    	Multi1 m = new Multi1();
    	String name = args.length > 0 ? args[0] : "world";
        m.hello(name);
    }

    public void hello(String name) throws Exception {
    String greeting = "Hello";
    System.out.println(greeting + " " + name);
  }
}
