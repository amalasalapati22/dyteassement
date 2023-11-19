# dyteassement
Log Ingestor and Query Interface
--->Steps to run the Project

Clone the repository.
Navigate to the project directory.
Build and run the Log Ingestor and Query Interface applications separately.
System Design:
Log Ingestor uses Spring Boot to handle HTTP requests and stores logs.
Query Interface provides a user-friendly interface for searching logs based on specified filters.
Advanced features like search within date ranges, regular expressions, and real-time capabilities are not implemented in this basic version.
Features Implemented:
Log ingestion via HTTP POST requests.
Basic filtering of logs in the Query Interface.
Identified Issues:
The system lacks advanced features and optimizations specified in the requirements.

--->Additional Recommendations:
Collaborate with a team to implement advanced features, database optimizations, and distributed systems.
Consider using a hybrid database solution (e.g., PostgreSQL for structured data and Elasticsearch for efficient full-text search).
Implement database indexing, sharding, and explore cloud-based solutions for scalability.
