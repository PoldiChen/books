
const obj = {
	name: 'Jack',
	speak() {return 'my name is ${this.name}';}
}

obj.sepak(); // my name is Jack

const speak = obj.sepak;
speak === o.speak;
speak(); // my name is 
         // 调用方式不同，JavaScript不知道speak在obj中定义，所以this绑定到了undefined