package com.pintusov.ee.app.servlet;


import com.pintusov.ee.app.dao.ModelEJB;
import com.pintusov.ee.app.exception.MessageException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Project name: TestEEApp
 * Created by Дмитрий
 * Date: 16.07.2017.
 */
@WebServlet (name = "WriteServlet", urlPatterns = {"/WriteServlet"})
public class WriteServlet extends HttpServlet {

	@EJB
	private ModelEJB modelEJB;
	private static String PUT_MESSAGE = "put_message";

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		String message = req.getParameter(PUT_MESSAGE);
		if ("".equals(message)) {
			modelEJB.deleteMessage();
		} else {
			try {
				modelEJB.putUserMessage(message);
			} catch (MessageException me) {
				throw new ServletException(me);
			}
		}
		resp.sendRedirect("./DisplayServlet");
	}
}
