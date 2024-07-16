CREATE TABLE participants(
    id UUID DEFAULT RANDOM_UUID()PRIMARY KEY,
    name VARCHAR(235) NOT NULL,
    email VARCHAR(235) NOT NULL,
    is_confirmed BOOLEAN NOT NULL,
    trip_id UUID,
    FOREIGN KEY (trip_id) REFERENCES trips(id)
);