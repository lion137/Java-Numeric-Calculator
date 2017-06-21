package NumericCalculator.numeric;

import java.util.Scanner;

/**
 * Created by lion on 20/06/17.
 */
public class NumericCalc {
    public  static void main (String [] args){
        System.out.println("Welcome to calculator, type h to help,\ntype q/quit to exit");
        String help = "Simple calculator in java, operators: +, /, -, *, works on BigDecimals only, \n" +
                "example: 3 * (9876545678999999999999999.9999999999999999 - 1.) ";
        Tokenizer x = new Tokenizer();
        ParseExpression y = new ParseExpression();
        Eval z = new Eval();
        Scanner scan = new Scanner(System.in);
        for (;;) {
            System.out.print("> ");
            String input = scan.nextLine();
            if (input.equals("quit") || (input.equals("q"))) break;
            if (input.equals("h")) {System.out.println(help); continue;}
            System.out.println(z.evalPostfix(y.infixToPostfix(x.tokenize(input))));
        }
    }
}

