package com.example.flowevent.playground

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.runBlocking

//Flow 이벤트 처리
//addEventListener 대신 onEach 사용
fun events(): Flow<Int> = (1..3).asFlow().onEach { delay(1000) }
fun main() = runBlocking {
//    events()
//        .onEach { event -> println("Event: $event") }
//        .collect { value -> //collect는 스트림이 끝날 때 까지 기다린다. UI작업, 네트워크 작업 아무것도 안하고 기다리기만 한다. 그래서 결론은 쓰지마라!
//            println(value)
//        }
//
//    println("Done")

    events()
        .onEach { event -> println("Event: $event") }
        .launchIn(this)
    println("Done")
}