/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoSynchronization;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author Menja
 */
public class Main {

    public static void main(String[] args) {
        //Variables
        Processor processor1 = new Processor();
        Scanner scanner = new Scanner(System.in);

        //runnings
        processor1.start();
        System.out.println("Press any key to stop the Thread");
        scanner.nextLine();
        processor1.shutDown();
        System.out.println("Press any key key to start the thread again");
        scanner.nextLine();
        processor1.start();
        
    }
}
