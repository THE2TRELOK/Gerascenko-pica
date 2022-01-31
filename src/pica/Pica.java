package pica;

import javax.swing.JOptionPane;

public class Pica {
int izmers;
String piedavas;
String dzeriens;
Double cena1;
Pica(int cm,String nacinka,String dzeriens,Double cena1){
	this.izmers=cm;
	this.piedavas=nacinka;
	this.dzeriens=dzeriens;
	this.cena1=cena1;
}
void izvadit(){
	JOptionPane.showMessageDialog(null,"Jusu picas izmers- "+izmers+"\nJusu pica- "+piedavas+"\nDzeriens- "+dzeriens+"\nJusu pasutijuma summa "+cena1+"ˆ");
		
}
	}