package cloud;

import cloud.util.CloudUtil;

public class NetworkCard {
	public static final int MAX_SPEED_MB = 100;            
	public final String macAddress;            
	public final int unitNumber;  
	public final String label;
	public int speedMb = MAX_SPEED_MB;
	public String network;                                         

	/*
	 * NetworkCard[1]
	 * Reemplazar concatenación de strings 
	 * usando "+" por StringBuilder en 
	 * Constructores 
	 */
	NetworkCard(int unitNumber){
		this.unitNumber = unitNumber;
		// Escribe tu código {
		StringBuilder sb = new StringBuilder();
		sb.append("Network Card "); 
		sb.append(unitNumber);
		this.label = sb.toString();
		// }
		this.macAddress = CloudUtil.getMACAddress();
	}
	
	NetworkCard(String network, int unitNumber){
		this.network = network;
		this.unitNumber = unitNumber;
		// Escribe tu código {
		StringBuilder sb = new StringBuilder();
		sb.append("Network Card "); 
		sb.append(unitNumber);
		this.label = sb.toString();
		
		// }
		this.macAddress = CloudUtil.getMACAddress();
	}
	NetworkCard(String network, int unitNumber, int speedMb){
		this.network = network;
		this.unitNumber = unitNumber;
		this.speedMb = speedMb;
		// Escribe tu código {
		StringBuilder sb = new StringBuilder();
		sb.append("Network Card ");
		sb.append(unitNumber);
		this.label = sb.toString();
		
		// }
		this.macAddress = CloudUtil.getMACAddress();
	}
	
	/*
	 * NetworkCard[2]
	 * obrecargar el método java.lang.Object.toString() para
	 * mostrar la representación en String de NetworkCard
	 * como lo hacía CloudUtil.printNICInfo()
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		// Escribe tu código {
		sb.append("Etiqueta: ");
		sb.append(this.label);
		sb.append("\nUnidad    : ");
		sb.append(this.unitNumber);
		sb.append("\nMAC       : ");
		sb.append(this.macAddress);
		sb.append("\nNetwork   : ");
		sb.append(this.network);
		sb.append("\nVelocidad : ");
		sb.append(this.speedMb);
		sb.append("Mbps\n");
		// }
		return sb.toString();
	}
}
