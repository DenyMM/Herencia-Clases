//Declaracion de subclase abstracta
public abstract class Idiofonos extends Instrumento{
	public abstract class SonidoIdiofonos extends FamiliasdeInstrumentos{
		public void Explicacion() {
			System.out.println("Se golpea el cuerpo del instrumento para producir sonido");
		}
	}
	//Declaracion de Superclases y parametros abstractos
public void Idiofonos(){
super.Altura_Definida(Definido());
super.Altura_Indefinida(Indefinido());
}
}
