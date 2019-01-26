
var tahoe = {
    resorts: ['a', 'b', 'c'],
    print: function(delay=1000) {
        setTimeout(function(){
            console.log(this.resorts.join(',')); // this指向window对象
        }, delay);
    }
};

tahoe.print(); // TypeError: Cannot read property 'join' of undefined

var tahoe2 = {
    resorts: ['a', 'b', 'c'],
    print: function(delay=1000){
        setTimeout(()=>{ // 使用箭头函数限定了this的作用域。？？？
            console.log(this.resorts.join(','))
        }, delay)
    }
};

tahoe2.print();

var tahoe3 = {
    resorts: ['a', 'b', 'c'],
    print: (delay=1000) => { // 将print函数声明为箭头函数，其中的this指向了window对象。？？？
        setTimeout(()=>{
            console.log(this.resorts.join(','))
        }, delay);
    }
};

tahoe3.print(); // TypeError: Cannot read property 'join' of undefined