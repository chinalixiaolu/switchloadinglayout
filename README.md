# switchloadinglayout
loading error empty 状态切换

开始使用

DefaultLoadingLayout defaultLayout = SwitchLoadingLayout.createDefaultLayout （this, "目标布局");
defaultLayout.onDone(); //完成状态
defaultLayout.onEmpty(); //空状态
defaultLayout.onError();  //错误状态
defaultLayout.onLoading(); //加载中状态


还提供其他api让使用者自定义加载的布局大小 字体颜色 字体大小


How to
To get a Git project into your build:
    Step 1. Add the JitPack repository to your build file
       allprojects {
            repositories {
                ...
                maven { url 'https://jitpack.io' }
            }
        }
    
    Step 2. Add the dependency
    
    dependencies {
	        implementation 'com.github.chinalixiaolu:switchloadinglayout:Tag'
	}
