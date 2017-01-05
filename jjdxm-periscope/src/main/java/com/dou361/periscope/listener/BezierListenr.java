package com.dou361.periscope.listener;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.graphics.PointF;
import android.os.Build;
import android.view.View;

/**
 * 动画贝塞尔曲线移动监听
 */
@TargetApi(Build.VERSION_CODES.HONEYCOMB_MR1)
public class BezierListenr implements ValueAnimator.AnimatorUpdateListener {

    private View target;

    public BezierListenr(View target) {
        this.target = target;
    }

    @Override
    public void onAnimationUpdate(ValueAnimator animation) {
        //这里获取到贝塞尔曲线计算出来的的x y值 赋值给view 这样就能让爱心随着曲线走啦
        PointF pointF = (PointF) animation.getAnimatedValue();
        target.setX(pointF.x);
        target.setY(pointF.y);
        // 这里偷个懒,顺便做一个alpha动画,这样alpha渐变也完成啦
        target.setAlpha(1 - animation.getAnimatedFraction());
    }
}