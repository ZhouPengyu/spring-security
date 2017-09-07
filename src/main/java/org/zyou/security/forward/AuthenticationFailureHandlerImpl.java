package org.zyou.security.forward;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

public class AuthenticationFailureHandlerImpl implements AuthenticationFailureHandler {

	private String forwardUrl;
	
	public void setForwardUrl(String forwardUrl) {
		this.forwardUrl = forwardUrl;
	}

	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException exception) throws IOException, ServletException {
//		request.getRequestDispatcher(forwardUrl).forward(request, response);
		response.sendRedirect(forwardUrl);
	}

}
