package como.ericsospedra.Tema10.Ejercicio07;

public class PrincipalDivisa {
    public static void main(String[] args) {
        Divisa divisa=new Divisa();
        float euros=155.56f;
        System.out.printf("%2.2f"+" $\n",divisa.usd(euros));
        System.out.printf("%2.2f"+" £\n",divisa.gbp(euros));
        System.out.printf("%2.2f"+" ₹\n",divisa.inr(euros));
        System.out.printf("%2.2f"+" A$\n",divisa.aud(euros));
        System.out.printf("%2.2f"+" C$\n",divisa.cad(euros));
        System.out.printf("%2.2f"+" $\n",divisa.ars(euros));
        System.out.printf("%2.2f"+" Bs\n",divisa.bob(euros));
        System.out.printf("%2.2f"+" $\n",divisa.clp(euros));
        System.out.printf("%2.2f"+" $\n",divisa.vez(euros));
        System.out.printf("%2.2f"+" ₡\n",divisa.crc(euros));
        System.out.printf("%2.2f"+" $\n",divisa.cup(euros));
        System.out.printf("%2.2f"+" RD$\n",divisa.dop(euros));
        System.out.printf("%2.2f"+" $\n",divisa.mxn(euros));
    }
}
