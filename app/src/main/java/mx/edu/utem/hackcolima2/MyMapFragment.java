package mx.edu.utem.hackcolima2;

import mx.edu.utem.hackcolima.listeners.ClickListener;
import mx.edu.utem.hackcolima.listeners.ClickLongListener;
import mx.edu.utem.hackcolima.listeners.MyLocationChangeListener;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;

import android.app.Fragment;
import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyMapFragment extends Fragment {
	
	private GoogleMap mMap;
	private String MAP_FRAG_TAG= "mapFragment";
	
	public MyMapFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_map, container, false);

		getMyMap();
        return rootView;

    }
    
    private void setUpMapIfNeeded() {
	   if (this.mMap == null) {

		   this.mMap = ((MapFragment) getFragmentManager().findFragmentByTag(MAP_FRAG_TAG)).getMap();
	      if (this.mMap != null) {

	    	  this.mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
	        	

	    	  this.mMap.setMyLocationEnabled(true);
	    	      	     	  

	    	  this.mMap.setOnMyLocationChangeListener(new MyLocationChangeListener(mMap));
	    	  

	          addClickListener();
	       addClickLongListener();
	      }
	   }
	}

    public GoogleMap getMyMap() {
    	setUpMapIfNeeded();
    	return this.mMap;
    }
    
    public void setMarker(LatLng position, String titulo, String info) {

    	mMap.addMarker(new MarkerOptions()
	       .position(position)
	       .title(titulo)
	       .snippet(info)
	       .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
    }
    
    public void drawPolilyne(PolylineOptions options){
        mMap.addPolyline(options);	
    }
    
    public void drawPoligono(PolygonOptions opts){
    	mMap.addPolygon(opts);	
    }
    
    public void addClickListener(){
    	mMap.setOnMapClickListener(new ClickListener());
    }

    public void addClickLongListener(){
    	mMap.setOnMapLongClickListener(new ClickLongListener(mMap));
    }
}
