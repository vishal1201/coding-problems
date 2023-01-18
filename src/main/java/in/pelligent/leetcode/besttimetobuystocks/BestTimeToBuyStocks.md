# Best Time to Buy Stocks

## Intuition
Iterate over each `price` while updating the `minimum-so-far` in the `prices list`; as well as compare `current-gain` w.r.t minimum and `current-price`. If that exceeds the `max-gain` so far, update `max-gain`.

## Approach
1. Initialize min variable to `Integer.MAX_VALUE`
2. Initialize `maxProfit`, `currentGain` to `0`.
3. Iterate over the price list while updating `minimum` as and when applicable as well as computing and comparing the `currentGain` i.e. `= currentPrice - min`.
4. If this is greater than the `maxProfit`, then update `maxProfit`.
5. Ultimately return the `maxProfit` after the loop ends as this would have the maximum possible profit.

## Complexity
### Time complexity:
    O(n)

### Space complexity
    O(1)

## Code
```java
class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        int currentGain = 0;
        
        for(int price : prices) {
            if(price < min) {
                min = price;
            }

            currentGain = price - min;
            if(maxProfit < currentGain) {
                maxProfit = currentGain;
            }
        }
        
        return maxProfit;
    }
}
```