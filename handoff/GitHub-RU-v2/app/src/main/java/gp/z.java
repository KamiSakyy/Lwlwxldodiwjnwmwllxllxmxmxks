package gp;

import fp.d1;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z implements aa.a {
    public static final z a = new z();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        hp.u c = hp.v.c(eVar, wVar);
        if (str != null) {
            return new d1(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        d1 d1Var = (d1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d1Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, d1Var.a);
        List list = hp.v.a;
        hp.u uVar = d1Var.b;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(uVar, "value");
        fVar.z0("name");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, uVar.a);
        fVar.z0("displayName");
        bVar.b(fVar, wVar, uVar.b);
        fVar.z0("description");
        aa.c.i.b(fVar, wVar, uVar.c);
    }
}
