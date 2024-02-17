package Composition;

public class Main {
    public static void main(String[] args) {
        // Creating the folder structure
        Folder phpDemo1 = new Folder("php_demo1");
        Folder sourceFiles = new Folder("Source Files");
        Folder phalcon = new Folder(".phalcon");
        Folder app = new Folder("app");
        Folder config = new Folder("config");
        Folder controllers = new Folder("controllers");
        Folder library = new Folder("library");
        Folder migrations = new Folder("migrations");
        Folder models = new Folder("models");
        Folder views = new Folder("views");
        Folder cache = new Folder("cache");
        Folder publicFolder = new Folder("public");
        Folder includePath = new Folder("IncludePath");
        Folder remoteFiles = new Folder("Remote Files");

        File htaccess = new File(".htaccess");
        File htrouterPhp = new File(".htrouter.php");
        File indexHtml = new File("index.html");

        // Building the structure
        phpDemo1.addSubFolder(sourceFiles);
        sourceFiles.addSubFolder(phalcon);
        phalcon.addSubFolder(app);
        app.addSubFolder(config);
        app.addSubFolder(controllers);
        app.addSubFolder(library);
        app.addSubFolder(migrations);
        app.addSubFolder(models);
        app.addSubFolder(views);
        app.addSubFolder(cache);
        phpDemo1.addSubFolder(publicFolder);
        phpDemo1.addSubFolder(includePath);
        phpDemo1.addSubFolder(remoteFiles);

        publicFolder.addFile(htaccess);
        publicFolder.addFile(htrouterPhp);
        publicFolder.addFile(indexHtml);

        // Printing the initial structure
        System.out.println("Initial Structure:");
        phpDemo1.printStructure(0);

        // Deleting the 'app' folder
        System.out.println("\nAfter deleting the 'app' folder:");
        app.delete();
        phpDemo1.printStructure(0);

        // Deleting the 'public' folder
        System.out.println("\nAfter deleting the 'public' folder:");
        publicFolder.delete();
        phpDemo1.printStructure(0);
    }
}
