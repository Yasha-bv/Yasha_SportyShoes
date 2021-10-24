package com.yasha.sportyshoes.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.yasha.sportyshoes.entity.Account;
import com.yasha.sportyshoes.entity.Order;
import com.yasha.sportyshoes.entity.Product;
import com.yasha.sportyshoes.entity.User;
import com.yasha.sportyshoes.model.OrderInfo;
import com.yasha.sportyshoes.model.UserInfo;
import com.yasha.sportyshoes.pagination.PaginationResult;

@Transactional
@Repository
public class AccountDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public Account findAccount(String userName) {
        Session session = this.sessionFactory.getCurrentSession();
        return session.find(Account.class, userName);
    }

 // @page = 1, 2, ...
 	public PaginationResult<UserInfo> listUserInfo(int page, int maxResult, int maxNavigationPage) {
 		
 		
 		String sql = "Select u from "
				+ User.class.getName() + " u ";

 		System.out.println("myyyyorderquery" + sql);

 		Session session = this.sessionFactory.getCurrentSession();
 		Query<UserInfo> query = session.createQuery(sql, UserInfo.class);
 		System.out.println("myyyuserrrquery" + query);
 		return new PaginationResult<UserInfo>(query, page, maxResult, maxNavigationPage);
 	} 	
}
