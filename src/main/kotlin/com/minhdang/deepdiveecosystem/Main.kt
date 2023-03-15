package com.minhdang.deepdiveecosystem

import java.lang.management.ManagementFactory

fun main() {
    try {
        val gcMxBeans = ManagementFactory.getGarbageCollectorMXBeans()
        for (gcMxBean in gcMxBeans) {
            println(gcMxBean.name)
            println(gcMxBean.objectName)
        }
    } catch (re: RuntimeException) {
        throw re
    } catch (exp: Exception) {
        throw RuntimeException(exp)
    }
}
