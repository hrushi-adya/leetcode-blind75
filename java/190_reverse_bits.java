Class Solution {
    public int reverseBit(int n) {
        int result = 0;
        for(int i=0; i<32; i++) {
            int bit = (n >> i) & 1;
            result = result | (bit << (31-i));
        }
        return result;
    }
}
