// Arrays are the same as Python lists. They simply need to be declared with a list of items being bound by a set of square brackets.
let listOfNumbers = [2, 3, 5, 7, 11];

// delete command removes a variable.
delete listOfNumbers;

//Two objects with the same value are not the same.
let object1 = {value: 10};
let object2 = object1;
let object3 = {value: 10};

console.log(object1 == object2);
// → true
console.log(object1 == object3);
// → false

object1.value = 15;
console.log(object2.value);
// → 15
console.log(object3.value);
// → 10

// Another way of doing for loops : for (x=0; x < JOURNAL.length; i++) =====> Using the "of" keyword
for (let entry of Journal) {
    console.log(`${entry.events.length} events.`);
}

// .push() = Python .append(), .pop() = Python .remove()

//.unshift() = add to start of array, .shift() = remove from start of array

//.indexOf() = Python .index, .lastIndexOf() = start search from the end

//.slice(x:y) = same as Python [x:y]. Second argument is not inclusive. .concat() = adds arrays together.

//.trim() = removes whitespace flanking the string.

//.padStart(string, paddingchar) = Pads a string to the desired length.

// .split() and .join() = same as Python, .repeat() = repeats string.

// function a(...arguments) {}; ... computes all of the arguments it's given. Called rest parameter