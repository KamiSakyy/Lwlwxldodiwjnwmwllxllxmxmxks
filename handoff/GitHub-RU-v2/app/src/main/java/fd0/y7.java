package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y7 implements aaShadow.a {
    public static final y7 a = new y7();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "id"});

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
        ri0.m3 c = ri0.o3.c(eVar, wVar);
        eVar.s0();
        ri0.t3 t3Var = ri0.t3.a;
        ri0.q3 c2 = ri0.t3.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new kc0.xb(str, str2, c, c2);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.xb xbVar = (kc0.xb) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xbVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, xbVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, xbVar.b);
        List list = ri0.o3.a;
        ri0.m3 m3Var = xbVar.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m3Var, "value");
        fVar.z0("id");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, m3Var.a);
        fVar.z0("number");
        fVar.z(m3Var.b);
        fVar.z0("repository");
        aa.c.c(ri0.p3.a, false).b(fVar, wVar, m3Var.c);
        fVar.z0("__typename");
        bVar2.b(fVar, wVar, m3Var.d);
        ri0.t3 t3Var = ri0.t3.a;
        ri0.t3.d(fVar, wVar, xbVar.d);
    }
}
