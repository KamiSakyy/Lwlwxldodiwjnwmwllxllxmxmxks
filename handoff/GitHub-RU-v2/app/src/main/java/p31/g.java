package p31;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ h c;

    public g(h hVar, boolean z, int i) {
        this.c = hVar;
        this.a = z;
        this.b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h hVar = this.c;
        hVar.b.setTranslationX(0.0f);
        hVar.a(0.0f, this.b, this.a);
    }
}
