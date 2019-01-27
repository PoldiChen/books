
class Vehicle {

	constructor() {
		this.passengers = [];
	}

	addPassenger(p) {
		this.passengers.push(p);
	}
}

class Car extends Vehicle {

	constructor() {
		super(); // 子类必须调用，否则会报错
	}

	deployAirbags() {
		console.log('boom!');
	}
}

const v = new Vehicle();
v.addPassenger('Jack');
v.addPassenger('Tom');
console.log(v.passengers);

const c = new Car();
c.addPassenger('Alice');
c.addPassenger('Simon');
console.log(c.passengers);
c.deployAirbags();
v.deployAirbags(); // TypeError: v.deployAribags is not a function