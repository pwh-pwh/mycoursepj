package com.coderpwh.generator.test;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestUtil {
    static final String filePath = "generator/src/main/java/com/coderpwh/generator/test/";
    static final String outPath = "generator/src/main/java/com/coderpwh/generator/test/";

    public static void main(String[] args) throws IOException, TemplateException {
        Configuration configuration = new Configuration(Configuration.getVersion());
        configuration.setDirectoryForTemplateLoading(new File(filePath));
        configuration.setDefaultEncoding("utf-8");
        Template template = configuration.getTemplate("test.ftl");

        FileWriter fileWriter = new FileWriter(outPath+"Test.java");
        template.process(null,fileWriter);
        fileWriter.close();
    }
}
