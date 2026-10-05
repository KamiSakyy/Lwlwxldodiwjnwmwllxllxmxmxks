package w31;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import o31.p;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d implements Runnable {
    public final /* synthetic */ int r;
    public final /* synthetic */ i s;

    public /* synthetic */ d(i iVar, int i) {
        this.r = i;
        this.s = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        Rect rect;
        int i = this.r;
        i iVar = this.s;
        switch (i) {
            case 0:
                h hVar = iVar.i;
                if (hVar != null && (context = iVar.h) != null) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (Build.VERSION.SDK_INT >= 30) {
                        rect = p.a(windowManager);
                    } else {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        Point point = new Point();
                        defaultDisplay.getRealSize(point);
                        rect = new Rect();
                        rect.right = point.x;
                        rect.bottom = point.y;
                    }
                    int height = rect.height();
                    int[] iArr = new int[2];
                    hVar.getLocationInWindow(iArr);
                    int height2 = (height - (hVar.getHeight() + iArr[1])) + ((int) hVar.getTranslationY());
                    int i2 = iVar.s;
                    if (height2 < i2) {
                        ViewGroup.LayoutParams layoutParams = hVar.getLayoutParams();
                        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                            p6.a aVar = i.x;
                            break;
                        } else {
                            int i3 = iVar.s;
                            iVar.t = i3;
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.bottomMargin = (i3 - height2) + marginLayoutParams.bottomMargin;
                            hVar.requestLayout();
                            break;
                        }
                    } else {
                        iVar.t = i2;
                        break;
                    }
                }
                break;
            case 1:
                iVar.f();
                break;
            default:
                h hVar2 = iVar.i;
                if (hVar2 != null) {
                    if (hVar2.getParent() != null) {
                        hVar2.setVisibility(0);
                    }
                    if (hVar2.getAnimationMode() != 1) {
                        int height3 = hVar2.getHeight();
                        ViewGroup.LayoutParams layoutParams2 = hVar2.getLayoutParams();
                        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                            height3 += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                        }
                        hVar2.setTranslationY(height3);
                        ValueAnimator valueAnimator = new ValueAnimator();
                        valueAnimator.setIntValues(height3, 0);
                        valueAnimator.setInterpolator(iVar.e);
                        valueAnimator.setDuration(iVar.c);
                        valueAnimator.addListener(new a(iVar, 1));
                        valueAnimator.addUpdateListener(new b(iVar, 2));
                        valueAnimator.start();
                        break;
                    } else {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.setInterpolator(iVar.d);
                        ofFloat.addUpdateListener(new b(iVar, 0));
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
                        ofFloat2.setInterpolator(iVar.f);
                        ofFloat2.addUpdateListener(new b(iVar, 1));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ofFloat, ofFloat2);
                        animatorSet.setDuration(iVar.a);
                        animatorSet.addListener(new a(iVar, 3));
                        animatorSet.start();
                        break;
                    }
                }
                break;
        }
    }
}
