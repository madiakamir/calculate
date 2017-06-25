package com.company;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner polin = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String polinText = polin.nextLine().toUpperCase();
        String perpolinText = "";

        if (polinText.length() == 5){
            for(int i = 4; i >= 0; i--){
                perpolinText = perpolinText + polinText.substring(i, i+1);
            }

            if (polinText.equals(perpolinText)){
                System.out.print("The text is polintrop");
            } else {
                System.out.print("The text  is not polintrop " + perpolinText);
            }
        }else{
            System.out.print("The text length more or less than 5 simbols");
        }
    }
}
