package com.slim.dumpdb2es.mvc;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.env.Environment;
import org.springframework.core.io.FileSystemResource;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

/**
 * Created by hg on 2015/4/16.
 */
@RestController
public class DumpController implements ApplicationContextAware {
    private static final Logger logger = LoggerFactory.getLogger(DumpController.class);

    @RequestMapping(value = "/test", method = {RequestMethod.GET, RequestMethod.POST})
    public String Check(HttpServletRequest request, HttpServletResponse response) throws IOException {
        logger.debug("receive a test request");
        return "{\"result\":\"ok\"}";
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        Environment env = applicationContext.getEnvironment();
//        toMailAddress = env.getProperty("toMailAddress");
//        fromMailAddress = env.getProperty("fromMailAddress");
//        savePath = env.getProperty("savePath");
//        if (savePath == null || savePath.isEmpty()) {
//            savePath = getClass().getClassLoader().getResource("").getPath() + "updmp";
//            logger.info("dump files will be saved to: {}", savePath);
//        }
    }
}
