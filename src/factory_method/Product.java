package factory_method;

public class Product extends AbstractProduct {

    @Override
    IEdit createEdit(EditEnum editEnum) 
            throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (IEdit) Class.forName(editEnum.getValue()).newInstance();
    }

    @Override
    IDocument createDocument(DocumentEnum documentEnum) 
            throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return (IDocument) Class.forName(documentEnum.getValue()).newInstance();
    }

}
