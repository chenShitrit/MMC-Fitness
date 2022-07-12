package app.utils;

import app.constants.Constants;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class SessionUtils {

    public static String getUsername (HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        Object sessionAttribute = session != null ? session.getAttribute(Constants.USERNAME) : null;
        return sessionAttribute != null ? sessionAttribute.toString() : null;
    }

    public static String getXMLIndex (HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        Object sessionAttribute = session != null ? session.getAttribute(Constants.INDEX) : null;
        return sessionAttribute != null ? sessionAttribute.toString() : null;
    }

    public static void clearSession (HttpServletRequest request) {
        request.getSession().invalidate();
    }

    public static String getTableId(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        Object tableId = session.getAttribute(Constants.TABLEID);

        return tableId.toString();
    }

    public static void removeTableId(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        session.removeAttribute(Constants.TABLEID);
    }

}