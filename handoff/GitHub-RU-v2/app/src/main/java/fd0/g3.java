package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g3 implements aaShadow.a {
    public static final g3 a = new g3();
    public static final List b = sy.d0Shadow.o(new String[]{"color", "name"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "color");
            throw null;
        }
        if (str2 != null) {
            return new kc0.d5(str, str2);
        }
        k41.b.B(eVar, "name");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.d5 d5Var = (kc0.d5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d5Var, "value");
        fVar.z0("color");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, d5Var.a);
        fVar.z0("name");
        bVar.b(fVar, wVar, d5Var.b);
    }
}
