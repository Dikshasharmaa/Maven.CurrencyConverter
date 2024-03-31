package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Ringgit implements ConvertableCurrency {
    CurrencyType currencyType;
    public Ringgit() {
        this.currencyType = CurrencyType.RINGGIT;
    }

    public CurrencyType getCurrencyType() {
        return currencyType;
    }
}
