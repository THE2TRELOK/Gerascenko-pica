package pica;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Picerija {
	static  Pica[] izveidotPicu( Pica[]masivs) {
		double cena1=0;
		int izmers=0;
		String piedavas,dzeriens;
			for(int i=0;i<masivs.length;i++) {
			    do {
			    	izmers = Integer.parseInt(JOptionPane.showInputDialog("Izvelies picas izmeru,20,30,40)"));
					if(izmers==20) {
						cena1=cena1+3.99;
					}
					else if (izmers==30) {
						cena1=cena1+5.99;
					}
					else if (izmers==40) {
						cena1=cena1+10.99;
					}
					}while(izmers!=20&izmers!=30&izmers!=40);
			    do {
				piedavas = JOptionPane.showInputDialog("Kadu picu velaties ir: (peperoni, studentu, havaju, amerikanu)");
				piedavas = piedavas.toLowerCase();
				if (piedavas.equals("peperoni")) {
					cena1=cena1+1.50;
				}
				if (piedavas.equals("studentu")) {
					cena1=cena1+1;
			}
				if (piedavas.equals("havaju")) {
					cena1=cena1+2;
				}
				if (piedavas.equals("Amerikanu")) {
					cena1=cena1+1.75;
				}
			    }while(!piedavas.equals("peperoni")&!piedavas.equals("studentu")&!piedavas.equals("havaju")&!piedavas.equals("amerikanu"));
			    do {
				dzeriens = JOptionPane.showInputDialog("Izvelejaties dzerienu: cola , fanta, sprite");
			    }while(!dzeriens.equals("cola")&!dzeriens.equals("fanta")&!dzeriens.equals("sprite"));
				masivs[i]= new Pica(izmers,piedavas,dzeriens,cena1);
			}
			return masivs;
	}

	public static void main(String[] args) {
		Pica[] picasMasivs=null;
		String izvele;
		JFrame fr = new JFrame();
			izvele = JOptionPane.showInputDialog("1-Uztaisit pasutijumu  | 2-Paskatities pasutijumu | stop");
			izvele = izvele.toLowerCase();
			switch(izvele) {
			}
		
	

	}

}
