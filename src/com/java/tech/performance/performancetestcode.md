### Python - Locust : 

```
1. create the : locustfile.py file

from locust import HttpUser, task, between
class LoginUser(HttpUser):
    # Wait time between requests for each simulated user (1-5 seconds)
    wait_time = between(1, 5)

    @task
    def login(self):
        # Define the POST request body
        payload = {
            "username": "testuser",
            "password": "P@ssw0rd"
        }
        headers = {"Content-Type": "application/json"}

        # Send POST request
        response = self.client.post("/api/v1/login", json=payload, headers=headers)

        # Validate response
        if response.status_code != 200:
            response.failure(f"Failed login: {response.text}")

2. Run Locust : 

locust -f locustfile.py --host http://localhost:8080

3. Open Web UI

- Go to : http://localhost:8089

Enter:
Number of users to simulate: 500
Spawn rate: 20 users/sec
Observe: response times, failure %, throughput.
```

### 2. Vegeta Example (Command-line) : 

```
Step 1: Create targets.txt

POST http://localhost:8080/api/v1/login
Content-Type: application/json
@body.json

Step 2: Create body.json
{
  "username": "testuser",
  "password": "P@ssw0rd"
}

Step 3: Run Vegeta Attack
 
cat targets.txt | vegeta attack -duration=30s -rate=200 | tee results.bin | vegeta report

Explannation :
-duration=30s → run for 30 seconds
-rate=200 → 200 requests per second

Requests      [total, rate]            6000, 200.00
Duration      [total, attack, wait]    30.0s, 29.9s, 100ms
Latencies     [mean, 95, 99, max]      320ms, 480ms, 600ms, 1s
Bytes In      [total, mean]            1200000, 200.00
Success       [ratio]                  99.5%
Status Codes  [code:count]             200:5970  500:30
