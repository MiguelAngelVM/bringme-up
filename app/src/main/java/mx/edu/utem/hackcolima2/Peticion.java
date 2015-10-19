package mx.edu.utem.hackcolima2;

import android.os.Handler;

import java.io.IOException;



public class Peticion extends Thread{
	private String urlBase;
	private String[][] params;
	private Handler manejador;

	public Peticion(String urlBase, String[][] params, Handler manejador) {
		super();
		this.urlBase = urlBase;
		this.params = params;
		this.manejador = manejador;
	}
	
	/*@Override
	public void run() {
		String respuesta = null;
		Message msg = manejador.obtainMessage();
		Bundle paquete = new Bundle();
		try {
			HttpClient cliente = new DefaultHttpClient();
			String laUrl = urlBase + params[0][0].replace(" ", "%20") + "?";
			for(int i = 1; i < params.length; i++) {
				laUrl += "&" + params[i][0].replace(" ", "%20") + "=" + params[i][1].replace(" ", "%20"); 
			}
			HttpGet peticion = new HttpGet(laUrl);
			ResponseHandler<String> responseHandler = new BasicResponseHandler();
			respuesta = cliente.execute(peticion, responseHandler);
			paquete.putString("respuesta", respuesta);
		} catch(ClientProtocolException e) {
			e.printStackTrace();
			paquete.putString("respuesta", e.getMessage());
		} catch(IOException e) {
			e.printStackTrace();
			paquete.putString("respuesta", e.getMessage());
		}
		msg.setData(paquete);
		manejador.sendMessage(msg);
	}*/
}
