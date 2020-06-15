DROP TABLE IF EXISTS lineitem;
DROP TABLE IF EXISTS Invoice;

CREATE TABLE Invoice (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  client VARCHAR(250) NOT NULL,
  vatrate BIGINT NOT NULL,
  invoicedate DATETIME NULL
);

CREATE TABLE lineitem (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  quantity BIGINT NOT NULL,
  description VARCHAR(250) NOT NULL,
  unitprice DECIMAL(4,2) NULL,
  invoiceid BIGINT
);
alter table lineitem add constraint FK_invoice_id foreign key (invoiceid) references Invoice (id);

