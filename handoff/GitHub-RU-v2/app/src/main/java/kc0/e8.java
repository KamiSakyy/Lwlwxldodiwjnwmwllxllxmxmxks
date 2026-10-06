package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e8 implements aaShadow.m0 {
    public f8 a;

    public e8(f8 f8Var) {
        this.a = f8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e8) && k71.k.b(this.a, ((e8) obj).a);
    }

    public final int hashCode() {
        f8 f8Var = this.a;
        if (f8Var == null) {
            return 0;
        }
        return f8Var.a.hashCode();
    }

    public final String toString() {
        return "Data(deleteIssueComment=" + this.a + ")";
    }
}
