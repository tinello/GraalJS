package ar.com.tinello.graaljs;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;

public class Main {
    
    static String JS_CODE = "(function myFun(param){console.log('Hello ' + param + ' from JS');})";

     public static void main(String[] args) {
         String who = args.length == 0 ? "World" : args[0];
         System.out.println("Hello " + who + " from Java");
         try (Context context = Context.create()) {
             Value value = context.eval("js", JS_CODE);
             value.execute(who);
         }
     }
}
