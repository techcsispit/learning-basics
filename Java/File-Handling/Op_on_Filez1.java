package Stormlight;

import java.util.*;
import java.io.*;

public class Op_on_Filez1 {
    Scanner sc=new Scanner(System.in);
    ArrayList<Integer> arr= new ArrayList<Integer>();

    void takeData(){ //To take data from user
        System.out.print("Please enter the no.of students=");
        int nos=sc.nextInt();
        System.out.println();
        for(int i=0;i<nos;i++){
            System.out.print("Please enter your roll no= ");
            arr.add(sc.nextInt());
            System.out.println();
        }
    }

    void output() throws IOException{//To write output to a file
        FileWriter fw=new FileWriter("myroll.txt",true);
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        for (int roll: arr){
            pw.println(roll);
        }
        pw.close();
        bw.close();
        fw.close();
    }

    void input() throws IOException{ //To take input from a file
        FileReader fr=new FileReader("myroll.txt");
        BufferedReader br=new BufferedReader(fr);
        String s="";
        while((s= br.readLine()) != null){
            System.out.println(s);
        }
        br.close();
        fr.close();
    }

    boolean present(int R)throws IOException{ //To check whether R is present in file or not
        FileReader f=new FileReader("myroll.txt");
        BufferedReader b=new BufferedReader(f);
        String text;
        boolean flag=false;
        while((text=b.readLine()) != null){
            int r;
            if(text.length()== 0){
                r=0;
            } else {
                r = Integer.parseInt(text);
            }
            if(R == r){
                flag=true;
                break;
            }
        }
        b.close();
        f.close();
        return flag;
    }

    void delete(int R) throws IOException{ //To delete all occurences of R from a file
        FileReader f=new FileReader("myroll.txt");
        BufferedReader b=new BufferedReader(f);
        FileWriter fw=new FileWriter("temp.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        int check=0;
        String s="";
        while((s=b.readLine()) != null){
            int r;
            if(s.length() == 0) {
                r = 0;
            } else {
                r=Integer.parseInt(s);
            }
            if(R == r){
                check++;
                continue;
            } else {
                pw.println(r);
            }
        }
        pw.close();
        bw.close();
        fw.close();
        b.close();
        f.close();
        FileReader F=new FileReader("temp.txt");
        BufferedReader B=new BufferedReader(F);
        FileWriter FW=new FileWriter("myroll.txt");
        BufferedWriter BW=new BufferedWriter(FW);
        PrintWriter PW=new PrintWriter(BW);
        while((s= B.readLine()) != null) {
            if (Integer.parseInt(s) == 0) {
                PW.println();
            } else {
                PW.println(s);
            }
        }
        PW.close();
        BW.close();
        FW.close();
        B.close();
        F.close();
        if(check>0){
            System.out.println("Record has been deleted.");
        } else {
            System.out.println("Record not found.");
        }
    }

    void mod(int M, int TBM) throws IOException{ //To modify value M with TBM in a file
        FileReader f=new FileReader("myroll.txt");
        BufferedReader b=new BufferedReader(f);
        FileWriter fw=new FileWriter("temp.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        String s="";
        int check=0;
        while((s=b.readLine()) != null){
            if(s.length() > 0) {
                if (Integer.parseInt(s) == M) {
                    pw.println(TBM);
                    check++;
                } else {
                    pw.println(s);
                }
            } else {
                pw.println();
            }
        }
        pw.close();
        bw.close();
        fw.close();
        b.close();
        f.close();
        FileReader F=new FileReader("temp.txt");
        BufferedReader B=new BufferedReader(F);
        FileWriter FW=new FileWriter("myroll.txt");
        BufferedWriter BW=new BufferedWriter(FW);
        PrintWriter PW=new PrintWriter(BW);
        while((s= B.readLine()) != null) {
            PW.println(s);
        }
        PW.close();
        BW.close();
        FW.close();
        B.close();
        F.close();
        if(check>0){
            System.out.println("Record has been modified.");
        } else {
            System.out.println("Record not found.");
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        Op_on_Filez1 ob=new Op_on_Filez1();
        System.out.print("Menu \n 1. Save data \n 2.Read Data \n 3. Search data \n 4. Delete data \n 5. Modify data \n 6.Exit \n Enter your choice= ");
        int ch=sc.nextInt();
        switch(ch){
            case 1: ob.takeData();
                    ob.output();
                    break;
            case 6: System.out.println("Thank you!");
                    break;
            case 2: ob.input();
                    break;
            case 3: System.out.print("Please enter roll number to be searched= ");
                    int s= sc.nextInt();
                    System.out.println(ob.present(s));
                    break;
            case 4: System.out.print("Please enter roll number to be deleted: ");
                    int tbd=sc.nextInt();
                    ob.delete(tbd);
                    break;
            case 5: System.out.print("Please enter value to be edited= ");
                    int x=sc.nextInt();
                    System.out.println();
                    System.out.print("Please enter new value= ");
                    int y=sc.nextInt();
                    ob.mod(x,y);
                    break;
            default: System.out.print("Invalid choice.");
                     break;
        }
    }
}
