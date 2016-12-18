/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

public class PremiumUser extends User {

    public PremiumUser(String login, String pass, double money) {
        super(login, pass, money);
    }

    @Override
    public boolean isPremium() {
        return true;
    }
}
