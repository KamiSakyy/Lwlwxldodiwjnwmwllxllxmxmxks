package ep;

import java.util.List;
import jo.f60;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mt implements aaShadow.a {
    public static final mt a = new mt();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        lt.j c = lt.n.c(eVar, wVar);
        if (str != null) {
            return new f60(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        f60 f60Var = (f60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(f60Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, f60Var.a);
        List list = lt.n.a;
        lt.n.d(fVar, wVar, f60Var.b);
    }
}
