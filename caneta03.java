public class caneta03 {
    public String caneta;
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public void status (){
         System.out.println("A caneta "+ this.caneta);
         System.out.println("O modelo "+ this.modelo);
         System.out.println("A cor  "+ this.cor);
         System.out.println("Ponta "+ this.ponta);
         System.out.println("Carga "+ this.carga);
         System.out.println("A caneta está tampada? "+ this.tampada);

    }
     public void rabiscar(){
        if (this.tampada == true){
            System.out.println("A caneta está tampada não posso rabiscar");

        }else {
            System.out.println("A caneta está destampada posso rabiscar");
        }
    
        }
        public void tampar (){
            this.tampada = true;    
        }

        public void destampar () {
            this.tampada = false;
        }


    
}
