package metropolia.renmai.steptracker.sensorsHandler

interface StepListener {
    fun step(timeNs: Long)
}