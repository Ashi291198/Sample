/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
         * Read input from stdin and provide input before running

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            System.out.println("hello world");
        }
 ,w,s       */
Scanner kb=new Scanner(System.in);
int n;
        System.out.println("Enter the n th term ");
        n=kb.nextInt();
int i,a,b,w,s;


for( i=1;i<=n;i++)
{
    if(n%2==0)
    {
        w=n/2;
        
        a=(int )Math.pow(3,w-1);
        System.out.println(a);
        
    }
    else
    {
        s=(n+1)/2;
        
    b=(int)Math.pow(2,s-1);
        System.out.println(b);
    }
}
     
    }


    
    
}
