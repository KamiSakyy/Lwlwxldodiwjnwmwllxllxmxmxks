package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f4 implements aaShadow.a {
    public static final f4 a = new f4();
    public static final List b = sy.d0.n("pullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.r6 r6Var = null;
        while (eVar.r0(b) == 0) {
            r6Var = (u10.r6) aa.c.b(aa.c.c(i4.a, false)).a(eVar, wVar);
        }
        return new u10.o6(r6Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.o6 o6Var = (u10.o6) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(o6Var, "value");
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(i4.a, false)).b(fVar, wVar, o6Var.a);
    }
}
