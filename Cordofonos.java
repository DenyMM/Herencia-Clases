//Declaracion de subclase final y subclase abstracta
public abstract class Cordofonos extends Instrumento{
	public abstract class SonidoCordofonos extends FamiliasdeInstrumentos{
		public void Explicacion() {
			System.out.println("Se basa en la manipulacion de las cuerdas para producir su sonido");
		}
	}
	//Declaracion de Superclases
public void Cordofonos(){
	super.Cuerda_Frotada(Frotar());
	super.Cuerda_Pulsada(Pulsar());
	super.Cuerda_Percutida(Percutir());
}
}
