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

package cc.niushuai.jtools.core;

/**
 * 各种符号常量
 *
 * @author niushuai233
 * @date 2023/1/9 11:39
 * @since 0.0.1
 */
public interface Symbol {

    /**
     * 英文叹号 {@code '!’}
     */
    String EXCLAMATION_MARK_EN = "!";

    /**
     * 中文叹号 {@code '！’}
     */
    String EXCLAMATION_MARK_CN = "！";

    /**
     * @ 符号 {@code '@'}
     */
    String AT = "@";

    /**
     * #号 {@code '#'}
     */
    String SHARP = "#";

    /**
     * $号 {@code '$'}
     */
    String DOLLAR = "$";

    /**
     * %号 {@code '%'}
     */
    String PERCENT_SIGN = "%";

    /**
     * 非符号 {@code '^'}
     */
    String NON_SYMBOL = "^";

    /**
     * and 符号 {@code '&’}
     */
    String AMP = "&";

    /**
     * *符号 {@code '*’}
     */
    String STAR = "*";

    /**
     * 左括号 {@code '(’}
     */
    String LEFT_BRACKET = "(";

    /**
     * 右括号 {@code ')’}
     */
    String RIGHT_BRACKET = ")";

    /**
     * 左括号 中文 {@code '（’}
     */
    String LEFT_BRACKET_CN = "（";

    /**
     * 右括号 中文 {@code '）’}
     */
    String RIGHT_BRACKET_CN = "）";

    /**
     * 左括号 {@code '[’}
     */
    String LEFT_MID_BRACKET = "[";

    /**
     * 右括号 {@code ']’}
     */
    String RIGHT_MID_BRACKET = "]";

    /**
     * 左括号 {@code '【’}
     */
    String LEFT_MID_BRACKET_CN = "【";

    /**
     * 右括号 {@code '】’}
     */
    String RIGHT_MID_BRACKET_CN = "】";

    /**
     * 左括号 {@code '{'
     */
    String LEFT_BIG_BRACKET = "{";

    /**
     * 右括号 {@code '}’}
     */
    String RIGHT_BIG_BRACKET = "}";

    /**
     * 制表符
     */
    String TAB = "\t";
}
