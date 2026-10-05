package wk0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k0 implements aa.a {
    public static final k0 a = new k0();
    public static final List b = sy.d0.o(new String[]{"id", "name", "owner", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        t tVar = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                tVar = (t) aa.c.c(g0.a, true).a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (tVar == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (str3 != null) {
            return new x(str, str2, tVar, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        x xVar = (x) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, xVar.a);
        fVar.z0("name");
        bVar.b(fVar, wVar, xVar.b);
        fVar.z0("owner");
        aa.c.c(g0.a, true).b(fVar, wVar, xVar.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, xVar.d);
    }
}
