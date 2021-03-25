package com.company;

public class Main {
    public static void main(String[] args) {
        String text = "My text = Hello, World!I love software develope.";
        String newText = "";
        char[] code = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' '};
        char[] codeChange = {'d','y','p','r','i','a','j','u','h','t','q','w','e','s','f','o','v','c','n','b','l','x','m','k','z','g',' '};

        for (int i = 0; i < text.length(); i++) {
            char temp = text.charAt(i);
//            System.out.println(temp);
            for (int j = 0; j < code.length; j++) {
                if (temp == code[j]) {
                    newText += String.valueOf(codeChange[j]);
                }
            }
        }
        System.out.println(newText);
    }
}
