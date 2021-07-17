class User extends Account {
    Integer tarjeta;
    

      public User(String name, String document, Integer tarjeta) {
          super(name, document);
          this.tarjeta = tarjeta;

      }
    
}
