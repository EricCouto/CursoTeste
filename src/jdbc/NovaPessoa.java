package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
	public static void main(String[] args) throws SQLException {

		Scanner entrada = new Scanner(System.in);

		System.out.println("informe o nome: ");
		String nome = entrada.next();

		Connection conexao = FabricaConexao.getConnection();

		/*
		 * fazendo a passagem do dado como variavel para evitar o sql ataque que
		 * consiste em passar um codigo sql como variavel podendo prejudicar o banco
		 */

		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		// String sql = "INSERT INTO pessoas (nome, codigo) VALUES (?, ?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, nome);
		// stmt.setInt(2, 1);
		stmt.execute();

		System.out.println("pessoa incluida com sucesso");
		entrada.close();
	}
}
