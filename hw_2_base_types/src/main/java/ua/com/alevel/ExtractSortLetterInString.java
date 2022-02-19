package ua.com.alevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExtractSortLetterInString {

    public static void extractString() throws IOException {
        int count[] = new int[256];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your string: ");
        String str = reader.readLine();
        String str1 = str.replaceAll("[^a-zA-Z]", "");
        char[] arr = str1.toCharArray();

        for(int i=0;i<(arr.length-1);i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    char temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        String str2 = String.valueOf(arr);

        for (int i = 0; i < str2.length(); i++) {
            count[(int) str2.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                System.out.println((char) i + " - " + count[i]);
            }
        }
        System.out.println();
    }
}
