# book-learning-javascript
some notes and codes for the book Learning JavaScript.

JavaScript学习指南

#### 第1章 第一个应用
1.HTML5和HTML的区别？浏览器如何运行HTML5？

2.什么是CDN？<br>
公共的内容分发网络，content delivery network

3.什么是严格模式？<br>
```
use strict;
```

#### 第2章 JavaScript开发中的常用工具
4.Node允许在浏览器之外的地方运行JavaScript。

5.Gulp、Grunt和webpack的区别？<br>
Gulp是一个构建工具，可以将开发过程中的一些常用任务自动化。

6.Babel编译转换器，可以将ES6的代码转换为便于使用的ES5代码。

7.ESLint，一个可以避免常见错误的格式检查工具。

8.常见的终端工具bash，内嵌在shell（终端的图形用户界面）中，是Linux或OSX操作系统的默认终端。

9.bash、shell、cmd的关系和区别？

10.npm一般结合Node使用，作为项目的包管理工具。<br>
npm支持两种级别的安装包：全局和本地，全局的安装包通常是开发过程中的命令行工具，本地安装包用于具体的项目。<br>
npm通过package.json文件来管理安装的模块。<br>
依赖分为常规依赖和开发依赖。开发依赖是指只在项目构建时需要的依赖，程序运行时不需要。<br>
安装依赖时需要在命令后加--save或--saveDev，否则虽然会安装，但不会出现在package.json中。<br>

11.ES6和ES5的区别？各个支持的浏览器版本？<br>
let、解构赋值、函数参数默认值、箭头符号

#### 第3章 字面量、常量、变量和数据类型
12.蛇形命名法<br>
current_temp_c、an_identifier_name

13.jQuery中以$开头的标识符一般指jQuery-wrapped对象

14.JavaScript中只有基本类型（值类型）和对象两种值（引用类型）。<br>
6种基本类型：数字、字符串、布尔、null、undefined、符号（symbol）。<br>
基本类型不能被修改，（可以改变基本类型赋值的变量，但基本类型本身的值不会改变），对象可以被修改。

15.基本类型的数字、字符串、布尔型都有对应的对象类型Number、String、Boolean，这些对象有两个用途，一是存储特殊值，比如Number.INFINITY，二是以函数的形式提供某些功能：code<br>
```
const s = “hello”;
s.toUpperCase();
```
JavaScript为s创建了一个临时的String对象，该对象有toUpperCase函数，函数被调用后临时对象就被删除。
```
const s = “hello”;
s.rating = 3;
s.rating; // undefined
```
给临时对象指定了属性rating，使用后立即被删除，所以再次访问是undefined。

16.JavaScript内置的对象类型<br>
Array、Date、RegExp、Map和WeakMap、Set和WeakSet

17.null和undefined是两种特殊的类型，都只有一个唯一的值，null和undefined。<br>
一般的经验而言，null是给开发者用的，undefined是留给JavaScript用的，表示未赋值的内容。<br>
开发时只有在有意的模仿变量未赋值的时候，才会使用undefined。<br>
当需要表示一个变量的值未知或者不适用的时候，常用的做法是用null

18.字符串转换为数字code<br>
第一种，使用Number对象的构造方法：<br>
```
const numStr = “33.3”;
const num = Number(numStr); // 创建了一个数值，没有创建Number对象的实例
```
第二种，使用内置函数parseInt和parseFloat，会忽略和数字不相关的信息：
```
const a = parseInt(“16 volts”, 10); // volts被忽略，16被当做十进制数解析
const b = parseInt(“3a”, 16); // 解析十六进制数3a，结果为58
const c = parseFloat(“15.5 kph”); // “ kph”被忽略
```

19.其他类型转换为字符串<br>
JavaScript中任何对象都有toString()方法，返回该对象的字符串形式。














aaa
