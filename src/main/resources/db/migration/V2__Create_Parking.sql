CREATE TABLE IF NOT EXISTS "parking"
(
    parking_id SERIAL PRIMARY KEY,
    "parking_name" TEXT NOT NULL,
    "parking_address" TEXT NOT NULL,
    "parking_phone" TEXT NOT NULL,
    "max_capacity" INTEGER NOT NULL,
    "previous" BOOLEAN NOT NULL,
    "member_id" INTEGER NOT NULL,
    FOREIGN KEY ("member_id") REFERENCES "member" ("member_id")
);

