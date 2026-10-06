package u91;

import b21.v;
import c21.h0;
import jo.f4Shadow;
import k71.k;
import t91.d;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class b {
    public d a;
    public v b;
    public int c;
    public a d;

    public b(d dVar, v vVar) {
        k.g(dVar, "constraints");
        this.a = dVar;
        this.b = vVar;
        this.c = -2;
    }

    public final boolean a(int i) {
        f4Shadow.z("action", i);
        if (i == 3) {
            i = 1;
        }
        h0 e = e();
        if (i == 1) {
            k.g(e, "type");
            this.b.j(e);
        } else {
            if (i != 2 && i == 3) {
                k.g(e, "type");
                throw new UnsupportedOperationException("Should not be invoked");
            }
            k.g(e, "type");
        }
        return i != 4;
    }

    public abstract boolean b();

    public abstract int c(s91.c cVar);

    public abstract a d(s91.c cVar, d dVar);

    public abstract h0 e();

    public abstract boolean f(s91.c cVar);
}
