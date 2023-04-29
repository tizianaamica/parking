CREATE TABLE IF NOT EXISTS "vehicle"
(
    vehicle_id SERIAL PRIMARY KEY,
    "vehicle_make" TEXT NOT NULL,
    "vehicle_type" TEXT NOT NULL,
    "vehicle_plate" VARCHAR(6) NOT NULL CHECK ("vehicle_plate" ~ '^[a-zA-Z0-9]{1,6}$'),
    "parking_id" INTEGER NOT NULL,
    FOREIGN KEY ("parking_id") REFERENCES "parking" ("parking_id")
);