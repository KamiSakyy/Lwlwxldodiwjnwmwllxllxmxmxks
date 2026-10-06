package e50;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m0 implements aa.a {
    public static final m0 a = new m0();
    public static final List b = sy.d0.o("__typename", "id", "replyTo");

    public static final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        j0 j0Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                j0Var = (j0) aa.c.b(aa.c.c(u0.a, false)).a(eVar, wVar);
            }
        }
        eVar.s0();
        i50.h c = i50.k.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new c0(str, str2, j0Var, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        c0 c0Var = (c0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, c0Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, c0Var.b);
        fVar.z0("replyTo");
        aa.c.b(aa.c.c(u0.a, false)).b(fVar, wVar, c0Var.c);
        List list = i50.k.a;
        i50.k.d(fVar, wVar, c0Var.d);
    }
    public static Object A(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public Object a(Object p1, Object p2, Object p3) { return null; }
    public static Object l(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object o(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object w(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object y(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}
