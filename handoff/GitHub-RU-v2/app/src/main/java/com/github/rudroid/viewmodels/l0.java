package com.github.rudroid.viewmodels;

import com.github.rudroid.utilities.ui.g1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l0 extends androidx.lifecycle.k1 {
    public static final a Companion = new a();
    public final com.github.rudroid.activities.util.c s;
    public final ml.q t;
    public final String u;
    public final String v;
    public final String w;
    public final String x;
    public final y71.y1 y;
    public final y71.i1 z;

    public static final class a {
    }

    public l0(com.github.rudroid.activities.util.c cVar, ml.q qVar, androidx.lifecycle.a1 a1Var) {
        k71.k.g(cVar, "accountHolder");
        k71.k.g(qVar, "updateRepositoryUseCase");
        k71.k.g(a1Var, "savedStateHandle");
        this.s = cVar;
        this.t = qVar;
        this.u = (String) com.github.rudroid.utilities.h2.a(a1Var, "EXTRA_ID");
        this.v = (String) com.github.rudroid.utilities.h2.a(a1Var, "EXTRA_NAME");
        this.w = (String) com.github.rudroid.utilities.h2.a(a1Var, "EXTRA_OWNER");
        String str = (String) a1Var.a("EXTRA_DESC");
        str = str == null ? "" : str;
        this.x = str;
        g1.a aVar = com.github.rudroid.utilities.ui.g1.Companion;
        b bVar = new b(str, 4);
        aVar.getClass();
        y71.y1 c = y71.n1.c(new com.github.rudroid.utilities.ui.t1(bVar));
        this.y = c;
        this.z = com.github.rudroid.utilities.w0.f(c, androidx.lifecycle.d1.k(this), new k0(this, 0));
    }

    public final void P() {
        String str;
        b bVar = (b) ((com.github.rudroid.utilities.ui.g1) this.y.getValue()).getData();
        if (bVar == null || (str = bVar.a) == null) {
            str = this.x;
        }
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0) null, new o0(this, str, null), 3);
    }

    public static final class b {
        public final String a;
        public final boolean b;
        public final boolean c;

        public b(String str, boolean z, boolean z2) {
            k71.k.g(str, "text");
            this.a = str;
            this.b = z;
            this.c = z2;
        }

        public static b a(b bVar, String str, boolean z, int i) {
            if ((i & 1) != 0) {
                str = bVar.a;
            }
            if ((i & 2) != 0) {
                z = bVar.b;
            }
            boolean z2 = (i & 4) != 0 ? bVar.c : true;
            bVar.getClass();
            k71.k.g(str, "text");
            return new b(str, z, z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return k71.k.b(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + x.i.e(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return jo.f4.s(com.github.rudroid.m0.o("DescriptionEditorState(text=", this.a, ", saveEnabled=", ", successfullySaved=", this.b), this.c, ")");
        }

        public /* synthetic */ b(String str, int i) {
            this((i & 1) != 0 ? "" : str, (i & 2) == 0, (i & 4) == 0);
        }
    }
}
