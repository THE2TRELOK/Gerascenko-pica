package pica;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Picerija {
	static  Pica[] izveidotPicu( Pica[]masivs) {
		double cena1=0;
		int izmers=0;
		String piedavas,dzeriens;
			for(int i=0;i<masivs.length;i++) {
			    
			    	izmers = Integer.parseInt(JOptionPane.showInputDialog("Izvelies picas izmeru,20,30,40)"));
					
				piedavas = JOptionPane.showInputDialog("Kadu picu velaties ir: (peperoni, studentu, havaju, amerikanu)");
				piedavas = piedavas.toLowerCase();
				
				dzeriens = JOptionPane.showInputDialog("Izvelejaties dzerienu: cola , fanta, sprite");
			    
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
