package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i8 implements aaShadow.a {
    public static final i8 a = new i8();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        qf0.a c = qf0.b.c(eVar, wVar);
        if (str != null) {
            return new kc0.nc(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.nc ncVar = (kc0.nc) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ncVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, ncVar.a);
        List list = qf0.b.a;
        qf0.b.d(fVar, wVar, ncVar.b);
    }
}
