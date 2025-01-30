package com.example.equinox;

import org.eclipse.osgi.launch.EquinoxFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.launch.Framework;
import org.osgi.framework.launch.FrameworkFactory;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class OSGiRunner {
    public static void main(String[] args) throws Exception {
        // 创建 Equinox 框架工厂
        FrameworkFactory frameworkFactory = new EquinoxFactory();
        Map<String, String> config = new HashMap<>();
        // 设置缓存目录
        config.put("osgi.configuration.area", new File("configuration").getAbsolutePath());
        config.put("osgi.sharedConfiguration.area", new File("configuration").getAbsolutePath());
        config.put("osgi.instance.area", new File("instance").getAbsolutePath());
        // 创建并启动框架
        Framework framework = frameworkFactory.newFramework(config);
        framework.start();
        BundleContext context = framework.getBundleContext();

        // 安装并启动我们的插件
        Bundle bundle = context.installBundle("file:" + new File("target/FirstDemo-1.0.jar").getAbsolutePath());
        bundle.start();

        // 停止框架
        framework.stop();
        framework.waitForStop(0);
    }
}