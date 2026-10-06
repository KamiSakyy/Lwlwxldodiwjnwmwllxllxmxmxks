package vb0;

import hc0.zm;
import u10.gq;
import u10.hq;
import u10.iq;
import u10.jq;
import u10.kq;
import u10.lq;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e5 extends c71.j implements j71.e {
    public final /* synthetic */ int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ rm0.y6 x;
    public final /* synthetic */ String y;
    public final /* synthetic */ zm z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e5(rm0.y6 y6Var, String str, zm zmVar, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.x = y6Var;
        this.y = str;
        this.z = zmVar;
    }

    @Override // c71.a
    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                e5 e5Var = new e5(this.x, this.y, this.z, cVar, 0);
                e5Var.w = obj;
                return e5Var;
            default:
                e5 e5Var2 = new e5(this.x, this.y, this.z, cVar, 1);
                e5Var2.w = obj;
                return e5Var2;
        }
    }

    @Override // j71.e
    public final Object s(Object obj, Object obj2) {
        i80.c cVar = (i80.c) obj;
        a71.c cVar2 = (a71.c) obj2;
        switch (this.v) {
        }
        return ((e5) r(cVar2, cVar)).v(w61.a0.a);
    }

    @Override // c71.a
    public final Object v(Object obj) {
        int i = this.v;
        aa.m0 m0Var = null;
        zm zmVar = this.z;
        String str = this.y;
        rm0.y6 y6Var = this.x;
        switch (i) {
            case 0:
                i80.c cVar = (i80.c) this.w;
                b71.a aVar = b71.a.r;
                sy.y.j(obj);
                com.github.service.wrapper.b bVar = y6Var.s;
                u10.h0 h0Var = new u10.h0(str, zmVar);
                if (cVar != null) {
                    String str2 = cVar.a;
                    m0Var = new u10.d0(new u10.b0(new u10.g0(cVar, str2), new u10.f0(new u10.e0(cVar, str2), cVar.b, str2)));
                }
                return y71.n1Shadow.y(bVar.k(h0Var, m0Var), y6Var.t);
            default:
                i80.c cVar2 = (i80.c) this.w;
                b71.a aVar2 = b71.a.r;
                sy.y.j(obj);
                com.github.service.wrapper.b bVar2 = y6Var.s;
                lq lqVar = new lq(str, zmVar);
                if (cVar2 != null) {
                    String str3 = cVar2.a;
                    m0Var = new gq(new jq(new kq(cVar2, str3), new iq(new hq(cVar2, str3), cVar2.b, str3)));
                }
                return y71.n1Shadow.y(bVar2.k(lqVar, m0Var), y6Var.t);
        }
    }
}
