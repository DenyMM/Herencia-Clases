	//Declaracion de subclase final y subclase abstracta
public abstract class Aerofonos extends Instrumento{
	public abstract class SonidoAerofonos extends FamiliasdeInstrumentos{
		public void Explicacion() {
			System.out.println("Se necesita aire para producir su sonido");
		}
	}
	//Declaracion de Superclases
public void Aerofonos(){
	super.Soplo_Humano(Soplo());
	super.Soplo_Mecanico(Mecanico());
}
}
