package com.example.waylists.domain

class DeleteWayListItemUseCase(private val wayListRepository: WayListRepository) {
    fun deleteWayListItem(wayListItemId: Int) {
        wayListRepository.deleteWayListItem(wayListItemId)
    }
}