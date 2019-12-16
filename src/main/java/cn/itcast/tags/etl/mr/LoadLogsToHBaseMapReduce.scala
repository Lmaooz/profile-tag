package cn.itcast.tags.etl.mr

/*
    
    需求:
    
    分析:    
    
    2019/12/16
    
*/
/**
  * 将hive表数据转换为HFile文件
  *
  *
  * 1.从hive读取数据
  *     输入的路径   input :文本数据
  *
  * 2.输出数据
  *     输出的路径   output： 输出到HFile文件
  *
  * Hbase表的名称
  */
class LoadLogsToHBaseMapReduce {


  /**
    * 定义map类 读取tsv数据
    *     map
    *       按照分隔符进行分割数据  分隔符为 制表符
    *
    *
    */
}
