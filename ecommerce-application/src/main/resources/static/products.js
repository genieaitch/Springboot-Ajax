$(document).ready(function () {
    $.ajax({
        url: '/api/products',
        method: 'GET',
        success:
            function (products) {
                $.each(products, function (index, item) {
                    $('#product-container').append(`
                           <div class="card">
                                <img src="${item.image}" alt="${item.title}">
                                <h3>${item.title}</h3>
                                <p>${item.price}원</p>
                            </div>`)
                })
            },
        error: function () {
            alert('상품을 서버에서 가져올 수 없습니다.')
        }
    });
});