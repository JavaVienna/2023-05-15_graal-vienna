import java.lang.reflect.InvocationTargetException;

public class Main {
  public static void main(String[] args) throws Exception {

    var blender = (Runnable) Class.forName(args[0]).getDeclaredConstructor().newInstance();
    //    var blender = new Blender();
    for (int i = 0; i < 10; i++) {
      long start = System.nanoTime();
      for (int j = 0; j < 10; j++) {
        blender.run();
      }
      long end = System.nanoTime();

      System.out.println(((end - start) / 1_000_000));
    }
  }
}
