# JTools ==> Java开发工具库

===========================================================================

[![License](http://img.shields.io/:license-apache-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.html) ![JDK 1.8](https://img.shields.io/badge/JDK-1.8-green.svg "JDK 1.8")



### :notebook:简介

  JTools 目标是基于 [hutool](https://github.com/dromara/hutool) 工具包二次封装为符合作者个人编码习惯的类库，可能对于通用性的考虑上有所欠缺。



### :package:安装

##### 直接安装

```bash
git clone https://github.com/niushuai233/jtools.git
cd jtools
mvn install
```

##### Maven配置

```XML
<dependency>
	<groupId>cc.niushuai</groupId>
	<artifactId>jtools</artifactId>
	<version>${central.version}</version>
</dependency>
```

**注意:**

- JTools 需要 JDK 8+，不能保证所有工具类或工具方法在其他版本可用.
- 如果您的版本在8之下，那么请知悉该工具并不适用您的项目.



### :straight_ruler: 版本对应关系

| jtools | hutool-core |
| ------ | ----------- |
| 0.0.1  | 5.8.11      |
| ...    |             |


### :credit_card: LICENSE

  基于 [Apache License 2](https://www.apache.org/licenses/LICENSE-2.0) 协议, 您可以下载代码用于闭源项目,但每个修改的过的文件必须放置版权说明。

