package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u4 implements aa.a {
    public static final u4 a = new u4();
    public static final List b = sy.d0.o("id", "replyTo", "discussion", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        u10.p7 p7Var = null;
        u10.n7 n7Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                p7Var = (u10.p7) aa.c.b(aa.c.c(a5.a, true)).a(eVar, wVar);
            } else if (r0 == 2) {
                n7Var = (u10.n7) aa.c.b(aa.c.c(y4.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 3) {
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
            return new u10.i7(str, p7Var, n7Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.i7 i7Var = (u10.i7) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i7Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, i7Var.a);
        fVar.z0("replyTo");
        aa.c.b(aa.c.c(a5.a, true)).b(fVar, wVar, i7Var.b);
        fVar.z0("discussion");
        aa.c.b(aa.c.c(y4.a, false)).b(fVar, wVar, i7Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, i7Var.d);
    }
}
