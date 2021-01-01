function ship_shoppingcart() {
    window.location.href = "../购物车页面/购物车.html";
}

function skip_buy() {
    window.location.href = "../购买记录页面/购买记录页面.html";
}

function skip_exit() {
    localStorage.setItem("loading", 'false');
    window.history.back();
}
function skip_sell() {
    window.location.href = "../出售记录页面/出售记录页面.html";
}
function skip_personal_information() {
    window.location.href = "../个人详细页面/个人详细页面.html";
}
function skip_back() {
    window.history.back();
}
var look=document.getElementById("look");
look.onmouseenter =function (){
    document.getElementById("money").classList.add("money1");
    document.getElementById("money-hidden").classList.add("money-hidden1");
    document.getElementById("money").classList.remove("money");
    document.getElementById("money-hidden").classList.remove("money-hidden");
}
look.onmouseout = function (){
    document.getElementById("money").classList.remove("money1");
    document.getElementById("money-hidden").classList.remove("money-hidden1");
    document.getElementById("money").classList.add("money");
    document.getElementById("money-hidden").classList.add("money-hidden");
}