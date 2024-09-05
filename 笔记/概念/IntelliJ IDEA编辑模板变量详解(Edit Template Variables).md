![gmzr](../Source/展示图片/gmzr.png)
### 函数及描述

| 函数                                                | 描述                                                                                                                                                         |
| ------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `annotated("annotation qname")`                   | 使用驻留在指定位置的注释创建类型符号。例如，请参见迭代组中的活动模板。                                                                                                                        |
| `anonymousSuper()`                                | 为 Kotlin 对象表达式建议一个超类型。                                                                                                                                     |
| `arrayVariable()`                                 | 建议当前作用域中适用的所有数组变量。例如，请参见迭代组中的活动模板。                                                                                                                         |
| `blockCommentEnd`                                 | 返回在当前语言上下文中指示块注释结束的字符。                                                                                                                                     |
| `blockCommentStart`                               | 返回在当前语言上下文中指示块注释开始的字符。                                                                                                                                     |
| `camelCase(String)`                               | 将字符串转换为 camelCase。例如，`camelCase(my-text-file)`、`camelCase(my text file)` 和 `camelCase(my_text_file)` 都返回 `myTextFile`。                                     |
| `capitalize(String)`                              | 将参数的第一个字母大写。                                                                                                                                               |
| `capitalizeAndUnderscore(sCamelCaseName)`         | 将作为参数传递的 CamelCase 名称的所有字母大写，并在各部分之间插入下划线。例如，`capitalizeAndUnderscore(FooBar)` 返回 `FOO_BAR`。                                                               |
| `castToLeftSideType()`                            | 将右侧表达式转换为左侧表达式类型。在迭代组中，它使用一个模板来生成原始类型和泛型集合。                                                                                                                |
| `className()`                                     | 返回当前类的名称（展开模板的类）。                                                                                                                                          |
| `classNameComplete()`                             | 这个表达式替代了变量位置上的类名补全。                                                                                                                                        |
| `clipboard()`                                     | 返回系统剪贴板的内容。                                                                                                                                                |
| `commentEnd()`                                    | 返回指示当前语言上下文中注释结尾的字符。如果行注释是用当前语言定义的，则返回值为空。                                                                                                                 |
| `commentStart()`                                  | 返回指示当前语言上下文中注释开头的字符。如果行注释是用当前语言定义的，则它们的开始指示符更好。                                                                                                            |
| `complete()`                                      | 在变量的位置调用代码完成。                                                                                                                                              |
| `completeSmart()`                                 | 在变量的位置调用智能类型完成。                                                                                                                                            |
| `componentTypeOf()`                               | 返回数组的组件类型。有关示例，请参见迭代组和其他组中的活动模板。                                                                                                                           |
| `concat(expressions…)`                            | 返回作为参数传递给函数的所有字符串的串联。                                                                                                                                      |
| `currentPackage()`                                | 返回当前包名称。                                                                                                                                                   |
| `date(sDate)`                                     | 如果没有参数，则以默认系统格式返回当前日期。                                                                                                                                     |
| `decapitalize(sName)`                             | 将参数的第一个字母替换为相应的小写字母。                                                                                                                                       |
| `descendantClassEnum()`                           | 返回指定为字符串参数的类的子级。                                                                                                                                           |
| `enum(sCompletionString1, sCompletionString2, …)` | 返回在扩展模板时建议完成的逗号分隔字符串列表。                                                                                                                                    |
| `escapeString(sEscapeString)`                     | 转义指定为参数的字符串。                                                                                                                                               |
| `expectedType()`                                  | 返回模板扩展到的表达式的预期类型。如果模板在赋值的右部分、返回后等展开，则很有意义。                                                                                                                 |
| `fileName()`                                      | 返回当前文件的名称及其扩展名。                                                                                                                                            |
| `fileNameWithoutExtension()`                      | 返回不带扩展名的当前文件的名称。                                                                                                                                           |
| `firstWord(sFirstWord)`                           | 返回作为参数传递的字符串的第一个字。                                                                                                                                         |
| `groovyScript("groovy code", arg1)`               | 返回具有指定代码的 Groovy 脚本。可以将 `groovyScript()` 函数与多个参数一起使用。第一个参数是所执行脚本的文本或包含脚本的文件的路径。下一个参数绑定到脚本中可用的 `_1`、`_2`、`_3`、…`_n` 变量。此外，脚本中还提供了 `_editor` 变量。此变量绑定到当前编辑器。 |
| `guessElementType()`                              | 猜测 `java.util.Collection` 中存储的元素类型。为了猜测，IntelliJ IDEA 试图找到元素添加到容器或从容器中提取的位置。                                                                               |
| `iterableComponentType()`                         | 返回可迭代组件的类型，如数组或集合。                                                                                                                                         |
| `iterableVariable()`                              | 返回可迭代的变量的名称。                                                                                                                                               |
| `JsArrayVariable()`                               | 返回当前 JavaScript 数组的名称。                                                                                                                                     |
| `jsClassName()`                                   | 返回当前 JavaScript 类的名称。                                                                                                                                      |
| `jsComponentTypeOf()`                             | 返回当前 JavaScript 组件的类型。                                                                                                                                     |
| `jsDefineParameter`                               | 基于模块的名称，返回参数 `fromDefine(["module"], function(<parameter_in_question>)`。                                                                                   |
| `jsMethodName()`                                  | 返回当前 JavaScript 方法的名称。                                                                                                                                     |
| `jsQualifiedClassName()`                          | 返回当前 JavaScript 类的完整名称。                                                                                                                                    |
| `jsSuggestIndexName()`                            | 返回最常用的索引变量的建议名称：`i`、`j`、`k` 等。当前作用域中尚未使用的名称将首先显示。                                                                                                          |
| `jsSuggestVariableName()`                         | 根据引用变量命名规则的代码样式设置，基于变量类型和初始值设定项表达式返回变量的建议名称。例如，如果它是一个在迭代中保存元素的变量，那么 IntelliJ IDEA 会猜测最合理的名称，并考虑到被迭代的容器的名称。                                                 |
| `jsSuggestDefaultVariableKind(Boolean)`           | 布尔参数确定当前上下文中是否允许常量。如果未指定参数，则允许使用常量。当模板展开时，将显示一个下拉列表，其中包含 TypeScript 和 ES6 的 `var`、`let` 和 `const` 选项，以及早期 JavaScript 版本的一个 `var` 选项。                       |
| `jsSuggestImportedEntityName()`                   | 根据文件名，将 `import` 类型的 import 语句的名称建议为 `from ""` 或 `import from ""`。                                                                                         |
| `lineCommentStart`                                | 返回在当前语言上下文中指示行注释开头的字符。                                                                                                                                     |
| `lineNumber()`                                    | 返回当前行号。                                                                                                                                                    |
| `lowercaseAndDash(String)`                        | 将 camelcase 字符串转换为小写，并插入破折号作为分隔符。例如，`lowercaseAndDash(MyExampleName)` 返回 `my-example-name`。                                                                |
| `methodName()`                                    | 返回展开模板的方法的名称。                                                                                                                                              |
| `methodParameters()`                              | 返回展开模板的方法的参数列表。                                                                                                                                            |
| `methodReturnType()`                              | 返回当前方法返回的值的类型（模板在其中展开）。                                                                                                                                    |
| `qualifiedClassName()`                            | 返回当前类的完全限定名（在其中展开模板）。                                                                                                                                      |
| `rightSideType()`                                 | 用右侧表达式的类型声明左侧变量。在迭代组中，它使用一个模板来生成原始类型和泛型集合。                                                                                                                 |
| `snakeCase(String)`                               | 将字符串转换为蛇形大小写。例如，`snakeCase(foo bar)` 返回 `foo_bar`。                                                                                                         |
| `spaceSeparated(String)`                          | 将字符串转换为小写并插入空格作为分隔符。例如，`spaceSeparated(foo bar)` 返回 `foo bar`。                                                                                             |
| `substringBefore(String, Delimiter)`              | 删除指定分隔符后的扩展名并仅返回文件名。这有助于测试文件名。例如，`substringBefore(".", "component_test.js")` 返回 `component_test`。                                                          |
| `subtypes(sType)`                                 | 返回作为参数传递的类型的子类型。                                                                                                                                           |
| `suggestFirstVariableName(sFirstVariableName)`    | 不代表真的、假的、这个、超级的。                                                                                                                                           |
| `suggestIndexName()`                              | 建议使用最常用的索引变量的名称：`i`、`j`、`k` 等（第一个不在当前范围内使用的变量）。                                                                                                            |
| `suggestVariableName()`                           | 根据引用变量命名规则的代码样式设置，基于变量类型及其初始值设定项表达式建议变量的名称。例如，如果它是一个在迭代中保存元素的变量，那么 IntelliJ IDEA 会猜测最合理的名称，并考虑到要迭代的容器的名称。                                                  |
| `time(sSystemTime)`                               | 以指定格式返回当前系统时间。                                                                                                                                             |
| `typeOfVariable(VAR)`                             | 返回作为参数传递的                                                                                                                                                  |
| `underscoresToCamelCase(String)`                  | 用作为参数传递的字符串中的 camelcase 字母替换下划线。例如，`underscoresToCamelCase(foo_bar)` 返回 `fooBar`。                                                                          |
| `underscoresToSpaces(sParameterWithUnderscores)`  | 用作为参数传递的字符串中的空格替换下划线。例如，`underscoresToSpaces(foo_bar)` 返回 `foo bar`。                                                                                       |
| `user()`                                          | 返回当前用户的名称。变量的类型。                                                                                                                                           |
| `variableOfType()`                                | 建议可以分配给作为参数传递的类型的所有变量。例如，`variableOfType("java.util.Vector")`。如果传递一个空字符串（""）作为参数，那么函数将建议所有变量，而不管其类型如何。                                                     |

| 函数                        | 描述                                                            |
|-----------------------------|-----------------------------------------------------------------|
| `${PACKAGE_NAME}`           | 将在其中创建新类或接口的目标包的名称。                          |
| `${PROJECT_NAME}`           | 当前项目的名称。                                                |
| `${FILE_NAME}`              | 将创建的 PHP 文件的名称。                                        |
| `${NAME}`                   | 您在创建文件期间在“新建文件”对话框中指定的新文件的名称。          |
| `${USER}`                   | 当前用户的登录名。                                              |
| `${DATE}`                   | 当前系统日期。                                                  |
| `${TIME}`                   | 当前系统时间。                                                  |
| `${YEAR}`                   | 当前年份。                                                      |
| `${MONTH}`                  | 当前月份。                                                      |
| `${DAY}`                    | 该月的当前日期。                                                |
| `${HOUR}`                   | 当前小时。                                                      |
| `${MINUTE}`                 | 当前分钟。                                                      |
| `${PRODUCT_NAME}`           | 将在其中创建文件的 IDE 的名称。                                 |
| `${MONTH_NAME_SHORT}`       | 月份名称的前 3 个字母。例如：一月、二月等。                      |
| `${MONTH_NAME_FULL}`        | 月份的全名。例如：一月、二月等。                                |
