package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bk implements aaShadow.a {
    public static final bk a = new bk();
    public static final List b = sy.d0.o(new String[]{"pageInfo", "nodes"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.kt ktVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                ktVar = (kc0.kt) aa.c.c(fk.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(ck.a, true)))).a(eVar, wVar);
            }
        }
        if (ktVar != null) {
            return new kc0.ft(ktVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.ft ftVar = (kc0.ft) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ftVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(fk.a, false).b(fVar, wVar, ftVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(ck.a, true)))).b(fVar, wVar, ftVar.b);
    }
}
