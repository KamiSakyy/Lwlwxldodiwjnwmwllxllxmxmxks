package w00;

import a10.d;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.i4;
import jo.mi0;
import k71.k;
import l81.n;
import nm.g;
import q81.q;
import q81.t;
import q81.u;
import v71.v;
import w51.r;
import y71.i;
import y71.n1Shadow;
import z01.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c implements l0, mi0 {
    public static final a Companion = new a();
    public v r;
    public oy.a s;

    public c(u uVar, v vVar, String str) {
        k.g(uVar, "okHttpClient");
        k.g(vVar, "ioDispatcher");
        this.r = vVar;
        n q = d5.q(new v00.n(28));
        r rVar = new r(11);
        rVar.l(xb.b.a(str));
        t71.n nVar = q.d;
        rVar.e(a.a.g(q, i4.V("application/json")));
        t a = uVar.a();
        a.c.add(new d(3));
        rVar.s = new u(a);
        this.s = (oy.a) rVar.m().l(oy.a.class);
    }

    public final i a(String str, String str2, String str3) {
        k.g(str, "text");
        return n1Shadow.y(new g(d11.b.b(d11.a.t, new n5.v(str2, str3, this, str, (a71.c) null, 6)), 15), this.r);
    }

    public final Object h() {
        return this;
    }
}
