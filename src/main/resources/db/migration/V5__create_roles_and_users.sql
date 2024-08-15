CREATE TABLE `Role` (
	RoleID TINYINT NOT NULL,
    Name varchar(64) NOT NULL,
    PRIMARY KEY (RoleID)
);

INSERT INTO `Role` (RoleID, Name) VALUES (1, 'Admin');
INSERT INTO `Role` (RoleID, Name) VALUES (2, 'HR');
INSERT INTO `Role` (RoleID, Name) VALUES (3, 'Management');
INSERT INTO `Role` (RoleID, Name) VALUES (4, 'Sales');

CREATE TABLE `User` (
	Username varchar(64) NOT NULL,
    Password varchar(64) NOT NULL,
    RoleID TINYINT NOT NULL,
    PRIMARY KEY (Username),
    FOREIGN KEY (RoleID) REFERENCES Role(RoleID)
);

INSERT INTO User(Username, Password, RoleID) VALUES ('admin', 'admin', 1);
INSERT INTO User(Username, Password, RoleID) VALUES ('HR', 'HR', 2);
INSERT INTO User(Username, Password, RoleID) VALUES ('Management', 'Management', 3);
INSERT INTO User(Username, Password, RoleID) VALUES ('Sales', 'Sales', 4);