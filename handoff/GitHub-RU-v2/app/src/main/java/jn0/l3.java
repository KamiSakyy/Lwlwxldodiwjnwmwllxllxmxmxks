package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l3 implements aa.m0 {
    public final j3 a;

    public l3(j3 j3Var) {
        this.a = j3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l3) && k71.k.b(this.a, ((l3) obj).a);
    }

    public final int hashCode() {
        j3 j3Var = this.a;
        if (j3Var == null) {
            return 0;
        }
        return j3Var.hashCode();
    }

    public final String toString() {
        return "Data(blockUser=" + this.a + ")";
    }
}
