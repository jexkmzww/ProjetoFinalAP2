/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinal;

import java.awt.Component;
import javax.swing.JFrame;

/**
 *
 * @author jexkmzww
 */
public class Application extends JFrame {
 
    public Application(Component component) {

        add(component);
        setVisible(true);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
    }

    public Application() {

        Login login = new Login();

        add(login);
        setVisible(true);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getRootPane().setDefaultButton(login.getButtonEntrar());
        setLocationRelativeTo(null);
    }

    public static void main(String args[]) {

        Application app = new Application();

    }
}
