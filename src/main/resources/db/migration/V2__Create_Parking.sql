CREATE TABLE IF NOT EXISTS "parking"
(
    parking_id SERIAL PRIMARY KEY,
    "parking_name" TEXT NOT NULL,
    "max_capacity" INTEGER NOT NULL,
    "previous" BOOLEAN NOT NULL,
    "hourly_rate" INTEGER NOT NULL,
    "member_id" INTEGER NOT NULL,
    FOREIGN KEY ("member_id") REFERENCES "member" ("member_id")
);

CREATE UNIQUE INDEX uk_parking_name ON parking (parking_name);