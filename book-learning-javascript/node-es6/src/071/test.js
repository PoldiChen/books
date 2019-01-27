
function a() {
    console.log('a: call b');
    b();
    console.log('a: done');
}

function b() {
    console.log('b: call c');
    c();
    console.log('b: done');
}

function c() {
    console.log('c: throw an error');
    throw new Error('error here!');
    console.log('c: done');
}

try {
    a();
} catch(err) {
    console.log(err.stack); // 调用栈
}