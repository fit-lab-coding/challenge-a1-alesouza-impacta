package fit.challenge;

public class ImcCalculator {

    static String calculate(int peso, double altura){
       double resultado = peso/(altura*altura);
       if (resultado > 25.0 || resultado <= 29.9)
        return "Sobrepeso";
       return null;
    }

    static String calculate(double peso, double altura){
        double resultado = peso/(altura*altura);
        if (resultado < 18.5)
            return "Magreza";
        else if (resultado < 24.9) 
            return "Normal";
        else if (resultado < 30.0) 
            return "Sobrepeso";
        else 
            return "Obesidade";            
    }
    
}
