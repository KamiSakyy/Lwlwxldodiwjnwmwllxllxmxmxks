package er0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class p implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "replies", "__typename"});

    public static o c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        n nVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                nVar = (n) aa.c.c(r.a, false).a(eVar, wVar);
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
        if (nVar == null) {
            k41.b.B(eVar, "replies");
            throw null;
        }
        if (str2 != null) {
            return new o(str, nVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, o oVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(oVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, oVar.a);
        fVar.z0("replies");
        aa.c.c(r.a, false).b(fVar, wVar, oVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, oVar.c);
    }
}
