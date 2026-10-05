package sq0;

import aa.w;
import java.util.List;
import k71.k;
import pz0.g9;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h implements aa.a {
    public static final h a = new h();
    public static final List b = d0.o(new String[]{"__typename", "state", "environment", "id"});

    public final Object a(ea.e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String str = null;
        g9 g9Var = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                g9Var = (g9) aa.c.b(qz0.a.m).a(eVar, wVar);
            } else if (r0 == 2) {
                str2 = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str3 != null) {
            return new b(str, g9Var, str2, str3);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        b bVar = (b) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(bVar, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, bVar.a);
        fVar.z0("state");
        aa.c.b(qz0.a.m).b(fVar, wVar, bVar.b);
        fVar.z0("environment");
        aa.c.i.b(fVar, wVar, bVar.c);
        fVar.z0("id");
        bVar2.b(fVar, wVar, bVar.d);
    }
}
