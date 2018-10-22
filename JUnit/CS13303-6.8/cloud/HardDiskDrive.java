package cloud;

public class HardDiskDrive {
	String id;						// Identificador único
	long capacityGB;				// Capacidad en GB
	int unitNumber;                 // Número de unidad
	String label;	                // Etiqueta
	
	/* 
	 * HardDiskDrive[1]
	 * Crear constructor y validar lo siguiente:
	 * - capacityGB debe ser mayor a 0 y múltiplo de 40
	 * HardDiskDrive[2]
	 * Reemplazar concatenación de strings 
	 * usando "+" por StringBuilder en Constructores 
	 */
	public HardDiskDrive(long capacityGB, int unitNumber){
		this.unitNumber = unitNumber;
		// Escribe tu código {
		if(capacityGB <= 1){
			System.err.println("Alerta: Disco debe ser mayor a 0");
		}
		if(capacityGB % 40 != 0){
			System.err.println("Alerta: Se recomienda utilizar multiplos de 40GB.");
		}
		this.capacityGB = capacityGB;
		// }
	}
	
	/*
	 * HardDiskDrive[3]
	 * Sobrecargar el método 
	 * java.lang.Object.toString() para mostrar la 
	 * representación en String de HardDiskDrive
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		// Escribe tu código {
		sb.append("Etiqueta : ");
		sb.append("Hard Disk ");
		sb.append(this.unitNumber);
		sb.append("\nUnidad   : ");
		sb.append(this.unitNumber);
		sb.append("\nCapacidad: ");
		sb.append(this.capacityGB);
		sb.append("GB\n");
		
		// }
		return sb.toString();
	}
}
