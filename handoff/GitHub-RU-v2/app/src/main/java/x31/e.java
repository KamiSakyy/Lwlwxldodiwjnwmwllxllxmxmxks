package x31;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ View b;
    public final /* synthetic */ f c;

    public e(f fVar, View view, View view2) {
        this.c = fVar;
        this.a = view;
        this.b = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.c.c(this.a, this.b, valueAnimator.getAnimatedFraction());
    }
}
