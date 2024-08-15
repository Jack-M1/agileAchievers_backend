INSERT INTO Employee (name, salary, bank_acc, ni, type) VALUES
('John Doe', 50000.00, '12345678', 'AB123456C', 1),
('Jane Smith', 60000.00, '23456789', 'CD234567A', 2),
('Alice Johnson', 70000.00, '34567890', 'EF345678B', 1),
('Bob Williams', 80000.00, '45678901', 'GH456789D', 2),
('Charlie Brown', 90000.00, '56789012', 'IJ567890E', 1);

INSERT INTO SalesComm (id, commission_rate) VALUES
(1, 1.5),
(2, 2.5),
(3, 0.5),
(4, 3.5),
(5, 6.5);

INSERT INTO Client (name, salesID) VALUES
('Client A', 1),
('Client B', 2),
('Client C', 3),
('Client D', 4),
('Client E', 5);

INSERT INTO Project (name, value, clientID, techleadID, completed) VALUES
('Project Alpha', 10000.00, 1, 1, 0),
('Project Beta', 20000.00, 2, 2, 1),
('Project Gamma', 30000.00, 3, 3, 0),
('Project Delta', 40000.00, 4, 4, 1),
('Project Epsilon', 50000.00, 5, 5, 0);

INSERT INTO ProjectDelivery (projectID, deliveryID, onProject) VALUES
(1, 1, 1),
(2, 2, 0),
(3, 3, 1),
(4, 4, 0),
(5, 5, 1);