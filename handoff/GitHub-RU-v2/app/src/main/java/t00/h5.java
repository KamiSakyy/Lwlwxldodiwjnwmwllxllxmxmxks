package t00;

import java.util.LinkedHashSet;
import java.util.Set;
import jn0.yf0;
import jo.mi0;
import m10.qw;
import pz0.fr;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h5 implements z01.r0, mi0, yf0 {
    public final /* synthetic */ int r;
    public final com.github.service.wrapper.j s;
    public final com.github.service.wrapper.b t;
    public final z01.p0 u;
    public final v71.v v;

    public h5(int i, com.github.service.wrapper.b bVar, com.github.service.wrapper.j jVar, v71.v vVar, z01.p0 p0Var) {
        this.r = i;
        switch (i) {
            case 1:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(p0Var, "boardService");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = p0Var;
                this.v = vVar;
                break;
            default:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(p0Var, "boardService");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = p0Var;
                this.v = vVar;
                break;
        }
    }

    public final y71.i a(String str, String str2, String str3, String str4) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "ownerLogin");
                k71.k.g(str2, "repositoryName");
                k71.k.g(str3, "query");
                return y71.n1.y(new w3(new y00.l(com.github.service.wrapper.a.o(this.s, new rz.q0(str, str2, new aa.u0(str3), str4 == null ? aa.t0.d : new aa.u0(str4), new aa.u0(qw.s)), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 10), 15), this.v);
            default:
                k71.k.g(str, "ownerLogin");
                k71.k.g(str2, "repositoryName");
                k71.k.g(str3, "query");
                return y71.n1.y(new wy0.q3(new y00.l(com.github.service.wrapper.a.o(this.s, new ux0.q0(str, str2, new aa.u0(str3), str4 == null ? aa.t0.d : new aa.u0(str4), new aa.u0(fr.s)), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 10), 10), this.v);
        }
    }

    public final y71.i b(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "projectId");
                k71.k.g(str2, "itemId");
                k71.k.g(str3, "fieldId");
                return y71.n1.y(new g3(in.r.k(this.t.d(new rz.j(str, str2, str3))), 5), this.v);
            default:
                k71.k.g(str, "projectId");
                k71.k.g(str2, "itemId");
                k71.k.g(str3, "fieldId");
                return y71.n1.y(new wy0.h1(in.r.k(this.t.d(new ux0.j(str, str2, str3))), 10), this.v);
        }
    }

    public final y71.i c(String str, String str2, String str3, l01.c0 c0Var) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "projectId");
                k71.k.g(str2, "itemId");
                k71.k.g(str3, "fieldId");
                return y71.n1.y(new g3(in.r.k(this.t.d(new rz.g1(str, str2, str3, com.google.android.gms.internal.measurement.b4.q0(c0Var)))), 3), this.v);
            default:
                k71.k.g(str, "projectId");
                k71.k.g(str2, "itemId");
                k71.k.g(str3, "fieldId");
                return y71.n1.y(new wy0.h1(in.r.k(this.t.d(new ux0.g1(str, str2, str3, i21.a.R(c0Var)))), 8), this.v);
        }
    }

    public final y71.i d(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "ownerLogin");
                rz.y yVar = new rz.y(str, new aa.u0(str2), new aa.u0((Object) null), 30);
                return y71.n1.y(in.r.g(new f8(new m7.x(this, yVar, (a71.c) null, 10)), new sw0.e(15), new sw0.e(16), new com.github.rudroid.actions.workflowruns.ui.e(this, str, str2, 23), new f1.f4(12, this, yVar)), this.v);
            default:
                k71.k.g(str, "ownerLogin");
                ux0.y yVar2 = new ux0.y(str, new aa.u0(str2), new aa.u0((Object) null), 30);
                return y71.n1.y(in.r.g(new f8(new m7.x(this, yVar2, (a71.c) null, 18)), new wa.g(25), new wa.g(26), new com.github.rudroid.actions.workflowruns.ui.e(this, str, str2, 25), new f1.f4(14, this, yVar2)), this.v);
        }
    }

    public final y71.i e(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "ownerLogin");
                return y71.n1.y(new b10.b(com.google.android.gms.internal.measurement.d5.R(com.github.service.wrapper.b.q(this.t, new rz.y(str, new aa.u0(str2), new aa.u0((Object) null), 30), ga.h.t, false, (Set) null, (Set) null, new androidx.compose.runtime.l3(1, new sw0.e(13)), new sw0.e(14), 28)), 6), this.v);
            default:
                k71.k.g(str, "ownerLogin");
                return y71.n1.y(new b10.b(com.google.android.gms.internal.measurement.d5.R(com.github.service.wrapper.b.q(this.t, new ux0.y(str, new aa.u0(str2), new aa.u0((Object) null), 30), ga.h.t, false, (Set) null, (Set) null, new androidx.compose.runtime.l3(1, new wa.g(27)), new wa.g(28), 28)), 11), this.v);
        }
    }

    public final y71.i f(String str, String str2, String str3, String str4, l01.c0 c0Var, String str5, l01.j0 j0Var, String str6) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "projectId");
                k71.k.g(str2, "itemId");
                k71.k.g(str3, "fieldId");
                k71.k.g(str4, "fullDatabaseId");
                k71.k.g(str5, "viewId");
                return y71.n1.y(y71.n1.I(y71.n1.I(new g3(in.r.k(this.t.d(new rz.g1(str, str2, str3, com.google.android.gms.internal.measurement.b4.q0(c0Var)))), 4), new r4(null, this, str5, str4, 0)), new sk.a(null, this, str5, str2, str4, j0Var, str6, c0Var, 1)), this.v);
            default:
                k71.k.g(str, "projectId");
                k71.k.g(str2, "itemId");
                k71.k.g(str3, "fieldId");
                k71.k.g(str4, "fullDatabaseId");
                k71.k.g(str5, "viewId");
                return y71.n1.y(y71.n1.I(y71.n1.I(new wy0.h1(in.r.k(this.t.d(new ux0.g1(str, str2, str3, i21.a.R(c0Var)))), 9), new wy0.c4((a71.c) null, this, str5, str4, 0)), new sk.a(null, this, str5, str2, str4, j0Var, str6, c0Var, 2)), this.v);
        }
    }

    public final y71.i g(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "ownerLogin");
                return y71.n1.y(in.r.l(new y00.l(com.github.service.wrapper.a.o(this.t, new rz.y(str, new aa.u0(str2), aa.t0.d, 30), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 10)), this.v);
            default:
                k71.k.g(str, "ownerLogin");
                return y71.n1.y(in.r.l(new y00.l(com.github.service.wrapper.a.o(this.t, new ux0.y(str, new aa.u0(str2), aa.t0.d, 30), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 10)), this.v);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }

    public final y71.i i(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "projectId");
                k71.k.g(str2, "itemId");
                return y71.n1.y(in.r.l(in.r.k(this.s.d(new rz.n(str, str2)))), this.v);
            default:
                k71.k.g(str, "projectId");
                k71.k.g(str2, "itemId");
                return y71.n1.y(in.r.l(in.r.k(this.s.d(new ux0.n(str, str2)))), this.v);
        }
    }

    public final Object j(String str, String str2, String str3, String str4) {
        switch (this.r) {
        }
        return y71.n1.y(y71.h.r, this.v);
    }

    public final y71.i k(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "userLogin");
                return y71.n1.y(new w3(new y00.l(com.github.service.wrapper.a.o(this.s, new rz.u1(str, str2 == null ? aa.t0.d : new aa.u0(str2)), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 10), 14), this.v);
            default:
                k71.k.g(str, "userLogin");
                return y71.n1.y(new wy0.q3(new y00.l(com.github.service.wrapper.a.o(this.s, new ux0.u1(str, str2 == null ? aa.t0.d : new aa.u0(str2)), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 10), 9), this.v);
        }
    }

    public final y71.i l(String str, int i) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "projectOwnerLogin");
                return y71.n1.y(new b10.b(com.google.android.gms.internal.measurement.d5.R(com.github.service.wrapper.a.b(this.s, new rz.b1(str, i), (ga.h) null, false, (Set) null, (Set) null, new androidx.compose.runtime.l3(1, new sw0.e(11)), new sw0.e(12), 26)), 7), this.v);
            default:
                k71.k.g(str, "projectOwnerLogin");
                return y71.n1.y(new b10.b(com.google.android.gms.internal.measurement.d5.R(com.github.service.wrapper.a.b(this.s, new ux0.b1(str, i), (ga.h) null, false, (Set) null, (Set) null, new androidx.compose.runtime.l3(1, new wa.g(23)), new wa.g(24), 26)), 12), this.v);
        }
    }

    public final y71.i m(String str, String str2, String str3, String str4, String str5, l01.j0 j0Var, String str6) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "projectId");
                k71.k.g(str2, "itemId");
                k71.k.g(str3, "fieldId");
                k71.k.g(str4, "fullDatabaseId");
                k71.k.g(str5, "viewId");
                return y71.n1.y(y71.n1.I(y71.n1.I(new g3(in.r.k(this.t.d(new rz.j(str, str2, str3))), 6), new r4(null, this, str5, str4, 1)), new nl.e(null, this, str5, str2, str4, j0Var, str6, 1)), this.v);
            default:
                k71.k.g(str, "projectId");
                k71.k.g(str2, "itemId");
                k71.k.g(str3, "fieldId");
                k71.k.g(str4, "fullDatabaseId");
                k71.k.g(str5, "viewId");
                return y71.n1.y(y71.n1.I(y71.n1.I(new wy0.h1(in.r.k(this.t.d(new ux0.j(str, str2, str3))), 11), new wy0.c4((a71.c) null, this, str5, str4, 1)), new nl.e(null, this, str5, str2, str4, j0Var, str6, 2)), this.v);
        }
    }

    public final y71.i n(String str) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "projectId");
                return y71.n1.y(in.r.l(in.r.k(this.s.d(new rz.k1(str)))), this.v);
            default:
                k71.k.g(str, "projectId");
                return y71.n1.y(in.r.l(in.r.k(this.s.d(new ux0.k1(str)))), this.v);
        }
    }

    public final Object o(String str, String str2, String str3, String str4) {
        switch (this.r) {
        }
        return y71.n1.y(y71.h.r, this.v);
    }

    public final y71.i p(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "projectId");
                k71.k.g(str2, "contentId");
                return y71.n1.y(new g3(in.r.k(this.s.d(new rz.e(str, str2))), 2), this.v);
            default:
                k71.k.g(str, "projectId");
                k71.k.g(str2, "contentId");
                return y71.n1.y(new wy0.h1(in.r.k(this.s.d(new ux0.e(str, str2))), 7), this.v);
        }
    }

    public final y71.i q(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "orgLogin");
                return y71.n1.y(new w3(new y00.l(com.github.service.wrapper.a.o(this.s, new rz.s(str, str2 == null ? aa.t0.d : new aa.u0(str2)), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 10), 13), this.v);
            default:
                k71.k.g(str, "orgLogin");
                return y71.n1.y(new wy0.q3(new y00.l(com.github.service.wrapper.a.o(this.s, new ux0.s(str, str2 == null ? aa.t0.d : new aa.u0(str2)), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 62), 10), 8), this.v);
        }
    }
}
