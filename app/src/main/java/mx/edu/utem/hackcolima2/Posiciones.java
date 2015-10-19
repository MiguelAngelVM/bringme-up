package mx.edu.utem.hackcolima2;

import android.graphics.Color;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class Posiciones {
	
	//Constante de Posición del marcador
	public static final LatLng SAGRADA_FAMILIA = new LatLng(41.40347, 2.17432); 
	
	//Constante de Opciones de Polilínea.
	public static final PolylineOptions POLILINEA = new PolylineOptions()
                               .add(new LatLng(41.40347, 2.17432))
                               .add(new LatLng(41.40691, 2.16864)) 
                               .add(new LatLng(41.40364, 2.16437));
	public static final PolygonOptions POLIGONO = new PolygonOptions()
    .add(new LatLng(41.40615, 2.17447),
         new LatLng(41.40778, 2.17662),
         new LatLng(41.40601, 2.17894),
         new LatLng(41.40445, 2.17673),
         new LatLng(41.40615, 2.17447))
         .strokeColor(Color.RED)
         .fillColor(Color.BLUE);
}
