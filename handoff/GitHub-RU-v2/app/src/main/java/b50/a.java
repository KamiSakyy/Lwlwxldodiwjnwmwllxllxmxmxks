package b50;

import aa.m;
import aa.r;
import aa.x;
import hc0.db;
import hc0.fb;
import hc0.g8;
import hc0.xa;
import java.util.List;
import k71.k;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        g8.Companion.getClass();
        r b = l0.b(g8.s);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("type", b, (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        x xVar = fb.a;
        m mVar2 = new m("html", l0.b(xVar), (String) null, rVar, rVar, rVar);
        db.Companion.getClass();
        x xVar2 = db.a;
        k.g(xVar2, "type");
        m mVar3 = new m("left", xVar2, (String) null, rVar, rVar, rVar);
        m mVar4 = new m("right", xVar2, (String) null, rVar, rVar, rVar);
        m mVar5 = new m("text", l0.b(xVar), (String) null, rVar, rVar, rVar);
        xa.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, mVar5, new m("isMissingNewlineAtEnd", l0.b(xa.a), (String) null, rVar, rVar, rVar)});
    }
}
