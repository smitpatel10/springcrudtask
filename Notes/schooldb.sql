CREATE DATABASE schooldb;

CREATE TABLE `student` (
  `id` int NOT NULL,
  `firstname` varchar(45) NOT NULL,
  `secondname` varchar(45) NOT NULL,
  `city` varchar(45) NOT NULL,
  `area` varchar(45) NOT NULL,
  `std` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



INSERT INTO `student` (`id`, `firstname`, `secondname`, `city`, `area`, `std`) VALUES
(1, 'Smit', 'Patel', 'Ahmedabad', 'Naroda', 10);

ALTER TABLE `student`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `student`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;
