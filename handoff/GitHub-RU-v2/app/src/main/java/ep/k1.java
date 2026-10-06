package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k1 implements aaShadow.a {
    public static final k1 a = new k1();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str != null) {
            return new jo.m2(str);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.m2 m2Var = (jo.m2) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m2Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, m2Var.a);
    }
}
