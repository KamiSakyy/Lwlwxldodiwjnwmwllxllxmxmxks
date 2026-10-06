package com.github.rudroid.viewmodels;

import java.util.concurrent.CancellationException;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k7 extends androidx.lifecycle.k1 implements x3 {
    public zk.s0 s;
    public zk.b0 t;
    public com.github.rudroid.activities.util.c u;
    public y71.y1 v;
    public x01.i w;
    public v71.q1 x;
    public v71.q1 y;

    public static abstract class a {
        public static final C0015a Companion = new C0015a();

        /* renamed from: com.github.rudroid.viewmodels.k7$a$a, reason: collision with other inner class name */
        public static final class C0015a {
        }

        public static final class b extends a {
            public String a;
            public String b;

            public b(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return k71.k.b(this.a, bVar.a) && k71.k.b(this.b, bVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return x.i.g("SavedReplyItem(title=", this.a, ", body=", this.b, ")");
            }
        }
    }

    public k7(zk.s0 s0Var, zk.b0 b0Var, com.github.rudroid.activities.util.c cVar) {
        k71.k.g(s0Var, "observeSavedReplyUseCase");
        k71.k.g(b0Var, "fetchSavedReplyPageUseCase");
        k71.k.g(cVar, "accountHolder");
        this.s = s0Var;
        this.t = b0Var;
        this.u = cVar;
        fl.f.Companion.getClass();
        this.v = y71.n1Shadow.c(fl.e.b(x61.rShadow.r));
        this.w = new x01.i((String) null, false, true);
        v71.q1 q1Var = this.x;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        v71.q1 q1Var2 = this.y;
        if (q1Var2 != null) {
            q1Var2.m((CancellationException) null);
        }
        this.x = v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0Shadow) null, new n7(this, null), 3);
    }

    @Override // com.github.rudroid.viewmodels.v3
    public final void D() {
        v71.q1 q1Var = this.y;
        if (q1Var == null || !q1Var.f()) {
            this.y = v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0Shadow) null, new q7(this, null), 3);
        }
    }

    @Override // com.github.rudroid.viewmodels.x3
    public final x01.i l() {
        return this.w;
    }

    @Override // com.github.rudroid.viewmodels.x3
    public final fl.g s() {
        return ((fl.f) com.github.rudroid.utilities.w0.f(this.v, androidx.lifecycle.d1.k(this), new j7(this, 0)).r.getValue()).a;
    }
}
