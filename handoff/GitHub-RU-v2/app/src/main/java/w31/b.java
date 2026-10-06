package w31;

import android.animation.ValueAnimator;

/* loaded from: /home/user/work/p/classes4.dex */
public class b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    public /* synthetic */ b(i iVar, int i) {
        this.a = i;
        this.b = iVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i iVar = this.b;
                iVar.i.setScaleX(floatValue);
                iVar.i.setScaleY(floatValue);
                break;
            case 2:
                this.b.i.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            default:
                this.b.i.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
        }
    }
}
