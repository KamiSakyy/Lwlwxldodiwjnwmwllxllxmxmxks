package d30;

import aa.m;
import aa.r;
import aa.x;
import hc0.bb;
import hc0.ew;
import hc0.fb;
import java.util.List;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class c {
    public static final List a;

    static {
        bb.Companion.getClass();
        r b = l0.b(bb.a);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        x xVar = fb.a;
        m mVar2 = new m("login", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("name", xVar, (String) null, rVar, rVar, rVar);
        ew.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, mVar3, new m("avatarUrl", l0.b(ew.a), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
