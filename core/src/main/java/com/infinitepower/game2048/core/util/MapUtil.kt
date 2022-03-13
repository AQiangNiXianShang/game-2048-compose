package com.infinitepower.game2048.core.util

fun <T> List<List<T>>.map(
    transform: (
        row: Int,
        col: Int,
        T
    ) -> T
): List<List<T>> = mapIndexed { row, rowTiles ->
    rowTiles.mapIndexed { col, colTiles ->
        transform(row, col, colTiles)
    }
}