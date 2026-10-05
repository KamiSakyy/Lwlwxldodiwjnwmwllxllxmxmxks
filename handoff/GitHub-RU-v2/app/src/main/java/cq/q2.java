package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q2 {
    public final String a;
    public final j b;

    public q2(String str, j jVar) {
        this.a = str;
        this.b = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) obj;
        return k71.k.b(this.a, q2Var.a) && k71.k.b(this.b, q2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Plan(__typename=" + this.a + ", chatModelPlanFragment=" + this.b + ")";
    }
}
