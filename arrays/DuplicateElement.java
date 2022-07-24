package arrays;

import java.io.*;

public class DuplicateElement {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(in.readLine());

        int[] a = new int[size];

        String[] s = new String[1];

        s = in.readLine().split(" ");

        for(int i=0; i<s.length; i++)
            a[i] = Integer.parseInt(s[i]);

        for(int i=0; i<s.length; i++)
            System.out.println(a[i]);

    }

}
