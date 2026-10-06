package com.github.service.wrapper;

import aa.h0;
import aa.i0;
import aa.m0;
import aa.n0;
import aa.r0;
import aa.s0;
import aa.w0;
import c00.m;
import com.apollographql.apollo.exception.CacheMissException;
import com.google.android.gms.measurement.internal.x3;
import d1.i1;
import ga.n;
import ga.s;
import in.r;
import java.util.Set;
import k71.k;
import t00.f8;
import v71.l0;
import w61.a0;
import y71.n1;
import y71.y;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i implements a, b, j {
    public z9.b a;
    public com.github.rudroid.common.e b;
    public boolean c;

    public i(z9.b bVar, q10.b bVar2, com.github.rudroid.common.e eVar, boolean z) {
        k.g(bVar2, "cacheKeyResolver");
        k.g(eVar, "crashLogger");
        this.a = bVar;
        this.b = eVar;
        this.c = z;
    }

    @Override // com.github.service.wrapper.b
    public final Object c(i0 i0Var, String str) {
        z9.b bVar = this.a;
        try {
            return androidx.lifecycle.b.u(n.d(bVar), i0Var, new ha.b(str), bVar.w);
        } catch (CacheMissException unused) {
            return null;
        }
    }

    @Override // com.github.service.wrapper.a
    public final y71.i d(n0 n0Var) {
        aa.d dVar = new aa.d(n0Var);
        dVar.c = dVar.c.d(new s());
        return r.i(n1.g(n1.y(new y71.e(new yl.b(this.a, dVar.b(), (a71.c) null, 8), a71.i.r, -2, x71.a.r), l0.b), Integer.MAX_VALUE), n0Var.name());
    }

    @Override // com.github.service.wrapper.b
    public final y71.i e(n0 n0Var, i0 i0Var, String str, j71.c cVar) {
        k.g(str, "id");
        return n1.I(new a61.l0(b.n(this, i0Var, str), cVar, 1), new m((a71.c) null, this, n0Var, 2));
    }

    @Override // com.github.service.wrapper.b
    public final Object f(s0 s0Var) {
        z9.b bVar = this.a;
        try {
            return n.d(bVar).v(s0Var, bVar.w, ha.a.b);
        } catch (CacheMissException unused) {
            return null;
        }
    }

    @Override // com.github.service.wrapper.a
    public final y71.i g(w0 w0Var, ga.h hVar, boolean z, Set set, Set set2, j71.e eVar, j71.c cVar) {
        Set set3;
        in.c d;
        k.g(w0Var, "query");
        k.g(hVar, "fetchPolicy");
        k.g(set, "partialErrorTypes");
        k.g(set2, "partialNodeErrorTypes");
        k.g(eVar, "addFailureMetaData");
        z9.a aVar = new z9.a(this.a, w0Var);
        aVar.c(new ga.f());
        Set set4 = r.a;
        go0.n i = r.i(((z9.a) n.c(aVar, hVar)).a(), w0Var.name());
        if (this.c) {
            set3 = set;
            d = r.c(i, !z, set3, set2, cVar, eVar, this);
        } else {
            set3 = set;
            d = r.d(i, !z, set3, set2, cVar, eVar);
        }
        return r.f(new y(d, new e(set3, this, w0Var, null, 0), 6));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // com.github.service.wrapper.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(String str, Set set, a71.c cVar) {
        c cVar2;
        int i;
        z9.b bVar = this.a;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i2 = cVar2.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar2.w = i2 - Integer.MIN_VALUE;
                Object obj = cVar2.u;
                b71.a aVar = b71.a.r;
                i = cVar2.w;
                boolean z = true;
                if (i != 0) {
                    sy.y.j(obj);
                    androidx.lifecycle.b d = n.d(bVar);
                    ((Boolean) ((x3) d.g).v(new i1(21, d, new ha.b(str)))).getClass();
                    androidx.lifecycle.b d2 = n.d(bVar);
                    cVar2.w = 1;
                    if (d2.t(set, cVar2) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return Boolean.valueOf(z);
            }
        }
        cVar2 = new c(this, (c71.c) cVar);
        Object obj2 = cVar2.u;
        b71.a aVar2 = b71.a.r;
        i = cVar2.w;
        boolean z2 = true;
        if (i != 0) {
        }
        return Boolean.valueOf(z2);
    }

    @Override // com.github.service.wrapper.b
    public final y71.i i(w0 w0Var, ga.h hVar, boolean z, Set set, Set set2, j71.e eVar, j71.c cVar) {
        k.g(w0Var, "query");
        k.g(hVar, "fetchPolicy");
        k.g(set, "partialErrorTypes");
        k.g(set2, "partialNodeErrorTypes");
        k.g(eVar, "addFailureMetaData");
        z9.a aVar = new z9.a(this.a, w0Var);
        aVar.c(new ga.f());
        go0.n i = r.i(new y(new f8(new a0.h((z9.a) n.c(aVar, hVar), (a71.c) null, 21)), new androidx.lifecycle.n(w0Var, (a71.c) null, 7), 6), w0Var.name());
        return r.f(new y(this.c ? r.c(i, !z, set, set2, cVar, eVar, this) : r.d(i, !z, set, set2, cVar, eVar), new e(set, this, w0Var, null, 1), 6));
    }

    @Override // com.github.service.wrapper.b
    public final Object j(s0 s0Var, r0 r0Var, a71.c cVar) {
        z9.b bVar = this.a;
        Object E = n.d(bVar).E(s0Var, r0Var, bVar.w, ha.a.b, true, cVar);
        return E == b71.a.r ? E : a0.a;
    }

    @Override // com.github.service.wrapper.b
    public final y71.i k(n0 n0Var, m0 m0Var) {
        k.g(n0Var, "mutation");
        aa.d dVar = new aa.d(n0Var);
        if (m0Var != null) {
            dVar.c = dVar.c.d(new ga.r(m0Var));
        }
        dVar.c = dVar.c.d(new s());
        return r.i(n1.g(n1.y(new y71.e(new yl.b(this.a, dVar.b(), (a71.c) null, 8), a71.i.r, -2, x71.a.r), l0.b), Integer.MAX_VALUE), n0Var.name());
    }

    @Override // com.github.service.wrapper.a
    public final y71.i l(w0 w0Var, ga.h hVar, boolean z, Set set, Set set2, com.github.rudroid.utilities.ui.emojipicker.e eVar) {
        k.g(w0Var, "query");
        k.g(hVar, "fetchPolicy");
        k.g(set, "partialErrorTypes");
        k.g(set2, "partialNodeErrorTypes");
        return new bz0.e(a.b(this, w0Var, hVar, z, set, set2, null, eVar, 32), 15);
    }

    @Override // com.github.service.wrapper.b
    public final y71.i m(w0 w0Var, ga.h hVar, boolean z, Set set, Set set2, com.github.rudroid.utilities.ui.emojipicker.e eVar) {
        k.g(set, "partialErrorTypes");
        k.g(set2, "partialNodeErrorTypes");
        return new bz0.e(b.q(this, w0Var, hVar, z, set, set2, null, eVar, 32), 16);
    }

    @Override // com.github.service.wrapper.b
    public final Object p(i0 i0Var, h0 h0Var, String str, a71.c cVar) {
        z9.b bVar = this.a;
        Object D = n.d(bVar).D(i0Var, new ha.b(str), h0Var, bVar.w, ha.a.b, true, cVar);
        return D == b71.a.r ? D : a0.a;
    }
}
