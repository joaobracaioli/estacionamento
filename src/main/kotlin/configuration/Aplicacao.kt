package configuration
import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["configuration"])

class Aplicacao

fun main(args: Array<String>) {
    runApplication<Aplicacao>(*args) {
        setBannerMode(Banner.Mode.OFF)
    }
}
