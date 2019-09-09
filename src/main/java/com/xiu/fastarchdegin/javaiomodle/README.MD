# java3种io模型

BIO、NIO和 AIO 是 Java 语言对操作系统的各种 IO 模型的封装

## 同步与异步

同步： 同步就是发起一个调用后，被调用者未处理完请求之前，调用不返回。

异步： 异步就是发起一个调用后，立刻得到被调用者的回应表示已接收到请求，但是被调用者并没有返回结果，此时我们可以处理其他的请求，被调
用者通常依靠事件，回调等机制来通知调用者其返回结果。

同步和异步的区别最大在于异步的话调用者不需要等待处理结果，被调用者会通过回调等机制来通知调用者其返回结果。


## 阻塞和非阻塞

阻塞： 阻塞就是发起一个请求，调用者一直等待请求结果返回，也就是当前线程会被挂起，无法从事其他任务，只有当条件就绪才能继续。

非阻塞： 非阻塞就是发起一个请求，调用者不用一直等着结果返回，可以先去干其他事情。


## 1. BIO (Blocking I/O)

同步阻塞I/O模式，数据的读取写入必须阻塞在一个线程内等待其完成。

![image](https://github.com/williamzhang11/fastArchDegin/blob/master/src/main/java/com/xiu/fastarchdegin/kafka/image/bio.png)























































https://github.com/Snailclimb/JavaGuide/blob/master/docs/java/BIO-NIO-AIO.md