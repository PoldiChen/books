
class Car {}

class InsurancePolicy {}

function makeInsurable(obj) {
	obj.addInsurancePolicy = function(policy) {
		this.insurancePolicy = policy;
	}
	obj.getInsurancePolicy = function() {
		return this.insurancePolicy;
	}
	obj.isInsuranced = function() {
		return !!this.insurancePolicy;
	}
}

const car1 = new Car();
makeInsurable(car1);
car1.addInsurancePolicy(new InsurancePolicy());

makeInsurable(Car.prototype); // 为Car的原型对象添加add、set等方法，Car的实例都共享这个原型对象，所以也有add、set方法？？？
const car2 = new Car();
car2.addInsurancePolicy(new InsurancePolicy());