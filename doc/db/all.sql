drop table if exists `chapter`;
create table `chapter` (
    `id` char(8) not null comment 'id'
    `course_id` char(8) comment '课程ID',
    `name` varchar(50) comment '名称',
    primary key (`id`)
) engine=innodb default charset=utf8mb4 comment='大章';

drop table if exists section;
create table section (
    `id` char(8) not null default '' comment 'ID',
    `title` varchar(50) not null comment '标题',
    `course_id` char(8) comment '课程ID',
    `chapter_id` char(8) comment '大章ID',
    `video` varchar(200) comment '视频',
    `time` int comment '时长|单位秒',
    `charge` char(1) comment '收费|C 收费;F 免费',
    `sort` int comment '顺序',
    `create_at` datetime(3) comment '创建时间',
    `updated_at` datetime(3) comment '修改时间',
    primary key (`id`)
) engine=InnoDB default charset=utf8mb4 comment='小节';


drop table if exists course;
create table course (
    id char(8) not null default '' comment 'id',
    name varchar(50) not null comment '名称',
    summary varchar(2000) comment '概述',
    time int default 0 comment '时长|单位秒',
    price decimal(8,2) not null default 0.00 comment '价格（元）',
    image varchar(100) comment '封面',
    level char(1) not null comment '级别|ONE(1,初级),TWO(2,中级),THREE(3,高级）',
    charge char(1) comment '收费|CHGRGE(C,收费),FREE(F,免费）',
    status char(1) comment '状态|PUBLISH(P,发布），DRAFT（D,草稿)',
    enroll integer default 0 comment '报名数',
    sort int comment '顺序',
    create_at datetime(3) comment '创建时间',
    updated_at datetime(3) comment '修改时间',
    primary key (id)
) engine=innodb default charset=utf8mb4 comment='课程表';