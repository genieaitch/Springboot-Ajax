$(document).ready(function () {
    // 사용자 데이터를 가져오기
    $.ajax({
        url: '/api/users', // 사용자 목록 API
        method: 'GET',
        success: function (data) {
            $.each(data, function (key, value) {
                // 사용자 정보를 포함한 카드 추가
                $('#user-container').append(`
                    <div class="card" data-user-id="${value.userId}">
                        <h3>${value.lastname}${value.firstname}</h3>
                        <p>${value.phone}</p>
                        <a href="/cart?userId=${value.userId}">장바구니 확인하기</a>
                    </div>
                `);
            });
        },
        error: function () {
            $('#user-container').append(`<p>서버에서 데이터를 가져올 수 없습니다.</p>`);
        }
    });

    // 카드 클릭 이벤트 핸들러 (이벤트 위임)
    $('#user-container').on('click', '.card', function () {
        const userId = $(this).data('userId'); // 클릭한 카드의 userId 가져오기
        if (userId) {
            window.location.href = `/user/${userId}`; // 상세 정보 페이지로 이동
        }
    });
});
