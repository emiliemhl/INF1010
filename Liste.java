public interface Liste<E>{
    /**
     * Returnerer nummer of elementer i lista.
     *
     * @return nummer av elementer i lista.
     */
    int storrelse();

    /**
     * Returnerer true hvis lista ikke inneholder noen elementer.
     *
     * @return true hvis lista ikke inneholder noen elementer.
     */
    boolean erTom();

    /**
     * Returnerer true hvis lista ikke inneholder det spesifikke elementet.
     *
     * @param o element som vi skal sjekke finnes i lista.
     * @return true om lista inneholder det spesifikke elementet.     
     */
    boolean inneholder(Object o);


    // Modifikasjons operatorer

    /**
     * Legger til det spesifikke elementet i listen.
     *
     * @param e elementet som skal bli lagt til i listen.
     */
    void leggTil(E e);

    /**
     * Fjerner det spesifikke elementet fra listen, om det finnes. Hvis listen ikke 
     * inneholder elementet, vil den forbli uendret.
     *
     * @param o element som skal bli fjernet fra listen, om det finnes.
     * @return true om listen inneholdt det spesifikke elementet.
     */
    boolean fjern(Object o);

    /**
     * Fjerner alle elementet fra denne listen. 
     * Listen vil vaere tom naar dette kallet returnerer.
     */
    void toem();

    /**
     * Returnerer elementet paa den spesifikke posisjonen i denne lista.
     * Listen returnerer null dersom indeksen er mindre eller storre enn listen.
     *
     * @param index index av elementet som skal returneres.
     * @return elementet som er paa den spesifikke posisjonen i denne lista.
     */
    E hent(int index);


    /**
     * Fjerner elementet paa den spesifikke posisjonen til denne listen. 
     * Returnerer null om indeksen er mindre eller storre enn listen.
     *
     * @param index indeksen til det elementet som skal bli fjernet.
     * @return elementet som tidligere var paa den posisjonen.
     */
    E fjern(int index);


    /**
     * Returnerer indeksen av den forste forekomsten av det spesifikke elementet i listen,
     * eller -1 om listen ikke inneholder det elementet.
     *
     * @param o element for aa soke etter.
     * @return indeksen til den forste forekomsten av det spesifikke elementet i denne listen, 
     * eller -1 om listen ikke inneholder det elementet.
     */
    int indeksTil(Object o);
}
