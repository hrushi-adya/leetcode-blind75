Class Solution {
    public int[] countingBits(int n) {
        int[] arr = new int[n+1];
        int offset = 1;

        for(int i=0; i<=n; i++) {
            if(i == offset*2) {
                offset = i;
            }
            arr[i] = 1+arr[i-offset];
        }

        return arr;
    }
}
