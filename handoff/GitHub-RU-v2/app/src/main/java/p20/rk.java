package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class rk implements aaShadow.a {
    public static final rk a = new rk();
    public static final List b = sy.d0Shadow.o("defaultBranchRef", "refs", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.wt wtVar = null;
        u10.zt ztVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                wtVar = (u10.wt) aa.c.b(aa.c.c(nk.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                ztVar = (u10.zt) aa.c.b(aa.c.c(qk.a, false)).a(eVar, wVar);
            } else if (r0 == 2) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
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
            return new u10.au(wtVar, ztVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.au auVar = (u10.au) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(auVar, "value");
        fVar.z0("defaultBranchRef");
        aa.c.b(aa.c.c(nk.a, false)).b(fVar, wVar, auVar.a);
        fVar.z0("refs");
        aa.c.b(aa.c.c(qk.a, false)).b(fVar, wVar, auVar.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, auVar.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, auVar.d);
    }
}
