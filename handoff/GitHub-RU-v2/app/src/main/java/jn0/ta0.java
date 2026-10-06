package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ta0 implements aaShadow.m0 {
    public final wa0 a;

    public ta0(wa0 wa0Var) {
        this.a = wa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ta0) && k71.k.b(this.a, ((ta0) obj).a);
    }

    public final int hashCode() {
        wa0 wa0Var = this.a;
        if (wa0Var == null) {
            return 0;
        }
        return wa0Var.hashCode();
    }

    public final String toString() {
        return "Data(updateIssue=" + this.a + ")";
    }
}
