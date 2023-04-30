import kotlin.jvm.JvmStatic
import java.util.ArrayList

interface TouristPlaceIterator {
    operator fun hasNext(): Boolean
    operator fun next(): Any
}