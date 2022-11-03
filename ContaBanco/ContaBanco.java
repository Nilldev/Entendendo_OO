
public class ContaBanco {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    public void estadoAtual(){
        System.out.println("***********************************************");
        System.out.println("Conta: "+this.getNumConta());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Titular: "+this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.getStatus());
        System.out.println("***********************************************");

    }

    public  void abrirConta (String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if( t== "CP"){
            this.setSaldo (150);
        }
        System.out.println("Parabéns!!\n Sua conta foi aberta com sucesso!");
        
    }
    
    public void fecharConta (){
        if (this.getSaldo() > 0){
            System.out.println("A sua conta não pode ser encerrada pois ainda constam valores ou débitos");
        } else if (this.getSaldo()< 0){
            System.out.println("A sua conta não pode ser encerrada pois ainda constam valores ou débitos");
        }
          else{
            this.setStatus(false);
            System.out.println("A sua conta foi encerrada com sucesso!");
          }
    }

    
    public void depositar (float v) {
        if (this.getStatus()){
            this.setSaldo(this.getSaldo()+v);
            System.out.println("Depósito realizado com sucesso na conta de "+ this.getDono());
        }else{
            System.out.println("Conta inexist");
        }
        
        
    }
    public void sacar (float v) {
        if (this.getStatus()){
            if (this.getSaldo()>= v){
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Saque realizado na conta de "+ this.getDono());
            }else {
                System.out.println("Saldo insuficiente.");
            }
       
        }else{ 
            System.out.println("Conta inativa");
         }
        
    }
    public void pagarMensal() {
        int v=0;
        if (this.getTipo() == "CC") {
            v=12;
        } else if(this.getTipo()=="CP"){
            v=20;
        }
        if ( this.getStatus()){
            this.setSaldo(this.getSaldo()-v);
            System.out.println("Mensalidade paga com sucesso.");
        }
        
    }
   
    public void ContaBanco(){
        this.saldo = 0;
        this.status = false;

    }

    public int getNumConta() {
        return numConta;
    }
    public void setNumConta( int numConta){
        this.numConta = numConta;
    }
    public String getTipo(){
        return tipo;
    }
    public void setTipo( String tipo){
        this.tipo = tipo;
    }
    public String getDono(){
        return dono;
    }
    public void setDono(String dono){
        this.dono = dono;
    }
    public float getSaldo(){
        return saldo;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    public boolean getStatus(){
        return status;
    }
    public void setStatus( boolean status){
        this.status = status;
    }
    

    
}