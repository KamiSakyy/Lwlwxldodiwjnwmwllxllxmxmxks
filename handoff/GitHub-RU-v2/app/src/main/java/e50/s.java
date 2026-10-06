package e50;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public class s implements aa.a {
    public static final s a = new s();
    public static final List b = sy.d0Shadow.o("__typename", "id", "comments");

    public static p c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        m mVar = null;
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
                mVar = (m) aa.c.c(r.a, false).a(eVar, wVar);
            }
        }
        eVar.s0();
        i80.e eVar2 = i80.e.a;
        i80.c c = i80.e.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (mVar != null) {
            return new p(str, str2, mVar, c);
        }
        k41.b.B(eVar, "comments");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, p pVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(pVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, pVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, pVar.b);
        fVar.z0("comments");
        aa.c.c(r.a, false).b(fVar, wVar, pVar.c);
        i80.e eVar = i80.e.a;
        i80.e.d(fVar, wVar, pVar.d);
    }

    public final /* bridge */ /* synthetic */ Object a(ea.e eVar, aa.w wVar) {
        return c(eVar, wVar);
    }

    public final /* bridge */ /* synthetic */ void b(ea.f fVar, aa.w wVar, Object obj) {
        d(fVar, wVar, (p) obj);
    }
}
