package jdbc;

public class DAOTeste {
	public static void main(String[] args) {
		DAO dao = new DAO();

		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		System.out.println(dao.incluir(sql, "Chelle"));
		System.out.println(dao.incluir(sql, "Kahlil"));
		System.out.println(dao.incluir(sql, "Yan"));
		
		dao.close(); 
		
		
		
		
	}
}
