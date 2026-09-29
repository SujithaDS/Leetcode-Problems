class Solution {
    public double[] convertTemperature(double celsius) {
       // List<Integer> list = new ArrayList<>();
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;
        return new double[]{kelvin,fahrenheit};
    
    }
}