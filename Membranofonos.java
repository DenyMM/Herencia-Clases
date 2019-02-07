//Declaracion de subclase abstracta 
public abstract class Membranofonos extends Instrumento{
	public abstract class SonidoMembrafonos extends FamiliasdeInstrumentos{
		public void Explicacion() {
			System.out.println("Depende de una membrana de diferentes materiales que al golpearla produce sonido");
		}
	}
	//Declaracion de Superclases con parametros abstractos
public void Membranofonos(){
super.Altura_Definida(Definido());
super.Altura_Indefinida(Indefinido());
}
}
