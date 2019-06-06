package com.overlord.designpatterns.composite;

/**
 * 组合模式入口
 */
public class CompositePatternMain {
    public static void main(String[] args){
        Component fileManager = new Folder("文件管理");
        Component folder1 = new Folder("文件夹1");
        Component file1 = new File("文件1");
        Component file2 = new File("文件2");
        fileManager.add(folder1);
        fileManager.add(file1);
        fileManager.add(file2);

        Component childFolder1 = new Folder("子文件夹1");
        Component childFolder2 = new Folder("子文件夹2");
        Component childFile1 = new File("文件夹1中文件1");
        folder1.add(childFolder1);
        folder1.add(childFolder2);
        folder1.add(childFile1);

        fileManager.operate();
    }
}
