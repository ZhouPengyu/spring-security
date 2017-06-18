package org.zyou.security.user.service.impl;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserServiceImpl implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserDetails details = null;
		if(details == null) throw new UsernameNotFoundException(username+"not found");
		String name = "zhoupengyu";
		String password = "c5d4263f0a868a9411ae561214c02ebf";
		boolean enabled = true;	//账号是否激活
		boolean accountNonExpired = true; 	//没有过期
		boolean credentialsNonExpired = true;	//证书没有过期
		boolean accountNonLocked = true;	//帐户没有锁定
		details = new User(name, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, AuthorityUtils.createAuthorityList("ROLE_USER"));
		return details;
	}

}
