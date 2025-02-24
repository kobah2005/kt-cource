interface Transformable {
    abstract  fun transform(data: String): String
}

abstract class DataProcessor(val processorName: String) {
    fun process(data: String): String {
        return "Обработчик: ${this.processorName} обработал данные"
    }
}

class Encryptor : DataProcessor("Encryptor"),Transformable {
    override fun transform(data: String): String {
        return "${this.processorName} преобразовал данные: encoded_$data"
    }
}

class Compressor : DataProcessor("Compressor"),Transformable {
    override fun transform(data: String): String {
        return "${this.processorName} преобразовал данные: compressed_$data"
    }
}

class Logger: DataProcessor("Logger") {
}