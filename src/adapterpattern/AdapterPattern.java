/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpattern;

/**
 *
 * @author пк
 */
public class AdapterPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creating object from TargetClass
        Robot kzRobot = new KZRobot();
        
        //Creating object with Target CLass from Adaptee object
        Robot kzBot = new KZBotAdapter(new KZBot());
        
        //Testing TargetClass
        kzRobot.sayHello();
        kzRobot.sayGoodbye();
        
        //Testing AdaptedClass
        kzBot.sayHello();
        kzBot.sayGoodbye();
       
    }
    
}
