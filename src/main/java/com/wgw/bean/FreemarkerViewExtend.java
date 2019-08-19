package com.wgw.bean;

import org.springframework.web.servlet.view.freemarker.FreeMarkerView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public class FreemarkerViewExtend extends FreeMarkerView {
    private static final String CONTEXT_PATH="/";
    private final static String STATIC_VERSION = "_1";

    @Override
    protected void exposeHelpers(Map<String, Object> model, HttpServletRequest request) throws Exception {
        super.exposeHelpers(model, request);
        model.put(CONTEXT_PATH,request.getContextPath());
        model.put(STATIC_VERSION,System.currentTimeMillis());
    }
}
