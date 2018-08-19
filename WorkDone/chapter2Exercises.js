// Eloquent Javascript Exercise Looping a Triangle
let symbol = "#";
for (x = 0; x <= 7; x++) {
    console.log(symbol);
    (symbol += "#");    
}

// Eloquent Javascript Exercise FizzBuzz
for (x = 1; x <= 100; x++) {
	if ((x % 3 == 0) && (x % 5 == 0)){
    	console.log("FizzBuzz");
    } else if (x % 3 == 0){
        console.log("Fizz");
    } else if (x % 5 == 0){
        console.log("Buzz");
    } else {
    	console.log(x);
    }
}

// Eloquent Javascript Exercise ChessBoard
let width = 8;
let height = 8;


//Print pattern 1
const pattern1 = function(x) {  
    let output = "";
    for (x = 0; x <= (width-1); x++) {
	  if (x % 2 == 0) {
    	  output += " ";
      } else if (x % 2 == 1){
    	  output += "#";
      }
  } console.log(output);
};

//Print pattern 2
const pattern2 = function(x) {
  output = "";
  for (x = 0; x <= (width-1); x++) {
	  if (x % 2 == 0) {
    	  output += "#";
      } else if (x % 2 == 1){
    	  output += " ";
      }
  } console.log(output);
};

for (x = 0; x <= (height-1); x++) {
    if (x % 2 == 0) {
        pattern1();
  } else if (x % 2 == 1) {
        pattern2();
  }
}