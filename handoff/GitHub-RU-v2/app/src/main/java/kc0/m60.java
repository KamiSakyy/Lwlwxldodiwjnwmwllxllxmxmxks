package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m60 implements aa.m0 {
    public final s60 a;

    public m60(s60 s60Var) {
        this.a = s60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m60) && k71.k.b(this.a, ((m60) obj).a);
    }

    public final int hashCode() {
        s60 s60Var = this.a;
        if (s60Var == null) {
            return 0;
        }
        return s60Var.hashCode();
    }

    public final String toString() {
        return "Data(updateIssue=" + this.a + ")";
    }
}
