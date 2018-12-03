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
public class KZBotAdapter implements Robot{

    Bot bot;

    public KZBotAdapter(Bot bot) {
        this.bot=bot;
    }
    
    @Override
    public void sayHello() {
        bot.sendMessageHello();
    }

    @Override
    public void sayGoodbye() {
        bot.sendMessageGoodBye();
    }
    
}

