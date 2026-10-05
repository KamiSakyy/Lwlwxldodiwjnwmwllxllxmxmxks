package xy0;

import ar0.i1;
import er0.a0;
import java.time.ZonedDateTime;
import pz0.ja;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public static final ar0.p a(a aVar, er0.i iVar) {
        aVar.getClass();
        ja.Companion.getClass();
        String str = ((aa.q) ja.c).a;
        String str2 = iVar.b;
        return new ar0.p(str, str2, iVar, iVar.n, new er0.o(str2, new er0.n(0, x61.r.r), str));
    }

    public static er0.i b(er0.i iVar) {
        bw0.a aVar;
        ZonedDateTime now = ZonedDateTime.now();
        i1 i1Var = iVar.m;
        String str = i1Var.a;
        boolean z = i1Var.c;
        int i = i1Var.d;
        kw0.a aVar2 = i1Var.e;
        k71.k.g(str, "__typename");
        i1 i1Var2 = new i1(str, false, z, i, aVar2);
        yp0.c cVar = iVar.j;
        bw0.a aVar3 = cVar.l;
        if (aVar3 != null) {
            String str2 = aVar3.a;
            kw0.a aVar4 = aVar3.c;
            k71.k.g(str2, "__typename");
            aVar = new bw0.a(str2, false, aVar4);
        } else {
            aVar = null;
        }
        return er0.i.a(iVar, false, false, false, now, yp0.c.a(cVar, "", aVar, 1855), null, null, i1Var2, 11527);
    }

    public static er0.i c(er0.i iVar, String str) {
        return er0.i.a(iVar, str == null && iVar.h == null, iVar.b.equals(str), iVar.b.equals(str), null, null, null, null, null, 16271);
    }

    public static er0.v d(er0.v vVar, String str) {
        String str2 = vVar.g;
        return er0.v.a(vVar, str == null, str2.equals(str), str2.equals(str), null, null, 2019);
    }

    public static a0 e(a0 a0Var, boolean z) {
        er0.v vVar = a0Var.c;
        return a0.a(a0Var, er0.v.a(vVar, z ? true : vVar.c, false, false, null, null, 2043));
    }
}
