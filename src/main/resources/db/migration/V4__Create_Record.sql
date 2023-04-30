CREATE TABLE IF NOT EXISTS "record"
(
    record_id SERIAL PRIMARY KEY,
    "vehicle_plate" VARCHAR(6) NOT NULL CHECK ("vehicle_plate" ~ '^[a-zA-Z0-9]{1,6}$'),
    "vehicle_entry_date" TIMESTAMP WITHOUT TIME ZONE,
    "parking_id" INTEGER,
    "vehicle_id" INTEGER,
    FOREIGN KEY ("parking_id") REFERENCES "parking" ("parking_id"),
    FOREIGN KEY ("vehicle_id") REFERENCES "vehicle" ("vehicle_id"),
    FOREIGN KEY ("vehicle_plate") REFERENCES "vehicle" ("vehicle_plate")
);
