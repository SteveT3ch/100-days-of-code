//let, var, const = binding
let caught = 5 * 5, ten = 10;
console.log(ten * ten);
console.log(ten + caught);
console.log("the value of x is", caught);

//Math.min() and Math.max()
console.log(Math.min(caught, ten) + 40);

//prompt() is the annoying web input pop-up on old sites. Modern programming tend to avoid this keyword.
//Number() converts the string value from input to number. Similar to Python int()
if (Number.isInteger(ten)) {
    console.log("The value of this number is", ten);
}
// No elif in JavaScript like Java. Must use else if. if statements must also be wrapped in circle brackets unlike Python.

let x = 10;
if (x < 1) {
    console.log(x, "is less than 1.")
} else if (x > 1) {
    console.log(x, "is greater than 1.")
} else {
    console.log(x, "is not a number.")
}

let num = 0;
while (num <= 12) {
    console.log(num);
    num += 2;
}
// do loops runs the body once, then has a while test that must be fulfilled before looping.
let y = 100
do {
    y -= 5
    console.log(y)
} while (y > 95)
// for loops in Javascript requires 3 arguments to run: for([initialization of variable, ie. x = 0]; [condition, ie. x <= 10]; [final-expression: expression to be evaluated at the end of each loop iteration. Updates or increments counter variable, ie. x++])
for (z = 0; z <= 5; z++) {
    console.log("z =", z);
}
// break; to break out of a loop.

