
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

const carObj = new Car('Tesla', 'S1');

console.log(typeof carObj);
console.log(carObj instanceof Car);

console.log(carObj.userGear);
carObj.shift('D');
console.log(carObj.userGear);