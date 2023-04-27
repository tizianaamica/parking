CREATE TABLE IF NOT EXISTS "vehicles"
(
    vehicle_id VARCHAR(28) PRIMARY KEY,
    "vehicle_make" TEXT,
    "vehicle_type" TEXT,
    "vehicle_plate" TEXT,
    "parking_id" TEXT,
    FOREIGN KEY ("parking_id") REFERENCES "parkings" ("parking_id")
);