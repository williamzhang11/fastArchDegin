# linux 5种IO模型

![image](https://github.com/williamzhang11/fastArchDegin/blob/master/src/main/java/com/xiu/fastarchdegin/image/iodiff.JPG)


## 1.阻塞iO(Blocking io)

![image](https://github.com/williamzhang11/fastArchDegin/blob/master/src/main/java/com/xiu/fastarchdegin/image/blockingio.JPG)

默认情况下socket是blocking.

当用户进程read时,kernel开始IO的第一阶段:准备数据.对于network io来说,很多
时候数据一开始还没到达,这个时候kernel要等待足够的数据到来.在用户进程这边,进程被阻塞.当kernel
一直等到数据准备好,会将数据从kernel中拷贝到用户内存.然后kernel返回结果,用户进程解除block状态.

blocking IO的特点就是在IO执行的两个阶段都被block了


## 2.非阻塞式IO

非阻塞IO流程是这样的

![image](https://github.com/williamzhang11/fastArchDegin/blob/master/src/main/java/com/xiu/fastarchdegin/image/noblockingio.JPG)

当用户进程发出read操作时,如果kernel中的数据没准备好,它不会block用户进程,而是立刻返回一个error.
用户进程判断结果是一个error时,就知道数据还没准备好,它可以再次发送read操作.一旦kernel中的数据
准备好,并且再次收到用户进程的read,kernel将数据拷贝到用户内存,然后返回

用户进程需要不断主动询问kernel数据好了没有.

## 3. IO多路复用(IO multiplexing)

有时候也称事件驱动IO,


![image](https://github.com/williamzhang11/fastArchDegin/blob/master/src/main/java/com/xiu/fastarchdegin/image/iomultiplexing.JPG)

用户进程调用了select,整个进程会被block,kernel会监视所有select负责的socket,当任何一个socket中
的数据准备好,select会返回.

io多路复用与阻塞式io的最大区别是,io多路复用调用2个系统调用(select和recvform) 而阻塞IO只调用
一个系统调用(recvform).但select的优势在于能同时处理多个connection

select/epoll的优势并不是对于单个连接能处理得更快，而是在于能处理更多的连接

## 4.信号驱动式I/O

![image](https://github.com/williamzhang11/fastArchDegin/blob/master/src/main/java/com/xiu/fastarchdegin/image/sinio.JPG)

## 5.异步IO


![image](https://github.com/williamzhang11/fastArchDegin/blob/master/src/main/java/com/xiu/fastarchdegin/image/ayncio.JPG)

用户进程发起read操作后,立刻可以开始做其他事.另一方面,从kernel角度,当它受到一个异步读后,首先会立刻返回,不会对
用户进程产生任何block,然后kernel等数据准备完成,然后将数据拷贝到用户内存,当这一切都 完成之后，
kernel会给用户进程发送一个signal，告诉它read操作完成了.在这整个过程中，进程完全没有被block。

其实前四种I/O模型都是同步I/O操作，他们的区别在于第一阶段，而他们的第二阶段是一样的：
在数据从内核复制到应用缓冲区期间（用户空间），进程阻塞于recvfrom调用。 

















