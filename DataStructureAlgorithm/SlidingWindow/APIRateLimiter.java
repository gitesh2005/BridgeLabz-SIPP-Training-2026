package SlidingWindow;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class APIRateLimiter {

    // Function to find the longest subarray with at most N distinct API keys
    public static int longestSubarrayWithAtMostNDistinct(int[] keyIds, int n) {

        Map<Integer, Integer> freq = new HashMap<>();

        int start = 0;
        int maxLen = 0;

        for (int end = 0; end < keyIds.length; end++) {

            // Add current API key to the window
            freq.put(keyIds[end], freq.getOrDefault(keyIds[end], 0) + 1);

            // Shrink window if distinct keys exceed N
            while (freq.size() > n) {

                int leftKey = keyIds[start];
                freq.put(leftKey, freq.get(leftKey) - 1);

                if (freq.get(leftKey) == 0) {
                    freq.remove(leftKey);
                }

                start++;
            }

            // Update maximum window length
            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of API requests: ");
        int size = sc.nextInt();

        int[] keyIds = new int[size];

        System.out.println("Enter API key IDs:");
        for (int i = 0; i < size; i++) {
            keyIds[i] = sc.nextInt();
        }

        System.out.print("Enter maximum distinct API keys (N): ");
        int n = sc.nextInt();

        int result = longestSubarrayWithAtMostNDistinct(keyIds, n);

        System.out.println("Longest contiguous subarray length: " + result);

        sc.close();
    }
}