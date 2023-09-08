package gerenciacontabancaria;
/**
 *
 * @author geovanelfr
 */
public class ContaBancaria {
    //ATRIBUTOS
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //METODOS PERSONALIZADOS
    public void estadoAtual() {
        System.out.println("============================================");
        System.out.println("Conta:" + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        
        switch (t){
            case "cc": this.setSaldo(50.0f);
                break;
            
            case "cp": this.setSaldo(150.0f);
                break;
            
            default:
                break;
        }
        
            System.out.println("CONTA CRIADA COM SUCESSO!");
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("Ainda existe saldo na conta");
            System.out.println("Nao e possivel finalizar a conta");
        } else if (this.getSaldo() < 0){
            System.out.println("Saldo na conta e negativo");
            System.out.println("Nao e possivel finalizar a conta");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    
    public void depositar(float deposito){
        if (this.isStatus()) {
            this.setSaldo(this.getSaldo() + deposito);
            System.out.println("Deposito realizado com sucesso na conta de "+ this.getDono() + ", saldo: R$" + this.getSaldo());
        }else{
            System.out.println("Impossivel depositar em uma conta fechada");
        }
        
    }
    
    public void sacar(float saque){
        if (this.isStatus() && this.getSaldo() >= saque) {
            this.setSaldo(this.getSaldo() - saque);
            System.out.println("Saque de R$"+ saque +" realizado com sucesso!" );
        }else{
            System.out.println("***Nao e possivel realizar o saque");
        }
    }
    
    public void pagarMensal() {
        if (this.isStatus()){
            switch (this.getTipo()){
                case "cc":
                    if (this.getSaldo() < 12) {
                        System.out.println("Voce nao tem saldo o suficiente, faca um deposito");
                        System.out.println("Seu salfo atual e de: R$" + this.getSaldo());
                    }else{
                        this.setSaldo(this.getSaldo() - 12.0f);
                        System.out.println("O pagamento de R$ 12,00 foi feito com sucesso\n");
                        System.out.println("Seu salfo atual e de: R$" + this.getSaldo());
                    }
                case "cp":
                    if (this.getSaldo() < 20) {
                        System.out.println("Voce nao tem saldo o suficiente, faca um deposito");
                        System.out.println("Seu salfo atual e de: R$" + this.getSaldo());
                    }else{
                        this.setSaldo(this.getSaldo() - 20.0f);
                        System.out.println("O pagamento de R$ 20,00 foi feito com sucersso");
                        System.out.println("Seu salfo atual e de: R$" + this.getSaldo());
                    }
            }
        }
    }
    
    //METODOS ESPECIAIS 

    public ContaBancaria() {
        this.saldo = 0;
        this.status = false;
    }

    public ContaBancaria(int numConta, String tipo, String dono, float saldo, boolean status) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        this.status = status;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
