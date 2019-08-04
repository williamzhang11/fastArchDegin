# UML类图与类关系详解

类图是面向对象系统建模中最常用和最重要的图.主要用来显示系统中类,接口以及
它们之间静态结构和关系的一种静态模型.类图中理清类与类之间关系是重点.

类关系有:

泛化(Generalization),继承

实现(Realization),接口实现

依赖(Dependency)

关联(Association)

其中关联又分为聚合(Aggregation),组合(Composition)

![image](https://github.com/williamzhang11/fastArchDegin/blob/master/src/main/java/com/xiu/fastarchdegin/kafka/image/uml.png)

## 1.基本概念

类图的3个基本组件:类名,属性,方法
![image](https://github.com/williamzhang11/fastArchDegin/blob/master/src/main/java/com/xiu/fastarchdegin/kafka/image/class.png)

### 1.1 泛化

泛化:表示is-a关系,是对象之间耦合度最大的一种关系,子类继承父类的所有细节.即继承
类图中使用带三角箭头的实线表示,箭头从子类指向父类

![image](https://github.com/williamzhang11/fastArchDegin/blob/master/src/main/java/com/xiu/fastarchdegin/kafka/image/generalization.jpg)

### 1.2实现

类图中是接口和实现之间的关系.类图中使用带三角箭头的虚线表示,箭头从实现类指向接口.
![image](https://github.com/williamzhang11/fastArchDegin/blob/master/src/main/java/com/xiu/fastarchdegin/kafka/image/realization.jpg)

### 1.3依赖

依赖是对象间最弱的一种关联方式,是临时性的关联.代码中一般指由局部变量,函数参数,返回值建立的对于其他对象的调用关系
.一个类调用被依赖类中的某些方法而得以完成这个类的一些职责.在类图使用带箭头的虚线表示,箭头从使用类指向被依赖类.

![image](https://github.com/williamzhang11/fastArchDegin/blob/master/src/main/java/com/xiu/fastarchdegin/kafka/image/dependency.jpg)

### 1.4关联

对象之间一种引用关系,如客户类和订单类之间的关系.这种关系通常使用类的属性表达.
关联又分为一般关联,
聚合关联,
组合关联.类图使用带箭头的实线表示,箭头从使用类指向被关联类.


![image](https://github.com/williamzhang11/fastArchDegin/blob/master/src/main/java/com/xiu/fastarchdegin/kafka/image/association.jpg)

### 1.5 聚合

聚合:表示has-a关系,一种不稳定的包含关系.有整体和局部关系,整体和局部可以独立存在.
类图上使用空心菱形表示,菱形从局部指向整体


![image](https://github.com/williamzhang11/fastArchDegin/blob/master/src/main/java/com/xiu/fastarchdegin/kafka/image/aggregation.jpg)

### 1.6 组合

表示contain-a关系,一种强包含关系.部分不能脱离整体存在.在类图使用实心的菱形表示,菱形从局部指向整体.

![image](https://github.com/williamzhang11/fastArchDegin/blob/master/src/main/java/com/xiu/fastarchdegin/kafka/image/composition.jpg)

### 1.7多重性

通常在关联,聚合,组合中使用.代表有多少个关联对象存在.如下图,一个割接通知可以关联
0到N个故障单.

![image](https://github.com/williamzhang11/fastArchDegin/blob/master/src/main/java/com/xiu/fastarchdegin/kafka/image/multiplicity.jpg)

### 聚合和组合的区别

1.聚合和组合的区别在于:聚合关系是has-a关系,组合关系是contains-a关系

2.聚合关系表示整体与部分关系比较弱,而组合比较强

3.聚合的整体和局部能够独立存在,组合的局部不能脱离整体存在











