package org.cores.Materiekern.Controller.PossessionController;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Describe: 这个是隶属于possession 单元的 controller
 * 这个possession 单元主要目的是管理我自己所拥有的一系列物品，由于无法精确到我所拥有的所有的物品
 * 因此需要把最主要的物品列出来，具体来说将所有的物品分了重要等级、类别、过期时间等，比如说某个东西是可以抛弃的、可替代的等等
 */
@RestController
@RequestMapping("/possession")
public class MyPossessionController {
    //这种标注非常不好看
    //我的初心是如何把我的东西统计起来，然后进行分类，这是我所想达到的目的，为了把我的这些东西全都整理好，
//    必须先进行一个分类的操作，实际上分类是一个很难进行的操作，因为类别之间无法进行一个严格的区分，尤其是一个物品可能属于多个类别

//    对于一个物品，是一个object，应当设立如下属性：
//    1.  name 名字
//    2. imgShots 图片 这里是一个图片列表 用shot 代表是一个快照    存储的时候不用放在物品表里 而是放在文件信息表 用一个 allmachtid 和 文件类型关联起来 去耦合
//    3. describe 描述 简要描述一下它的作用
//    4. validStartTime   这个物品发挥作用的开始时间、如生产时间
//    5. validEndTime     这个物品失去效用的时间、如食物的过期时间（在插入时需要估计一下）
//    6、 type   所属类别 很重要 因为需要分类整理
//    7、 possessionId 物品的唯一id 用雪花算法生成 同时保留和区分数据库的主键
//    8、 domain 这个物品在哪一个仓库，也就是说所有的物品都属于一个总仓库，而比如说我现在在工作，那么我工作时候有一个工作仓库
//    9、有效位
//    10、 更新时间
//    11、价值
//    12、source 来源 用字符串

//    -----------------物品类别--------------------------
//    1. 衣服、床上用品  穿着用品 主要指衣服、裤子、床单、被子这些棉织品

//      2. 电子产品： 手机、电脑、充电线、插板、数据线等
//    3. 钝器工具类，比如螺丝刀、钳子，这里的工具是非食用品，通常为钝器。
//    4. 小型工具类，比如小刀、指甲剪等小型的工具
//    5. supplyments ,包括一些补充性的，如spirulina powder
//    6.
}
