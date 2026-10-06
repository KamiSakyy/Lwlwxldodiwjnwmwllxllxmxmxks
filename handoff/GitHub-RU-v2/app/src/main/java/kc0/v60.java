package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v60 implements aaShadow.m0 {
    public x60 a;

    public v60(x60 x60Var) {
        this.a = x60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v60) && k71.k.b(this.a, ((v60) obj).a);
    }

    public final int hashCode() {
        x60 x60Var = this.a;
        if (x60Var == null) {
            return 0;
        }
        return x60Var.hashCode();
    }

    public final String toString() {
        return "Data(updateIssue=" + this.a + ")";
    }
}
