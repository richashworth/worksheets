Monoids describe an aggregation pattern: whenever we need to combine or merge values of a particular
type in a functional program, this design pattern helps abstract the mechanics of the aggregation
from the program's business logic. In this post, we will use the 'LCD Digits' kata that we [tackled
previously](http://richashworth.com/2016/01/lcd-digits-with-scala/) as a motivating example. The
goal here is to transform a sequence of input digits into a string resembling their representation
on an LCD display. For example, given the input '1234', the program should produce:

```
  ._. ... ._. ._. ... ._.
  |.| ..| ._| ._| |_| |_.
  |_| ..| |_. ._| ..| ._|
```


