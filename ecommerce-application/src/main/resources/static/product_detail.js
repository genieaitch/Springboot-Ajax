const userId = window.location.pathname.split('/').pop();

$.ajax({
    url: `/api/users/${userId}`, // 사용자 상세 정보 API
    method: 'GET',
    success: function (user) {
        $('#user-detail-container').append(`
            이름 : <p>${user.lastname} ${user.firstname}</p>
            이메일 : <p>${user.email}</p>
            전화번호 : <p>${user.phone}</p>
            주소 : <p>${user.city} ${user.street}</p>
        `);
    },
    error: function () {
        $('#user-detail-container').append('<p>사용자 정보를 가져올 수 없습니다.</p>');
    }
});
