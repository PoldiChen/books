
function func(obj) {
	obj.message = 'new message';
}

let obj = {
	message: 'init message';
};

console.log(obj.message); // init message
func(obj);
console.log(obj.message); // new message