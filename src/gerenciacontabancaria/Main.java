
package gerenciacontabancaria;

/**
 *
 * @author 023145
 */
public class Main {
    public static void main(String[] args) {
        
        ContaBancaria p1 = new ContaBancaria();
        p1.setNumConta(1111);
        p1.setDono("joao");
        p1.abrirConta("cc");        
        
        
        ContaBancaria p2 = new ContaBancaria();
        p2.setNumConta(2222);
        p2.setDono("Creuza");
        p2.abrirConta("cp");
        
        p1.depositar(100);
        p2.depositar(500);
        
        p2.sacar(500);
        p1.sacar(150);
        
        p1.fecharConta();
        
        p1.estadoAtual();
        p2.estadoAtual();
        
        
    }
    
}
