package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q5 {
    public String a;
    public String b;
    public String c;

    public q5(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5)) {
            return false;
        }
        q5 q5Var = (q5) obj;
        return k71.k.b(this.a, q5Var.a) && k71.k.b(this.b, q5Var.b) && k71.k.b(this.c, q5Var.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        String str = this.c;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("OnOrganization(__typename=", this.a, ", id=", this.b, ", name="), this.c, ")");
    }
}
