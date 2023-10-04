import java.math.BigDecimal;
public class DadosBancarios {
        private int numeroDaConta;
        private String agencia;
        private String nomeDoCliente;
        private BigDecimal saldo;

        public DadosBancarios(int numeroDaConta, String agencia, String nomeDoCliente, BigDecimal saldo) {
            this.numeroDaConta = numeroDaConta;
            this.agencia = agencia;
            this.nomeDoCliente = nomeDoCliente;
            this.saldo = saldo;
        }

        public int getNumeroDaConta() {
            return numeroDaConta;
        }

        public String getAgencia() {
            return agencia;
        }

        public String getNomeDoCliente() {
            return nomeDoCliente;
        }

        public BigDecimal getSaldo() {
            return saldo;
        }
    }

