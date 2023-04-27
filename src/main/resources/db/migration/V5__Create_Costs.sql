CREATE TABLE IF NOT EXISTS "costs"
(
    cost_id VARCHAR(28) PRIMARY KEY,
    "hourly_rate" TEXT,
    "number_hours" TEXT,
    "total_cost" TEXT,
    "record_id" TEXT,
    FOREIGN KEY ("record_id") REFERENCES "records" ("record_id")
);