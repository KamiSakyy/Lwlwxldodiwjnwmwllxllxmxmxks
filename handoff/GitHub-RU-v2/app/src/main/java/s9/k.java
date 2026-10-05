package s9;

import android.view.ViewTreeObserver;
import v71.l;

/* loaded from: /home/user/work/p/classes.dex */
public final class k implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: r, reason: collision with root package name */
    public boolean f31783r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f31784s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver f31785t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ l f31786u;

    public k(f fVar, ViewTreeObserver viewTreeObserver, l lVar) {
        this.f31784s = fVar;
        this.f31785t = viewTreeObserver;
        this.f31786u = lVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        f fVar = this.f31784s;
        h b10 = fVar.b();
        if (b10 != null) {
            ViewTreeObserver viewTreeObserver = this.f31785t;
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            } else {
                fVar.f31773r.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            if (!this.f31783r) {
                this.f31783r = true;
                this.f31786u.i(b10);
            }
        }
        return true;
    }
}
