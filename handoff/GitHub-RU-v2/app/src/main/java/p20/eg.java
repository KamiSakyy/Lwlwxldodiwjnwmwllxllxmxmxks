package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class eg implements aaShadow.a {
    public static final eg a = new eg();
    public static final List b = sy.d0.o("user", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.co coVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                coVar = (u10.co) aa.c.b(aa.c.c(jg.a, true)).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new u10.xn(coVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.xn xnVar = (u10.xn) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xnVar, "value");
        fVar.z0("user");
        aa.c.b(aa.c.c(jg.a, true)).b(fVar, wVar, xnVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, xnVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, xnVar.c);
    }
}
