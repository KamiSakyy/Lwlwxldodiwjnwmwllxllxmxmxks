package eo0;

import java.util.List;
import jn0.a60;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ft implements aaShadow.a {
    public static final ft a = new ft();
    public static final List b = sy.d0.n("success");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        while (eVar.r0(b) == 0) {
            bool = (Boolean) aa.c.k.a(eVar, wVar);
        }
        return new a60(bool);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        a60 a60Var = (a60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a60Var, "value");
        fVar.z0("success");
        aa.c.k.b(fVar, wVar, a60Var.a);
    }
}
