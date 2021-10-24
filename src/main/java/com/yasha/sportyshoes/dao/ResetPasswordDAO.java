package com.yasha.sportyshoes.dao;

import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.yasha.sportyshoes.entity.Product;
import com.yasha.sportyshoes.entity.ResetPassword;
import com.yasha.sportyshoes.form.ProductForm;
import com.yasha.sportyshoes.form.ResetPasswordForm;

@Transactional
@Repository
public class ResetPasswordDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = Exception.class)
	public void changePassword(ResetPasswordForm resetPasswordForm, UserDetails user) {

		Session session = this.sessionFactory.getCurrentSession();
		ResetPassword resetPassword = null;

		if (resetPassword == null) {

			resetPassword = new ResetPassword();
			resetPassword.setEncrytedPassword(resetPasswordForm.confirmPass);
		}
		
		System.out.println("myyyyyuser "+ user);
		System.out.println("myyyyresetPasswordForm "+ resetPasswordForm);

		if (resetPasswordForm != null && user != null) {
			String sql = "UPDATE ACCOUNTS SET ENCRYTED_PASSWORD=" + resetPasswordForm.confirmPass + " WHERE USER_NAME="
					+ user.getUsername();
			System.out.println("myyyyyyyyyysql "+ sql);
			Query<ResetPasswordForm> query = session.createQuery(sql, ResetPasswordForm.class);
			System.out.println("myyyyquery "+ query);
			query.setParameter("ENCRYTED_PASSWORD", resetPasswordForm.confirmPass);
		}

		session.persist(resetPassword);
		// If error in DB, Exceptions will be thrown out immediately
		session.flush();
	}
}
