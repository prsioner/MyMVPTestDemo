# MyMVPTestDemo
android mvp设计模式
1.MVP模式中包含以下四个元素：

    (1)View:负责绘制UI元素、与用户进行交互(在Android中体现为Activity);


    (2)View interface:需要View实现的接口，View通过View interface与Presenter进行交互，降低耦合，方便进行单元测试;


    (3)Model:负责存储、检索、操纵数据(有时也实现一个Model interface用来降低耦合);


    (4)Presenter:作为View与Model交互的中间纽带，处理与用户交互的负责逻辑。

注意：1.View不直接与Model交互，而是通过与Presenter交互来与Model间接交互

      2.通常View与Presenter是一对一的，但复杂的View可能绑定多个Presenter来处理逻辑

2.写个简单MVP获取用户信息并显示的demo

    功能设计：

    1.view ：获取用户的输入，并在点show 按键时显示出来，由此ye定义出view 接口该有什么方法

    2.model ：Presenter传递进来的用户数据进行存储，在调用时取出来，由此也定义出model 接口该有什么方法

    3.presenter:桥梁作用，通过接口与View及Model进行交互,完成功能.


