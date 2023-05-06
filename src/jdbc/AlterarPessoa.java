package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarPessoa {

	public static void main(String[] args) throws SQLException {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o codigo da pessoa: ");
		int buscar = entrada.nextInt();

		String selectSQL = " SELECT codigo, nome FROM pessoas WHERE codigo = ?";
		String updateSQL = "UPDATE pessoas SET nome = ? WHERE  codigo = ?";

		Connection conexao = FabricaConexao.getConnection();
		PreparedStatement stmt = conexao.prepareStatement(selectSQL);
		stmt.setInt(1, buscar);
		ResultSet resultado = stmt.executeQuery();

		if (resultado.next()) {
			Pessoa p = new Pessoa(resultado.getInt(1), resultado.getString(2));

			System.out.println(("a pessoa é : " + p.getNome()));
			entrada.nextLine();

			System.out.println("informe o novo nome: ");
			String novoNome = entrada.nextLine();

			stmt.close();
			stmt = conexao.prepareStatement(updateSQL);
			stmt.setString(1, novoNome);
			stmt.setInt(2, buscar);
			stmt.execute();

			System.out.println("Nome alterado com sucesso! ");

		} else {
			System.out.println("codigo não encontrado.");
		}

		conexao.close();
		entrada.close();
	}

}
