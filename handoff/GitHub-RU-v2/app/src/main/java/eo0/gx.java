package eo0;

import java.util.List;
import jn0.ac0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gx implements aaShadow.a {
    public static final gx a = new gx();
    public static final List b = sy.d0Shadow.n("viewerCanPush");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        while (eVar.r0(b) == 0) {
            bool = (Boolean) aa.c.f.a(eVar, wVar);
        }
        if (bool != null) {
            return new ac0(bool.booleanValue());
        }
        k41.b.B(eVar, "viewerCanPush");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ac0 ac0Var = (ac0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ac0Var, "value");
        fVar.z0("viewerCanPush");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(ac0Var.a));
    }
}
