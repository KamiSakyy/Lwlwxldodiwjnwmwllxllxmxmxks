package p20;

import java.util.List;
import u10.j00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yo implements aaShadow.a {
    public static final yo a = new yo();
    public static final List b = sy.d0.n("success");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        while (eVar.r0(b) == 0) {
            bool = (Boolean) aa.c.k.a(eVar, wVar);
        }
        return new j00(bool);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        j00 j00Var = (j00) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j00Var, "value");
        fVar.z0("success");
        aa.c.k.b(fVar, wVar, j00Var.a);
    }
}
