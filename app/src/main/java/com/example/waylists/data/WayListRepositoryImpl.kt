package com.example.waylists.data

import com.example.waylists.domain.WayListItem
import com.example.waylists.domain.WayListRepository

object WayListRepositoryImpl : WayListRepository {

    val wayListsList = mutableListOf<WayListItem>()

    private var autoIncrementId = 0

    override fun addWayList(wayListItem: WayListItem) {
        if (wayListItem.id == WayListItem.UNDEFINED_ID)
            wayListItem.id = autoIncrementId++
        wayListsList.add(wayListItem)
    }

    override fun deleteWayListItem(wayListItem: WayListItem) {
        wayListsList.remove(wayListItem)
    }

    override fun editWayListItem(wayListItem: WayListItem) {
        val oldElement = getWayListItem(wayListItem.id)
        deleteWayListItem(oldElement)
        addWayList(wayListItem)
    }

    override fun getWayListItem(wayListItemId: Int): WayListItem {
        return wayListsList.find {
            it.id == wayListItemId
        } ?: throw RuntimeException("Element with id $wayListItemId not found")
    }

    override fun getWayLists(): List<WayListItem> {
        return wayListsList.toList()
    }
}