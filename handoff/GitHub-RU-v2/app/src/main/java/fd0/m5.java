package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m5 implements aaShadow.a {
    public static final m5 a = new m5();
    public static final List b = sy.d0Shadow.n("success");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        while (eVar.r0(b) == 0) {
            bool = (Boolean) aa.c.k.a(eVar, wVar);
        }
        return new kc0.j8(bool);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.j8 j8Var = (kc0.j8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j8Var, "value");
        fVar.z0("success");
        aa.c.k.b(fVar, wVar, j8Var.a);
    }
}
