package u00;

import is.i1;
import java.time.ZonedDateTime;
import m10.nd;
import ms.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public static final is.p a(a aVar, ms.i iVar) {
        aVar.getClass();
        nd.Companion.getClass();
        String str = ((aa.q) nd.c).a;
        String str2 = iVar.b;
        return new is.p(str, str2, iVar, iVar.n, new ms.o(str2, new ms.n(0, x61.r.r), str));
    }

    public static ms.i b(ms.i iVar) {
        mx.a aVar;
        ZonedDateTime now = ZonedDateTime.now();
        i1 i1Var = iVar.m;
        String str = i1Var.a;
        boolean z = i1Var.c;
        int i = i1Var.d;
        vx.a aVar2 = i1Var.e;
        k71.k.g(str, "__typename");
        i1 i1Var2 = new i1(str, false, z, i, aVar2);
        ar.c cVar = iVar.j;
        mx.a aVar3 = cVar.l;
        if (aVar3 != null) {
            String str2 = aVar3.a;
            vx.a aVar4 = aVar3.c;
            k71.k.g(str2, "__typename");
            aVar = new mx.a(str2, false, aVar4);
        } else {
            aVar = null;
        }
        return ms.i.a(iVar, false, false, false, now, ar.c.a(cVar, "", aVar, 1855), null, null, i1Var2, 11527);
    }

    public static ms.i c(ms.i iVar, String str) {
        return ms.i.a(iVar, str == null && iVar.h == null, iVar.b.equals(str), iVar.b.equals(str), null, null, null, null, null, 16271);
    }

    public static ms.v d(ms.v vVar, String str) {
        String str2 = vVar.g;
        return ms.v.a(vVar, str == null, str2.equals(str), str2.equals(str), null, null, 2019);
    }

    public static a0 e(a0 a0Var, boolean z) {
        ms.v vVar = a0Var.c;
        return a0.a(a0Var, ms.v.a(vVar, z ? true : vVar.c, false, false, null, null, 2043));
    }
}
