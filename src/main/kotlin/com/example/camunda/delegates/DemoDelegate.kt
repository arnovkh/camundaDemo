package com.example.camunda.delegates

import org.camunda.bpm.engine.delegate.DelegateExecution
import org.camunda.bpm.engine.delegate.JavaDelegate

class DemoDelegate: JavaDelegate {

    @Throws(Exception::class)
    override fun execute(execution: DelegateExecution) {
        println("Delegate has been called")
    }
}