package ap0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r implements aa.a {
    public static final r a = new r();
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
        d0 c = e0.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new n(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        n nVar = (n) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(nVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, nVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, nVar.b);
        List list = e0.a;
        d0 d0Var = nVar.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d0Var, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, d0Var.a);
        fVar.z0("id");
        bVar2.b(fVar, wVar, d0Var.b);
        fVar.z0("url");
        bVar2.b(fVar, wVar, d0Var.c);
        fVar.z0("title");
        bVar2.b(fVar, wVar, d0Var.d);
        fVar.z0("bodyHTML");
        bVar2.b(fVar, wVar, d0Var.e);
        fVar.z0("bodyText");
        bVar2.b(fVar, wVar, d0Var.f);
        fVar.z0("number");
        fVar.z(d0Var.g);
        fVar.z0("repository");
        aa.c.c(f0.a, true).b(fVar, wVar, d0Var.h);
        gu0.f fVar2 = gu0.f.a;
        gu0.f.d(fVar, wVar, d0Var.i);
    }
}
