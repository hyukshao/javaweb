$(function () {
    // 循环轮播到某个特定的帧 
    $(".slide-one").click(function () {
        $("#myCarousel").carousel(0);
    });
    $(".slide-two").click(function () {
        $("#myCarousel").carousel(1);
    });
});

function skip_search() {
    window.location.href = "../搜索结果页面/搜索结果页面.html";
}

function skip_back() {
    window.history.back();
}