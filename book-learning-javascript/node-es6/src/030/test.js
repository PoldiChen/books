
'use strict';

const obj = {
	name: 'Julie',
	greetingBackwards: function() {
		const self = this; // 在这里this还是绑定到obj
		function getReverseName() {
			let nameBackwards = '';
			for (let i = self.name.length-1; i>0; i++) { // 在嵌套的函数内this绑定到了其他其他，不能直接用this
				nameBackwards += self.name.substr(i, 1);
			}
			return nameBackwards;
		}
		return getReverseName() + ' si eman ym'; // 在greetingBackwards中调用getReverseName，this不是绑定到obj，而是其他地方
	}
};

let result = obj.greetingBackwards();
console.log(result);
