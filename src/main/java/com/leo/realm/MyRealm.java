package com.leo.realm;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import com.leo.dao.BloggerDao;
import com.leo.entity.Blogger;
import com.leo.service.BloggerService;

/**
 * �Զ���realm
 * @author liao
 *
 */
public class MyRealm extends AuthorizingRealm{
	
	@Resource
	private BloggerService bloggerService;
	/**
	 * Ϊ��ǰ�ĵ�½���û���ɫ��Ȩ��
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * ��֤��ǰ��½���û�
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		
		String userName=(String)token.getPrincipal();
		Blogger blogger=bloggerService.getByUserName(userName);
		if(blogger!=null){
			//����ǰ�û���Ϣ����session��
			SecurityUtils.getSubject().getSession().setAttribute("currentUser", blogger);
			AuthenticationInfo authenticationInfo=new SimpleAuthenticationInfo(
					blogger.getUserName(), blogger.getPassword(), "leo");
			return authenticationInfo;
		}else {
			return null;
		}

	}

}
