package com.example.demo1;

import java.util.List;

public class test001 {
    public static void main(String[] args) {
        String src = "con.sy";
        String tag = "hive_metastore_process \"Hive Metastore Process\" HIVE OK \"Metastore OK - Hive";
        String method = args.length == 3 ? args[2] : null;
        System.out.println("command is: ");
//        if (method != null && method.equals("string")) {
            cmdIsString(src, tag);
//        } else {
//            cmdIsListOrArray(src, tag);
//        }
    }

    /**
     * 执行命令，命令用拼接成一个字符串形式（会包含空格）
     * @param src 源路径
     * @param tag 目标路径
     */
    private static void cmdIsString(String src, String tag) {
        String cmd = "sh";
        String md = "-c";
        String cmd2 = "/var/ls/testMs.py hive_metastore_process \"Hive Metastore Process\" HIVE OK \"Metastore OK - Hive command took 0.006s\" 1624952296623 emr114.dtwave.com";
        int m = cmd2.indexOf('\u0000');

        System.out.println("command start");
        ProcessBuilder builder = new ProcessBuilder(cmd,md,cmd2);
        try {
            Process process = builder.start();
            process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.toString());
        }
    }

    /**
     * 执行命令，命令各个部分拼接成一个数组或者ArrayList集合
     * 该方法采用数组实现
     * @param src 源路径
     * @param tag 目标路径
     */
    private static void cmdIsListOrArray(String src, String tag) {
        String cmd = "cp";
        // 命令的各个部分组成一个字符串数组，用该数组创建ProcessBuilder对象
        String[] cmds = new String[] {cmd, "-rf", src, tag};
        System.out.println("command is: " + cmds[0] + cmds[1] + cmds[2] + cmds[3]);
        ProcessBuilder builder = new ProcessBuilder(cmds);
        try {
            Process process = builder.start();
            process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.toString());
        }
    }
}
