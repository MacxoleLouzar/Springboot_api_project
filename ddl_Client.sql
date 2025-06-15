CREATE TABLE client
(
    id      INT          NOT NULL,
    name    VARCHAR(255) NULL,
    email   VARCHAR(255) NULL,
    age     INT          NOT NULL,
    gender  VARCHAR(255) NULL,
    phone UNKNOWN__JAVA.UTIL.LIST<JAVA.LANG.STRING> NULL,
    address VARCHAR(255) NULL,
    CONSTRAINT pk_client PRIMARY KEY (id)
);