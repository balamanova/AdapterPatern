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
public class KZBot implements Bot{

    @Override
    public void sendMessageHello() {
        System.out.println("Bot : Salem");
    }

    @Override
    public void sendMessageGoodBye() {
        System.out.println("Bot : Sau Boliniz");
    }

}
