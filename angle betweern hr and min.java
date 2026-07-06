class Solution {
    public double getAngle(String s) {
        // code here
        String[] parts= s.split(":");
		int hr = Integer.parseInt(parts[0]);
		int min = Integer.parseInt(parts[1]);
		int time= (hr*60)+min;
		double minhd=(time*6)%360;
		double hrhd=(time/2.000)%360;
		double angle=Math.abs(hrhd-minhd);
		return Math.min(angle,360-angle);
    }
}