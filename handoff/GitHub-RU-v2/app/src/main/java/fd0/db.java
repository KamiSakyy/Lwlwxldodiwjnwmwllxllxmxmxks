package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class db implements aa.a {
    public static final db a = new db();
    public static final List b = sy.d0.n("hasNextPage");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        while (eVar.r0(b) == 0) {
            bool = (Boolean) aa.c.f.a(eVar, wVar);
        }
        if (bool != null) {
            return new kc0.jg(bool.booleanValue());
        }
        k41.b.B(eVar, "hasNextPage");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.jg jgVar = (kc0.jg) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jgVar, "value");
        fVar.z0("hasNextPage");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(jgVar.a));
    }
}
