
const Car = (function() {
	const carProps = new WeakMap();

	class Car {
		constructor(make, model) {
			this.make = make;
			this.model = model;
			this._userGears = ['P', 'N', 'R', 'D'];
			carProps.set(this, { userGear: this._userGears[0] });
		}

		getUserGear() {
			return carProps.get(this).userGear;
		}

		setUserGear(gear) {
			carprops.get(this).userGear = gear;
		}

		shift(gear) {
			this.gear = gear;
		}
	}
	return Car;
}});

let carObj = new Car();
console.log(carObj.getUserGear());