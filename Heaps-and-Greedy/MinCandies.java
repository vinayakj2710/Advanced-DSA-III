
      
public int MinCandies(ArrayList<Integer> A) {
        int n = A.size();
        int[] candies = new int[n];
        Arrays.fill(candies, 1);

        // Left to right
        for (int i = 1; i < n; i++) {
            if (A.get(i) > A.get(i - 1)) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Right to left
        int total = candies[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (A.get(i) > A.get(i + 1)) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
            total += candies[i];
        }

        return total;

    }
