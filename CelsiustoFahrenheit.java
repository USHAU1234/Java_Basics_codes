public class CelsiustoFahrenheit {

    int convertor(int celsius){
        int fahrenheit = (celsius* 9/5) + 32;
        return fahrenheit;
    }

    public static void main(String[] args){
        int celsius = 32;
        CelsiustoFahrenheit obj = new CelsiustoFahrenheit();
        System.out.println(obj.convertor(celsius));
    }

}
