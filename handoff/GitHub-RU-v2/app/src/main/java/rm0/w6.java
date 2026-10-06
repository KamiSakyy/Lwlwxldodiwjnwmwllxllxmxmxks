package rm0;

import gn0.bo;
import kc0.kr;
import kc0.lr;
import kc0.mr;
import kc0.nr;
import kc0.or;
import kc0.pr;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w6 extends c71.j implements j71.e {
    public final /* synthetic */ int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ y6 x;
    public final /* synthetic */ String y;
    public final /* synthetic */ bo z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w6(y6 y6Var, String str, bo boVar, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.x = y6Var;
        this.y = str;
        this.z = boVar;
    }

    @Override // c71.a
    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                w6 w6Var = new w6(this.x, this.y, this.z, cVar, 0);
                w6Var.w = obj;
                return w6Var;
            default:
                w6 w6Var2 = new w6(this.x, this.y, this.z, cVar, 1);
                w6Var2.w = obj;
                return w6Var2;
        }
    }

    @Override // j71.e
    public final Object s(Object obj, Object obj2) {
        aj0.c cVar = (aj0.c) obj;
        a71.c cVar2 = (a71.c) obj2;
        switch (this.v) {
        }
        return ((w6) r(cVar2, cVar)).v(w61.a0.a);
    }

    @Override // c71.a
    public final Object v(Object obj) {
        int i = this.v;
        aa.m0 m0Var = null;
        bo boVar = this.z;
        String str = this.y;
        y6 y6Var = this.x;
        switch (i) {
            case 0:
                aj0.c cVar = (aj0.c) this.w;
                b71.a aVar = b71.a.r;
                sy.y.j(obj);
                com.github.service.wrapper.bShadow bVar = y6Var.s;
                kc0.h0 h0Var = new kc0.h0(str, boVar);
                if (cVar != null) {
                    String str2 = cVar.a;
                    m0Var = new kc0.d0(new kc0.b0(new kc0.g0(cVar, str2), new kc0.f0(new kc0.e0(cVar, str2), cVar.b, str2)));
                }
                return y71.n1.y(bVar.k(h0Var, m0Var), y6Var.t);
            default:
                aj0.c cVar2 = (aj0.c) this.w;
                b71.a aVar2 = b71.a.r;
                sy.y.j(obj);
                com.github.service.wrapper.bShadow bVar2 = y6Var.s;
                pr prVar = new pr(str, boVar);
                if (cVar2 != null) {
                    String str3 = cVar2.a;
                    m0Var = new kr(new nr(new or(cVar2, str3), new mr(new lr(cVar2, str3), cVar2.b, str3)));
                }
                return y71.n1.y(bVar2.k(prVar, m0Var), y6Var.t);
        }
    }
}
