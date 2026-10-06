package ep;

import java.util.List;
import jo.ac0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kx implements aaShadow.a {
    public static final kx a = new kx();
    public static final List b = sy.d0.o("__typename", "id");

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
        ms.i c = ms.l.c(eVar, wVar);
        eVar.s0();
        pv.f fVar = pv.f.a;
        pv.c c2 = pv.f.c(eVar, wVar);
        eVar.s0();
        ms.o c3 = ms.p.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new ac0(str, str2, c, c2, c3);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ac0 ac0Var = (ac0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ac0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, ac0Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, ac0Var.b);
        List list = ms.l.a;
        ms.l.d(fVar, wVar, ac0Var.c);
        pv.f fVar2 = pv.f.a;
        pv.f.d(fVar, wVar, ac0Var.d);
        List list2 = ms.p.a;
        ms.p.d(fVar, wVar, ac0Var.e);
    }
}
