package x80;

import aa.r;
import hc0.bb;
import hc0.db;
import hc0.fb;
import hc0.xa;
import java.util.List;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class k {
    public static final List a;

    static {
        fb.Companion.getClass();
        r b = l0.b(fb.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        aa.m mVar2 = new aa.m("id", l0.b(bb.a), (String) null, rVar, rVar, rVar);
        db.Companion.getClass();
        aa.m mVar3 = new aa.m("stargazerCount", l0.b(db.a), (String) null, rVar, rVar, rVar);
        xa.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar, mVar2, mVar3, new aa.m("viewerHasStarred", l0.b(xa.a), (String) null, rVar, rVar, rVar)});
    }
}
