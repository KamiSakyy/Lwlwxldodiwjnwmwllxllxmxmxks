package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r5 implements aa.a {
    public static final r5 a = new r5();
    public static final List b = sy.d0.o(new String[]{"__typename", "id"});

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
        eVar.s0();
        ri0.h8 c = ri0.l8.c(eVar, wVar);
        eVar.s0();
        ri0.z zVar = ri0.z.a;
        ri0.v c2 = ri0.z.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new kc0.s8(str, str2, c, c2);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.s8 s8Var = (kc0.s8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s8Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, s8Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, s8Var.b);
        List list = ri0.l8.a;
        ri0.l8.d(fVar, wVar, s8Var.c);
        ri0.z zVar = ri0.z.a;
        ri0.z.d(fVar, wVar, s8Var.d);
    }
}
