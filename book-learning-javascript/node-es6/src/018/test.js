
const numStr = "33.3";
const num = Number(numStr); // 创建了一个数值，没有创建Number对象的实例

const a = parseInt("16 volts", 10); // volts被忽略，16被当做十进制数解析
const b = parseInt("3a", 16); // 解析十六进制数3a，结果为58
const c = parseFloat("15.5 kph"); // “ kph”被忽略