let box = document.querySelectorAll(".A1");
for (let i = 0; i < box.length; i++) {
    box[i].onmouseenter = function (event) {
        let ripple = box[i].querySelector(".ripple");
        ripple.classList.add("animation");
        ripple.style.width = this.offsetWidth + "px";
        ripple.style.height = this.offsetWidth + "px";
        ripple.style.top = -(this.offsetHeight - event.offsetY) + "px";
        ripple.style.left = -(this.offsetWidth / 2 - event.offsetX) + "px";
        setTimeout(function () {
            ripple.classList.remove("animation");
        }, 1000)

    }
}
window.online();
function online() {
    // var a = localStorage.getItem("loading");
    // console.log(a);
    // if (a == 'true') {
    //     document.getElementById("load").style.display = "none";
    //     document.getElementById("login").style.display = "none";
    //     document.getElementById("center").style.display = "block";
    // } else {
    //     document.getElementById("load").style.display = "block";
    //     document.getElementById("login").style.display = "block";
    //     document.getElementById("center").style.display = "none";
    // }
}
function skip_center() {
    window.location.href = "../../templates/个人页面.html";
}
function skip() {
    window.location.href = "../../templates/分类页面.html";
}

function search() {
    window.location.href = "../../templates/搜索结果页面.html";
}

function load() {
    window.location.href = "../../templates/登录页面.html";
}

function login() {
    window.location.href = "../../templates/注册.html";
}


