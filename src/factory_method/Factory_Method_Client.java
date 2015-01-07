package factory_method;

public class Factory_Method_Client {

    public static void main(String[] args) {
        Product product=new Product();
        try {
            IEdit editNote=product.createEdit(EditEnum.note_pad);
            IEdit editUltra=product.createEdit(EditEnum.ultra_edit);
            IDocument txt=product.createDocument(DocumentEnum.txt);
            IDocument doc=product.createDocument(DocumentEnum.doc);
            EditDocumentManager editDocumentManager=new EditDocumentManager();
            System.out.println("---------------editNote-----------------------");
            System.out.println("editNote---txt-----------");
            editDocumentManager.editNoteOperate(editNote, txt);
            System.out.println("editNote---doc-----------");
            editDocumentManager.editNoteOperate(editNote, doc);
            System.out.println("---------------editUltra-----------------------");
            System.out.println("editUltra---txt----------");
            editDocumentManager.editNoteOperate(editUltra, txt);
            System.out.println("editUltra---doc-----------");
            editDocumentManager.editNoteOperate(editUltra, doc);
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
