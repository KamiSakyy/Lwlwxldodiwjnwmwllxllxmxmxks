package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ip implements aaShadow.a {
    public static final ip a = new ip();
    public static final List b = sy.d0Shadow.o("planLimit", "pullRequest", "collaborators", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num = null;
        jo.h00 h00Var = null;
        jo.c00 c00Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                long nextLong = eVar.nextLong();
                if (nextLong > 2147483647L) {
                    while (nextLong > 2147483647L) {
                        nextLong = jo.f4Shadow.c(1, nextLong, "substring(...)");
                    }
                    num = Integer.valueOf((int) nextLong);
                } else {
                    num = Integer.valueOf((int) nextLong);
                }
            } else if (r0 == 1) {
                h00Var = (jo.h00) aa.c.b(aa.c.c(hp.a, false)).a(eVar, wVar);
            } else if (r0 == 2) {
                c00Var = (jo.c00) aa.c.b(aa.c.c(dp.a, false)).a(eVar, wVar);
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
            return new jo.i00(intValue, h00Var, c00Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.i00 i00Var = (jo.i00) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i00Var, "value");
        fVar.z0("planLimit");
        fVar.z(i00Var.a);
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(hp.a, false)).b(fVar, wVar, i00Var.b);
        fVar.z0("collaborators");
        aa.c.b(aa.c.c(dp.a, false)).b(fVar, wVar, i00Var.c);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, i00Var.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, i00Var.e);
    }
}
