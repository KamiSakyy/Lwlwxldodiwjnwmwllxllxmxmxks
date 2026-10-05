package uo;

import aa.m;
import aa.x;
import java.util.List;
import k71.k;
import m10.ah;
import m10.cc0;
import m10.eh;
import v8.l0;
import x61.l;
import x61.r;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d {
    public static final List a;

    static {
        cc0.Companion.getClass();
        x xVar = cc0.a;
        k.g(xVar, "type");
        r rVar = r.r;
        m mVar = new m("mobileUpdatesUrl", xVar, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        m mVar2 = new m("id", l0.b(ah.a), (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, new m("__typename", l0.b(eh.a), (String) null, rVar, rVar, rVar)});
    }
}
