package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w9 implements aaShadow.a {
    public static final w9 a = new w9();
    public static final List b = sy.d0Shadow.n("node");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.ye yeVar = null;
        while (eVar.r0(b) == 0) {
            yeVar = (kc0.ye) aa.c.b(aa.c.c(ba.a, true)).a(eVar, wVar);
        }
        return new kc0.te(yeVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.te teVar = (kc0.te) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(teVar, "value");
        fVar.z0("node");
        aa.c.b(aa.c.c(ba.a, true)).b(fVar, wVar, teVar.a);
    }
}
