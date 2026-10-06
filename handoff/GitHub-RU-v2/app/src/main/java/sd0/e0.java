package sd0;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e0 {
    public String a;
    public String b;
    public boolean c;
    public f0 d;
    public String e;

    public e0(String str, String str2, boolean z, f0 f0Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = f0Var;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return k71.k.b(this.a, e0Var.a) && k71.k.b(this.b, e0Var.b) && this.c == e0Var.c && k71.k.b(this.d, e0Var.d) && k71.k.b(this.e, e0Var.e);
    }

    public final int hashCode() {
        int e = x.i.e(h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c);
        f0 f0Var = this.d;
        return this.e.hashCode() + ((e + (f0Var == null ? 0 : f0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Ref(id=", this.a, ", name=", this.b, ", viewerCanCommitToBranch=");
        o.append(this.c);
        o.append(", target=");
        o.append(this.d);
        o.append(", __typename=");
        return h1.p(o, this.e, ")");
    }
}
