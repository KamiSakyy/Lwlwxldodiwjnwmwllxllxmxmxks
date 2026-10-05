package lt0;

import aa.m;
import aa.r;
import java.util.List;
import pz0.pd;
import pz0.td;
import pz0.xd;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        td.Companion.getClass();
        r b = l0.b(td.a);
        x61.r rVar = x61.r.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        m mVar2 = new m("viewerIsFollowing", l0.b(pd.a), (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, new m("__typename", l0.b(xd.a), (String) null, rVar, rVar, rVar)});
    }
}
