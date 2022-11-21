package com.example.waylists.domain

class GetWayListItemUseCase(private val wayListRepository: WayListRepository) {
    fun getWayListItem(wayListItemId: Int) : WayListItem {
        return wayListRepository.getWayListItem(wayListItemId)
    }
}