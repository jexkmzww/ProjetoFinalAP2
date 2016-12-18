/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal;

import user.DefaultUser;
import user.PremiumUser;
import user.User;
import java.util.HashMap;

import java.util.Map;

/**
 * Created by jexkmzww on 07/12/2016.
 */
public class Users {

    private static Map<String, User> users = new HashMap<>();

    static {
        //chave e valor - chave "jose" - defaultUser
        //chave e valor - chave "jose" - premiumUser
        users.put("jose", new DefaultUser("jose", "jose", 500.00));
        users.put("joao", new DefaultUser("joao", "joao", 10.00));
        users.put("adm", new PremiumUser("adm", "adm", 1000.00));
    }

    public static User login(String login, String pass) throws Exception {
        //existe String
        if (users.containsKey(login)) {
            //verificar se a senha é igual a senha do user
            User x = users.get(login);
            //se a senha for igual a senha do user
            if (x.getPass().equals(pass)) {
                //retorna o value da key - defaultUser - "jose", jose
                return users.get(login);
            }
        }
        throw new Exception();
    }



}
