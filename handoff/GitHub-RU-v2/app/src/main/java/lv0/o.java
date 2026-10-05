package lv0;

import aa.w;
import java.util.List;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o implements aa.a {
    public static final o a = new o();
    public static final List b = d0.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        j c = n.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new k(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        k kVar = (k) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(kVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, kVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, kVar.b);
        List list = n.a;
        j jVar = kVar.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jVar, "value");
        fVar.z0("issueState");
        fVar.I(jVar.a.r);
        fVar.z0("title");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, jVar.b);
        fVar.z0("url");
        bVar2.b(fVar, wVar, jVar.c);
        fVar.z0("number");
        fVar.z(jVar.d);
        fVar.z0("stateReason");
        aa.c.b(qz0.a.x).b(fVar, wVar, jVar.e);
    }
}
