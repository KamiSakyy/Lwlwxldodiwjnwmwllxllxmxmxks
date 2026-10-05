package a10;

import a0.m1;
import com.github.service.repositorycreation.CreateRepositoryInput;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.i4;
import jo.mi0;
import k71.k;
import l81.n;
import q81.q;
import q81.t;
import q81.u;
import v71.v;
import w51.r;
import y71.i;
import y71.n1;
import z01.e1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e implements e1, mi0 {
    public static final a Companion = new a();
    public final v r;
    public final s00.a s;

    public e(u uVar, v vVar, String str) {
        k.g(uVar, "okHttpClient");
        k.g(vVar, "ioDispatcher");
        this.r = vVar;
        n q = d5.q(new m1(25));
        r rVar = new r(11);
        rVar.l(xb.b.a(str));
        t71.n nVar = q.d;
        rVar.e(a.a.g(q, i4.V("application/json")));
        t a = uVar.a();
        a.c.add(new d(0));
        rVar.s = new u(a);
        this.s = (s00.a) rVar.m().l(s00.a.class);
    }

    public final i a() {
        return n1.y(d11.b.b(d11.a.t, new c(this, null, 0)), this.r);
    }

    public final i b(CreateRepositoryInput createRepositoryInput) {
        return n1.y(d11.b.b(d11.b.a, new b(this, createRepositoryInput, null, 0)), this.r);
    }

    public final i c() {
        return n1.y(d11.b.b(d11.a.t, new c(this, null, 1)), this.r);
    }

    public final Object h() {
        return this;
    }
}
