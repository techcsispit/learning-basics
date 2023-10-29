package Stormlight;

import java.io.*;
import java.util.Scanner;

public class Op_on_BinFile {
    int Roll;
    double Marks;

    void output() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Enter our roll_no:");
        Roll = Integer.parseInt(br.readLine());
        System.out.println();
        System.out.print("Enter our mks:");
        Marks = Double.parseDouble(br.readLine());
        System.out.println();
        FileOutputStream fos = new FileOutputStream("mydata.dat", true);
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeInt(Roll);
        dos.writeDouble(Marks);
        dos.close();
        dos.close();
    }

    void input() throws IOException {
        FileInputStream fis = new FileInputStream("mydata.dat");
        DataInputStream dis = new DataInputStream(fis);
        boolean flag = false;
        while (flag == false) {
            try {
                int R;
                double M;
                R = dis.readInt();
                M = dis.readDouble();
                System.out.println("Roll no=" + R + " - " + M);
            } catch (EOFException e) {
                flag = true;
            }
        }
        dis.close();
        fis.close();
    }

    boolean search(int R) throws IOException {
        FileInputStream fis = new FileInputStream("mydata.dat");
        DataInputStream dis = new DataInputStream(fis);
        boolean result = false;
        boolean flag = false;
        while (flag == false) {
            try {
                int r = dis.readInt();
                if (R == r) {
                    result = true;
                    break;
                }
            } catch (EOFException e) {
                flag = true;
            }
        }
        dis.close();
        fis.close();
        return result;
    }

    void modify(int R) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileInputStream fis = new FileInputStream("mydata.dat");
        DataInputStream dis = new DataInputStream(fis);
        FileOutputStream fos = new FileOutputStream("temp.dat");
        DataOutputStream dos = new DataOutputStream(fos);
        boolean flag = false;
        while (flag == false) {
            try {
                int RR = dis.readInt();
                double M = dis.readDouble();
                if (R == RR) {
                    System.out.print("Please enter marks to be modified:");
                    M = sc.nextDouble();
                }
                dos.writeInt(RR);
                dos.writeDouble(M);
            } catch (EOFException e) {
                flag = true;
            }
        }
        dos.close();
        fos.close();
        dis.close();
        fis.close();
        fis = new FileInputStream("temp.dat");
        dis = new DataInputStream(fis);
        fos = new FileOutputStream("mydata.dat");
        dos = new DataOutputStream(fos);
        flag = false;
        while (flag == false) {
            try {
                int a = dis.readInt();
                double m = dis.readDouble();
                dos.writeInt(a);
                dos.writeDouble(m);
            } catch (EOFException e) {
                flag = true;
            }
        }
        dos.close();
        fos.close();
        dis.close();
        fis.close();
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Op_on_BinFile ob = new Op_on_BinFile();
        System.out.println("1.Store data \n 2.Read data \n 3.Seach data \n 4.Modify data");
        System.out.println("Please enter a choice:");
        int ch = sc.nextInt();
        while (ch < 5) {
            switch (ch) {
                case 1:
                    ob.output();
                    break;
                case 2:
                    System.out.println("Displaying file data:"+ "\n");
                    ob.input();
                    break;
                case 3:
                    System.out.println("Enter roll number to be searched=");
                    int f = sc.nextInt();
                    System.out.println(ob.search(f));
                    break;
                case 4:
                    System.out.println("Enter roll number whose marks are to be modified");
                    int R = sc.nextInt();
                    ob.modify(R);
                    break;
            }
            ch++;
        }
    }
}
