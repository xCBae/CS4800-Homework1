package Composition;

import java.util.ArrayList;
import java.util.List;

public class Folder {
    private String name;
    private List<File> files;
    private List<Folder> subFolders;

    public Folder(String name) {
        this.name = name;
        this.files = new ArrayList<>();
        this.subFolders = new ArrayList<>();
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void addSubFolder(Folder folder) {
        subFolders.add(folder);
    }

    public void printStructure(int indent) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < indent; i++) {
            sb.append("| ");
        }
        sb.append("|-").append(name);
        System.out.println(sb.toString());
        
        for (File file : files) {
            StringBuilder fileIndent = new StringBuilder();
            for (int i = 0; i <= indent; i++) {
                fileIndent.append("| ");
            }
            fileIndent.append("|-").append(file.getName());
            System.out.println(fileIndent.toString());
        }

        for (Folder subFolder : subFolders) {
            subFolder.printStructure(indent + 1);
        }
    }

    public void delete() {
        files.clear();
        for (Folder subFolder : subFolders) {
            subFolder.delete();
        }
        subFolders.clear();
    }
}
