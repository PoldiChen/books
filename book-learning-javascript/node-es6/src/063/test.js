

class Parent {
	constructor() {
		this.name = 'parent';
		this.isParent = true;
	}
}

Parent.prototype.sneaky = 'not recommended';

class Child extends Parent {
	constructor() {
		super();
		this.name = 'child';
		this.isChild = true;
	}
}

const obj = new Child();
for (let key in obj) {
	console.log(key + ':' + obj[key]); // name, isParent, isChild, sneaky
	console.log(obj.hasOwnProperty(key)); // true, true, true, false
}
console.log(obj.keys);