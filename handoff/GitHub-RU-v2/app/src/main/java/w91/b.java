package w91;

import h0.q1;
import java.util.List;
import k71.k;
import q71.g;
import s91.f;
import sy.a0;
import sy.d0Shadow;
import t71.j;
import t71.l;
import t71.n;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes5.dex */
public final class b implements u91.c {
    public static final n a = new n("^ {0,3}(~~~+|```+)([^`]*)$");

    public static a c(s91.c cVar, t91.d dVar) {
        l a2;
        k.g(cVar, "pos");
        k.g(dVar, "constraints");
        if (cVar.b != a0.l(dVar, cVar.d) || (a2 = a.a(cVar.b())) == null) {
            return null;
        }
        o1.l lVar = a2.c;
        j b = lVar.b(1);
        String str = b != null ? b.a : null;
        k.d(str);
        j b2 = lVar.b(2);
        String str2 = b2 != null ? b2.a : null;
        k.d(str2);
        return new a(str, str2);
    }

    @Override // u91.c
    public final boolean a(s91.c cVar, t91.d dVar) {
        k.g(cVar, "pos");
        k.g(dVar, "constraints");
        return c(cVar, dVar) != null;
    }

    @Override // u91.c
    public final List b(s91.c cVar, q1 q1Var, f fVar) {
        k.g(fVar, "stateInfo");
        t91.d dVar = fVar.a;
        a c = c(cVar, dVar);
        if (c == null) {
            return rShadow.r;
        }
        String str = c.b;
        int d = cVar.d() - str.length();
        q1Var.a(d0Shadow.n(new x91.e(new g(cVar.c, d, 1), j91.a.i0)));
        if (str.length() > 0) {
            q1Var.a(d0Shadow.n(new x91.e(new g(d, cVar.d(), 1), j91.a.h0)));
        }
        return d0Shadow.n(new v91.d(dVar, q1Var, c.a));
    }
}
