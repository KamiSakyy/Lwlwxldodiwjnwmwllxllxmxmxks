package ep;

import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kf implements aa.a {
    public static final kf a = new kf();
    public static final List b = sy.d0.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        jo.ym ymVar;
        jo.zm zmVar;
        jo.xm xmVar;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Set set = wVar.b;
        Set set2 = wVar.a;
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
        if (str == null) {
            throw new IllegalStateException("__typename was not found");
        }
        if (m71.a.v(m71.a.O(new String[]{"Issue"}), set2, str, set)) {
            eVar.s0();
            ymVar = mf.c(eVar, wVar);
        } else {
            ymVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"PullRequest"}), set2, str, set)) {
            eVar.s0();
            zmVar = nf.c(eVar, wVar);
        } else {
            zmVar = null;
        }
        if (m71.a.v(m71.a.O(new String[]{"Discussion"}), set2, str, set)) {
            eVar.s0();
            xmVar = lf.c(eVar, wVar);
        } else {
            xmVar = null;
        }
        if (str2 != null) {
            return new jo.wm(str, str2, ymVar, zmVar, xmVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.wm wmVar = (jo.wm) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wmVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, wmVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, wmVar.b);
        jo.ym ymVar = wmVar.c;
        if (ymVar != null) {
            mf.d(fVar, wVar, ymVar);
        }
        jo.zm zmVar = wmVar.d;
        if (zmVar != null) {
            nf.d(fVar, wVar, zmVar);
        }
        jo.xm xmVar = wmVar.e;
        if (xmVar != null) {
            lf.d(fVar, wVar, xmVar);
        }
    }
}
