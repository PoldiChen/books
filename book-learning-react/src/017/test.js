
class Vacation {

    constructor(destination, length) {
        this.destination = destination;
        this.length = length;
    }

    print() {
        console.log(this.destination);
        console.log(this.length);
    }
}

var va = new Vacation('london', 10);
va.print();