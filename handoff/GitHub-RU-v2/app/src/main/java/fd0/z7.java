package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z7 implements aa.a {
    public static final z7 a = new z7();
    public static final List b = sy.d0.o(new String[]{"__typename", "pullRequest", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        kc0.xb xbVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                xbVar = (kc0.xb) aa.c.c(y7.a, true).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        wi0.c c = wi0.f.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (xbVar == null) {
            k41.b.B(eVar, "pullRequest");
            throw null;
        }
        if (str2 != null) {
            return new kc0.yb(str, xbVar, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.yb ybVar = (kc0.yb) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ybVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, ybVar.a);
        fVar.z0("pullRequest");
        aa.c.c(y7.a, true).b(fVar, wVar, ybVar.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, ybVar.c);
        List list = wi0.f.a;
        wi0.f.d(fVar, wVar, ybVar.d);
    }
}
