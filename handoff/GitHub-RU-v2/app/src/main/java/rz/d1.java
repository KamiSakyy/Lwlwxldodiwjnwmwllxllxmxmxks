package rz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d1 implements aa.m0 {
    public f1 a;

    public d1(f1 f1Var) {
        this.a = f1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d1) && k71.k.b(this.a, ((d1) obj).a);
    }

    public final int hashCode() {
        f1 f1Var = this.a;
        if (f1Var == null) {
            return 0;
        }
        return f1Var.hashCode();
    }

    public final String toString() {
        return "Data(updateProjectV2ItemFieldValue=" + this.a + ")";
    }
}
