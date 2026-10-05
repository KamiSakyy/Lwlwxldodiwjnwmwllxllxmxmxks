package com.github.rudroid.uitoolkit.snackbar;

import androidx.compose.runtime.f1;
import androidx.compose.runtime.s;
import com.github.rudroid.uitoolkit.f3;
import com.google.android.gms.internal.measurement.z3;
import f1.p5;
import f1.ub;
import w1.r;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p extends k71.l implements j71.e {
    public final /* synthetic */ f1 s;
    public final /* synthetic */ y3.k t;
    public final /* synthetic */ String u;
    public final /* synthetic */ String v;
    public final /* synthetic */ String w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(f1 f1Var, y3.k kVar, j71.a aVar, String str, String str2, String str3) {
        super(2);
        this.s = f1Var;
        this.t = kVar;
        this.u = str;
        this.v = str2;
        this.w = str3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x012d, code lost:
    
        if (r7 == r3) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj, Object obj2) {
        Object obj3;
        s sVar = (s) obj;
        int intValue = ((Number) obj2).intValue() & 3;
        a0 a0Var = a0.a;
        if (intValue == 2 && sVar.C()) {
            sVar.V();
            return a0Var;
        }
        this.s.setValue(a0Var);
        y3.k kVar = this.t;
        kVar.getClass();
        kVar.d();
        sVar.c0(-1540358435);
        y3.k kVar2 = (y3.k) kVar.c().s;
        y3.d b = kVar2.b();
        y3.d b2 = kVar2.b();
        y3.d b3 = kVar2.b();
        y3.d b4 = kVar2.b();
        String str = this.u;
        boolean f = sVar.f(str);
        Object N = sVar.N();
        Object obj4 = androidx.compose.runtime.n.a;
        if (f || N == obj4) {
            N = new f(str);
            sVar.n0(N);
        }
        w1.o oVar = w1.o.a;
        r a = y3.k.a(oVar, b, (j71.c) N);
        if (str == null) {
            str = "";
        }
        f3.a(a, str, false, com.github.rudroid.uitoolkit.a.x, false, null, null, null, sVar, 3072, 244);
        boolean f2 = sVar.f(b3) | sVar.f(b) | sVar.f(b4);
        Object N2 = sVar.N();
        if (f2 || N2 == obj4) {
            N2 = new g(b3, b, b4);
            sVar.n0(N2);
        }
        ub.b(this.v, y3.k.a(oVar, b2, (j71.c) N2), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 2, 0, (j71.c) null, ih.d.f(sVar).n, sVar, 0, 24576, 114684);
        String str2 = this.w;
        String str3 = str2 != null ? str2 : "";
        boolean f3 = sVar.f(b2) | sVar.f(b) | sVar.f(b4) | sVar.f(str2);
        Object N3 = sVar.N();
        if (f3) {
            obj3 = obj4;
        } else {
            obj3 = obj4;
        }
        N3 = new h(b2, b, b4, str2);
        sVar.n0(N3);
        Object obj5 = obj3;
        ub.b(str3, y3.k.a(oVar, b3, (j71.c) N3), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 1, 0, (j71.c) null, ih.d.f(sVar).x, sVar, 0, 24576, 114684);
        Object N4 = sVar.N();
        if (N4 == obj5) {
            N4 = i.r;
            sVar.n0(N4);
        }
        p5.a(z3.C(2131231164, 0, sVar), (String) null, y3.k.a(oVar, b4, (j71.c) N4), ih.d.b(sVar).F, sVar, 56, 0);
        sVar.q(false);
        return a0Var;
    }
}
