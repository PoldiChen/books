
function Vacation(destination, length) {
    this.destination = destination;
    this.length = length;
}

Vacation.prototype.print = function() {
    console.log(this.destination);
    console.log(this.length);
};

var va = new Vacation('london', 10);

va.print();