package com.anikai

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import com.lagradost.cloudstream3.registerMainAPI

@CloudstreamPlugin
class AnikaiPlugin : Plugin() {
    override fun load() {
        registerMainAPI(AnikaiProvider())
    }
}
