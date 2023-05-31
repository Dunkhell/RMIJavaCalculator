package org.uwm.sys.rozpro.calculator.server.service;

import lombok.RequiredArgsConstructor;
import org.uwm.sys.rozpro.calculator.server.model.CalculatorInterface;

import java.rmi.RemoteException;


@RequiredArgsConstructor
public class CalculatorService implements CalculatorInterface {

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) throws RemoteException {
        if (num2 == 0) {
            throw new RemoteException("Cannot divide by zero!");
        }
        return num1 / num2;
    }
}
