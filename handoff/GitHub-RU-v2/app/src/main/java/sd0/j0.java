package sd0;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j0 implements aa.a {
    public static final j0 a = new j0();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        a0Shadow a0Var;
        z zVar;
        b0 b0Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        c0 c0Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"MarkdownFileType"}), set2, str, set)) {
            eVar.s0();
            a0Var = o0.c(eVar, wVar);
        } else {
            a0Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"ImageFileType"}), set2, str, set)) {
            eVar.s0();
            zVar = n0.c(eVar, wVar);
        } else {
            zVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PdfFileType"}), set2, str, set)) {
            eVar.s0();
            b0Var = p0.c(eVar, wVar);
        } else {
            b0Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"TextFileType"}), set2, str, set)) {
            eVar.s0();
            c0Var = q0.c(eVar, wVar);
        }
        return new v(str, a0Var, zVar, b0Var, c0Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        v vVar = (v) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(vVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, vVar.a);
        a0Shadow a0Var = vVar.b;
        if (a0Var != null) {
            o0.d(fVar, wVar, a0Var);
        }
        z zVar = vVar.c;
        if (zVar != null) {
            List list = n0.a;
            fVar.z0("url");
            aa.c.i.b(fVar, wVar, zVar.a);
        }
        b0 b0Var = vVar.d;
        if (b0Var != null) {
            List list2 = p0.a;
            fVar.z0("url");
            aa.c.i.b(fVar, wVar, b0Var.a);
        }
        c0 c0Var = vVar.e;
        if (c0Var != null) {
            q0.d(fVar, wVar, c0Var);
        }
    }
}
