package hy0;

import java.util.List;
import sy.d0Shadow;
import wx0.u4;
import wx0.v4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p implements aa.a {
    public static final p a = new p();
    public static final List b = d0Shadow.o(new String[]{"__typename", "defaultView", "views", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        gy0.r rVar = null;
        gy0.w wVar2 = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                rVar = (gy0.r) aa.c.b(aa.c.c(m.a, true)).a(eVar, wVar);
            } else if (r0 == 2) {
                wVar2 = (gy0.w) aa.c.c(r.a, false).a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        u4 c = v4.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (wVar2 == null) {
            k41.b.B(eVar, "views");
            throw null;
        }
        if (str2 != null) {
            return new gy0.u(str, rVar, wVar2, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        gy0.u uVar = (gy0.u) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(uVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, uVar.a);
        fVar.z0("defaultView");
        aa.c.b(aa.c.c(m.a, true)).b(fVar, wVar, uVar.b);
        fVar.z0("views");
        aa.c.c(r.a, false).b(fVar, wVar, uVar.c);
        fVar.z0("id");
        bVar.b(fVar, wVar, uVar.d);
        List list = v4.a;
        v4.d(fVar, wVar, uVar.e);
    }
}
