package a80;

import hc0.bb;
import hc0.db;
import hc0.fb;
import java.util.List;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class i {
    public static final List a;

    static {
        bb.Companion.getClass();
        aa.r b = l0.b(bb.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        db.Companion.getClass();
        aa.m mVar2 = new aa.m("number", l0.b(db.a), (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("__typename", l0.b(fb.a), (String) null, rVar, rVar, rVar)});
    }
}
