### 完成度：
* 功能实现的比例达到了三分之二，小部分功能没有实现

__Details:__
- \- StudentController.java:14 缺少添加学员、获取分组等接口
- \- StudentController.java:35 自动分组应该是随机的，每次结果应该不一样

### 知识点：
* 了解下restful规范
* 如果不是特定的自定义返回结果，ResponseEntity可以省略
* 了解下@ResponseStatus的用法

__Details:__
- \- StudentsDataProvider.java:5 了解下Repository的概念
- \- StudentController.java:31 path一般不使用驼峰形式，使用中划线"-"连接
- \- StudentController.java:32 path中不包含动词

### 工程实践：
__Details:__
+ \+ StudentService.java:13 有提取Magic Number的意识
- \- StudentController.java:27 一般特定的业务异常场景，在service中进行throw
- \- StudentController.java:36 变量名需要使用驼峰形式
- \- StudentsResponse.java:13 删掉未使用的代码
- \- StudentService.java:14 常量名称一般是大写，组合词用"_"连接



