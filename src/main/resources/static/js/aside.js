/*
 *  Aside menu control
 */
$(document).ready(function() {      // 이벤트 등록
  $('#stateMsgBtn').click(function(e) {
    $('#stateMsgInput').attr({'class': 'mt-2'});    // 입력창이 보이게
    $('#stateInput').val($('#stateMsg').text());    // 입력창에 stateMsg 내용이 보이게
  });
  $('#stateMsgSubmit').click(changeStateMsg);     // 이벤트 등록
});