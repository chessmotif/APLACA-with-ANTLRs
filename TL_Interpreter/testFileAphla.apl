## THIS IS A COMMENT
## IO and operations

x <- in('string inputs: ') # ' hello';
out <- x # ' hi';
out <- 'yolo ' # x;

out <- 2 + in('integer inputs: ') + 4;
out <- 2 + in ** 3;
out <- 3 * 5 - 2;

a<-in('divide by 99: ');
out <- 'quotient = ' # (a // 99);
out <- 'remainder = ' # (a % 99);

out <- in('double inputs: ') * 3.14159265358979323;


a <- in('boolean testing');
out <- a ^_^ false;

out <- 'or-test';
out <- true |_| true;
out <- true |_| false;
out <- false |_| true;
out <- false |_| false;

out <- 'and-test';
out <- true &_& true;
out <- true &_& false;
out <- false &_& true;
out <- false &_& false;

out <- 'xor/cuteemote-test';
out <- true ^_^ true;
out <- true ^_^ false;
out <- false ^_^ true;
out <- false ^_^ false;

## recursion o:
func printLol(num) {
	if num >_> 0 {
		printLol(num-1);
		out <- 'lol' # num;
	}
}

printLol(5);