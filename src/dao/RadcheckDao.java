package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import entity.Radcheck;



public class RadcheckDao {

	public void addRadcheck(Radcheck radcheck) {

		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();
		s.save(radcheck);
		s.getTransaction().commit();
		s.close();
	}

	@SuppressWarnings("unchecked")
	public List<Radcheck> listRadCheck() {

		List<Radcheck> list = new ArrayList<Radcheck>();
		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();
		list = s.createQuery("from Radcheck").list();
		s.getTransaction().commit();
		s.close();
		return list;
	}

	public void removeRadCheck(Integer id) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();
		Radcheck radcheck = (Radcheck) s.load(Radcheck.class, id);
		s.delete(radcheck);
		s.getTransaction().commit();
		s.close();
	}

	public void updateRadcheck(Radcheck radcheck) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();
		s.update(radcheck);
		s.getTransaction().commit();
		s.close();
	}

	public Radcheck getRadcheck(int id) {
		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();
		Radcheck radcheck = null;

		try {

			radcheck = (Radcheck) s.createCriteria(Radcheck.class).add(Restrictions.eq("id", id)).uniqueResult();

		} catch (Exception e) {

			e.getMessage();

		} finally {
			s.close();

		}

		if (radcheck == null) {
			System.out.println("Nao encontrou o acesso de idRadcheck = "+id+" Retornou null");
			return null;
		} else {

			System.out.println("Retornou o acesso");
			return radcheck;
		}

	}

	@SuppressWarnings("unchecked")
	public List<Radcheck> getRadcheck(String username) {

		List<Radcheck> list = new ArrayList<Radcheck>();
		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();

		try {

			list = s.createCriteria(Radcheck.class).add(Restrictions.like("username", username)).list();

		} catch (Exception e) {

			e.getMessage();

		} finally {
			s.close();

		}
		return list;

	}

	@SuppressWarnings("unchecked")
	public List<Radcheck> getRadcheck(String tipo, String situacao) {

		List<Radcheck> list = new ArrayList<Radcheck>();
		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();

		try {

			list = s.createCriteria(Radcheck.class).add(Restrictions.like("tipo", tipo)).add(Restrictions.like("situacao", situacao))
					.list();

		} catch (Exception e) {

			e.getMessage();

		} finally {
			s.close();

		}
		return list;

	}
	
	@SuppressWarnings("unchecked")
	public List<Radcheck> getOsCliente(String tipo) {

		List<Radcheck> list = new ArrayList<Radcheck>();
		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();

		try {

			list = s.createCriteria(Radcheck.class).add(Restrictions.like("tipo", tipo)).list();

		} catch (Exception e) {

			e.getMessage();

		} finally {
			s.close();

		}
		return list;

	}

}
