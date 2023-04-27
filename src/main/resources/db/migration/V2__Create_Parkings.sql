CREATE TABLE IF NOT EXISTS "parkings"
(
    parking_id VARCHAR(28) PRIMARY KEY,
    "name" TEXT,
    "adress" TEXT,
    "phone" TEXT,
    "member_id" TEXT,
    FOREIGN KEY ("member_id") REFERENCES "members" ("member_id")
);
