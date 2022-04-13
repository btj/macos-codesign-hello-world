public class MyShell {
  public static void main(String[] args) throws Exception {
    Process process = new ProcessBuilder(args).inheritIO().start();
    int exitCode = process.waitFor();
    System.exit(exitCode);
  }
}
