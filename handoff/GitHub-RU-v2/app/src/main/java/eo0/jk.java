package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jk implements aaShadow.a {
    public static final jk a = new jk();
    public static final List b = sy.d0.n("clientMutationId");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.i.a(eVar, wVar);
        }
        return new jn0.kt(str);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.kt ktVar = (jn0.kt) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ktVar, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, ktVar.a);
    }
}
