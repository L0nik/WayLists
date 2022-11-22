package com.example.waylists.domain

interface WayListRepository {
    fun addWayList(wayListItem: WayListItem)
    fun deleteWayListItem(wayListItem: WayListItem)
    fun editWayListItem(wayListItem: WayListItem)
    fun getWayListItem(wayListItemId: Int) : WayListItem
    fun getWayLists() : List<WayListItem>
}