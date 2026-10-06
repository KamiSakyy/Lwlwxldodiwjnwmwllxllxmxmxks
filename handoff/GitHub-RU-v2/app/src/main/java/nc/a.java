package nc;

import java.util.ArrayList;
import java.util.List;
import jk.d;
import lj.b;
import sy.d0Shadow;
import x61.m;
import x61.rShadow;
import yz0.b8;
import yz0.q2;
import yz0.v7;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {
    public static final ArrayList a(d dVar) {
        List b10 = b(dVar);
        b8 b8Var = dVar.j;
        List list = rShadow.r;
        List n10 = b8Var != null ? (dVar.h || dVar.a.p.a) ? list : d0Shadow.n(b8Var) : null;
        if (n10 != null) {
            list = n10;
        }
        return m.H0(m.l0(m.l0(b10, list), c(dVar)));
    }

    public static final List b(d dVar) {
        String str = dVar.a.a;
        return dVar.d ? d0Shadow.n(new q2(str)) : (dVar.f && dVar.e) ? d0Shadow.n(new v7(str)) : rShadow.r;
    }

    public static final List c(d dVar) {
        if (!dVar.h) {
            b bVar = dVar.a;
            if (!bVar.p.a) {
                return bVar.n;
            }
        }
        return rShadow.r;
    }
}
