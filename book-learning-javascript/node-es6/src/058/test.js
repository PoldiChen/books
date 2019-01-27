
class Car {

	static getNextVin() { // 为防止两个实例生成同样的vin，定义成静态方法
		return Car.nextVin++; // 也可以用this.nextVin++，使用Car是为了强调静态方法
	}

	constructor(make, model) {
		this.make = make;
		this.model = model;
		this.vin = Car.getNextVin();
	}

	static areSimilar(car1, car2) {
		return car1.make == car2.make && car1.model == car2.model;
	}

	static areSame(car1, car2) {
		return car1.vin == car2.vin;
	}
}
Car.nextVin = 1;

const car1 = new Car('Tesla', 'S');
const car2 = new Car('Mazda', '3');
const car3 = new Car('Mazda', '3');

console.log(car1.vin); // 1
console.log(car2.vin); // 2
console.log(car3.vin); // 3

console.log(Car.areSimilar(car2, car3)); // true
console.log(Car.areSame(car2, car3)); // false