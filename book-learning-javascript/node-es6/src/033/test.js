
const f1 = function() { return "hello"; }
const f2 = () => "hello";

const f3 = function(name) { return 'hello, ${name}'; }
const f4 = name => 'hello, ${name}';

const f5 = function(a, b) { return a+b; }
const f6 = (a, b) => a+b;

console.log(f1());
console.log(f2());
console.log(f3());
console.log(f4());
console.log(f5(1, 2));
console.log(f6(1, 2));