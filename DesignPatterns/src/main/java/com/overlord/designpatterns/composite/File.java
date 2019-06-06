package com.overlord.designpatterns.composite;

/**
 * 文件 叶子构件
 */
public class File implements Component {
    private String name;

    protected File(String name){
        this.name = name;
    }

    @Override
    public void add(Component c) {
        System.out.println("文件不支持添加操作");
    }

    @Override
    public void delete(Component c) {
        System.out.println("文件不支持删除操作");
    }

    @Override
    public Component getChild(int i) {
        System.out.println("文件不支持获取子节点操作");
        return null;
    }

    @Override
    public void operate() {
        System.out.println("打开文件-->" + this.name);
    }
}
