package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {
    default Double convert(CurrencyType currencyType) {
        double srcRate =  this.getCurrencyType().getRate();
        double destRate = currencyType.getRate();
        return destRate/srcRate;

    }

    public CurrencyType getCurrencyType();
}
