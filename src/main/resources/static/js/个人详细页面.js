function skip_back() {
    window.history.back();
}
var more_num = 1;
function more() {
    console.log(more_num);
    let bg = document.getElementById("bg");
    let border = document.getElementById("photo-border");
    let name = document.getElementById("name");
    let address = document.getElementById("address");
    let more = document.getElementById("more");
    let sold = document.getElementById("sold");
    let buy = document.getElementById("buy");
    let grade = document.getElementById("grade");
    let realname = document.getElementById("realname");
    let number = document.getElementById("number");
    let name3 = document.getElementById("name3-1");

    if (more_num % 2 == 1) {
        name3.classList.add("name3-1");
        realname.classList.add("realname-1");
        number.classList.add("number-1");
        grade.classList.add("grade-1");
        buy.classList.add("buy-1");
        sold.classList.add("sold-1");
        more.classList.add("more-1");
        address.classList.add("address-1");
        name.classList.add("name-1");
        bg.classList.add("animation");
        border.classList.add("photo-border-1");

        setTimeout(function () {

            number.classList.remove("number-1");
            realname.classList.remove("realname-1");
            grade.classList.remove("grade-1");
            buy.classList.remove("buy-1");
            sold.classList.remove("sold-1");
            more.classList.remove("more-1");
            address.classList.remove("address-1")
            bg.classList.remove("animation");
            border.classList.remove("photo-border-1");
            name.classList.remove("name-1");
            name3.classList.remove("name3");

            bg.classList.remove("bg-1");
            border.classList.remove("photo-border");
            name.classList.remove("name");
            address.classList.remove("address")
            more.classList.remove("more");
            sold.classList.remove("sold");
            buy.classList.remove("buy");
            grade.classList.remove("grade");
            realname.classList.remove("realname");
            number.classList.remove("number");

            bg.classList.add("bg-2");
            border.classList.add("photo-border-2");
            name.classList.add("name-2");
            address.classList.add("address-2")
            more.classList.add("more-2");
            sold.classList.add("sold-2");
            buy.classList.add("buy-2");
            grade.classList.add("grade-2");
            realname.classList.add("realname-2");
            number.classList.add("number-2");

        }, 700)
    } else {

        realname.classList.add("realname-3");
        number.classList.add("number-3");
        grade.classList.add("grade-3");
        buy.classList.add("buy-3");
        sold.classList.add("sold-3");
        more.classList.add("more-3");
        address.classList.add("address-3");
        name.classList.add("name-3");
        bg.classList.add("bg-3");
        border.classList.add("photo-border-3");
        name3.classList.add("name3");


        setTimeout(function () {

            number.classList.remove("number-3");
            realname.classList.remove("realname-3");
            grade.classList.remove("grade-3");
            buy.classList.remove("buy-3");
            sold.classList.remove("sold-3");
            more.classList.remove("more-3");
            address.classList.remove("address-3")
            bg.classList.remove("bg-3");
            border.classList.remove("photo-border-3");
            name.classList.remove("name-3");
            name3.classList.remove("name3-1");

            bg.classList.remove("bg-2");
            border.classList.remove("photo-border-2");
            name.classList.remove("name-2");
            address.classList.remove("address-2")
            more.classList.remove("more-2");
            sold.classList.remove("sold-2");
            buy.classList.remove("buy-2");
            grade.classList.remove("grade-2");
            realname.classList.remove("realname-2");
            number.classList.remove("number-2");

            bg.classList.add("bg-1");
            border.classList.add("photo-border");
            name.classList.add("name");
            address.classList.add("address")
            more.classList.add("more");
            sold.classList.add("sold");
            buy.classList.add("buy");
            grade.classList.add("grade");
            realname.classList.add("realname");
            number.classList.add("number");

        }, 700)
    }
    more_num++;
}