package p31;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f extends a {
    public float g;
    public float h;

    public f(View view) {
        super(view);
        Resources resources = view.getResources();
        this.g = resources.getDimension(2131165423);
        this.h = resources.getDimension(2131165424);
    }

    public final AnimatorSet a() {
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new p6.a(1));
        return animatorSet;
    }

    public final void b(float f) {
        float interpolation = this.a.getInterpolation(f);
        View view = this.b;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width <= 0.0f || height <= 0.0f) {
            return;
        }
        float f2 = this.g / width;
        float f3 = this.h / height;
        float a = 1.0f - y21.a.a(0.0f, f2, interpolation);
        float a2 = 1.0f - y21.a.a(0.0f, f3, interpolation);
        if (Float.isNaN(a) || Float.isNaN(a2)) {
            return;
        }
        view.setScaleX(a);
        view.setPivotY(height);
        view.setScaleY(a2);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(a2 != 0.0f ? a / a2 : 1.0f);
            }
        }
    }
}
