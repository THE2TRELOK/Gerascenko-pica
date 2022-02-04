package pica;

import javax.swing.JOptionPane;

public class Pica {
int izmers;
String piedavas;
String dzeriens;
Double cena1;
String fri;
Pica(int cm,String nacinka,String dzeriens,Double cena1,String fri){
	this.izmers=cm;
	this.piedavas=nacinka;
	this.dzeriens=dzeriens;
	this.cena1=cena1;
	this.fri=fri;
}
void izvadit(){
	JOptionPane.showMessageDialog(null,"Jusu picas izmers- "+izmers+"\nJusu pica- "+piedavas+"\nDzeriens- "+dzeriens+"\nkartupeli fri: "+fri+"\nJusu pasutijuma summa "+cena1+"ˆ");
		
}
	}