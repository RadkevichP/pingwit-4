package pl.pingwit.lec_23.point_2;

import pl.pingwit.lec_21.point_1.CatPet;
import pl.pingwit.lec_23.point_1.AccountInformation;

import javax.xml.validation.Validator;

/**
 * @author Pavel Radkevich
 * @since 17.04.23
 */
public class Application {

    public static void main(String[] args) {
        MyAnnotationValidator validator = new MyAnnotationValidator();

        AccountInformation accountInformation = new AccountInformation("Pavel", "Rad123", "berbeuvb");
        //validator.validate(accountInformation);

        CatPet cat = new CatPet("00990", "opopo");
        validator.validate(cat);
        System.out.println(cat);

        System.out.println(accountInformation);
    }
}
