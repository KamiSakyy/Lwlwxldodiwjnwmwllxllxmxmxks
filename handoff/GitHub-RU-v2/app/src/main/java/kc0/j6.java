package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j6 implements aaShadow.m0 {
    public final i6 a;

    public j6(i6 i6Var) {
        this.a = i6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j6) && k71.k.b(this.a, ((j6) obj).a);
    }

    public final int hashCode() {
        i6 i6Var = this.a;
        if (i6Var == null) {
            return 0;
        }
        return i6Var.hashCode();
    }

    public final String toString() {
        return "Data(createCommitOnBranch=" + this.a + ")";
    }
}
