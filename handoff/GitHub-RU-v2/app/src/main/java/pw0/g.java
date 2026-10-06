package pw0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g implements aa.a {
    public static final g a = new g();
    public static final List b = sy.d0Shadow.o(new String[]{"viewer", "repository", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        ow0.n nVar = null;
        ow0.m mVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                nVar = (ow0.n) aa.c.c(i.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                mVar = (ow0.m) aa.c.b(aa.c.c(h.a, true)).a(eVar, wVar);
            } else if (r0 == 2) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (nVar == null) {
            k41.b.B(eVar, "viewer");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new ow0.l(nVar, mVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ow0.l lVar = (ow0.l) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(lVar, "value");
        fVar.z0("viewer");
        aa.c.c(i.a, false).b(fVar, wVar, lVar.a);
        fVar.z0("repository");
        aa.c.b(aa.c.c(h.a, true)).b(fVar, wVar, lVar.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, lVar.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, lVar.d);
    }
}
