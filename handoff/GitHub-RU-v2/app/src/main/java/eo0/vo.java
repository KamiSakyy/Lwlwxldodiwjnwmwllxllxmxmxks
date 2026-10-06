package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vo implements aaShadow.a {
    public static final vo a = new vo();
    public static final List b = sy.d0Shadow.o(new String[]{"id", "activePullRequests", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jn0.dz dzVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                dzVar = (jn0.dz) aa.c.c(noShadow.a, false).a(eVar, wVar);
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
        if (dzVar == null) {
            k41.b.B(eVar, "activePullRequests");
            throw null;
        }
        if (str2 != null) {
            return new jn0.mz(str, dzVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.mz mzVar = (jn0.mz) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(mzVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, mzVar.a);
        fVar.z0("activePullRequests");
        aa.c.c(noShadow.a, false).b(fVar, wVar, mzVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, mzVar.c);
    }
}
