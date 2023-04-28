CREATE TABLE IF NOT EXISTS "record"
(
    record_id SERIAL PRIMARY KEY,
    "vehicle_entry_date" TIMESTAMP WITHOUT TIME ZONE,
    "vehicle_exit_date" TIMESTAMP WITHOUT TIME ZONE,
    "vehicle_id" INTEGER,
    "parking_id" INTEGER,
    FOREIGN KEY ("vehicle_id") REFERENCES "vehicle" ("vehicle_id"),
    FOREIGN KEY ("parking_id") REFERENCES "parking" ("parking_id")
);
