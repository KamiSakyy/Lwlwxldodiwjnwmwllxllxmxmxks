package ep;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class dg implements aa.a {
    public static final dg a = new dg();
    public static final List b = sy.d0.o("commitMessageBody", "commitMessageHeadline", "possibleCommitAuthorEmails", "state");

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        m10.vy vyVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 2) {
                arrayList = aa.c.a(aa.c.a).c(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                String u = eVar.u();
                k71.k.d(u);
                m10.vy.Companion.getClass();
                Iterator it = m10.vy.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((m10.vy) obj).r.equals(u)) {
                        break;
                    }
                }
                m10.vy vyVar2 = (m10.vy) obj;
                vyVar = vyVar2 == null ? m10.vy.t : vyVar2;
            }
        }
        if (arrayList == null) {
            k41.b.B(eVar, "possibleCommitAuthorEmails");
            throw null;
        }
        if (vyVar != null) {
            return new jo.xn(str, str2, arrayList, vyVar);
        }
        k41.b.B(eVar, "state");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.xn xnVar = (jo.xn) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xnVar, "value");
        fVar.z0("commitMessageBody");
        aa.o0 o0Var = aa.c.i;
        o0Var.b(fVar, wVar, xnVar.a);
        fVar.z0("commitMessageHeadline");
        o0Var.b(fVar, wVar, xnVar.b);
        fVar.z0("possibleCommitAuthorEmails");
        aa.c.a(aa.c.a).e(fVar, wVar, xnVar.c);
        fVar.z0("state");
        fVar.I(xnVar.d.r);
    }
}
