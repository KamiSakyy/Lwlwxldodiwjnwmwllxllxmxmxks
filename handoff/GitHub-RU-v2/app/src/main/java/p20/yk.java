package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yk implements aa.a {
    public static final yk a = new yk();
    public static final List b = sy.d0.o("planLimit", "pullRequest", "collaborators", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        u10.iu iuVar = null;
        u10.du duVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = jo.f4.c(1, nextLong, "substring(...)");
                    }
                    num = Integer.valueOf((int) nextLong);
                } else {
                    num = Integer.valueOf((int) nextLong);
                }
            } else if (r0 == 1) {
                iuVar = (u10.iu) aa.c.b(aa.c.c(xk.a, false)).a(eVar, wVar);
            } else if (r0 == 2) {
                duVar = (u10.du) aa.c.b(aa.c.c(tk.a, false)).a(eVar, wVar);
            } else if (r0 == 3) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (num == null) {
            k41.b.B(eVar, "planLimit");
            throw null;
        }
        int intValue = num.intValue();
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new u10.ju(intValue, iuVar, duVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.ju juVar = (u10.ju) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(juVar, "value");
        fVar.z0("planLimit");
        fVar.z(juVar.a);
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(xk.a, false)).b(fVar, wVar, juVar.b);
        fVar.z0("collaborators");
        aa.c.b(aa.c.c(tk.a, false)).b(fVar, wVar, juVar.c);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, juVar.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, juVar.e);
    }
}
