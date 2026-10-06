package ea0;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w0 implements aa.a {
    public static final w0 a = new w0();
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
        s0 c = v0.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new t0(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        t0 t0Var = (t0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, t0Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, t0Var.b);
        List list = v0.a;
        s0 s0Var = t0Var.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, s0Var.a);
        fVar.z0("viewerCanUnblock");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(s0Var.b));
        List list2 = d1.a;
        d1.d(fVar, wVar, s0Var.c);
    }
}
