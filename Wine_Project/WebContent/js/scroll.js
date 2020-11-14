
$(document).ready(function() {
   //radio버튼처럼 checkbox name값 설정
   $('input[type="checkbox"][name="check"]').click(function(){
       //click 이벤트가 발생했는지 체크
       if ($(this).prop('checked')) {
           //checkbox 전체를 checked 해제후 click한 요소만 true지정
           $('input[type="checkbox"][name="check"]').prop('checked', false);
           $(this).prop('checked', true);
       }
   });
});



