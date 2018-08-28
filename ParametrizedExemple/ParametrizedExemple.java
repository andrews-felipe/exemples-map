Written by Anonymous

package br.cesed.unifacisa.si.map.exercicio;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

public class Parameterized 
{
	private Parameterized() {}  
    // Interfaces.
    private interface Car 
    {
        String showInfo();
    }
    private enum Type 
    {
        HATCH, SEDAN, SUV, VAN;
    }
    private abstract static class CarFactory 
    {
        abstract Car createCar(Type type);
        
        void deliver(Car car, String place) 
        {
            System.out.println("Delivering " + car.showInfo() + " to " + place);
        } 
    }

    // Implementation.
    private static class Palio implements Car 
    {
        public String showInfo() { return "Palio. Hatch from Fiat"; }
    }
    
    private static class Siena implements Car 
    {
        public String showInfo() { return "Siena. Sedan from Fiat"; }
    }
    
    private static class Ducato implements Car 
    {
        public String showInfo() { return "Ducato. Van from Hyundai"; }
    }
    
    private static class HRV implements Car 
    {
        public String showInfo() { return "HRV. SUV from Hyundai"; }
    }
    
    private static class Fiat extends CarFactory 
    {
        Car createCar(Type type) 
        {
            switch (type) 
            {
                case HATCH:
                    return new Palio();
                case SEDAN:
                    return new Siena();
                default:
                    throw new IllegalArgumentException(); 
            }
        }
    }
    
    private static class Hyundai extends CarFactory 
    {
        Car createCar(Type type) 
        {
            switch (type) 
            {
                case SUV:
                    return new HRV();
                case VAN:
                    return new Ducato();
                default:
                    throw new IllegalArgumentException(); 
            }
        }
    }
    
    public static void main(String []args) 
    {
        Parameterized.CarFactory fiat = new Parameterized.Fiat();
        System.out.println("Fábrica da Fiat:");
        System.out.println("	Fiat factory creates " + fiat.createCar(Type.HATCH).showInfo());
        System.out.println("	Fiat factory creates " + fiat.createCar(Type.SEDAN).showInfo());
        
        Parameterized.CarFactory hyundai = new Parameterized.Hyundai();
        System.out.println("\nFábrica da Hyundai:");
        System.out.println("	Hyundai factory creates " + hyundai.createCar(Type.SUV).showInfo());
        System.out.println("	Hyundai factory creates " + hyundai.createCar(Type.VAN).showInfo());
    }
}