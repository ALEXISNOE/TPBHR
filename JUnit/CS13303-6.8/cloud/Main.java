package cloud;

import java.util.HashMap;

public class Main {
	// Método principal
	public static void main(String[] args) {

			// 1. Crear objeto vm1 basado en VirtualMachine
			// Escribe tu código {
			VirtualMachine vm1 = new VirtualMachine(1, 1024, "VM1", "Ubuntu");
			// }
			NetworkCard nic1 = new NetworkCard("122.22.22.22", 1);
			NetworkCard nic2 = new NetworkCard("133.33.33.33", 2, 1000);

			// 2. Crear un HashMap<Integer, NetworkCard> para agregar los 
			//    objetos nic1 y nic2 creados previamente
			// Escribe tu código {
			vm1.addNICs(new HashMap<Integer, NetworkCard>());
			// }
			
			HardDiskDrive hdd1 = new HardDiskDrive(100, 1);
			HardDiskDrive hdd2 = new HardDiskDrive(120, 2);
			
			// 3. Crear un HashMap<Integer, HardDiskDrive> para agregar los 
			//    objetos hdd1 y hdd1 creados previamente
			// Escribe tu código {
			vm1.addHDDs(new HashMap<Integer, HardDiskDrive>());
			
			// }		
			
			// 4. Asignar nics y hdds a VirtualMachine.nics y
			// VirtualMachine.hdds respectivamente
			// Escribe tu código {
			vm1.addNIC(nic1);
			vm1.addNIC(nic2);
			vm1.addHDD(hdd1);
			vm1.addHDD(hdd2);
			
			// }

			// 5. Imprimiendo variables de VM1
			System.out.println("Resumen: ");
			System.out.println(vm1.toString());

			// 6. Imprimiendo variables de VM1.nics
			System.out.println("Detallado NICs: ");
			// Escribe tu código {
			for(int i = 1; i <= vm1.nics.size(); i++){
				System.out.println(vm1.nics.get(i).toString());
			}
			// }
			
			// 7. Imprimiendo variables de VM1.hdds
			System.out.println("Detallado HDDs: ");
			// Escribe tu código {
			for(int i = 1; i <= vm1.hdds.size(); i++){
				System.out.println(vm1.hdds.get(i).toString());
			}
			// }
	}
	

}
