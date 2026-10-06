package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public class b implements aaShadow.a {
    public static final b a = new b();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        gq.c c = gq.d.c(eVar, wVar);
        if (str != null) {
            return new jo.b(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.b bVar = (jo.b) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(bVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, bVar.a);
        List list = gq.d.a;
        gq.d.d(fVar, wVar, bVar.b);
    }
    public static final Object A = null;
    public static final Object h = null;
    public static final Object r = null;
    public Object c(Object p1, Object p2) { return null; }
    public Object e(Object p1, Object p2, Object p3) { return null; }
}
