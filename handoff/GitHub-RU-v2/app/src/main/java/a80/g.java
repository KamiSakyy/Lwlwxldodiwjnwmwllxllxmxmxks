package a80;

import aa.x;
import hc0.bb;
import hc0.db;
import hc0.fb;
import java.util.List;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class g {
    public static final List a;

    static {
        bb.Companion.getClass();
        aa.r b = l0.b(bb.a);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        db.Companion.getClass();
        x xVar = db.a;
        k71.k.g(xVar, "type");
        aa.m mVar2 = new aa.m("totalCommentsCount", xVar, (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("__typename", l0.b(fb.a), (String) null, rVar, rVar, rVar)});
    }
}
