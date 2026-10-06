package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f0 implements aa.h0 {
    public String a;
    public String b;
    public e0 c;
    public String d;

    public f0(String str, String str2, e0 e0Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = e0Var;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return k71.k.b(this.a, f0Var.a) && k71.k.b(this.b, f0Var.b) && k71.k.b(this.c, f0Var.c) && k71.k.b(this.d, f0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("FilesChangedReviewThreadFragment(id=", this.a, ", headRefOid=", this.b, ", reviewThreads=");
        o.append(this.c);
        o.append(", __typename=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
