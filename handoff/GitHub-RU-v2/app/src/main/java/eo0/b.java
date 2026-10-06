package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b implements aaShadow.a {
    public static final b a = new b();
    public static final List b = sy.d0.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jn0.e eVar2 = null;
        while (eVar.r0(b) == 0) {
            eVar2 = (jn0.e) aa.c.b(aa.c.c(d.a, true)).a(eVar, wVar);
        }
        return new jn0.b(eVar2);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.b bVar = (jn0.b) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(bVar, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(d.a, true)).b(fVar, wVar, bVar.a);
    }
    public Object c(Object p1, Object p2) { return null; }
    public Object e(Object p1, Object p2, Object p3) { return null; }
    public Object e(Object p1, Object p2, Object p3) { return null; }
}
