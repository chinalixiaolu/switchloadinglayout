# switchloadinglayout
loading error empty 状态切换

//使用方式
 DefaultLoadingLayout defaultLayout = SwitchLoadingLayout.createDefaultLayout （this, "目标布局");
defaultLayout.onDone(); //完成状态
defaultLayout.onEmpty(); //空状态
defaultLayout.onError();  //错误状态
defaultLayout.onLoading(); //加载中状态

//还提供其他api让使用者自定义加载的布局大小 字体颜色 字体大小