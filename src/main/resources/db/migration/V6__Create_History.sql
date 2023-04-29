CREATE TABLE IF NOT EXISTS "history"
(
  history_id SERIAL PRIMARY KEY,
  "vehicle_checkout_date" TIMESTAMP WITHOUT TIME ZONE,
  "vehicle_id" INTEGER,
  FOREIGN KEY ("vehicle_id") REFERENCES vehicle("vehicle_id") ON DELETE CASCADE
);
