package w31;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    public /* synthetic */ a(i iVar, int i) {
        this.a = i;
        this.b = iVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.f();
                break;
            case 1:
                this.b.g();
                break;
            case 2:
                this.b.f();
                break;
            default:
                this.b.g();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                i iVar = this.b;
                j jVar = iVar.j;
                int i = iVar.c;
                int i2 = iVar.a;
                jVar.b(i - i2, i2);
                break;
            case 2:
                i iVar2 = this.b;
                iVar2.j.a(iVar2.b);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ a(i iVar, int i, int i2) {
        this.a = i2;
        this.b = iVar;
    }
}
