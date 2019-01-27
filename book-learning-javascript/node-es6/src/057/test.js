
class Car {

	constructor(make, model) {
		this.make = make;
		this.model = model;
		this.userGears = ['P', 'N', 'R', 'D'];
		this.userGear = this.userGears[0];
	}

	shift(gear) {
		if (this.userGears.indexOf(gear) < 0) {
			throw new Error('invalid gear');
		}
		this.userGear = gear;
	}
}

const car1 = new Car();
const car2 = new Car();

console.log(car1.shift == Car.prototype.shift); // true
car1.shift('D');
car1.shift('d'); // error
console.log(car1.userGear); // D
console.log(car1.shift == car2.shift); // true

car1.shift = function(gear) { // 覆盖了原型的shift方法
	this.userGear = gear.toUpperCase();
}
console.log(car1.shift == Car.prototype.shift); //false
console.log(car1.shift == car2.shift); // false
car1.shift('d');
console.log(car1.userGear); // D
