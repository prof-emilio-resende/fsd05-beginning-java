package br.com.fit;

import br.com.fit.basics.FlowControl;
import br.com.fit.basics.Operators;
import br.com.fit.basics.Types;
import br.com.fit.basics.Variables;
import br.com.fit.collections.Collections;
import br.com.fit.collections.Functions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Variables.doTry();
        Types.doTry();
        Operators.doTry();
        FlowControl.doTry(2);
        
        Collections.doTry();
        Functions.doTry();
    }
}
