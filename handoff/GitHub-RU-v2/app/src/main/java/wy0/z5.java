package wy0;

import jn0.nt;
import jn0.ot;
import jn0.pt;
import jn0.qt;
import jn0.rt;
import jn0.st;
import pz0.cv;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z5 extends c71.j implements j71.e {
    public final /* synthetic */ int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ rm0.y6 x;
    public final /* synthetic */ String y;
    public final /* synthetic */ cv z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z5(rm0.y6 y6Var, String str, cv cvVar, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.x = y6Var;
        this.y = str;
        this.z = cvVar;
    }

    @Override // c71.a
    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                z5 z5Var = new z5(this.x, this.y, this.z, cVar, 0);
                z5Var.w = obj;
                return z5Var;
            default:
                z5 z5Var2 = new z5(this.x, this.y, this.z, cVar, 1);
                z5Var2.w = obj;
                return z5Var2;
        }
    }

    @Override // j71.e
    public final Object s(Object obj, Object obj2) {
        gu0.c cVar = (gu0.c) obj;
        a71.c cVar2 = (a71.c) obj2;
        switch (this.v) {
        }
        return ((z5) r(cVar2, cVar)).v(w61.a0.a);
    }

    @Override // c71.a
    public final Object v(Object obj) {
        int i = this.v;
        aa.m0 m0Var = null;
        cv cvVar = this.z;
        String str = this.y;
        rm0.y6 y6Var = this.x;
        switch (i) {
            case 0:
                gu0.c cVar = (gu0.c) this.w;
                b71.a aVar = b71.a.r;
                sy.y.j(obj);
                com.github.service.wrapper.b bVar = y6Var.s;
                jn0.h0 h0Var = new jn0.h0(str, cvVar);
                if (cVar != null) {
                    String str2 = cVar.a;
                    m0Var = new jn0.d0(new jn0.b0(new jn0.g0(cVar, str2), new jn0.f0(new jn0.e0(cVar, str2), cVar.b, str2)));
                }
                return y71.n1.y(bVar.k(h0Var, m0Var), y6Var.t);
            default:
                gu0.c cVar2 = (gu0.c) this.w;
                b71.a aVar2 = b71.a.r;
                sy.y.j(obj);
                com.github.service.wrapper.b bVar2 = y6Var.s;
                st stVar = new st(str, cvVar);
                if (cVar2 != null) {
                    String str3 = cVar2.a;
                    m0Var = new nt(new qt(new rt(cVar2, str3), new pt(new ot(cVar2, str3), cVar2.b, str3)));
                }
                return y71.n1.y(bVar2.k(stVar, m0Var), y6Var.t);
        }
    }
}
