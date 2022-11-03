public class contas {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(194058);
        p1.setDono("Nill Souza");
        p1.estadoAtual();
        p1.abrirConta("CC");
    }
}
