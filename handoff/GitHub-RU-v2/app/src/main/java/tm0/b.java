package tm0;

import a10.d;
import a71.c;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.i4;
import jn0.yf0;
import k71.k;
import kc0.yb0;
import l81.n;
import nm.g;
import q81.q;
import q81.t;
import q81.u;
import t00.ua;
import u10.y90;
import v71.v;
import w51.r;
import wy0.p4;
import y71.i;
import y71.n1;
import z01.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b implements l0, yb0, y90, yf0 {
    public final /* synthetic */ int r;
    public final v s;
    public final Object t;

    public b(int i, String str, u uVar, v vVar) {
        this.r = i;
        k.g(uVar, "okHttpClient");
        k.g(vVar, "ioDispatcher");
        switch (i) {
            case 1:
                this.s = vVar;
                n q = d5.q(new p4(24));
                r rVar = new r(11);
                rVar.l(xb.b.a(str));
                t71.n nVar = q.d;
                rVar.e(a.a.g(q, i4.V("application/json")));
                t a = uVar.a();
                a.c.add(new d(4));
                rVar.s = new u(a);
                this.t = (ua0.a) rVar.m().l(ua0.a.class);
                break;
            case 2:
                this.s = vVar;
                n q2 = d5.q(new ze.a(18));
                r rVar2 = new r(11);
                rVar2.l(xb.b.a(str));
                t71.n nVar2 = q.d;
                rVar2.e(a.a.g(q2, i4.V("application/json")));
                t a2 = uVar.a();
                a2.c.add(new d(5));
                rVar2.s = new u(a2);
                this.t = (xw0.a) rVar2.m().l(xw0.a.class);
                break;
            default:
                this.s = vVar;
                n q3 = d5.q(new ua(3));
                r rVar3 = new r(11);
                rVar3.l(xb.b.a(str));
                t71.n nVar3 = q.d;
                rVar3.e(a.a.g(q3, i4.V("application/json")));
                t a3 = uVar.a();
                a3.c.add(new d(2));
                rVar3.s = new u(a3);
                this.t = (ll0.a) rVar3.m().l(ll0.a.class);
                break;
        }
    }

    @Override // z01.l0
    public final i a(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                k.g(str, "text");
                return n1.y(new g(d11.b.b(d11.a.t, new n5.v(str2, str3, this, str, (c) null, 3)), 4), this.s);
            case 1:
                k.g(str, "text");
                return n1.y(new g(d11.b.b(d11.a.t, new n5.v(str2, str3, this, str, (c) null, 7)), 18), this.s);
            default:
                k.g(str, "text");
                return n1.y(new g(d11.b.b(d11.a.t, new n5.v(str2, str3, this, str, (c) null, 8)), 21), this.s);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }
}
