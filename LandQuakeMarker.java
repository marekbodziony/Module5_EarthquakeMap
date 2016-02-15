package module5;

import de.fhpotsdam.unfolding.data.PointFeature;
import processing.core.PGraphics;

/** Implements a visual marker for land earthquakes on an earthquake map
 * 
 * @author UC San Diego Intermediate Software Development MOOC team
 * @author Marek Bodziony
 *
 */
public class LandQuakeMarker extends EarthquakeMarker {
	
	public PointFeature quakeInfo;
	private CommonMarker lastSelected;
	
	
	public LandQuakeMarker(PointFeature quake) {
		
		// calling EarthquakeMarker constructor
		super(quake);
		
		// setting field in earthquake marker
		isOnLand = true;
		
		quakeInfo = quake;
	}


	/** Draw the earthquake as an ellipse */
	@Override
	public void drawEarthquake(PGraphics pg, float x, float y) {
		pg.ellipse(x, y, 2*radius, 2*radius);
		showTitle(pg,  x,  y);
		
	}
	

	// Get the country the earthquake is in
	public String getCountry() {
		return (String) getProperty("country");
	}

	public void showTitle(PGraphics pg, float x, float y){
		
		//String quakeCountry = quakeInfo.getProperty("country").toString();
		//String quakeCity = quakeInfo.getProperty("city").toString();
		
		//System.out.println(quakeInfo.getProperties());
		
		//if(1==1){
			//pg.fill(255);
			//pg.rect(x, y, 100, 20);
			//pg.fill(0);
			//pg.text(quakeInfo.getProperties().toString(), x, y);
		
		//}
	}
		
}
