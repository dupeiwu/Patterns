package factory_method;

public abstract class AbstractProduct {
    abstract IEdit createEdit(EditEnum editEnum) throws InstantiationException, IllegalAccessException, ClassNotFoundException;
    abstract IDocument createDocument(DocumentEnum documentEnum) throws InstantiationException, IllegalAccessException, ClassNotFoundException;
}
