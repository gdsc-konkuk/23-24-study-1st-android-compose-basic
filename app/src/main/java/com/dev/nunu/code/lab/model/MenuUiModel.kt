package com.dev.nunu.code.lab.model

data class MenuUiModel(
    val title: String,
    val onPress: () -> Unit
) {
    companion object {
        val DEFAULT = listOf(
            MenuUiModel(title = "최근 알림", onPress = { }),
            MenuUiModel(title = "내 정보 수정", onPress = { }),
            MenuUiModel(title = "공지사항", onPress = { })
        )
    }
}
