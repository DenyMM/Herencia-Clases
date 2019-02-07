//Declaracion de subclase abstracta
public abstract class Electrofonos extends Instrumento {
	public abstract class SonidoElectrofonos extends FamiliasdeInstrumentos{
public void Explicacion() {
	System.out.println("Se necesita electricidad para producir su sonido");
}
	}
	//Declaracion de Superclases y parametros abstractos
public void Electrofonos(){
super.Sonido_Puros(Puros());
super.Sonido_Mecanoelectronicos(Mecanoelectronicos());
}
}
