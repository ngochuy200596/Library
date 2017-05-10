$(document).ready(function () {
    $(".regular").slick({
        dots: true,
        infinite: true,
        slidesToShow: 6,
        slidesToScroll: 6
    });

    $(".new").slick({
        dots: true,
        infinite: true,
        slidesToShow: 4,
        slidesToScroll: 4
    });
});