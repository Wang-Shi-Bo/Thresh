package codeBlock;

import java.util.HashMap;
import java.util.Map;

public class loginDome {
    // 静态哈希表，模拟存放用户名和密码
    private static Map<String, String> credentials;

    static { // 静态代码块：类加载时初始化用户信息
        System.out.println("静态块：初始化用户凭证");
        credentials = new HashMap<>();
        credentials.put("alice", "pass123");
        credentials.put("bob", "qwerty");
    }

    { // 实例代码块：每次创建对象时输出提示
        System.out.println("实例块：LoginSystem 对象正在初始化...");
    }

    // 登录验证方法，使用同步块保护对共享凭证表的访问
    public static boolean login(String user, String pass) {
        synchronized (credentials) { // 锁定 credentials 对象
            String pwd = credentials.get(user);
            return pwd != null && pwd.equals(pass);
        }
    }

    public static void main(String[] args) {
        System.out.println("创建登录系统实例：");
        loginDome ls = new loginDome();

        System.out.println("主程序中开始测试登录功能...");
        // 普通局部代码块，用于临时计算
        {
            String testUser = "alice";
            String testPass = "pass123";
            System.out.println("局部块测试：尝试登录用户名=" + testUser);
        }

        if (login("alice", "pass123")) {
            System.out.println("登录成功！");
        } else {
            System.out.println("登录失败！");
        }
    }
}
