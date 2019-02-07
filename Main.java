import java.util.Scanner;
public class Main extends Excepcion{	
	// se agregan excepciones, se extiende a la clase excepcion
public static <Soplo_Humano> void main(String args[])throws Exception{
		Scanner entry = new Scanner (System.in);
		String Instrumentos = null;
		System.out.print("Flauta"+ "\n" + "Trompeta"+ "\n" +"Marimba");
		System.out.print("Ingrese instrumento: ");
		 Instrumentos = entry.next();
		if(Instrumentos.equals("Flauta"))
	    	System.out.println("Tiene un orificio donde pasa el aire");
		if(Instrumentos.equals("Trompeta"))
			System.out.println("Tiene un orificio donde pasa el aire");
		throw new Exception("No tiene orificio por lo tanto no es del tipo Aerofono");
}	
public static <Cuerda_frotada> void cuerdas(String args[])throws Exception{
	Scanner entry = new Scanner (System.in);
	String Instrumentos = null;
	System.out.print("Violin"+ "\n" + "Violoncello"+ "\n" +"Guitarra");
	System.out.print("Ingrese instrumento: ");
	 Instrumentos = entry.next();
	 try {
	if(Instrumentos.equals("Violin")  || Instrumentos.equals("Violoncello"))
    	System.out.println("Para producir su sonido se necesita frotar las cuerdas");}
	catch (Exception e){
		if(Instrumentos.equals("Guitarra"))
	throw new Exception("No tiene cuerdas por lo tanto no es del tipo Cordofono");	
}
}
public static <Altura_indefinida> void membranas(String args[])throws Exception{
	Scanner entry = new Scanner (System.in);
	String Instrumentos = null;
	System.out.print("Pandero"+ "\n" + "Bongos"+ "\n" +"Sintetizador");
	System.out.print("Ingrese instrumento: ");
	 Instrumentos = entry.next();
	 try {
	if(Instrumentos.equals("Pandero")  || Instrumentos.equals("Bongos"))
    	System.out.println("Para producir su sonido se golpea las membranas del instrumento");}
	catch (Exception e){
		if(Instrumentos.equals("Sintetizador"))
	throw new Exception("No pertenece a los instrumentos Membrafonos");	
}
}
}
