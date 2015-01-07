package factory_method;

public class EditDocumentManager {

    public void editNoteOperate(IEdit edit,IDocument document)
    {
        edit.openEdit();
        document.openDocument();
        document.saveDocument();
        document.closeDocument();
        document.deleteDocument();
        edit.closeEdit();
        edit.uninstall();
    }
}
