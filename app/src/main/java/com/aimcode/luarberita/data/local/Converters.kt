package com.aimcode.luarberita.data.local

import androidx.room.TypeConverter
import com.aimcode.luarberita.data.models.Source

//untuk merubah data ke type data primitif
class Converters {

    @TypeConverter
    fun frommSource(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }
}