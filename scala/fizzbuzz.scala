for (i <- 1 to 100){
  if ( i % 15 == 0 ){
    println(i + ": Fizz Buzz")
  }else if (i % 3 == 0){
    println(i + ": Fizz")
  }else if (i % 5 == 0){
    println(i + ": Buzz")
  }else{
    println(i)
  }
}
