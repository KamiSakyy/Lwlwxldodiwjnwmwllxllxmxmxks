package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d7 implements aa.a {
    public static final d7 a = new d7();
    public static final List b = sy.d0.o("__typename", "id");

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
        gv.o c = gv.p.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new jo.ta(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.ta taVar = (jo.ta) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(taVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, taVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, taVar.b);
        List list = gv.p.a;
        gv.o oVar = taVar.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(oVar, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, oVar.a);
        fVar.z0("lastEditedAt");
        m10.sa.Companion.getClass();
        aa.c.b(wVar.e(m10.sa.a)).b(fVar, wVar, oVar.b);
        fVar.z0("state");
        fVar.I(oVar.c.r);
        fVar.z0("id");
        bVar2.b(fVar, wVar, oVar.d);
        gv.n3 n3Var = gv.n3.a;
        gv.n3.d(fVar, wVar, oVar.e);
    }
}
