
var box = document.getElementById("box");
var InputBox = document.getElementById("InputBox");
box.onmouseover = function () {
    box.classList.add("box-1");
    box.classList.remove("box-2");
    box.classList.remove("box")

    InputBox.classList.add("InputBox-1");
    InputBox.classList.remove("InputBox-2");
    InputBox.classList.remove("InputBox");

}

box.onmouseout = function () {
    box.classList.remove("box-1");
    box.classList.add("box-2");

    InputBox.classList.remove("InputBox-1");
    InputBox.classList.add("InputBox-2");
};

let A1 = document.querySelectorAll(".A1");
for (let i = 0; i < A1.length; i++) {
    let sanjiao = A1[i].querySelector(".sanjiao");

    A1[i].onmouseout = function (event) {
        sanjiao.classList.add("sanjiao-2");
        sanjiao.classList.remove("sanjiao-1");
    }
    A1[i].onmouseover = function (event) {
        sanjiao.classList.add("sanjiao-1");
        sanjiao.classList.remove("sanjiao");
        sanjiao.classList.remove("sanjiao-2");

    }

}
function skip_center() {
    window.location.href = "../个人页面/个人页面.html";
}
function skip_search() {
    window.location.href = "../搜索结果页面/搜索结果页面.html";
}
function skip_home() {
    window.history.back();
}
function load() {
    window.location.href = "../登录页面、注册页面/登录页面.html";
}
function login() {
    window.location.href = "../登录页面、注册页面/注册.html";
}
function skip_seller() {
    window.location.href = "../个人详细页面/个人详细页面.html";
}
function AddShopping() {

        var b = document.getElementById("AddToCart");
        b.style.display = "block";
}
function warning() {
    var a = document.getElementById("warning");
    a.style.display = "none";
}
function CellSeller() {
    document.getElementById("SellerInformation").style.display = "block";;
}
function SellerInformation() {
    var a = document.getElementById("SellerInformation");
    a.style.display = "none";
}
function AddToCart() {
    var a = document.getElementById("AddToCart");
    a.style.display = "none";
}
var one=document.getElementById("one");
var two=document.getElementById("two");
function  next_one(){
    one.classList.add("one-out");
    one.classList.remove("one");
    two.classList.add("two-in");
    two.classList.remove("two");

    setTimeout(function (){
        one.classList.add("one-2");
        one.classList.remove("one-out");
        two.classList.add("two-2");
        two.classList.remove("two-in");
    },1000)

}
function  next_two(){
    one.classList.add("one-in");
    one.classList.remove("one-2");
    two.classList.add("two-out");
    two.classList.remove("two-2");

    setTimeout(function (){
        one.classList.add("one");
        one.classList.remove("one-in");
        two.classList.add("two");
        two.classList.remove("two-out");
    },1000)
}

