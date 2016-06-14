# [jjdxmperiscope][project] #

## Introduction ##

### 点赞功能 ###
现在视频应用越来越火,Periscope火起来后,国内也出现了不少跟风者,界面几乎跟Periscope一模一样.Periscope确实不错,点赞的效果也让人眼前一亮,很漂亮.

[apk下载][downapk]
## Features ##
1.爱心出现在底部并且水平居中

2.爱心的颜色/类型 随机

3.爱心进入时候有一个缩放的动画

4.缩放完毕后,开始变速向上移动,并且伴随alpha渐变效果

5.爱心移动的轨迹光滑,是个曲线
## Screenshots ##

<img src="https://github.com/jjdxmashl/jjdxmperiscope/blob/master/screenshots/icon01.png" width="300"> 
<img src="https://github.com/jjdxmashl/jjdxmperiscope/blob/master/screenshots/icon02.png" width="300"> 

## Get Started ##
### 具体实现 ###
1.自定义view的一些基础方法以及一些注意点

2.随机数的使用

3.插补器的使用

4.属性动画的高级用法

5.贝塞尔曲线在Android中的实现以及应用

### 使用 ###
1.在布局中使用，相当于RelativeLayout布局的使用

	<com.dou361.periscope.FavorLayout
        android:id="@+id/fl_view"
        xmlns:favor="http://schemas.android.com/apk/res-auto"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="@color/bg"
        favor:drawables="@array/ivs"/>

随机出现的图片数组

	<!-- 随机图片数组 -->
    <integer-array name="ivs">
        <item>@mipmap/red</item>
        <item>@mipmap/yellow</item>
        <item>@mipmap/blue</item>
    </integer-array>

2.findview之后调用即可例如：


    	private FavorLayout fl_view;

        fl_view = (FavorLayout) findViewById(R.id.fl_view);

	 	@Override
	    public void onClick(View v) {
	        fl_view.addFavor();
	    }

## More Actions ##

## ChangeLog ##

## About Author ##

#### 个人网站:[http://www.dou361.com][web] ####
#### GitHub:[jjdxmashl][github] ####
#### QQ:316988670 ####
#### 交流QQ群:548545202 ####


## License ##

    Copyright (C) dou361, The Framework Open Source Project
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
     	http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

## (Frequently Asked Questions)FAQ ##
## Bugs Report and Help ##

If you find any bug when using project, please report [here][issues]. Thanks for helping us building a better one.



[web]:http://www.dou361.com
[github]:https://github.com/jjdxmashl/
[project]:https://github.com/jjdxmashl/jjdxmperiscope/
[issues]:https://github.com/jjdxmashl/jjdxmperiscope/issues/new
[downapk]:https://github.com/jjdxmashl/jjdxmperiscope/blob/master/apk/app-debug.apk
[icon01]:https://github.com/jjdxmashl/jjdxmperiscope/blob/master/screenshots/icon01.png
[icon02]:https://github.com/jjdxmashl/jjdxmperiscope/blob/master/screenshots/icon02.png
