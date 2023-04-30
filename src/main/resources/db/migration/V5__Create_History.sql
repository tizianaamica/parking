CREATE TABLE IF NOT EXISTS "history"
(
  history_id SERIAL PRIMARY KEY,
  "vehicle_checkout_date" TIMESTAMP WITHOUT TIME ZONE,
  "record_id" INTEGER,
  FOREIGN KEY ("record_id") REFERENCES record("record_id")
);
