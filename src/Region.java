enum Region {
    CHUY("\"Burana\" tower"),
    YSYK_KOL("\"Ysyk_Kol\" lake"),
    TALAS("\"Manas\" grave"),
    NARYN("\"Tash_Rabat\""),
    JALAL_ABAD("\"Arslanbab\" forest"),
    OSH("\"Sulayman too\" mountain"),
    BATKEN("\"Aigul\" flower");

    private String sight;
    Region (String sight){this.sight = sight;}
    public String getSight(){return sight;}
}
