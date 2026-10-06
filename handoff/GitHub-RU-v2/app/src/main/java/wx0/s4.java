package wx0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s4 implements aa.a {
    public static final s4 a = new s4();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        i5 c = j5.c(eVar, wVar);
        if (str != null) {
            return new q4(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        q4 q4Var = (q4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q4Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, q4Var.a);
        List list = j5.a;
        i5 i5Var = q4Var.b;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i5Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, i5Var.a);
        fVar.z0("name");
        bVar.b(fVar, wVar, i5Var.b);
        fVar.z0("nameHTML");
        bVar.b(fVar, wVar, i5Var.c);
    }
}
