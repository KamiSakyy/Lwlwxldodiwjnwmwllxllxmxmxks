package el0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id"});

    public static dl0.d c(ea.e eVar, aa.w wVar) {
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
        yg0.o c = yg0.q.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new dl0.d(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, dl0.d dVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, dVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, dVar.b);
        List list = yg0.q.a;
        yg0.q.d(fVar, wVar, dVar.c);
    }
    public Object a(Object p1) { return null; }
    public Object b(Object p1) { return null; }
    public static final Object f = null;
    public static final Object i = null;
    public static final Object k = null;
}
