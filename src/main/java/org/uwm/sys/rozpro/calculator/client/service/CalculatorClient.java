package org.uwm.sys.rozpro.calculator.client.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.uwm.sys.rozpro.calculator.server.model.CalculatorInterface;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorClient {
    private static final Logger logger = LoggerFactory.getLogger(CalculatorClient.class);


    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            CalculatorInterface calculator = (CalculatorInterface) registry.lookup("Calculator");

            double num1 = 10.5;
            double num2 = 5.5;

            logger.info("Addition: " + calculator.add(num1, num2));
            logger.info("Subtraction: " + calculator.subtract(num1, num2));
            logger.info("Multiplication: " + calculator.multiply(num1, num2));
            logger.info("Division: " + calculator.divide(num1, num2));
        } catch (Exception e) {
            logger.error("Calculator client crashed!: " + e.toString());
            e.printStackTrace();
        }
    }
}
