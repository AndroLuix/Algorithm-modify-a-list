package Array;
import java.util.Scanner;
public class Memo {

	public static void main(String[] args) {
		// TODO Esercizio 10(ARTICOLATO)
		
		/*
		 * Scrivere un programma modulare Memo che, 
		 * utilizzando un array,
		 * legge 10 stringhe 
		 * poi mette a disposizione u menu con le seugenti opzioni
		 * 
		 * [S] Stampa stringhe dalla posizione ... alla ...
		 * [M]Modifica stringa in posizione ...
		 * [T] Trova posizione della stringa ...
		 * [E] Esci
		 */
		
		String[] memo = {
				"Alfa","Beta","Cielo","Delta","Energia","Forza","Ghiaccio","Indipendente","otto","nove"
		};
		Scanner scanner = new Scanner(System.in);
		
		//se l'utente scelie S si leggerà dall'indice (scelto dall'utente) fino all'indice (scelto dall'utente)
		// se l'utente sceglie M, il programma legge una posizione numero
		//se l’utente sceglie T, il programma legga una stringa s e stampa la prima posizione dell’array che
		//la contiene, o un messaggio di errore se nessuna cella la contiene;
		//se l’utente sceglie E, il programma stampa il contenuto dell’array e termina
		
		System.out.println("Scegli l'operazione da svoglere\n"
				+ "[S] Stampa stringhe dalla posizione ... alla ... \n"
				+ "[M] Modifica stringa in posizione ...\n"
				+ "[T] Trova posizione della stringa ...\n"
				+ "[E] Esci");
		
		
		//dichiarazione delle variabili
		String input = "";					//dichiarazione variabile per input
		int indice_iniziale, indice_finale; //indice stampaggio array
		int err= 0;					//dichiarazione di cont err
		int indiceInput;
		
		//loop del programma:
		while(!input.equals(null)) {
			
			System.out.println("Scegli l'operazione:"); 
			
			 if(!input.equals(null)) {
				 input = scanner.next(); //Avviso di errore input
			 }
	
			 //operazione S (scegli indice a fino indice b)
			if(input.equalsIgnoreCase("S")) {
				System.out.println("Ricorda: L'array parte dall'indice 0 e l'ultimo indice e' "+memo.length); //avviso
													//invito a scegliere
				do { 
				System.out.println("Scegli la prima posizione"); 		
				indice_iniziale = scanner.nextInt(); 					//primo indice
				System.out.println("Scegli la seconda posizione");
				indice_finale = scanner.nextInt();	
			
				 if(indice_iniziale>indice_finale) {
					 System.out.println("L'indice iniziale deve avere un valore numerico minore del secondo indice");
				 }else if((indice_iniziale > (memo.length-1)) || indice_iniziale > (memo.length-1)){
					 System.out.println("Uno degli indici che hai scelto e' maggiore di "+memo.length);
				 }
				 
				 }while(!((indice_iniziale < indice_finale) && 
						 (indice_iniziale < (memo.length-1)) &&
						 indice_finale < (memo.length)));			//secondo indice
				
				
				for(int i =indice_iniziale; i < indice_finale; i++ ) {
					System.out.println(memo[i]);
				}
				
			//opreazione M: scegli di modificare una stringa	
			}else if(input.equalsIgnoreCase("M")) {
				
				do {
				//scelta dell'indice
				System.out.println("Scegli il valore numerico dell'indice");
				indiceInput = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Hai scelto l'indice: "+indiceInput);
				if(indiceInput > memo.length) {
					System.out.println("L'indice massimo e' "+(memo.length-1));
				}}while(indiceInput > memo.length);
				
				//modifica della stringa
				System.out.print("Modifica la stringa '" +memo[indiceInput] +"' :");
				String nuovaStringa = scanner.nextLine();
				
				
				//Ricerca indice e modifica della stringa
				memo[indiceInput] = nuovaStringa;
				System.out.println("Stringa Modificata con successo > " +memo[indiceInput]);
				//} while(indiceInput > memo.length);
				
				
				//TROVA POSIZIONE STRINGA 
			}else if(input.equalsIgnoreCase("T")) {
				System.out.println("Cerca l'elemento: ");
				scanner.nextLine();
				
				String cerca = scanner.nextLine();
				for(int i = 0; i < memo.length; i++) {
					
					if(memo[i].equalsIgnoreCase(cerca)) {
						System.out.println("l'elemento: "+memo[i]+ " si trova all'indice "+i);
						return;
					}
				}
				System.out.println("Nessun elemento trovato");
			}else if(input.equalsIgnoreCase("E")) {
				System.out.println("programma chiuso, array in video:");
				
				for(String indice:memo) {
					System.out.println(indice);
				}
				scanner.close();
				return;
				
			}else {
				System.out.println("Non hai scelto alcun valore");
			}
		}
		
		
	}

}
