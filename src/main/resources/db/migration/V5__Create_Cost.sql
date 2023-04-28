CREATE TABLE IF NOT EXISTS "cost"
(
    cost_id SERIAL PRIMARY KEY,
    "hourly_rate" INTEGER NOT NULL,
    "number_hours" INTEGER NOT NULL,
    "total_cost" INTEGER NOT NULL,
    "record_id" INTEGER,
    FOREIGN KEY ("record_id") REFERENCES "record" ("record_id")
);