package document.converter

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory

class ConverterApplication

fun main(args: Array<String>) {
	TomcatServletWebServerFactory()
			.getWebServer()
			.start()
}
