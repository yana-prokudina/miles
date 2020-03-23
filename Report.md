# Miles .java

## Краткое описание

Код [miles](https://github.com/yana-prokudina/miles/blob/master/Main.java) был запущен в IntelliJIDEA.

В задании не указано с какой точностью необходим расчет милей и в какую сторону необходимо округление.

Исходя из общей логики применен метод BigDecimal со следующими параметрами: 

scale = 0 **округление до целого значения**

Roundingmode = floor **округление в меньшую сторону, чтобы учитывать только целое число милей, и не брать в расчет остаток**

Результат запуска кода:

![Run result](https://github.com/yana-prokudina/miles/blob/master/miles.png)
