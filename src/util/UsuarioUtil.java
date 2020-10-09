package util;

import java.util.HashMap;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import entity.Usuario;

public class UsuarioUtil {
	
	
	
		public static boolean verificaUsuario(String usuario, String senha) {

			Session s = dao.HibernateUtil.getSessionFactory().openSession();
			s.beginTransaction();
			Usuario u = null;

			try {

				u = (Usuario) s.createCriteria(Usuario.class).add(Restrictions.eq("usuario", usuario))
						.add(Restrictions.eq("senha", senha)).uniqueResult();
				
				System.out.println("usuário digitado: "+ usuario);
				System.out.println("senha digitada: "+senha);
				
				

			} catch (Exception e) {

				e.getMessage();

			} finally {
				s.close();

			}

			if (u == null) {
				return false;
			} else {
				return true;
			}

		}// Fim do metodo verificaUsuario

	
		
}
