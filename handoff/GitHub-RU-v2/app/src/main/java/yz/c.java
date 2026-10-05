package yz;

import aa.k;
import aa.m;
import aa.r;
import aa.s;
import aa.u0;
import aa.x;
import java.util.List;
import m10.eh;
import m10.ix;
import m10.st;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class c {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("ProjectV2ViewItemConnection");
        List list = b.a;
        List r = l.r(new s[]{mVar, no.a.c(list, "selections", "ProjectV2ViewItemConnection", n, list)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s mVar3 = new m("viewGroupId", xVar, (String) null, rVar, rVar, rVar);
        List n2 = d0.n("ProjectV2Group");
        List list2 = a.a;
        s c = no.a.c(list2, "selections", "ProjectV2Group", n2, list2);
        ix.Companion.getClass();
        r b2 = l0.b(ix.a);
        st.Companion.getClass();
        a = l.r(new s[]{mVar2, mVar3, c, new m("items", b2, (String) null, rVar, l.r(new k[]{new k(st.a, new u0((Object) null)), new k(st.b, new u0(20))}), r)});
    }
}
