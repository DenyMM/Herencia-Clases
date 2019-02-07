public abstract class Instrumento {
	//Declaracion de clase abstracta
public abstract class FamiliasdeInstrumentos{
	//Sobrecarga de metodos
	protected abstract void Soplo(String humano);
	protected abstract void Soplo(String mecanico, String humano);
	protected abstract void Cuerda(String frotada, String pulsada);
	protected abstract void Cuerda(String pulsada);
	protected abstract void Cuerda_Percutida(String percutida);
	protected abstract void Altura(String Definida);
	protected abstract void Altura(String Indefinida, String suspendido);
	protected abstract void Sonido(String puro, String electricidad);
	protected abstract void Sonido(String mecanoelectrico);}
//Declaracion de Superclases 
//Declaracion de Superclases de la Subclase Aerófonos en la clase Instrumentos
public void Soplo_Humano(String soplo) {
}
public void Soplo_Mecanico(String mecanico) {
}
//Declaracio de Superclases de la Subclase Cordófonos en la clase Instrumentos
public void Cuerda_Frotada(String frotada) {	
}
public void Cuerda_Pulsada(String pulsada) {	
}
public void Cuerda_Percutida(String percutida) {	
}
//Declaracio de Superclases de la Subclase Idiófonos y Membranófonos en la clase Instrumentos
public void Altura_Definida(String alturaDef) {	
}
public void Altura_Indefinida(String alturaInd) {
}
//Declaracio de Superclases de la Subclase Electrófonos en la clase Instrumentos
public void Sonido_Mecanoelectronicos(String Electro) {
}
public void Sonido_Puros(String Puro) {
}

// Declaracion de  metodos de accion
public String getSoplo() {
return "Soplo Humano";
} 
public String getFrotar() {
return "Frotar cuerda";
} 
public String getDefinido() {
return "Golpes";
} 
public String getMembrana() {
return "Golpes en membrana";
}
public String getElectronicos() {
return "Corriente electrica";
} 


//Declaracion de parametros abstractos
public abstract String Soplo();
public abstract String Mecanico();
public abstract String Frotar();
public abstract String Pulsar();
public abstract String Percutir();
public abstract String Definido(); 
public abstract String Indefinido();
public abstract String Puros();
public abstract String Mecanoelectronicos();
}

