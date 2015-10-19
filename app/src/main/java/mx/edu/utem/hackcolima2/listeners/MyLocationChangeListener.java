package mx.edu.utem.hackcolima2.listeners;

import android.location.Location;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnMyLocationChangeListener;
import com.google.android.gms.maps.model.LatLng;

public class MyLocationChangeListener implements OnMyLocationChangeListener {
	public static int CAMERA_DEFAUL_ZOOM = 15;
	
	private GoogleMap mMap;
	private LatLng myPosition;
	
	public MyLocationChangeListener(GoogleMap mMap) {
		this.mMap = mMap;
	}
	
	private void centerMapOnMyLocation(Location location) {
        if (location != null) {
        	myPosition = new LatLng(location.getLatitude(),
                    location.getLongitude());
        }
        this.mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(myPosition, CAMERA_DEFAUL_ZOOM));
    }
	
	@Override
	public void onMyLocationChange(Location ivMyLocation) {
		centerMapOnMyLocation(ivMyLocation);
		
	}

}
