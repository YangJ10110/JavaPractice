package org.example;

import java.util.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        while (true) {
//            int read = System.in.read();
//            System.out.println("Input" + read);
//            if (filter(read)){
//                process(read);
//            }
//        }
//        IfElse();

//        Substring();
//        Reverse();

//        Scanner scan = new Scanner(System.in);
//        String a = scan.next();
//        String b = scan.next();
//        scan.close();
//        a = a.toLowerCase();
//        b = b.toLowerCase();
//        boolean ret = isAnagram(a,b);
//        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

//        javaList();
//        javaMap();
        javaStack();
    }

    private static boolean filter(int read){
        return read != '\n' && read != 'a';
    }

    private static void process(int arg){
        if (Math.max(arg, 90) % 2 == 0) {
            System.out.println("!");
        }
    }


    public static void IfElse() throws IOException {
        Scanner scan = new Scanner(System.in);
        int N = 0;
        int i = 0;

        while(i<5){

            N = scan.nextInt();

            if (N%2 == 0 ){
                if (N > 1 && N < 6){
                    System.out.println("Not Weird");
                }
                else if (N>5 && N < 20){
                    System.out.println("Weird");
                } else if (N>=20){
                    System.out.println("Not Weird");
                }
            }else {
                System.out.println("Weird");
            }
            i++;
        }


    }

    public static void Substring () throws IOException {
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        int start = scan.nextInt();
        int end = scan.nextInt();

        // Number of string indices we need to extract
        int indices = end - start;
        String x = S.substring(start,end);
        System.out.println(x);


    }

    public static void Reverse() throws IOException{
        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        String B = A;
        int length = A.length();
        int x = length-1;
        for (int i = 0; i < length; i++){
            //replace B with end to start of A
            System.out.println(x);
            char ch = A.charAt(x);

            B = B.substring(0, i) + ch + B.substring(i + 1);
            System.out.println(B);
            x--;

        }
        if (Objects.equals(B,A)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }

    public static boolean isAnagram(String a, String b) throws IOException {


        if (a.length() != b.length()){
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();

        int[] freqA = new int[26];
        int[] freqB = new int[26];

        // 1. logic iterating thru the string A and B and storing each character in list
        // Splitting without regex
//
//        Map<Character,Integer> freq1 = new HashMap<>();
//        Map<Character,Integer> freq2 = new HashMap<>();
//        char ch;

//        for (int i = 0; i < a.length(); i++) {
//            listA.add(a.charAt(i));
//            ch = a.charAt(i);
//            if (freq1.get(ch) != null){
//                freq1.put(ch,freq1.get(ch)+1);
//            }
//            else {
//                freq1.put(ch,1);
//            }

//        }
//        for (int i = 0; i < b.length(); i++) {
//            ch = b.charAt(i);
//            if (freq2.get(ch) != null){
//                freq2.put(ch,freq2.get(ch)+1);
//            }
//            else {
//                freq2.put(ch,1);
//            }
//        }
//        System.out.println(freq2);
//        System.out.println(freq1);



//        return Objects.equals(freq1, freq2);
        int x;
        int y;

        for (int i = 0; i < a.length(); i++) {
            // a in ascii is 97 to z with 122
            // to store it in freqA and freqB list we need to diminish the value to the index
            // ex: a-a 97-97 is 0 b-a is 98-97 is 1
            // a being the base making it equal to its index
            x = a.charAt(i) - 'a';
            freqA[x] = freqA[x] + 1;
            y = b.charAt(i) - 'a';
            freqB[y]=freqB[y]+1;
        }


        for (int i = 0; i < 26; i++) {
            if (freqA[i] != freqB[i]) {
                return false;
            }
        }

        return true;

    }

    public static void javaList() throws IOException {
        Scanner scan = new Scanner(System.in);
        // get first the index size of the list
        int indexSize = scan.nextInt();
        ArrayList<Integer> L = new ArrayList<>();
        scan.nextLine();
        String input = scan.nextLine();
        // regex to split the string input to lis
        String[] inputArray = input.split("\\s+",indexSize);


        for (int i = 0; i <= indexSize-1; i++){
            L.add(Integer.parseInt(inputArray[i]));
        }

//        System.out.println(L);
        int queries = scan.nextInt();
        for (int i=0;i < queries; i++){
            String Command = scan.next();
            switch(Command){
                case "Insert":
                    //
                    scan.nextLine();
                    input = scan.nextLine();
                    inputArray = input.split("\\s+",indexSize);
                    L.add(Integer.parseInt(inputArray[0]),Integer.parseInt(inputArray[1]));
//                L[Integer.parseInt(inputArray[0])]=Integer.parseInt(inputArray[1]);
//                    System.out.println(L);

                    break;

                case "Delete":
                    int index = scan.nextInt();
                    L.remove(index);

                    break;
            }
        }
        String Output = "";
        String ch = " ";
        indexSize = L.size() -1;

        for (int i =0; i <= indexSize; i++ ){
            Output = Output.concat(L.get(i)+ch);
        }

        System.out.println(Output);


    }

    public static void javaMap () throws IOException {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        String name;
        int phone;
        Map<String,Integer> contact = new HashMap<>();

        for(int i=0;i<n;i++)
        {
            name=in.nextLine();
            phone=in.nextInt();
            contact.put(name,phone);
            in.nextLine();

        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if (contact.get(s) == null){
                System.out.println("Not found");
            }
            else {
                int num = contact.get(s);
                System.out.println(s+"="+num);
            }



        }
    }
    public static void javaStack () throws IOException {
        Scanner sc = new Scanner(System.in);
        char[] opening = {'{','[','('};
        char[] closing = {'}',']',')'};

        while (sc.hasNext()) {
            String input=sc.next();
            Stack<Character> in = new Stack<>();
            boolean isBalanced = true;

            for (int i=0; i < input.length(); i++){
                boolean isLast = input.length() - i -1 ==0;
                for (char s: opening){
                    // check if opening
                    if (s == input.charAt(i)){
                        // push
                        in.push(input.charAt(i));
                        // isBalanced = false;
                    }
                }
                for (char s: closing){
                    // check if closing
                    if (s == input.charAt(i)){
                        // check if empty
                        if (in.isEmpty()){
                            isBalanced = false;
                            break;
                        }
                        else{
                            char x = in.pop();
                            int k = 0;
                            boolean matchFound = false;
                            while (k < 3){
                                if (x == opening[k] && s == closing[k]){
                                    matchFound = true;
                                    break;
                                }
                                k++;
                            }
                            if (!matchFound){
                                isBalanced = false;
                                break;
                            }

                        }

                    }
                }



            }
            if (!in.empty()){
                isBalanced = false;
            }
            System.out.println(isBalanced ? "true":"false");

        }



        }
    }






//public class Main {
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        int c = scan.nextInt();
//        // Complete this line
//        // Complete this line
//
//        System.out.println(a);
//        System.out.println(b);
//
//        System.out.println(c);
//
//        // Complete this line
//        // Complete this line
//    }
//}
