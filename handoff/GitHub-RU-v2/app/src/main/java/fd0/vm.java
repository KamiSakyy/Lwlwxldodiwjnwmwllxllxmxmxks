package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vm implements aa.a {
    public static final vm a = new vm();
    public static final List b = sy.d0.o(new String[]{"defaultBranchRef", "refs", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.xw xwVar = null;
        kc0.zw zwVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                xwVar = (kc0.xw) aa.c.b(aa.c.c(sm.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                zwVar = (kc0.zw) aa.c.b(aa.c.c(um.a, false)).a(eVar, wVar);
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
            return new kc0.ax(xwVar, zwVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.ax axVar = (kc0.ax) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(axVar, "value");
        fVar.z0("defaultBranchRef");
        aa.c.b(aa.c.c(sm.a, false)).b(fVar, wVar, axVar.a);
        fVar.z0("refs");
        aa.c.b(aa.c.c(um.a, false)).b(fVar, wVar, axVar.b);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, axVar.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, axVar.d);
    }
}
