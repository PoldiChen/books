
let globalFunc;
{
	let blockVar = 'a'; // 可以在外部访问这个块作用域的变量
	globalFunc = function() {
		console.log(blockVar);
	}
} // 这个块以及它的父作用域（全局作用域）构成了一个闭包
globalFunc();

//////////////////////////////////////////////////////////////////

let func;
{
	let obj = {
		name: 'safe'
	}
	f = function() {
		return obj;
	}
}
let objRef = f();
objRef.name = 'not safe';