public class FIFOListe<E> implements Liste<E>{
    
    private Node forste;
    private Node siste;
    
    private class Node{
    	Node neste;
    	E element;

    	Node(E element){
    		this.element = element;
    	}
    }

    public int storrelse(){
    	int teller = 0;

    	for(Node temp = forste; temp != null; temp = temp.neste){
    		teller++;
    	}
    	return teller;

    }

    public boolean erTom(){
    	if(forste == null){
    		return true;
    	} return false;
    }
    
    public boolean inneholder(Object o){
    	if(forste == null){
    		return false;
    	}

    	for(Node temp = forste; temp != null; temp = temp.neste){
    		if(temp.element == o){
    			return true;
    		}
    	}
    	return false;
    }

    public void leggTil(E e){

    	//Oppretter ny node for det nye elementet.
    	Node nyNode = new Node(e);

    	//Sjekker om listen er tom.
    	if(forste == null){
    		forste = nyNode;
    		siste = nyNode;
    	} else if (forste == siste){
    		//Ett element i listen.
    		forste.neste = nyNode;
    		siste = nyNode;
    	} else {
    		siste.neste = nyNode;
    		siste = nyNode;
    	}

    }
    
    public boolean fjern(Object o){
    	int index = indeksTil(o);
    	if(index == -1){
    		return false;
    	}

    	fjern(index);
    	return true;
    }

    public void toem(){
    	forste = null;
    	siste = null;
    }

    public E hent(int index){
    	if(index < 0){
    		return null;
    	}

    	Node temp = forste;
    	for(int i = 0; i < index; i++){
    		if(temp == null){
    			return null;
    		} else if(i == index){
    			//Funnet plassen paa indeksen
    			return temp.element;
    		}
    		temp = temp.neste;
    	}
    	return null;
    }
    
    public E fjern(int index){
    	if(index < 0){
    		return null;
    	}
    	
    	Node forrige = forste;
    	Node temp = forste;

    	if(index == 0 && forste != null){
    		forste = forste.neste;
    		return temp.element;
    	}

    	for(int i = 0; i <= index; i++){
    		if(temp == null){
    			return null;
    		} else if(i == index){
    			//Funnet plassen paa indeksen
    			forrige.neste = temp.neste;
    			return temp.element;
    		}
    		forrige = temp;
    		temp = temp.neste;
    	}
    	return null;
    }

    public int indeksTil(Object o){
    	int teller = 0;
    	for(Node temp = forste; temp != null; temp = temp.neste){
    		if(o == temp.element){
    			return teller;
    		} teller++;
    	}
    	//Fant ikke elementet.
    	return -1;
    }
}