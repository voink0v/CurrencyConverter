package repository;

import com.example.entity.Valute;

import java.math.BigDecimal;

public  interface ValuteRepository {
      default Valute getByCodeDefault (String charCode ) {
           if (charCode.toLowerCase().equals("rub")) {
                return new Valute(1,"RUB",1,"qwerty", BigDecimal.ONE);
           } else {
                return getByCharCode(charCode);
           }
      }

     Valute getByCharCode (String charCode);
}
