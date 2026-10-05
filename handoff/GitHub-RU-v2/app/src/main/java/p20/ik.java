package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ik implements aa.a {
    public static final ik a = new ik();
    public static final List b = sy.d0.o("id", "branchInfo", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        u10.kt ktVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                ktVar = (u10.kt) aa.c.b(aa.c.c(gk.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new u10.nt(str, ktVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.nt ntVar = (u10.nt) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ntVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, ntVar.a);
        fVar.z0("branchInfo");
        aa.c.b(aa.c.c(gk.a, true)).b(fVar, wVar, ntVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, ntVar.c);
    }
}
