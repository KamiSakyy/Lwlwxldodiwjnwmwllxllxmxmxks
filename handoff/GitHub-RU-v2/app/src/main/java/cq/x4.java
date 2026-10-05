package cq;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x4 implements aa.a {
    public static final x4 a = new x4();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        o4 o4Var;
        n4 n4Var;
        p4 p4Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        q4 q4Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"MarkdownFileType"}), set2, str, set)) {
            eVar.s0();
            o4Var = c5.c(eVar, wVar);
        } else {
            o4Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"ImageFileType"}), set2, str, set)) {
            eVar.s0();
            n4Var = b5.c(eVar, wVar);
        } else {
            n4Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PdfFileType"}), set2, str, set)) {
            eVar.s0();
            p4Var = d5.c(eVar, wVar);
        } else {
            p4Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"TextFileType"}), set2, str, set)) {
            eVar.s0();
            q4Var = e5.c(eVar, wVar);
        }
        return new j4(str, o4Var, n4Var, p4Var, q4Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        j4 j4Var = (j4) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j4Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, j4Var.a);
        o4 o4Var = j4Var.b;
        if (o4Var != null) {
            c5.d(fVar, wVar, o4Var);
        }
        n4 n4Var = j4Var.c;
        if (n4Var != null) {
            List list = b5.a;
            fVar.z0("url");
            aa.c.i.b(fVar, wVar, n4Var.a);
        }
        p4 p4Var = j4Var.d;
        if (p4Var != null) {
            List list2 = d5.a;
            fVar.z0("url");
            aa.c.i.b(fVar, wVar, p4Var.a);
        }
        q4 q4Var = j4Var.e;
        if (q4Var != null) {
            e5.d(fVar, wVar, q4Var);
        }
    }
}
