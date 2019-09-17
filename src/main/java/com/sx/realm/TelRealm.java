package com.sx.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.sx.pojo.User;
import com.sx.service.UserService;

public class TelRealm extends AuthorizingRealm {
    @Autowired
    UserService us;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principal) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
     // TODO Auto-generated method stub
        String telephone = (String) token.getPrincipal();
        User user = us.getByTel(telephone);
        if (user != null) {
            AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(user.getTelephone(), "ok", "xx");
            return authcInfo;
        } else {        
            return null;
        }
    }
}
