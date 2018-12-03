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
public class KZRobot implements Robot{

    @Override
    public void sayHello() {
        System.out.println("Robot : Salem"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sayGoodbye() {
        System.out.println("Robot : Sau Boliniz"); //To change body of generated methods, choose Tools | Templates.
    }
    
}
