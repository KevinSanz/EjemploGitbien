import acm.graphics.*;

public class Ejemplo1 extends acm.program.GraphicsProgram{
	public void run(){
		GLabel etiqueta=new GLabel("hola git!!");
		add(etiqueta);
		//cambio tamaño de la ventana
		setSize(800,600);
		//llamo al metodo que dibuja la piramide 
		pintarPiramide();
	}	
	public void pintarPiramide(){
		int numLadrillosBase = 14;
		int anchoLadrillo = 30;
		int altoLadrillo = 12;
		for (int j=0; j<numLadrillosBase;j++){

			//para que no ponga 14 ladrillos pones el numero de ladrillos
			//querido yo del martes te falta lo mas facil que es girar la piramide
			for (int i=0; i< numLadrillosBase-j; i++){
				GRect ladrillo =new GRect(anchoLadrillo,altoLadrillo);
				//como queremos hacer la fila entera haciendo la anchura
				//de el ladrillo lo multiplicas por i para que se vayan 
				//colocando poco a poco
				//como queremos poner otra fila hacmos lo mismo con la j
				add(ladrillo,anchoLadrillo*j/2 + anchoLadrillo*i,altoLadrillo*j);

				pause(20);
			}}


	}

}
