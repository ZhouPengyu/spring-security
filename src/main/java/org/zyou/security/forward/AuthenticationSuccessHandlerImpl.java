package org.zyou.security.forward;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

public class AuthenticationSuccessHandlerImpl implements AuthenticationSuccessHandler {

	private String forwardUrl;
	
	public void setForwardUrl(String forwardUrl) {
		this.forwardUrl = forwardUrl;
	}
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
		request.getRequestDispatcher(forwardUrl).forward(request, response);
	}

}
