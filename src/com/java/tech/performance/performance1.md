# 📘 Performance Testing Interview Q&A Guide

This document covers:
1. **Performance Testing Interview Questions & Answers**
2. **Core Knowledge Areas for Performance Test Engineers**

---

## 🔹 Basics

**Q: What is performance testing and how is it different from functional testing?**  
✅ Performance testing checks **speed, scalability, stability, and responsiveness** of an application under load.
- **Functional testing** → verifies correctness of features.
- **Performance testing** → verifies how fast, stable, and scalable features work under expected/peak load.

---

**Q: Explain the types of performance tests.**  
✅
- **Load Test** → system under expected user load.
- **Stress Test** → push beyond limits to find breaking point.
- **Soak/Endurance Test** → run under load for long duration (memory leaks, stability).
- **Spike Test** → sudden surge in traffic (e.g., flash sale).
- **Scalability Test** → check behavior when scaling infra.
- **Volume Test** → DB performance with large datasets.

---

**Q: What are key performance testing KPIs?**  
✅
- **Response Time** (avg, 95th/99th percentile).
- **Latency** (network delay).
- **Throughput / TPS**.
- **Error Rate** (% failed requests).
- **Resource Utilization** (CPU, memory, disk I/O, network).

---

## 🔹 Tools & Frameworks

**Q: Which tools have you worked on?**  
✅ JMeter, LoadRunner, Locust, Gatling, Vegeta, k6.

---

**Q: How do you parameterize test data?**  
✅ Use CSV files, env variables, or generators. (e.g., JMeter CSV DataSet Config, Locust Python generators).

---

**Q: How do you simulate concurrent users vs requests per second?**  
✅
- **Concurrent Users** → simulate multiple virtual users (threads, coroutines).
- **RPS (Requests per Second)** → control request rate explicitly (good for APIs).

---

**Q: How do you handle correlation & dynamic values?**  
✅ Extract dynamic values (session IDs, tokens) from server response and reuse.
- JMeter → Regex/JSON Extractor.
- LoadRunner → Correlation rules.

---

## 🔹 Scenario Design

**Q: How do you design a workload model?**  
✅ Use production traffic patterns. Example:
- 60% login, 30% checkout, 10% search.
- Include ramp-up, steady-state, ramp-down.

---

**Q: What’s the difference between think time and pacing?**  
✅
- **Think Time** → simulated user delay.
- **Pacing** → controls rate of execution per user.

---

**Q: How do you decide number of users to simulate?**  
✅ Formula:  Concurrent Users = (Peak Transactions per Hour × Avg Response Time in seconds) / 3600


---

**Q: How do you distribute load across endpoints?**  
✅ Weighted distribution (e.g., 60% login, 30% search, 10% checkout).
- JMeter → Throughput Controller.
- Locust → Task weights.

---

## 🔹 Metrics & Monitoring

**Q: How do you measure response time vs latency?**  
✅
- **Latency** → time to first byte.
- **Response Time** → full round-trip until response complete.

---

**Q: Difference between throughput and bandwidth?**  
✅
- **Throughput** → requests/sec handled.
- **Bandwidth** → network link capacity.

---

**Q: How do you monitor infra during tests?**  
✅ APM tools (Grafana, Prometheus, New Relic).
- DB monitoring: slow query logs.
- Infra: `top`, `vmstat`, `iostat`.

---

**Q: How do you identify bottlenecks?**  
✅
- High CPU + slow responses → CPU bottleneck.
- Low CPU + slow responses → DB/network issue.
- Memory grows continuously → memory leak.

---

## 🔹 Analysis & Results

**Q: What are 95th/99th percentile response times?**  
✅ Metrics showing worst-case user experience.
- 95th percentile = 95% of requests are faster than this time.

---

**Q: How do you analyze performance results?**  
✅ Compare vs baseline & SLA. Look at response time trends, throughput, and errors.

---

**Q: How do you compare test runs?**  
✅ Keep workload/env same, compare throughput, response times, error %.

---

**Q: How do you decide pass/fail?**  
✅ Based on SLA. Example:
- 95% requests < 2 sec.
- Error rate < 1%.
- CPU < 70%.

---

## 🔹 Advanced

**Q: How do you test microservices performance?**  
✅ Run API-level tests, measure inter-service latency, DB queries. Use service mesh telemetry.

---

**Q: How do you test async systems (Kafka, RabbitMQ)?**  
✅ Measure producer throughput, consumer lag, message latency.

---

**Q: How do you test real-time systems (chat/streaming)?**  
✅ Use WebSocket clients (Locust, k6). Measure message latency & delivery rate.

---

**Q: How do you integrate perf tests into CI/CD?**  
✅ Run JMeter/Locust in Jenkins, GitHub Actions. Fail build if SLA thresholds breached.

---

**Q: How do you handle distributed load?**  
✅ JMeter distributed mode, Locust workers, Kubernetes injectors.

---

## 🔹 Troubleshooting

**Q: CPU high but response time good?**  
✅ Likely CPU-bound but still optimized. Watch if it hits 100%.

---

**Q: Response time bad but CPU low?**  
✅ Likely DB bottleneck, query tuning, or network issue.

---

**Q: How do you detect memory leaks?**  
✅ Run endurance test → monitor memory. Continuous growth → leak.

---

**Q: Throughput drops when users increase?**  
✅ Resource saturation, thread contention, DB locks.

---

# 📘 2. Core Knowledge Areas

### ✅ Performance Testing Types
- Load, Stress, Soak, Spike, Scalability, Volume.

### ✅ Metrics
- Response time (avg, p95/p99), throughput, TPS, error %, resource usage.

### ✅ Tools
- Load tools: JMeter, Locust, Gatling, k6.
- Monitoring: Grafana, Prometheus, New Relic.
- Profiling: Heap/thread dumps, DB analysis.

### ✅ Systems Knowledge
- HTTP, REST, WebSockets.
- Caching (Redis, CDN).
- SQL/NoSQL performance.
- Cloud scaling, load balancers.

### ✅ Skills to Demonstrate
1. Convert SLAs → performance goals.
2. Create scalable scripts.
3. End-to-end monitoring.
4. Identify bottlenecks.
5. Recommend optimizations.
6. Work with dev/ops to fix issues.

---

# 🎯 Key Takeaway
Be ready to:
- Explain **types of performance tests**.
- Design **realistic workloads**.
- Monitor **full-stack performance**.
- Analyze & provide **actionable insights**.
- Collaborate on optimizations.  


```
Requests      [total, rate]            6000, 200.00
Duration      [total, attack, wait]    30.0s, 29.9s, 100ms
Latencies     [mean, 95, 99, max]      320ms, 480ms, 600ms, 1s
Bytes In      [total, mean]            1200000, 200.00
Success       [ratio]                  99.5%
Status Codes  [code:count]             200:5970  500:30

1. Requests [total, rate] 6000, 200.00
Total Requests = 6000 → During the test, Vegeta sent 6000 HTTP requests.
Rate = 200 RPS → Each second, 200 requests were sent (200 × 30s = 6000).
👉 This shows your system was attacked with a steady load of 200 requests/sec for 30 seconds.

2. Duration [total, attack, wait] 30.0s, 29.9s, 100ms
Total = 30.0s → Total runtime of test.
Attack = 29.9s → Time Vegeta was actively sending requests.
Wait = 100ms → Extra time for outstanding requests to complete.

3. Latencies
Latencies [mean, 95, 99, max] 320ms, 480ms, 600ms, 1s

Mean (Avg) = 320 ms → Average response time across all 6000 requests.
95th Percentile (p95) = 480 ms →
95% of requests completed within 480 ms.
Only 5% of requests took longer.
99th Percentile (p99) = 600 ms →
99% of requests completed within 600 ms.
Only 1% of requests were slower.
Max = 1s → The single slowest request took 1 second.

Why percentiles matter?
Average can be misleading (hides slow outliers).
Percentiles (p95, p99) show tail latency — critical for user experience.
Example: if you have 1M users, 1% (10k users) seeing 600ms response is still a lot.

4. Bytes In : 
Bytes In [total, mean] 1200000, 200.00
Total = 1,200,000 bytes → Total data received from server (~1.2 MB).
Mean = 200 bytes per response → Each response body averaged 200 bytes.

5. Success :
Success [ratio] 99.5%
99.5% of requests succeeded.
This means 0.5% (≈30 requests) failed (likely returned error codes).

6. Status codes : 
Status Codes [code:count] 200:5970  500:30
200 (OK) → 5970 requests succeeded.
500 (Internal Server Error) → 30 requests failed.

```
