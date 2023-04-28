CREATE TABLE IF NOT EXISTS "member"
(
    member_id SERIAL PRIMARY KEY,
    "member_name" TEXT NOT NULL,
    "member_email" TEXT NOT NULL
);