class Driver extends Account {
    Integer licencia;

    public Driver(String name, String document, Integer licencia) {
        super(name, document);
        this.licencia = licencia;
    }

}