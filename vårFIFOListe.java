class FIFOListe<E> extends Liste<E>{
	private class Node{
		E element;
		Node neste;
	}
	Node firstNode = new Node();
	Node lastNode = new Node();
	
	int storrelse(){
		Node temp = firstNode;
		int counter = 0;
		while (temp != null){
			temp = temp.neste;
			if (temp != null){
				counter ++;
			}
		}
		return counter;
	}
	
	boolean erTom(){
		return (firstNode == null);
	}
	
	boolean inneholder(E e){
		if (erTom())throw new RuntimeException("THIS SHIT AINT WORKING");
		Node temp = firstNode;
		while (temp != null){
			temp = temp.neste;
			if (temp.element == e){
				return true;
			}
		}
		return false;
	}
	
	void leggTil(E e){
		
	}
	boolean fjern(E e){
	
	}
	void toem(){
		firstNode = null;
		lastNode = null;
	}
	
	E hent(int index){
		Node temp = firstNode;
		if (index>=storrelse()){
			return null;
		}
		for (int i = 0; i <= index; i++){
			temp = temp.neste;
			return temp.element;
		}
		return null;
	}
	E fjern(int index){
		if (index>=storrelse()){
			return null;
		}
		Node temp = firstNode;
		if (index == 0){
			firstNode = firstNode.neste;
			return temp;
		}
		for(int i = 0; i<index-1; i++){
			temp = temp.neste;
		}
		if (temp.neste.neste == null){
			returnable = temp.neste;
			temp.neste = null;
		}
		else if {
			
		}
		
		
		while(temp!=null){
		
		}
	}
	
	int indexTil(E e){
		if (erTom())throw new RuntimeException("THIS SHIT AINT WORKING");
		Node temp = firstNode;
		int counter = 0;
		while (temp != null){
			temp = temp.neste;
			if (temp.element == e){
				return return counter;
			}
			counter ++;
		}
		return -1;
	}
}


interface Liste<E>{
	int storrelse();
	boolean erTom();
	boolean inneholder(E e);
	void leggTil(E e);
	boolean fjern(E e);
	void toem();
	E hent(int index);
	E fjern(int index);
	int indexTil(E e);
}




