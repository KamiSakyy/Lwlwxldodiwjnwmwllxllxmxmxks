package d31;

import android.animation.ValueAnimator;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;
import l7.p;
import l7.u;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u31.j jVar = ((BottomSheetBehavior) this.b).j;
                if (jVar != null) {
                    jVar.r(floatValue);
                    break;
                }
                break;
            case 1:
                int floatValue2 = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                p pVar = (p) this.b;
                pVar.c.setAlpha(floatValue2);
                pVar.d.setAlpha(floatValue2);
                pVar.s.invalidate();
                break;
            case 2:
                ((u) this.b).m = valueAnimator.getAnimatedFraction();
                break;
            case 3:
                ((TabLayout) this.b).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                break;
            case 4:
                ((TextInputLayout) this.b).N0.A(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                ((CollapsingToolbarLayout) this.b).setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
        }
    }
}
