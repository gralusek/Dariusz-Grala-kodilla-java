package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String input, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(input);
        System.out.println(result);
    }

    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Example text", (input) -> "ABC" + input + "ABC") ;
        poemBeautifier.beautify("Example text", (input) -> input.toUpperCase()) ;
        poemBeautifier.beautify("Example text", (input) -> input + 555);
        poemBeautifier.beautify("Example text", (input) -> input.toLowerCase());
    }


}
