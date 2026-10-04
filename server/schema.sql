CREATE TABLE IF NOT EXISTS devices (
  id            TEXT PRIMARY KEY,
  model         TEXT,
  sdk           INTEGER,
  -- pending: تازه دیده شده و منتظر تایید | approved: مجاز | blocked: بلاک
  status        TEXT NOT NULL DEFAULT 'pending',
  note          TEXT,
  first_seen    INTEGER NOT NULL,
  last_seen     INTEGER NOT NULL,
  request_count INTEGER NOT NULL DEFAULT 0
);

CREATE TABLE IF NOT EXISTS usage (
  device_id TEXT NOT NULL,
  day       TEXT NOT NULL,
  count     INTEGER NOT NULL DEFAULT 0,
  PRIMARY KEY (device_id, day)
);

CREATE INDEX IF NOT EXISTS idx_devices_status ON devices(status);
