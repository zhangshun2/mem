package com.baizhi.mem;

import com.baizhi.mem.dao.UserMapper;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    public void contextLoads() {
        System.out.println(userMapper.selectByPrimaryKey(1));
    }

    @Test
    public void testFreemarker() throws Exception {
        //初始化配置
        Configuration configuration = new Configuration(Configuration.VERSION_2_3_23);
        //设置模板目录
        configuration.setDirectoryForTemplateLoading(new File("D:/WebStudy/mem/src/test/java/com/baizhi/mem"));
        //设置默认的编码格式
        configuration.setDefaultEncoding("utf-8");
        //设置对应额执行的ftl
        Template template = configuration.getTemplate("index2.ftl");
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", "张顺");
        template.process(map, new FileWriter("D:/index2.html"));

    }

}
