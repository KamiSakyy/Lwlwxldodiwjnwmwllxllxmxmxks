package ap0;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b4 implements aa.a {
    public static final b4 a = new b4();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        s3 s3Var;
        r3 r3Var;
        t3 t3Var;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        u3 u3Var = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"MarkdownFileType"}), set2, str, set)) {
            eVar.s0();
            s3Var = g4.c(eVar, wVar);
        } else {
            s3Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"ImageFileType"}), set2, str, set)) {
            eVar.s0();
            r3Var = f4.c(eVar, wVar);
        } else {
            r3Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PdfFileType"}), set2, str, set)) {
            eVar.s0();
            t3Var = h4.c(eVar, wVar);
        } else {
            t3Var = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"TextFileType"}), set2, str, set)) {
            eVar.s0();
            u3Var = i4.c(eVar, wVar);
        }
        return new n3(str, s3Var, r3Var, t3Var, u3Var);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        n3 n3Var = (n3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(n3Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, n3Var.a);
        s3 s3Var = n3Var.b;
        if (s3Var != null) {
            g4.d(fVar, wVar, s3Var);
        }
        r3 r3Var = n3Var.c;
        if (r3Var != null) {
            List list = f4.a;
            fVar.z0("url");
            aa.c.i.b(fVar, wVar, r3Var.a);
        }
        t3 t3Var = n3Var.d;
        if (t3Var != null) {
            List list2 = h4.a;
            fVar.z0("url");
            aa.c.i.b(fVar, wVar, t3Var.a);
        }
        u3 u3Var = n3Var.e;
        if (u3Var != null) {
            i4.d(fVar, wVar, u3Var);
        }
    }
}
