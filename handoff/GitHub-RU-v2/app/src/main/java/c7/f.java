package c7;

import d.y;
import w51.r;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public r f4136a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4137b;

    public final void a() {
        r rVar = this.f4136a;
        if (rVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!this.f4137b) {
            rVar.r(this, (b) null);
        }
        g gVar = (g) rVar.t;
        c5.b bVar = (c5.b) rVar.s;
        gVar.getClass();
        if (equals(gVar.f4145h) && -1 == gVar.f4144g) {
            d dVar = gVar.f4143f;
            if (dVar == null) {
                dVar = gVar.c(-1);
            }
            gVar.f4143f = null;
            gVar.f4144g = 0;
            gVar.f4145h = null;
            if (dVar == null) {
                ((y) bVar.f4114s).f20932a.run();
            } else {
                dVar.b();
            }
            y1 y1Var = gVar.f4138a;
            y1Var.getClass();
            y1Var.k((Object) null, h.f4149b);
        }
        this.f4137b = false;
    }

    public void b(boolean z10) {
    }

}
