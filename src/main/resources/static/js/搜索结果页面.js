// window.online();
// function online() {
//     localStorage.setItem("loading", true);
//     var a = localStorage.getItem("loading");
//     if (a == 'true') {
//         document.getElementById("load").style.display = "none";
//         document.getElementById("login").style.display = "none";
//         document.getElementById("center").style.display = "block";
//     } else {
//         document.getElementById("load").style.display = "block";
//         document.getElementById("login").style.display = "block";
//         document.getElementById("center").style.display = "none";
//     }
// }
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
function back() {
    window.history.back();
}
function skip_center() {
    window.location.href = "../个人页面/个人页面.html";
}
function skip_detail() {
    window.location.href = "../商品详细页面/商品详细页面.html";
}
function load() {
    window.location.href = "../登录页面、注册页面/登录页面.html";
}
function login() {
    window.location.href = "../登录页面、注册页面/注册.html";
}
function skip_search() {
    window.location.href = "../搜索结果页面/搜索结果页面.html";
}