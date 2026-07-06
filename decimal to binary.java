class Solution {
    static String decToBinary(int n) {
        StringBuilder binary = new StringBuilder();
        int dig=0;
        while(n>0){
            dig=n%2;
            binary.append(dig);
            n=n/2;        
        }
        binary.reverse();
        return binary.toString();
    }
}
