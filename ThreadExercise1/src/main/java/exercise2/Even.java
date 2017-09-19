/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

/**
 *
 * @author Menja
 */
public class Even extends Thread {

    private int n = 0;

    @Override
    public void run() {
        next();
    }

    public int next() {
        n++;
        n++;
        System.out.println(n);
        return n;
    }
}
