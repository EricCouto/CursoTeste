package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
	public static void main(String[] args) throws SQLException {
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite o codigo que deseja excluir: ");
		int codigo = entrada.nextInt();

		Connection conexao = FabricaConexao.getConnection();
		String sql = " DELETE FROM pessoas WHERE  codigo = ?";

		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigo);

		if (stmt.executeUpdate() > 0) {
			System.out.println("pessoa excluida com sucesso");
		}else 
			System.out.println("Exclusão não realizada");
		

			conexao.close();
		entrada.close();
	}

}
