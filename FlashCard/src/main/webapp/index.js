//document.write("Hello from seprate js file");
let abc = 100;
console.log("Hello");
function show() {
	document.getElementById("test").innerHTML = "By function";
	alert("Hello");
	// document.write("Function working");
}
var request = new XMLHttpRequest();
request.open('GET', 'http://localhost:8080/get/1');
request.onload = function() {
	document.write(request.response);
};
request.send();