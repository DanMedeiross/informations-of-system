package br.com.guanabara;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoDoSistema {

	public static void main(String[] args) {
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		System.out.println("A resolu��o do seu sistema �: ");
		System.out.println(d.width + "X" + d.height);
	}
}