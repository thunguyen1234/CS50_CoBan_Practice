package Java.JavaFoundation.projects.project1;

import java.util.HashMap;


public class LibraryManager {
    // declare hashmap to store documents
    HashMap<String, Document> documents;

    // constructor
    public LibraryManager() {
        // initialize hashmap
        documents = new HashMap<>();
        documents.put("B001", new Book("Java Programming", 2020, "John Doe"));
        documents.put("D001", new Book("Science Daily", 2021, "Jane Smith"));

    }
//throws : ném ra ngoại lệ khi không tìm thấy tài liệu
//bất kì method muốn ném ra exception cần thỏa mãn 2 điều kiện:
//1. method phải khai báo throws ExceptionType
//2. nơi gọi method phải xử lý ngoại lệ (try-catch hoặc throws tiếp)
//Dùng throws	Từ chối xử lý và chuyển trách nhiệm xử lý lỗi đó cho hàm gọi nó.
    public void searchByTitle(String title) throws DocumentNotFoundException {
   for(String docKey: documents.keySet()){
       Document doc = documents.get(docKey);
       // tại sao từ key mà lấy ra title? đáng lẽ phải là từ object chứ nhỉ?
       if(doc.title.equals(title)){
           System.out.println("Found Document - ID: " + docKey + ", Title: " + doc.title + ", Year: " + doc.year);
           return;
       }
throw new DocumentNotFoundException("Document with title '" + title + "' not found.");
    
    
    }
}

    public void displayAll() {
        for (String docKey : documents.keySet()) {
            Document doc = documents.get(docKey);
            System.out.println("ID: " + docKey + ", Title: " + doc.title + ", Year: " + doc.year);
        }

    }

    public void addDocument(String id, Document doc) {
        documents.put(id, doc);
    }
    //delete document by id
    public void deleteDocument(String id) {
        documents.remove(id);
    }
}
