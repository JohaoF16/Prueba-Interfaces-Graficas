
package dominio;

public class Cuenta {
    private int codigo;
    private String nombres;
    private double saldoInicial;
    private static int aux = 1;

    public Cuenta(String nombres, double saldoInicial) {
        this.codigo = Cuenta.aux++;
        this.nombres = nombres;
        this.saldoInicial = saldoInicial;
    }

    public void setCodigo(int codigo) {
            this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }
    
    
    
    
}
