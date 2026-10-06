package z70;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a1 implements aa.a {
    public static final a1 a = new a1();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        k c = l.c(eVar, wVar);
        if (str != null) {
            return new g0(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        g0 g0Var = (g0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(g0Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, g0Var.a);
        List list = l.a;
        k kVar = g0Var.b;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(kVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, kVar.a);
        g gVar = kVar.b;
        if (gVar != null) {
            List list2 = m.a;
            fVar.z0("url");
            aa.c.i.b(fVar, wVar, gVar.a);
        }
        i iVar = kVar.c;
        if (iVar != null) {
            List list3 = o.a;
            fVar.z0("url");
            aa.c.i.b(fVar, wVar, iVar.a);
        }
        h hVar = kVar.d;
        if (hVar != null) {
            n.d(fVar, wVar, hVar);
        }
        j jVar = kVar.e;
        if (jVar != null) {
            p.d(fVar, wVar, jVar);
        }
    }
}
