package TEST;

class Earth
static final double EARTH_RADIUS = 6400;p
static final double EARTH_SURFACE_AREA;
static {
	EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS *EARTH_RADIUS ;
	
}


public class EarthEx {
	public static void main(String args) {
		System.out.println("지구반지름"+Earth.EARTH_RADIUS);
		System.out.println(""+Earth.EARTH_SURFACE_AREA;);
		
	}
}
