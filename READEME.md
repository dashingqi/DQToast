## DQToast

#### Activity

###### DecorView

###### ContentView

#### Application

###### Window

#### 适配

###### 需要悬浮权限
- 直接降级使用系统的Toast

###### Android11适配
- 针对处于后台要弹出Toast --> 直接降级使用系统的Toast

###### 工厂模式
- 使用工厂模式构建不通的View


#### 需要关注的点
- 内存泄漏 （传进的Context）
- 本次弹窗要取消上次弹窗