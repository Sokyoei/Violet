create database if not exists Violet;
use Violet;

drop table if exists `role`;
create table role
(
    `nameZh`        varchar(255) character set utf8mb4 collate utf8mb4_general_ci not null comment '姓名（中文）',
    `nameEn`        varchar(255) character set utf8mb4 collate utf8mb4_general_ci not null comment '姓名（英文）',
    `birthday`      date                                                          not null comment '生日',
    `title`         varchar(255) character set utf8mb4 collate utf8mb4_general_ci not null comment '称号',
    `version`       varchar(10) character set utf8mb4 collate utf8mb4_general_ci  not null comment '上线版本',
    `constellation` varchar(255) character set utf8mb4 collate utf8mb4_general_ci not null comment '命之座',
    `level`         tinyint(4)                                                    not null comment '星级'
);

insert into `role`
values ('芙宁娜', 'Furina', '2024-11-13', '不休独舞', '4.3', '司颂座', 5);
insert into `role`
values ('八重神子', 'Yae Miko', '2022-6-27', '浮世笑百姿', '2.5', '仙狐座', 5);
