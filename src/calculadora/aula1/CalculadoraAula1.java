package calculadora.aula1;

public class CalculadoraAula1 {

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });

    }
}
