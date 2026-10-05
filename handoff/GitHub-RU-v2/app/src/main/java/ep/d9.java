package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d9 implements aa.a {
    public static final d9 a = new d9();
    public static final List b = sy.d0.o("__typename", "pullRequest", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jo.od odVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                odVar = (jo.od) aa.c.c(c9.a, true).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        lv.c c = lv.f.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (odVar == null) {
            k41.b.B(eVar, "pullRequest");
            throw null;
        }
        if (str2 != null) {
            return new jo.pd(str, odVar, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.pd pdVar = (jo.pd) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(pdVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, pdVar.a);
        fVar.z0("pullRequest");
        aa.c.c(c9.a, true).b(fVar, wVar, pdVar.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, pdVar.c);
        List list = lv.f.a;
        lv.f.d(fVar, wVar, pdVar.d);
    }
}
