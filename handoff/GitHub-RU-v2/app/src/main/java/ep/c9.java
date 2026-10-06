package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c9 implements aaShadow.a {
    public static final c9 a = new c9();
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
        gv.w3 c = gv.y3.c(eVar, wVar);
        eVar.s0();
        gv.d4 d4Var = gv.d4.a;
        gv.a4 c2 = gv.d4.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new jo.od(str, str2, c, c2);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.od odVar = (jo.od) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(odVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, odVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, odVar.b);
        List list = gv.y3.a;
        gv.w3 w3Var = odVar.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w3Var, "value");
        fVar.z0("id");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, w3Var.a);
        fVar.z0("number");
        fVar.z(w3Var.b);
        fVar.z0("repository");
        aa.c.c(gv.z3.a, false).b(fVar, wVar, w3Var.c);
        fVar.z0("__typename");
        bVar2.b(fVar, wVar, w3Var.d);
        gv.d4 d4Var = gv.d4.a;
        gv.d4.d(fVar, wVar, odVar.d);
    }
}
