package p20;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i8 implements aaShadow.a {
    public static final i8 a = new i8();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        u10.pc pcVar;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        u10.qc qcVar = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"MarkdownFileType"}), set2, str, set)) {
            eVar.s0();
            pcVar = k8.c(eVar, wVar);
        } else {
            pcVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"TextFileType"}), set2, str, set)) {
            eVar.s0();
            qcVar = l8.c(eVar, wVar);
        }
        return new u10.nc(str, pcVar, qcVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.nc ncVar = (u10.nc) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ncVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, ncVar.a);
        u10.pc pcVar = ncVar.b;
        if (pcVar != null) {
            List list = k8.a;
            fVar.z0("contentRaw");
            aa.c.i.b(fVar, wVar, pcVar.a);
        }
        u10.qc qcVar = ncVar.c;
        if (qcVar != null) {
            List list2 = l8.a;
            fVar.z0("contentRaw");
            aa.c.i.b(fVar, wVar, qcVar.a);
        }
    }
}
