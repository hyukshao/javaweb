// window.online();
// function online() {
//     var a = localStorage.getItem("loading");
//     console.log(a);
//     if (a == 'true') {
//         document.getElementById("load").style.display = "none";
//         document.getElementById("login").style.display = "none";
//         document.getElementById("center").style.display = "block";
//     } else {
//         document.getElementById("load").style.display = "block";
//         document.getElementById("login").style.display = "block";
//         document.getElementById("center").style.display = "none";
//     }
//     // var id = document.getElementById("getId");
//     // var getId = "@{/zhuye/fenlei/detail}" + id;
//     // document.getElementById("a").href = getId;
// }


function back() {
    window.history.back();
}
function skip_center() {
    window.location.href = "../个人页面/个人页面.html";
}
function skip_detail() {
    window.location.href = "../商品详细页面/商品详细页面.html";
}
function skip_search() {
    window.location.href = "../搜索结果页面/搜索结果页面.html";
}
function load() {
    window.location.href = "../登录页面、注册页面/登录页面.html";
}
function login() {
    window.location.href = "../登录页面、注册页面/注册.html";
}
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
let D11 = document.querySelectorAll(".D11");
for (let i = 0; i < D11.length; i++) {
    let sanjiao = D11[i].querySelector(".sanjiao");

    D11[i].onmouseout = function (event) {
        sanjiao.classList.add("sanjiao-2");
        sanjiao.classList.remove("sanjiao-1");
    }
    D11[i].onmouseover = function (event) {
        sanjiao.classList.add("sanjiao-1");
        sanjiao.classList.remove("sanjiao");
        sanjiao.classList.remove("sanjiao-2");

    }

}
let D21 = document.querySelectorAll(".D21");
for (let i = 0; i < D21.length; i++) {
    let sanjiao2 = D21[i].querySelector(".sanjiao2");

    D21[i].onmouseout = function (event) {
        sanjiao2.classList.add("sanjiao-2");
        sanjiao2.classList.remove("sanjiao-1");
    }
    D21[i].onmouseover = function (event) {
        sanjiao2.classList.add("sanjiao-1");
        sanjiao2.classList.remove("sanjiao");
        sanjiao2.classList.remove("sanjiao-2");

    }

}
let D31 = document.querySelectorAll(".D31");
for (let i = 0; i < D31.length; i++) {
    let sanjiao3 = D31[i].querySelector(".sanjiao3");

    D31[i].onmouseout = function (event) {
        sanjiao3.classList.add("sanjiao-2");
        sanjiao3.classList.remove("sanjiao-1");
    }
    D31[i].onmouseover = function (event) {
        sanjiao3.classList.add("sanjiao-1");
        sanjiao3.classList.remove("sanjiao");
        sanjiao3.classList.remove("sanjiao-2");

    }

}
let D41 = document.querySelectorAll(".D41");
for (let i = 0; i < D41.length; i++) {
    let sanjiao4 = D41[i].querySelector(".sanjiao4");

    D41[i].onmouseout = function (event) {
        sanjiao4.classList.add("sanjiao-2");
        sanjiao4.classList.remove("sanjiao-1");
    }
    D41[i].onmouseover = function (event) {
        sanjiao4.classList.add("sanjiao-1");
        sanjiao4.classList.remove("sanjiao");
        sanjiao4.classList.remove("sanjiao-2");

    }

}
var point = 1;
var ing = 0;
function one() {
    if (point != 1 && ing != 1) {
        ing = 1;
        var the = document.getElementById("one");
        the.classList.add("one-in");
        the.classList.remove("one-out");
        the.classList.remove("one-1");
        switch (point) {

            case 3:
                var other = document.getElementById("three");
                other.classList.add("three-out");
                other.classList.remove("three");
                other.classList.remove("three-in");

                setTimeout(function () {
                    other.classList.add("three");
                    other.classList.remove("three-out");
                    point = 1;
                    ing = 0;
                }, 1000)
                break;

            case 4:
                var other = document.getElementById("four");
                other.classList.add("four-out");
                other.classList.remove("four");
                other.classList.remove("four-in");

                setTimeout(function () {
                    other.classList.add("four");
                    other.classList.remove("four-out");

                    point = 1;
                    ing = 0;
                }, 1000)
                break;

            case 5:
                var other = document.getElementById("five");
                other.classList.add("five-out");
                other.classList.remove("five");
                other.classList.remove("five-in");

                setTimeout(function () {
                    other.classList.add("five");
                    other.classList.remove("five-out");
                    point = 1;
                    ing = 0;
                }, 1000)
                break;
        }

    }

}

function three() {
    if (point != 3 && ing != 1) {
        ing = 1;
        var the = document.getElementById("three");
        the.classList.add("three-in")
        the.classList.remove("three")
        the.classList.remove("three-out")

        switch (point) {

            case 1:

                var other = document.getElementById("one");
                other.classList.add("one-out");
                other.classList.remove("one");
                other.classList.remove("one-in");

                setTimeout(function () {
                    other.classList.add("one-1");
                    other.classList.remove("one-out");
                    point = 3;
                    ing = 0;
                }, 1000)
                break;

            case 4:
                var other = document.getElementById("four");
                other.classList.add("four-out");
                other.classList.remove("four-in");
                other.classList.remove("four");

                setTimeout(function () {
                    other.classList.add("four");
                    other.classList.remove("four-out");

                    point = 3;
                    ing = 0;
                }, 1000)
                break;

            case 5:
                var other = document.getElementById("five");
                other.classList.add("five-out");
                other.classList.remove("five");
                other.classList.remove("five-in");
                setTimeout(function () {
                    other.classList.add("five");
                    other.classList.remove("five-out");
                    point = 3;
                    ing = 0;
                }, 1000)
                break;
        }

    }

}
function four() {
    if (point != 4 && ing != 1) {
        ing = 1;
        var the = document.getElementById("four");
        the.classList.add("four-in")
        the.classList.remove("four")
        the.classList.remove("four-out")
        switch (point) {

            case 1:

                var other = document.getElementById("one");
                other.classList.add("one-out");
                other.classList.remove("one");
                other.classList.remove("one-in");

                setTimeout(function () {
                    other.classList.add("one-1");
                    other.classList.remove("one-out");
                    point = 4;
                    ing = 0;
                }, 1000)
                break;

            case 3:
                var other = document.getElementById("three");
                other.classList.add("three-out");
                other.classList.remove("three");
                other.classList.remove("three-in");

                setTimeout(function () {
                    other.classList.add("three");
                    other.classList.remove("three-out");
                    point = 4;
                    ing = 0;
                }, 1000)
                break;

            case 5:
                var other = document.getElementById("five");
                other.classList.add("five-out");
                other.classList.remove("five-in");
                other.classList.remove("five");

                setTimeout(function () {
                    other.classList.add("five");
                    other.classList.remove("five-out");
                    point = 4;
                    ing = 0;
                }, 1000)
                break;
        }

    }

}
function five() {
    if (point != 5 && ing != 1) {
        ing = 1;
        var the = document.getElementById("five");
        the.classList.add("five-in");
        the.classList.remove("five");
        the.classList.remove("five-out");
        switch (point) {

            case 1:

                var other = document.getElementById("one");
                other.classList.add("one-out");
                other.classList.remove("one");
                other.classList.remove("one-in");

                setTimeout(function () {
                    other.classList.add("one-1");
                    other.classList.remove("one-out");
                    point = 5;
                    ing = 0;
                }, 1000)
                break;

            case 3:
                var other = document.getElementById("three");
                other.classList.add("three-out");
                other.classList.remove("three");
                other.classList.remove("three-in");

                setTimeout(function () {
                    other.classList.add("three");
                    other.classList.remove("three-out");
                    point = 5;
                    ing = 0;
                }, 1000)
                break;

            case 4:
                var other = document.getElementById("four");
                other.classList.add("four-out");
                other.classList.remove("four");
                other.classList.remove("four-in");

                setTimeout(function () {
                    other.classList.add("four");
                    other.classList.remove("four-out");
                    point = 5;
                    ing = 0;
                }, 1000)
                break;
        }
    }
}
