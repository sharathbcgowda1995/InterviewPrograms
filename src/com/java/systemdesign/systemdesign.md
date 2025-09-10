# 📘 System Design Core Q&A Guide

This document covers **6 core system design interview problems** with their
- **Follow-up questions & answers**
- **Key services** and their responsibilities

---

## 1. Chat App (WhatsApp / Messenger)

### Follow-up Questions & Answers
- **Q: How do you ensure messages arrive in order?**  
  ✅ Use **per-conversation sequencing** (message IDs/timestamps). No need for global ordering. Clients can reorder messages locally.

- **Q: How do you handle offline users?**  
  ✅ Store messages in a **queue or DB** (Cassandra, DynamoDB). On reconnect, deliver pending messages. Push notifications as fallback.

- **Q: How do you scale to millions of WebSocket connections?**  
  ✅ Use **load balancers** + shard users across servers. Each server maintains active connections. Use consistent hashing for routing.

- **Q: How do you guarantee delivery?**  
  ✅ Implement **ack-based protocol**: Sender → Server → Receiver. Each stage sends ack; retries on failure.

### Services & Responsibilities
- **Auth Service** → User login, sessions, JWT tokens.
- **Chat Service** → Routes messages to recipients, handles acknowledgments.
- **Message Queue (Kafka/SQS)** → Decouple send/receive, retries.
- **Storage**
    - SQL (user profiles, contacts).
    - NoSQL (messages, conversation history).
- **Notification Service** → Push (APNS/FCM) for offline delivery.
- **Presence Service** → Tracks online/offline/last seen.

---

## 2. Food Delivery (Swiggy / Zomato)

### Follow-up Questions & Answers
- **Q: How do you match drivers to orders?**  
  ✅ Use **geospatial index** (Redis GEO / PostGIS). Score drivers by distance, ETA, rating, load.

- **Q: How do you handle peak traffic (lunch/dinner rush)?**  
  ✅ Buffer orders in **queue** (Kafka, SQS). **Auto-scale** stateless services. Apply **rate limiting**.

- **Q: How do you keep ETAs accurate?**  
  ✅ Continuously recompute ETA with **driver location + traffic APIs**. Push updates via WebSocket.

- **Q: What if a driver cancels?**  
  ✅ Return order to **matching pool** and retry assignment. Notify user if delay threshold exceeded.

### Services & Responsibilities
- **User Service** → Profiles, addresses, preferences.
- **Restaurant Service** → Menu, availability.
- **Order Service** → Order lifecycle (created → delivered).
- **Payment Service** → Secure payments, refunds.
- **Delivery Service** → Driver matching, assignments, tracking.
- **Notification Service** → Push/SMS/email updates.
- **Geo Service** → Driver location updates, ETA calculations.
- **Event Bus** → Emits lifecycle events (`order_ready`, `driver_assigned`).

---

## 3. URL Shortener (Bit.ly)

### Follow-up Questions & Answers
- **Q: How do you generate unique keys without collisions?**  
  ✅ Use **Base62 encoding** of DB auto-increment IDs or distributed ID generators (e.g., Snowflake).

- **Q: What if one URL is extremely popular?**  
  ✅ Cache in **CDN/Redis** for fast lookups. Replicate DB reads.

- **Q: How do you track billions of clicks?**  
  ✅ Log asynchronously to **Kafka → Spark/BigQuery** for analytics.

- **Q: How do you handle trillions of URLs?**  
  ✅ Partition/shard DB by **hash of short key**. Archive/purge inactive URLs.

### Services & Responsibilities
- **API Service** → `POST /shorten`, `GET /{shortKey}`.
- **Key Generation Service** → Generates unique short IDs.
- **Storage Service** → SQL/NoSQL mapping `shortKey → longURL`.
- **Cache (Redis/CDN)** → Caches hot URLs for fast redirects.
- **Analytics Service** → Collects clicks, devices, geos.
- **Event Pipeline** → Kafka → batch/stream processing for analytics.

---

## 4. YouTube / Video Streaming

### Follow-up Questions & Answers
- **Q: How do you handle large uploads?**  
  ✅ Support **chunked/resumable uploads** → object storage (S3/GCS).

- **Q: How do you deliver videos worldwide?**  
  ✅ Use **CDN edge servers** with **adaptive bitrate streaming (HLS/DASH)**.

- **Q: How do you generate recommendations?**  
  ✅ Offline ML (collaborative filtering) + online personalization (recent activity).

- **Q: How do you manage petabyte-scale storage?**  
  ✅ Tiered storage: hot content on SSD/S3, cold content archived to Glacier.

### Services & Responsibilities
- **Upload Service** → Manages resumable uploads.
- **Transcoding Service** → Converts to multiple resolutions/bitrates.
- **Storage Service** → Stores video blobs in object storage.
- **CDN/Edge Cache** → Serves content near users with low latency.
- **Streaming Service** → HLS/DASH for adaptive playback.
- **Metadata Service** → Titles, tags, ownership, thumbnails.
- **Recommendation Service** → Personalized ranking of videos.
- **Analytics Service** → Tracks views, watch time, engagement.

---

## 5. Uber / Lyft (Ride-hailing)

### Follow-up Questions & Answers
- **Q: How often should drivers send GPS updates?**  
  ✅ Every 5–10s (balance accuracy vs battery/load).

- **Q: How do you pick among multiple nearby drivers?**  
  ✅ Score drivers by distance, ETA, rating, surge factor, and load.

- **Q: How do you implement surge pricing?**  
  ✅ Compute demand/supply ratio per zone. Raise multiplier when demand > supply.

- **Q: What if no driver accepts the ride?**  
  ✅ Retry assignment with next best drivers. Cancel gracefully after timeout.

### Services & Responsibilities
- **User Service** → Passenger profiles.
- **Driver Service** → Driver availability, rating, status.
- **Ride Service** → Ride lifecycle.
- **Matching Service** → Finds nearest drivers (geospatial).
- **Geo Service** → Manages driver location updates, ETA.
- **Payment Service** → Fare calc, charges, settlements.
- **Notification Service** → Push/SMS ride updates.
- **Event Bus** → Ride lifecycle events.

---

## 6. Amazon / E-commerce

### Follow-up Questions & Answers
- **Q: How do you scale search for millions of products?**  
  ✅ Use **Elasticsearch/Solr** with inverted indexes + faceted search.

- **Q: How do you prevent overselling inventory?**  
  ✅ Use **strongly consistent DB** or row-level locking on inventory.

- **Q: Where do you store shopping carts?**  
  ✅ Active carts in **Redis** (fast) + persisted in DB for durability.

- **Q: How do you ensure reliable workflows across payment/inventory/shipping?**  
  ✅ Use **saga pattern** (choreography/orchestration + compensating transactions).

### Services & Responsibilities
- **Catalog Service** → Product listings, search index.
- **Cart Service** → Active cart management.
- **Order Service** → Manages orders end-to-end.
- **Inventory Service** → Tracks stock across warehouses.
- **Payment Service** → Payments, refunds, settlements.
- **Recommendation Service** → Personalized product suggestions.
- **Logistics Service** → Fulfillment, shipping tracking.
- **Notification Service** → Order/shipping notifications.
- **Analytics Service** → Sales, fraud detection, business metrics.

---

# 🎯 Final Notes
- These **6 systems** cover:
    - Real-time messaging
    - Geo + event-driven workflows
    - Key-value mapping at scale
    - Media upload + CDN
    - Ride-matching and payments
    - Large-scale catalog + transactions

- Mastering these gives you a solid foundation for **any system design interview**.
