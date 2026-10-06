package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class sc implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id"});

    public static jo.ri c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        ct.a0 a0Var = ct.a0.a;
        ct.u c = ct.a0.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new jo.ri(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jo.ri riVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(riVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, riVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, riVar.b);
        ct.a0 a0Var = ct.a0.a;
        ct.a0.d(fVar, wVar, riVar.c);
    }
}
