// Function declarations are not part of the regular top-to-bottom flow of control.
console.log("The future says:", future());

function future() {
  return "You'll never have flying cars";
}

const tobefunction = function(x) {
    console.log("do something");
};

const tobefunctionalt = (x, y) => {
    console.log(x * y);
};

// When function is defined with arguments that have = after it, the expression will replace the argument when it is omitted.
function power(base, exponent = 2) {
    let result = 1;
    for (let count = 0; count < exponent; count++){
        result *= base;
    }
    return result;
}