package mx.edu.utem.hackcolima2.listeners;

import android.util.Log;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnMapLongClickListener;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class ClickLongListener implements OnMapLongClickListener {
	private GoogleMap mMap;
	public ClickLongListener(GoogleMap mMap) {
		this.mMap = mMap;
	}
	
	@Override
	public void onMapLongClick(LatLng latLong) {
		Log.v("ClickLongListener latitude: ", String.valueOf(latLong.latitude));
		Log.v("ClickLongListener longitude: ", String.valueOf(latLong.longitude));
		this.mMap.addMarker(new MarkerOptions().position(latLong)
                .title("Coordenadas:")
                .snippet("Latitud: " + String.valueOf(latLong.latitude) 
                + " Longitud: " + String.valueOf(latLong.longitude))
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
	}

}
