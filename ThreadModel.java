public static boolean isDone=false;
new Thread(new Runnable() {
    public void run() {
        int counter = 1;
        while (!isDone) {
        System.out.println("Printing line: " + counter);
        try { Thread.sleep(10); } catch (Exception ie) {}
        }
     }
        }).start();
new Thread(new Runnable() {
public void run() {
      try  {Thread.sleep(100); } catch (Exception ie) {}
      isDone = true;
      }
  }).start();
