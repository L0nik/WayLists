package com.example.waylists.domain

class EditWayListItemUseCase(private val wayListRepository: WayListRepository) {
    fun editWayListItem(wayListItem: WayListItem) {
        wayListRepository.editWayListItem(wayListItem)
    }
}