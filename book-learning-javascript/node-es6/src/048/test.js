
const SYM = Symbol();
const obj = {
	a: 1,
	b: 2,
	c: 3,
	[SYM]: 4
};
for (let key in obj) {
	if (!obj.hasOwnProperty(key)) {
		continue;
	}
	console.log(key+':'+obj[key]);
}