package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b6 implements aa.m0 {
    public final a6 a;

    public b6(a6 a6Var) {
        this.a = a6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b6) && k71.k.b(this.a, ((b6) obj).a);
    }

    public final int hashCode() {
        a6 a6Var = this.a;
        if (a6Var == null) {
            return 0;
        }
        return a6Var.hashCode();
    }

    public final String toString() {
        return "Data(createCommitOnBranch=" + this.a + ")";
    }
}
