
const message = (function(){
	const secret = 'SECRET';
	return 'the secret is: ' + secret;
})();
console.log(message);

////////////////////////////////////////////////////

const func = (function(){
	let count = 0;
	return function() {
		console.log('count: ' + (++count));
	}
})();

func();
func();
func();