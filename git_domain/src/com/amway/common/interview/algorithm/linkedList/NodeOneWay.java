package com.amway.common.interview.algorithm.linkedList;

/**
 * 模拟单向链表
 * 
 * @author 宏宇
 * @editor Jan 23, 2012 7:55:21 PM
 * @see 
 *      ==========================================================================
 *      ========================
 * @see 【数据结构的分类：线性数据结构和非线性数据结构】
 * @see 1)线性数据结构，包含：线性表、栈、队列、串、数组、文件
 * @see 2)非线性数据结构，含：树、图
 * @see 
 *      ==========================================================================
 *      ========================
 * @see 【线性表的概述：其数据元素呈线性关系】
 * @see 1)线性表中的所有数据元素在同一个线性表中必须是相同的数据类型
 * @see 2)线性表中必存在唯一的称为"第一个"的数据元素，必存在唯一的称为"最后一个"的数据元素
 * @see 3)线性表中除第一个元素外，每个元素都有且只有一个前驱元素。除最后一个元素外，每个元素都有且只有一个后继元素
 * @see 4)线性表的逻辑结构是n个数据元素的有限序列(a1,a2,a3,...,an)，其中n为线性表的长度(n>=0)，n=0的表称为空表
 * @see 
 *      ==========================================================================
 *      ========================
 * @see 【线性表的分类：按其存储结构可分为顺序表和链表】
 * @see 1)顺序表：用顺序存储结构存储的线性表称为顺序表。即内存地址中的元素是按照循序连续存放的
 * @see 也可以说，将线性表中的数据元素依次存放在某个存储区域中，所形成的表称为顺序表
 * @see 一维数组就是用顺序方式存储的线性表，所以ArrayList可以看作是一种顺序表
 * @see 2)链表：用链式存储结构存储的线性表称为链表。即内存地址中的元素不是连续存放的
 * @see 
 *      ==========================================================================
 *      ========================
 * @see 【stack】
 * @see 栈(stack)也是一种特殊的线性表，是限定仅在表尾进行插入和删除运算的线性表
 * @see 栈的物理存储可以用顺序存储结构，也可以用链式存储结构
 * @see 栈是一种后进先出(LIFO)的结构，栈的表尾称为栈顶(top)，栈的表头称为栈底(bottom)
 * @see 
 *      ==========================================================================
 *      ========================
 * @see 【Queue】
 * @see 队列(Queue)是限定所有的插入只能在表的一端进行，而所有的删除都在表的另一端进行的线性表
 * @see 队列的物理存储可以用顺序存储结构，也可以用链式存储结构
 * @see 队列是一种先进先出(FIFO)的结构，其中允许插入的一端称为队尾(Rear)，允许删除的一端称为队头(Front)(有点像等公交车)
 * @see 
 *      ==========================================================================
 *      ========================
 */
public class NodeOneWay {
	String data; // 存放节点数据本身
	NodeOneWay next; // 存放指向后一个节点的引用

	public NodeOneWay() {
	}

	public NodeOneWay(String data) {
		this.data = data;
	}
}
