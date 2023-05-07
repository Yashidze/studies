abstract class BaseApiService {
    protected abstract fun validate(entity: BaseEntity)
    protected abstract fun save(entity: BaseEntity?)
    protected abstract fun notifyAdmin(entity: BaseEntity?)
    fun update(entity: BaseEntity) {
        validate(entity)
        save(entity)
    }
}