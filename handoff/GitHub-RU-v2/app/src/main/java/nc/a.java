package nc;

import java.util.ArrayList;
import java.util.List;
import jk.d;
import lj.b;
import sy.d0;
import x61.m;
import x61.r;
import yz0.b8;
import yz0.q2;
import yz0.v7;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {
    public static final ArrayList a(d dVar) {
        List b10 = b(dVar);
        b8 b8Var = dVar.j;
        List list = r.r;
        List n10 = b8Var != null ? (dVar.h || dVar.a.p.a) ? list : d0.n(b8Var) : null;
        if (n10 != null) {
            list = n10;
        }
        return m.H0(m.l0(m.l0(b10, list), c(dVar)));
    }

    public static final List b(d dVar) {
        String str = dVar.a.a;
        return dVar.d ? d0.n(new q2(str)) : (dVar.f && dVar.e) ? d0.n(new v7(str)) : r.r;
    }

    public static final List c(d dVar) {
        if (!dVar.h) {
            b bVar = dVar.a;
            if (!bVar.p.a) {
                return bVar.n;
            }
        }
        return r.r;
    }
}
