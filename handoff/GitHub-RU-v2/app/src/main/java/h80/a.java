package h80;

import aa.m;
import aa.x;
import hc0.bb;
import hc0.db;
import hc0.fb;
import java.util.List;
import k71.k;
import v8.l0;
import x61.l;
import x61.r;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        db.Companion.getClass();
        x xVar = db.a;
        k.g(xVar, "type");
        r rVar = r.r;
        m mVar = new m("startLine", xVar, (String) null, rVar, rVar, rVar);
        m mVar2 = new m("line", xVar, "endLine", rVar, rVar, rVar);
        fb.Companion.getClass();
        x xVar2 = fb.a;
        k.g(xVar2, "type");
        m mVar3 = new m("startLineType", xVar2, (String) null, rVar, rVar, rVar);
        m mVar4 = new m("endLineType", xVar2, (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, new m("id", l0.b(bb.a), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
