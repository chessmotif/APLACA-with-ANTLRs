##if 2 =_= 3 {out <- 2 + 3;}
##fiif 2 >_< 3 {out <- 2 * 3;}
##fi {out <- 2 + 3 + 4;}



a <- 5;  
  
if a <_< 4 { a <- 1; } 
fiif a <_< 0 { a <- 2;  }
fi{ a <- 42;  }
out <- a;