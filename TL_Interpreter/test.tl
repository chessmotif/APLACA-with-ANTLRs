func mult(a, b) {
	out <- a * b;
}

func cat (a, b){
	out <- a # b;
}

func factorial (a){
	if a =_= 1{ out <-a;}
	fi {out <- factorial (a*(a-1));}
}

return factorial (1);