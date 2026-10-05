package a5;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.gms.measurement.internal.x3;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class j1 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f433a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f434b;

    public /* synthetic */ j1(int i, Object obj) {
        this.f433a = i;
        this.f434b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f433a) {
            case k5.f.J /* 0 */:
                ((View) ((k.k0) ((x3) this.f434b).s).f27491d.getParent()).invalidate();
                break;
            case 1:
                f31.c cVar = (f31.c) this.f434b;
                cVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cVar.j.setAlpha((int) (255.0f * floatValue));
                cVar.x = floatValue;
                break;
            default:
                y31.i iVar = (y31.i) this.f434b;
                iVar.getClass();
                ((y31.m) iVar).d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }

    public /* synthetic */ j1(x3 x3Var, View view) {
        this.f433a = 0;
        this.f434b = x3Var;
    }
}
