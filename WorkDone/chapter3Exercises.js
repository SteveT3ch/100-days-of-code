//Eloquent Javascript Exercise Minimum
function min(number1, number2) {
    if (number1 < number2) {
        return number1;
    } else if (number2 < number1) {
        return number2;
    }
}
console.log(min(0,10));
console.log(min(0,-10));

//Eloquent Javascript Exercise Recursion
function isEven(number) {
    if (number == 0) {
        return true;
    } else if (number == 1) {
        return false;
    } else if (number > 0) { 
        return isEven(number - 2);
    } else if (number < 0) {
        return isEven(number + 2);
    }
}
console.log(isEven(-110));
console.log(isEven(75));
console.log(isEven(50));

//Eloquent Javascript Exercise Bean Counting
function countBs(word) {
    let Bcount = 0;
    for (count = 0 ; count < word.length ; count++) {
        if (word[count] == "B") {
            Bcount++;
        }
    }
    return Bcount;
}
console.log(countBs("BBC"));

function countChar(word, letter) {
    let lettercount = 0;
    for (count = 0 ; count < word.length ; count++) {
        if (word[count] == letter) {
            lettercount++;
        }
    }
    return lettercount;
}
console.log(countChar("kakkerlak", "k"));