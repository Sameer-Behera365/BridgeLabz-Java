package ioprogramming.designpatterns;

interface FileService {
    void accessFile();
}

class RealFileService implements FileService {
    public void accessFile() {
        System.out.println("Accessing File");
    }
}

class FileAccessProxy implements FileService {
    private RealFileService realService = new RealFileService();
    private String role;

    public FileAccessProxy(String role) {
        this.role = role;
    }

    public void accessFile() {
        if ("ADMIN".equals(role)) {
            realService.accessFile();
        } else {
            System.out.println("Access Denied");
        }
    }
}

public class ProxyPatternDemo {
    public static void main(String[] args) {
        FileService service = new FileAccessProxy("ADMIN");
        service.accessFile();
    }
}