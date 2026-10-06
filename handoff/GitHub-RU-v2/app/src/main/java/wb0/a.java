package wb0;

import e50.d1;
import hc0.w8;
import i50.u;
import i50.z;
import java.time.ZonedDateTime;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public static final e50.n a(a aVar, i50.h hVar) {
        aVar.getClass();
        w8.Companion.getClass();
        String str = ((aa.q) w8.c).a;
        String str2 = hVar.b;
        return new e50.n(str, str2, hVar, hVar.n, new i50.n(str2, new i50.m(0, rShadow.r), str));
    }

    public static i50.h b(i50.h hVar) {
        aa0.a aVar;
        ZonedDateTime now = ZonedDateTime.now();
        d1 d1Var = hVar.m;
        String str = d1Var.a;
        boolean z = d1Var.c;
        int i = d1Var.d;
        ja0.a aVar2 = d1Var.e;
        k71.k.g(str, "__typename");
        d1 d1Var2 = new d1(str, false, z, i, aVar2);
        c40.c cVar = hVar.j;
        aa0.a aVar3 = cVar.l;
        if (aVar3 != null) {
            String str2 = aVar3.a;
            ja0.a aVar4 = aVar3.c;
            k71.k.g(str2, "__typename");
            aVar = new aa0.a(str2, false, aVar4);
        } else {
            aVar = null;
        }
        return i50.h.a(hVar, false, false, false, now, c40.c.a(cVar, "", aVar, 1855), (g70.a) null, (y60.a) null, d1Var2, 11527);
    }

    public static i50.h c(i50.h hVar, String str) {
        return i50.h.a(hVar, str == null && hVar.h == null, hVar.b.equals(str), hVar.b.equals(str), (ZonedDateTime) null, (c40.c) null, (g70.a) null, (y60.a) null, (d1) null, 16271);
    }

    public static u d(u uVar, String str) {
        String str2 = uVar.g;
        return u.a(uVar, str == null, str2.equals(str), str2.equals(str), (g70.a) null, (y60.a) null, 2019);
    }

    public static z e(z zVar, boolean z) {
        u uVar = zVar.c;
        return z.a(zVar, u.a(uVar, z ? true : uVar.c, false, false, (g70.a) null, (y60.a) null, 2043));
    }
}
