package gv;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z7 implements aa.a {
    public static final z7 a = new z7();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        i c = j.c(eVar, wVar);
        if (str != null) {
            return new u7(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u7 u7Var = (u7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u7Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, u7Var.a);
        List list = j.a;
        i iVar = u7Var.b;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(iVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, iVar.a);
        e eVar = iVar.b;
        if (eVar != null) {
            k.d(fVar, wVar, eVar);
        }
        g gVar = iVar.c;
        if (gVar != null) {
            m.d(fVar, wVar, gVar);
        }
        h hVar = iVar.d;
        if (hVar != null) {
            n.d(fVar, wVar, hVar);
        }
        f fVar2 = iVar.e;
        if (fVar2 != null) {
            l.d(fVar, wVar, fVar2);
        }
    }
}
