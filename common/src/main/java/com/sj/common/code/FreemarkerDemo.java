package com.sj.common.code;

import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FreemarkerDemo {
    private static final String TEMPLATE_PATH="src/main/java/com/sj/common/code/model";
    private static final String CLASS_PATH ="src/main/java/com/sj/common/code/hello";

    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        Writer out = null;
        try {
            configuration.setDirectoryForTemplateLoading(new File(TEMPLATE_PATH));
            Map<String,Object> data = new HashMap<>();
            data.put("classPath","com.sj.common.code.hello");
            data.put("className","User");
            data.put("id","id");
            data.put("userName","name");
            data.put("password","pwd");
            Template template = configuration.getTemplate("test.ftl");
            File doc = new File(CLASS_PATH+"\\"+"User.java");
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(doc)));
            template.process(data,out);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if(null != out){
                    out.flush();
                }
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
    }
}
