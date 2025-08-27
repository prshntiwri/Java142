package KIET_OOPS.Exception_Handling;

import java.io.DataInputStream;


public class IOException extends Throwable {
        public static void main(String[] args) throws IOException, java.io.IOException {
            DataInputStream dis = new DataInputStream(System.in);
                int x,y,z = 0;
                x = dis.readInt();
                y = dis.readInt();
                z = x / y;
                System.out.println("Exception not occurs");
    }
}
