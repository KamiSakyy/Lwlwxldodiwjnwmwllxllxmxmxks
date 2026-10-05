package yz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r3 implements q3 {
    public final u3 a;
    public final String b;
    public int c;
    public boolean d;
    public final long e;

    public r3(u3 u3Var, String str, int i, boolean z) {
        k71.k.g(str, "subjectId");
        this.a = u3Var;
        this.b = str;
        this.c = i;
        this.d = z;
        this.e = u3Var.a.hashCode();
    }

    public static r3 a(r3 r3Var, int i, boolean z) {
        u3 u3Var = r3Var.a;
        String str = r3Var.b;
        r3Var.getClass();
        k71.k.g(str, "subjectId");
        return new r3(u3Var, str, i, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r3)) {
            return false;
        }
        r3 r3Var = (r3) obj;
        return k71.k.b(this.a, r3Var.a) && k71.k.b(this.b, r3Var.b) && this.c == r3Var.c && this.d == r3Var.d;
    }

    @Override // yz0.q3
    public final long getId() {
        return this.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + a0.s0.b(this.c, com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31);
    }

    public final String toString() {
        return "Reaction(content=" + this.a + ", subjectId=" + this.b + ", usersTotalCount=" + this.c + ", viewerHasReacted=" + this.d + ")";
    }
}
