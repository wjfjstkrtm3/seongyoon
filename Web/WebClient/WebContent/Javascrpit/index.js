const title = document.querySelector("#title");


const CLICKED_CLASS = "clicked";

function handleClicked() { // className은 처음에 비어있으므로 console.log(currentClass)해도 아무것도 안나옴
	title.classList.toggle(CLICKED_CLASS); // toggle은 줄여주는 것으로
									       // 클래스가 거기있는지 체크해서 거기없으면 add, 있으면 remove 해준다
}

function init() {	
title.addEventListener("click", handleClicked);

}
init();




/*
const title = document.querySelector("#title");


const CLICKED_CLASS = "clicked";

function handleClicked() { // className은 처음에 비어있으므로 console.log(currentClass)해도 아무것도 안나옴
	const hasClass = title.classList.contains(CLICKED_CLASS); // true또는 false 반환, value가 존재하는지 체크
	//const currentClass = title.className;
	if(hasClass   // currentClass !== CLICKED_CLASS) {
		// title.className = CLICKED_CLASS; // class = clicked 로 만들어주는거임
		title.classList.remove(CLICKED_CLASS);  CLICKED_CLASS를 가지고 있을경우에는 제거
	} else {
		title.classList.add(CLICKED_CLASS);  CLICKED_CLASS를 가지고 있을경우에는 생성
		//  title.className = ""; // 빈문자열로 만들어주고 앞에있는 id = title css 적용 
	}
}

function init() {
title.addEventListener("click", handleClicked);

}
init();

------------------------------------------------------------------------------------------


const title = document.querySelector("#title");


const CLICKED_CLASS = "clicked";

function handleClicked() { // className은 처음에 비어있으므로 console.log(currentClass)해도 아무것도 안나옴
	const currentClass = title.className;
	if(currentClass !== CLICKED_CLASS ) {
		title.className = CLICKED_CLASS; // class = clicked 로 만들어주는거임
	} else {
		title.className = ""; // 빈문자열로 만들어주고 앞에있는 id = title css 적용 
	}
}


function init() {
title.addEventListener("click", handleClicked);

}
init();

-------------------------------------------------------------

const title = document.querySelector("#title");


const BASE_COLOR = "rgb(52, 73, 94)" // 색깔 값 체크
const OTHER_COLOR = "#7f8c8d"
	
function handleClick() {
	const currentColor = title.style.color;
	if(currentColor === BASE_COLOR) {
		title.style.color = OTHER_COLOR;
	} else {
		title.style.color = BASE_COLOR;
	}
}


function init() {
	title.style.color = BASE_COLOR;
	title.addEventListener("mouseenter", handleClick);
	
}

init();



const age = prompt("How old are you");

if(age >= 18 && age <= 21) {
	console.log("you can drink but you should not");
	
} else if(age>21) {
	console.log("go ahead");
} else {
	console.log("too young")
}




if("10"===10) {
	console.log("hi");
	
} else if("10" === "10"){
	console.log("lalala");
} else {
	cosole.log("ho");
}



const title = document.querySelector("#title");

function handleClick() {
	
	title.style.color = "red";
}
title.addEventListener("click", handleClick)





function handleResize() {
	console.log("I Have been resized")
}

 window.addEventListener("resize", handleResize);
 handleResize()는 바로 즉시 함수를 호출하는거고
 handleResize 함수를 바로 즉시 호출하지 않고, resize될때 호출됨




title.innerHTML = "Hi, From Jeong";
title.style.color = "red";
document.title= "I Own you now";

console.log(title);


자바스크립트는 단지 html과 css를 바꾸고 싶어서 만들어지지 않았다
이벤트에 반응하기 위해서 만들었다
 


const data = ["정성윤","연습중","오늘도","힘들다"];
const data2 = {
name : "아무개",
age : 25
		
		
}
console.log(data);
console.log(data2);

const Calculator = {
plus : function(a,b) {
  return a+b;
},

minus : function(a,b) {
  return a-b;
},

divde : function(a,b) {
  return a/b;
},

gob : function(a,b) {
  return a*b;
}
}

const result = Calculator.plus(5,5);
const result2 = Calculator.minus(5,5);
const result3 = Calculator.divde(5,5);
const result4 = Calculator.gob(5,5);




console.log(result);
console.log(result2);
console.log(result3);
console.log(result4);



function test() {
return "나는 바보입니다.";


}

const result5 = test();

console.log(result5);


 `는 백틱이다
function SayHello(name,age) {
return(`Hello ${name} you are age ${age} years old`);


}

const result10 =SayHello("Jeong",25)
;

console.log(result10);



const calculator2 = {
plus : function(a,b) {
  return a+b;
}


}



const plus = calculator2.plus(5,5);

console.log(plus);
*/

