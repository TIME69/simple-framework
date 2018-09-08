package com.github.time69.simple_springmvc;

/**
 * 描述: 解析器接口
 *
 * @author <a href="1348555156@qq.com">LeiLi.Zhang</a>
 * @version 0.0.0
 * @date 2018/9/6
 */
public interface Resolver {
    /**
     * 返回顺序号，顺序号用户标识其加载顺序
     * @return
     */
    int getOrder();
}
