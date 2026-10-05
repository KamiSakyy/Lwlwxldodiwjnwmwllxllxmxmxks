package t00;

import jo.kv;
import jo.lv;
import jo.mv;
import jo.nv;
import jo.ov;
import jo.pv;
import m10.z00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x6 extends c71.j implements j71.e {
    public final /* synthetic */ int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ rm0.y6 x;
    public final /* synthetic */ String y;
    public final /* synthetic */ z00 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x6(rm0.y6 y6Var, String str, z00 z00Var, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.x = y6Var;
        this.y = str;
        this.z = z00Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                x6 x6Var = new x6(this.x, this.y, this.z, cVar, 0);
                x6Var.w = obj;
                return x6Var;
            default:
                x6 x6Var2 = new x6(this.x, this.y, this.z, cVar, 1);
                x6Var2.w = obj;
                return x6Var2;
        }
    }

    public final Object s(Object obj, Object obj2) {
        pv.c cVar = (pv.c) obj;
        a71.c cVar2 = (a71.c) obj2;
        switch (this.v) {
        }
        return r(cVar2, cVar).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        int i = this.v;
        aa.m0 m0Var = null;
        z00 z00Var = this.z;
        String str = this.y;
        rm0.y6 y6Var = this.x;
        switch (i) {
            case 0:
                pv.c cVar = (pv.c) this.w;
                b71.a aVar = b71.a.r;
                sy.y.j(obj);
                com.github.service.wrapper.b bVar = y6Var.s;
                jo.m0 m0Var2 = new jo.m0(str, z00Var);
                if (cVar != null) {
                    String str2 = cVar.a;
                    m0Var = new jo.i0(new jo.g0(new jo.l0(str2, cVar), new jo.k0(new jo.j0(str2, cVar), cVar.b, str2)));
                }
                return y71.n1.y(bVar.k(m0Var2, m0Var), y6Var.t);
            default:
                pv.c cVar2 = (pv.c) this.w;
                b71.a aVar2 = b71.a.r;
                sy.y.j(obj);
                com.github.service.wrapper.b bVar2 = y6Var.s;
                pv pvVar = new pv(str, z00Var);
                if (cVar2 != null) {
                    String str3 = cVar2.a;
                    m0Var = new kv(new nv(new ov(str3, cVar2), new mv(new lv(str3, cVar2), cVar2.b, str3)));
                }
                return y71.n1.y(bVar2.k(pvVar, m0Var), y6Var.t);
        }
    }
}
