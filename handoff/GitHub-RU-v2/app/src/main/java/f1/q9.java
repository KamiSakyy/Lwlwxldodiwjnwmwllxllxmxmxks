package f1;

import android.view.KeyEvent;

/* loaded from: /home/user/work/p/classes.dex */
public final class q9 implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f23615r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j71.c f23616s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ q71.d f23617t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f23618u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f23619v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ float f23620w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j71.a f23621x;

    public q9(boolean z10, j71.c cVar, q71.d dVar, int i, boolean z11, float f6, j71.a aVar) {
        this.f23615r = z10;
        this.f23616s = cVar;
        this.f23617t = dVar;
        this.f23618u = i;
        this.f23619v = z11;
        this.f23620w = f6;
        this.f23621x = aVar;
    }

    public final Object k(Object obj) {
        j71.c cVar;
        KeyEvent keyEvent = ((o2.b) obj).f29963a;
        q71.d dVar = this.f23617t;
        float f6 = dVar.f30995b;
        if (this.f23615r && (cVar = this.f23616s) != null) {
            int c10 = o2.c.c(keyEvent);
            boolean z10 = false;
            if (c10 != 2) {
                if (c10 == 1) {
                    long a10 = o2.c.a(keyEvent.getKeyCode());
                    if (o2.a.a(a10, o2.a.f29943d) || o2.a.a(a10, o2.a.f29944e) || o2.a.a(a10, o2.a.f29946g) || o2.a.a(a10, o2.a.f29945f) || o2.a.a(a10, o2.a.f29960x) || o2.a.a(a10, o2.a.f29961y) || o2.a.a(a10, o2.a.E) || o2.a.a(a10, o2.a.F)) {
                        j71.a aVar = this.f23621x;
                        if (aVar != null) {
                            aVar.a();
                        }
                        z10 = true;
                    }
                }
                return Boolean.valueOf(z10);
            }
            float f10 = dVar.f30994a;
            float abs = Math.abs(f6 - f10);
            int i = this.f23618u;
            float f11 = abs / (i > 0 ? i + 1 : 100);
            int i10 = this.f23619v ? -1 : 1;
            long a11 = o2.c.a(keyEvent.getKeyCode());
            boolean a12 = o2.a.a(a11, o2.a.f29943d);
            float f12 = this.f23620w;
            if (a12) {
                cVar.k(aa1.b.x(Float.valueOf((i10 * f11) + f12), dVar));
            } else if (o2.a.a(a11, o2.a.f29944e)) {
                cVar.k(aa1.b.x(Float.valueOf(f12 - (i10 * f11)), dVar));
            } else if (o2.a.a(a11, o2.a.f29946g)) {
                cVar.k(aa1.b.x(Float.valueOf((i10 * f11) + f12), dVar));
            } else if (o2.a.a(a11, o2.a.f29945f)) {
                cVar.k(aa1.b.x(Float.valueOf(f12 - (i10 * f11)), dVar));
            } else if (o2.a.a(a11, o2.a.f29960x)) {
                cVar.k(Float.valueOf(f10));
            } else if (o2.a.a(a11, o2.a.f29961y)) {
                cVar.k(Float.valueOf(f6));
            } else {
                if (!o2.a.a(a11, o2.a.E)) {
                    if (o2.a.a(a11, o2.a.F)) {
                        cVar.k(aa1.b.x(Float.valueOf((aa1.b.v(r7 / 10, 1, 10) * f11) + f12), dVar));
                    }
                    return Boolean.valueOf(z10);
                }
                cVar.k(aa1.b.x(Float.valueOf(f12 - (aa1.b.v(r7 / 10, 1, 10) * f11)), dVar));
            }
            z10 = true;
            return Boolean.valueOf(z10);
        }
        return Boolean.FALSE;
    }
}
