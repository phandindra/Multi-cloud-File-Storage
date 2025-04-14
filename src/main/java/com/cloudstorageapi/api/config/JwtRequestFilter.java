package com.cloudstorageapi.api.config;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

/*
The JwtRequestFilter extends the Spring Web Filter OncePerRequestFilter class. For any incoming request this Filter
class gets executed. It checks if the request has a valid JWT token. If it has a valid JWT Token then it sets the
 Authentication in the context, to specify that the current user is authenticated.
 */

@Component
public class JwtRequestFilter extends OncePerRequestFilter {
 

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws ServletException, IOException {
 
		// System.out.println(" Inside Filter Internal ----- > 14 ");
		chain.doFilter(request, response);
	}

}
