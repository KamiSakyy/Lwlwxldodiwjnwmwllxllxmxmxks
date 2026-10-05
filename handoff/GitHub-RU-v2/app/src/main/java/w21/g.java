package w21;

import c21.u;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g {
    public final o a = new o();

    public g() {
    }

    public final void a(Object obj) {
        this.a.m(obj);
    }

    public final void b(Exception exc) {
        o oVar = this.a;
        oVar.getClass();
        u.h(exc, "Exception must not be null");
        synchronized (oVar.a) {
            try {
                if (oVar.c) {
                    return;
                }
                oVar.c = true;
                oVar.f = exc;
                oVar.b.m(oVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Object obj) {
        this.a.o(obj);
    }

    public g(s21.a aVar) {
        s21.a aVar2 = new s21.a(22, this);
        aVar.getClass();
        ((o) aVar.s).d(h.a, new s21.a(20, aVar2));
    }
}
