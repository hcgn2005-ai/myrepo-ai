package com.anikai

import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.metaproviders.AnimeStreamProvider
import com.lagradost.cloudstream3.utils.AppUtils

class AnikaiProvider : AnimeStreamProvider() {
    override var mainUrl = "https://anikai.to"
    override var name = "Anikai"
    override val hasMainPage = true
    override val supportedTypes = setOf(TvType.Anime, TvType.AnimeMovie)

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        // TODO: replace with real selectors from anikai.to
        return HomePageResponse(emptyList(), false)
    }

    override suspend fun search(query: String): List<SearchResponse> {
        // TODO: implement search
        return emptyList()
    }

    override suspend fun load(url: String): LoadResponse {
        // TODO: implement details + episodes
        return newAnimeLoadResponse("Anikai placeholder", url, TvType.Anime) { }
    }

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        // TODO: implement player links
        return true
    }
}
