package com.example.waylists.domain

class GetWayListsUseCase(private val wayListRepository: WayListRepository) {
    fun getWayLists() : List<WayListItem> {
        return wayListRepository.getWayLists()
    }
}