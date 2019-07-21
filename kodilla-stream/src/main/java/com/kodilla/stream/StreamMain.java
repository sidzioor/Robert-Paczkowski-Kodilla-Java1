package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.Processor;

public class StreamMain {
    public static void main(String[] args) {
        Processor processor =new Processor();
        processor.execute(()-> System.out.println("this is an example text"));

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Add ABC on start and end of String", (text -> {
            String abc = " ABC ";
            String text1= abc+text+abc;
            System.out.println(text1.trim());
        }));
        poemBeautifier.beautify("Change all letter in String to upper case", (text -> System.out.println(text.toUpperCase())));
        poemBeautifier.beautify("chanGe AlL oF ThE LeTtErS tO NoRmaL SeNteNcE.", (text -> {
            char firstLetter = text.toUpperCase().charAt(0);
            System.out.println(firstLetter+text.toLowerCase().substring(1));
        }));
        poemBeautifier.beautify("aewqrewDelete added random letter on start and end of String.qwertwwtr", (text ->{
            int firstLetterOfNormalSentence = text.indexOf("D");
            int lastLetterOfNormalSentence = text.indexOf(".")+1;
            String deleteRandomLetters = text.substring(firstLetterOfNormalSentence,lastLetterOfNormalSentence);
            System.out.println(deleteRandomLetters);
        }));
    }
}
