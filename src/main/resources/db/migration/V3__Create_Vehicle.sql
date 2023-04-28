CREATE TABLE IF NOT EXISTS "vehicle"
(
    vehicle_id SERIAL PRIMARY KEY,
    "vehicle_make" TEXT NOT NULL,
    "vehicle_type" TEXT NOT NULL,
    "vehicle_plate" TEXT NOT NULL,
    "parking_id" INTEGER NOT NULL,
    FOREIGN KEY ("parking_id") REFERENCES "parking" ("parking_id")
);