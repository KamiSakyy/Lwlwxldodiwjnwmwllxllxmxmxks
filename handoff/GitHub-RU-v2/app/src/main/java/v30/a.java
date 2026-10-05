package v30;

import aa.m;
import aa.r;
import aa.x;
import hc0.bb;
import hc0.fb;
import hc0.h6;
import java.util.List;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        fb.Companion.getClass();
        x xVar = fb.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        m mVar2 = new m("id", l0.b(bb.a), (String) null, rVar, rVar, rVar);
        h6.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, new m("createdAt", l0.b(h6.a), (String) null, rVar, rVar, rVar), new m("oldBase", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("newBase", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
