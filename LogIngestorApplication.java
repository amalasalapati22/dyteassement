import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
 
@SpringBootApplication
public class LogIngestorApplication {
    public static void main(String[] args) {
SpringApplication.run(LogIngestorApplication.class, args);
    }
}
 
@RestController
class LogController {
    @PostMapping("/ingest")
    public String ingestLogs(@RequestBody String logData) {
        //Implement logic to process and store logData
        return "Log ingested successfully";
    }
}
