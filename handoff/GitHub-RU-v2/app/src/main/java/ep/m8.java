package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m8 implements aa.a {
    public static final m8 a = new m8();
    public static final List b = sy.d0.o("repository", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.sc scVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                scVar = (jo.sc) aa.c.b(aa.c.c(o8.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
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
            return new jo.qc(scVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.qc qcVar = (jo.qc) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qcVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(o8.a, false)).b(fVar, wVar, qcVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, qcVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, qcVar.c);
    }
}
