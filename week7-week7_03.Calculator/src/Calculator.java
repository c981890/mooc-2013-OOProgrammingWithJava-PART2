/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aikitrumm
 */
public class Calculator {

    private Reader reader;
    private int statistics;

    public Calculator() {
        this.reader = new Reader();
        this.statistics = 0;
    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }

    private void sum() {
        System.out.print("value1: ");
        int value1 = reader.readInteger(); // read the value using the Reader-object
        System.out.print("value2: ");
        int value2 = reader.readInteger(); // read the value using the Reader-object
        System.out.println("sum of the values " + (value1 + value2)); // print the value according to the example above
        this.statistics++;
    }

    private void difference() {
        System.out.print("value1: ");
        int value1 = reader.readInteger(); // read the value using the Reader-object
        System.out.print("value2: ");
        int value2 = reader.readInteger(); // read the value using the Reader-object
        System.out.println("difference of the values " + (value1 - value2)); // print the value according to the example above
        this.statistics++;
    }

    private void product() {
        System.out.print("value1: ");
        int value1 = reader.readInteger(); // read the value using the Reader-object
        System.out.print("value2: ");
        int value2 = reader.readInteger(); // read the value using the Reader-object
        System.out.println("product of the values " + (value1 * value2)); // print the value according to the example above
        this.statistics++;
    }

    private void statistics() {
        System.out.println("Calculations done " + this.statistics);

    }
}
