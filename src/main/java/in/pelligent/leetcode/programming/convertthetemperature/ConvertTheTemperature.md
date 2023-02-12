# Convert The Temperature
## Intuition
Return the calculations in a double array.

## Approach
1. Return a new double[] with 2 calculations - 1 for Celsius to Kelvin, 1 for Celsius to Fahrenheit

## Complexity
### Time complexity
    O(1)

### Space complexity
    O(1)

## Code
```java
class ConvertTheTemperature {
    public double[] solution1(double celsius) {
        return new double[]{
            celsius+273.15, 
            celsius*1.80+32.00
        };
    }
}
```