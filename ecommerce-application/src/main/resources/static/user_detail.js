$(document).ready(function () {
    // URL에서 userId 추출
    const params = new URLSearchParams(window.location.search);
    const userId = params.get('userId');

    // 사용자 상세 정보 가져오기
    $.ajax({
        url: `/api/users/${userId}`, // 사용자 상세 정보 API
        method: 'GET',
        success: function (data) {
            $('#user-detail-container').append(`
            이름 : <p>${data.lastname}${data.firstname}</p>
            이메일 : <p>${data.email}</p>
            전화번호 : <p>${data.phone}</p>
            주소 : <p>${data.city}${data.street}</p>
            `);
        },
        error: function () {
            $('#user-detail-container').append('<p>사용자 정보를 가져올 수 없습니다.</p>');
        }
    });
});
