package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d7 implements aaShadow.a {
    public static final d7 a = new d7();
    public static final List b = sy.d0Shadow.n("id");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str != null) {
            return new kc0.qa(str);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.qa qaVar = (kc0.qa) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qaVar, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, qaVar.a);
    }
}
