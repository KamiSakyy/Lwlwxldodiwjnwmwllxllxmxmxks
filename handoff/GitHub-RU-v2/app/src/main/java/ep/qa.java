package ep;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qa implements aaShadow.a {
    public static final qa a = new qa();
    public static final List b = sy.d0Shadow.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        jo.xf xfVar;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
        jo.yf yfVar = null;
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"MarkdownFileType"}), set2, str, set)) {
            eVar.s0();
            xfVar = sa.c(eVar, wVar);
        } else {
            xfVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"TextFileType"}), set2, str, set)) {
            eVar.s0();
            yfVar = ta.c(eVar, wVar);
        }
        return new jo.vf(str, xfVar, yfVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.vf vfVar = (jo.vf) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(vfVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, vfVar.a);
        jo.xf xfVar = vfVar.b;
        if (xfVar != null) {
            List list = sa.a;
            fVar.z0("contentRaw");
            aa.c.i.b(fVar, wVar, xfVar.a);
        }
        jo.yf yfVar = vfVar.c;
        if (yfVar != null) {
            List list2 = ta.a;
            fVar.z0("contentRaw");
            aa.c.i.b(fVar, wVar, yfVar.a);
        }
    }
}
