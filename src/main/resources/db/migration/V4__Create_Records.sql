CREATE TABLE IF NOT EXISTS "records"
(
    record_id VARCHAR(28) PRIMARY KEY,
    "vehicle_entry_date" TIMESTAMP WITHOUT TIME ZONE,
    "vehicle_exit_date" TIMESTAMP WITHOUT TIME ZONE,
    "vehicle_id" TEXT,
    "parking_id" TEXT,
    FOREIGN KEY ("vehicle_id") REFERENCES "vehicles" ("vehicle_id"),
    FOREIGN KEY ("parking_id") REFERENCES "parkings" ("parking_id")
);
