package com.echo.controller;

import org.restexpress.Request;
import org.restexpress.Response;

/**
 * Created by mathewl on 12/23/14.
 */
public class BodyEchoController {

    public String create(Request request, Response response) {
        response.setResponseCreated();
        byte[] b = new byte[request.getBody().capacity()];
        request.getBody().readBytes(b);
        return new String(b);
    }

    public String read(Request request, Response response) {
        byte[] b = new byte[request.getBody().capacity()];
        request.getBody().readBytes(b);
        return new String(b);
    }

    public String update(Request request, Response response) {
        byte[] b = new byte[request.getBody().capacity()];
        request.getBody().readBytes(b);
        return new String(b);
    }

    public String delete(Request request, Response response) {
        byte[] b = new byte[request.getBody().capacity()];
        request.getBody().readBytes(b);
        return new String(b);
    }

    public String readAll(Request request, Response response) {
        byte[] b = new byte[request.getBody().capacity()];
        request.getBody().readBytes(b);
        return new String(b);
    }

    public void throwException(Request request, Response response)
            throws Exception {
        throw new NullPointerException(this.getClass().getSimpleName());
    }
}
