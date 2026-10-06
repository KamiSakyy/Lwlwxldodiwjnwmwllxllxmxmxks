package cz0;

import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.i4;
import jn0.yf0;
import jo.mi0;
import k71.k;
import l81.n;
import m00.e;
import q81.q;
import q81.u;
import v71.v;
import w51.r;
import xn.q1;
import y71.i;
import y71.n1Shadow;
import z01.f1Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b implements f1, yf0, mi0 {
    public final /* synthetic */ int r;
    public v s;
    public Object t;

    public b(int i, String str, u uVar, v vVar) {
        this.r = i;
        k.g(uVar, "okHttpClient");
        k.g(vVar, "ioDispatcher");
        switch (i) {
            case 1:
                this.s = vVar;
                n q = d5.q(new q1(21));
                r rVar = new r(11);
                rVar.l(xb.b.a(str));
                t71.n nVar = q.d;
                rVar.e(a.a.g(q, i4.V("application/json")));
                rVar.s = new u(uVar.a());
                this.t = (e) rVar.m().l(e.class);
                break;
            default:
                this.s = vVar;
                n q2 = d5.q(new com.github.rudroid.utilities.ui.emojipicker.e(23));
                r rVar2 = new r(11);
                rVar2.l(xb.b.a(str));
                t71.n nVar2 = q.d;
                rVar2.e(a.a.g(q2, i4.V("application/json")));
                rVar2.s = new u(uVar.a());
                this.t = (py0.e) rVar2.m().l(py0.e.class);
                break;
        }
    }

    @Override // z01.f1Shadow
    public final i a(String str, String str2, String str3, boolean z) {
        switch (this.r) {
            case 0:
                k.g(str, "parentRepositoryOwner");
                k.g(str2, "parentRepositoryName");
                return n1Shadow.y(in.rShadow.l(d11.b.b(d11.a.t, new a(this, str, str2, str3, z, null, 0))), this.s);
            default:
                k.g(str, "parentRepositoryOwner");
                k.g(str2, "parentRepositoryName");
                return n1Shadow.y(in.rShadow.l(d11.b.b(d11.a.t, new a(this, str, str2, str3, z, null, 1))), this.s);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
}
