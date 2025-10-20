package Task5;

public class NameValidator implements Validator {
    @Override
    public void validate(String value) throws  ValidateException {
        if(value.isBlank())
            throw new ValidateException("Имя не должно быть пустым");
    }
// допишите код класса
}