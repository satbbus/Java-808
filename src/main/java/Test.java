import java.io.IOException;

public class Test {
    public static void main(String[] args) throws Exception {
        X xobj = new X();
        xobj.printFileContent();
     }
}

class X{
    public void printFileContent() throws IOException {
        throw new IOException();
    }
}