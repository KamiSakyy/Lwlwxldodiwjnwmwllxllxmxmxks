package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c7 implements aaShadow.a {
    public static final c7 a = new c7();
    public static final List b = sy.d0Shadow.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
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
        wq.f c = wq.h.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new jo.sa(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.sa saVar = (jo.sa) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(saVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, saVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, saVar.b);
        List list = wq.h.a;
        wq.f fVar2 = saVar.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fVar2, "value");
        fVar.z0("name");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, fVar2.a);
        fVar.z0("status");
        fVar.I(fVar2.b.r);
        fVar.z0("id");
        bVar2.b(fVar, wVar, fVar2.c);
        fVar.z0("conclusion");
        aa.c.b(n10Shadow.a.d).b(fVar, wVar, fVar2.d);
        fVar.z0("permalink");
        bVar2.b(fVar, wVar, fVar2.e);
        fVar.z0("deployment");
        aa.c.b(aa.c.c(wq.g.a, false)).b(fVar, wVar, fVar2.f);
        fVar.z0("steps");
        aa.c.b(aa.c.c(wq.l.a, false)).b(fVar, wVar, fVar2.g);
        fVar.z0("__typename");
        bVar2.b(fVar, wVar, fVar2.h);
    }
}
