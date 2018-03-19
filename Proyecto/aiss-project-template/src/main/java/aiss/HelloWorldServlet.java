package aiss;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {
	
	private static final Logger log = Logger.getLogger(HelloWorldServlet.class.getName());
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		// Sample log
		log.log(Level.FINE, "Processing GET request");
		 
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<!doctype html>");
		out.print("<html>");
		out.println("<head><title>DESCRIPCION</title></head>");
		out.println("<body>");
		out.println("<h1>Descripción del Proyecto</h1>");
		out.println("<div>");
		out.println("Hoy en día cuando piensas en organizar un viaje con amigos o con la familia, buscas no solo lugares a los que ir sino también eventos que haya por la zona para acudir a ellos. Incluso sabiendo el periodo de tiempo que vas a estar en una ciudad te gustaría saber si hay algún evento para poder asistir y pasar un tiempo de ocio.\n" + 
				"Hoy en día si quieres saber información dependiendo de los eventos hay que buscarlos en diferentes web, y consultar varias paginas diferentes, con nuestra aplicación mashup vamos a simplificar ese problema para que puedas verlos todos los eventos de una zona sin tener que visitar varias web.\n" + 
				"Desde nuestro mashup podrás buscar eventos de una zona en un rango de fechas, después podrás ver la localización de dichos eventos su fecha incluso una descripción de los mismos, si el evento te puede interesar puedes guardarlo en tu calendario de Google para no perdértelo, al mismo tiempo podrás ver los comentarios de Facebook y twitter sobre el evento incluso si quieres dejar tu mismo uno podrás hacerlo si antes inicias sesión con tu cuenta, en el caso de que hiciera falta una entrada o un tikect para el evento , se proporciona un enlace para que puedas ir a la web del evento y comprar tu entrada, incluso si eres de fuera, desde la miasma aplicación buscar habitaciones de hoteles cerca para poder pasar allí la noche si lo prefieres, dándote enlace directo a una web de reserva de hoteles para que puedas realizar dicha reserva.\n" + 
				"");
		out.println("</p></body></html>");
		
	}
}
