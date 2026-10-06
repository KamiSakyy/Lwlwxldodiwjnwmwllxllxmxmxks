package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h6 implements aaShadow.a {
    public static final h6 a = new h6();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        ud0.a c = ud0.b.c(eVar, wVar);
        if (str != null) {
            return new kc0.l9(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.l9 l9Var = (kc0.l9) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l9Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, l9Var.a);
        List list = ud0.b.a;
        ud0.b.d(fVar, wVar, l9Var.b);
    }
}
