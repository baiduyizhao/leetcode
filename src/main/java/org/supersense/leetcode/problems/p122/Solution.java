package org.supersense.leetcode.problems.p122;

public class Solution {
    public int maxProfit(int[] prices) {
    	if(prices == null || prices.length == 0){
    		return 0;
    	}
        int[] maxprof = new int[prices.length];
        int max = 0;
        maxprof[0] = 0;
        for(int i = 1; i < prices.length; i++){
        	int diff = prices[i] - prices[i-1];
        	if(diff > 0){
        		maxprof[i] = maxprof[i-1] + diff;
        		max += diff;
        	}else{
        		maxprof[i] = 0;
        	}
        }
        return max;
    }
}
