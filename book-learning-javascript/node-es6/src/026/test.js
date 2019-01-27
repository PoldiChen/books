
function func(obj) {
	obj.message = 'set new message';
	obj = {
		message: 'new obj';
	}; // obj指向了一个新的、独立的对象，函数外的obj指向原来的对象
	console.log(obj.message); // new obj
}

let obj = {
	message: 'init message';
};

console.log(obj.message); // init message
func(obj); // new obj
console.log(obj.message); // set new message