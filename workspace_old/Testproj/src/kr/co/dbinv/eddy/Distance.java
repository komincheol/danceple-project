package kr.co.dbinv.eddy;

public class Distance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long lightspeed;
		long distance;

		lightspeed = 3000000;
		distance = lightspeed * 365L * 24 * 60 * 60;

		System.out.println("빛이 1년동안 가는 거리 : " + distance + "km.");
	}

}
