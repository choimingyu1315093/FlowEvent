Flow 이벤트 처리
addEventListener 대신 onEach 사용해라
collect는 스트림이 끝날 때 까지 기다린다. 다음에 있을 UI작업, 네트워크 작업 아무것도 안하고 기다리기만 한다. 그래서 쓰지마라!!
단, collect 대신 launchIn을 사용하면 된다.
