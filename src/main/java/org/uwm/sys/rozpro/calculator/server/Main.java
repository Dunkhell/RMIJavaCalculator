package org.uwm.sys.rozpro.calculator.server;

import org.uwm.sys.rozpro.calculator.server.model.CalculatorInterface;
import org.uwm.sys.rozpro.calculator.server.service.CalculatorService;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);


    public static void main(String[] args) {
        try {
            CalculatorService server = new CalculatorService();
            CalculatorInterface stub = (CalculatorInterface) UnicastRemoteObject.exportObject(server, 0);

            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind("Calculator", stub);
            logger.info("Calculator service is running...");
        } catch (Exception e) {
            System.err.println("Calculator service crashed!: " + e.toString());
            e.printStackTrace();
        }
    }
}