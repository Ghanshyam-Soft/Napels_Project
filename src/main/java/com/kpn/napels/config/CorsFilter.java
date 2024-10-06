
package com.kpn.napels.config;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jboss.logging.MDC;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component

@Order(Ordered.HIGHEST_PRECEDENCE)
public class CorsFilter implements Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("req::" + req.getRemoteAddr());

		String method = ((HttpServletRequest) req).getMethod();
		System.out.println("method::" + method);
		final HttpServletResponse response = (HttpServletResponse) res;
		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Methods", "POST, PUT, GET, OPTIONS, DELETE");
		response.setHeader("Access-Control-Allow-Headers", "Authorization, Content-Type");
		response.setHeader("Access-Control-Max-Age", "3600");
		if ("OPTIONS".equalsIgnoreCase(((HttpServletRequest) req).getMethod())) {
			System.out.println("inside getMethod()");
			response.setStatus(HttpServletResponse.SC_OK);
		} else {
			try {
				System.out.println("inside chain.doFilter()");
				String mdcData=String.format("requestId:%s", requestId());
				MDC.put("mdcData",mdcData);
				chain.doFilter(req, res);
			} finally {
				 MDC.clear();
			}
			
			
		}
	}

	@Override
	public void destroy() {
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		System.out.println("inside init Filter()");
	}
	private String requestId() {
		return UUID.randomUUID().toString();
	}
}
