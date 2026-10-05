package s9;

import android.view.ViewTreeObserver;
import w61.a0;

/* loaded from: /home/user/work/p/classes.dex */
public final class j implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f f31780r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver f31781s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k f31782t;

    public j(f fVar, ViewTreeObserver viewTreeObserver, k kVar) {
        this.f31780r = fVar;
        this.f31781s = viewTreeObserver;
        this.f31782t = kVar;
    }

    public final Object k(Object obj) {
        ViewTreeObserver viewTreeObserver = this.f31781s;
        boolean isAlive = viewTreeObserver.isAlive();
        k kVar = this.f31782t;
        if (isAlive) {
            viewTreeObserver.removeOnPreDrawListener(kVar);
        } else {
            this.f31780r.f31773r.getViewTreeObserver().removeOnPreDrawListener(kVar);
        }
        return a0.a;
    }
}
