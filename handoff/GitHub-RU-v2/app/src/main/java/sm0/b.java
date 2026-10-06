package sm0;

import gn0.i9;
import java.time.ZonedDateTime;
import uf0.i1;
import yf0.a0;
import yf0.v;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bShadow {
    public static final uf0.p a(bShadow bVar, yf0.i iVar) {
        bVar.getClass();
        i9.Companion.getClass();
        String str = ((aa.q) i9.c).a;
        String str2 = iVar.b;
        return new uf0.p(str, str2, iVar, iVar.n, new yf0.o(str2, new yf0.n(0, x61.rShadow.r), str));
    }

    public static yf0.i b(yf0.i iVar) {
        sk0.a aVar;
        ZonedDateTime now = ZonedDateTime.now();
        i1 i1Var = iVar.m;
        String str = i1Var.a;
        boolean z = i1Var.c;
        int i = i1Var.d;
        bl0.a aVar2 = i1Var.e;
        k71.k.g(str, "__typename");
        i1 i1Var2 = new i1(str, false, z, i, aVar2);
        se0.c cVar = iVar.j;
        sk0.a aVar3 = cVar.l;
        if (aVar3 != null) {
            String str2 = aVar3.a;
            bl0.a aVar4 = aVar3.c;
            k71.k.g(str2, "__typename");
            aVar = new sk0.a(str2, false, aVar4);
        } else {
            aVar = null;
        }
        return yf0.i.a(iVar, false, false, false, now, se0.c.a(cVar, "", aVar, 1855), null, null, i1Var2, 11527);
    }

    public static yf0.i c(yf0.i iVar, String str) {
        return yf0.i.a(iVar, str == null && iVar.h == null, iVar.b.equals(str), iVar.b.equals(str), null, null, null, null, null, 16271);
    }

    public static v d(v vVar, String str) {
        String str2 = vVar.g;
        return v.a(vVar, str == null, str2.equals(str), str2.equals(str), null, null, 2019);
    }

    public static a0 e(a0 a0Var, boolean z) {
        v vVar = a0Var.c;
        return a0.a(a0Var, v.a(vVar, z ? true : vVar.c, false, false, null, null, 2043));
    }
}
