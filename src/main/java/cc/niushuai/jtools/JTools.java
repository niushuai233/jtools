/*
 * Copyright (C) 2023 niushuai233 niushuai.cc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cc.niushuai.jtools;

import cn.hutool.core.lang.ConsoleTable;
import cn.hutool.core.util.ClassUtil;
import cn.hutool.core.util.StrUtil;

import java.util.Set;

/**
 * <p>
 * JTools 自封装工具类
 * </p>
 * <p>
 * 主要基于hutool类库 + 个人习惯而成
 * </p>
 *
 * @author niushuai233
 * @date 2023/1/5 15:54
 * @since 0.0.1
 */
public class JTools {

    /**
     * 作者
     */
    public static final String AUTHOR = "niushuai233";

    /**
     * 该项目root包
     */
    public static final String ROOT_PACKAGE_NAME = "cc.niushuai.jtools";

    /**
     * 标识工具类 该项目约定所有的工具类以Util结尾
     */
    public static final String UTIL = "Util";

    private JTools() {
    }

    /**
     * 显示所有的JTools工具类
     *
     * @return 所有工具类的Class
     * @author niushuai233
     * @date 2023/1/5 16:08
     * @since 0.0.1
     */
    public static Set<Class<?>> getAllUtils() {
        return ClassUtil.scanPackage(ROOT_PACKAGE_NAME, (clazz) -> !clazz.isInterface() && StrUtil.endWith(clazz.getSimpleName(), UTIL));
    }

    /**
     * 控制台输出所有的JTools工具类
     *
     * @author niushuai233
     * @date 2023/1/5 16:11
     * @since 0.0.1
     */
    public static void printAllUtils() {
        Set<Class<?>> allUtils = getAllUtils();
        ConsoleTable consoleTable = ConsoleTable.create().addHeader("工具类名", "所在包");
        allUtils.forEach(item -> consoleTable.addBody(item.getSimpleName(), item.getPackage().getName()));
        consoleTable.print();
    }
}
