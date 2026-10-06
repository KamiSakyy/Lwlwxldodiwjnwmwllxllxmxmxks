package iy0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q0 {
    public final String a;
    public final wx0.h b;

    public q0(String str, wx0.h hVar) {
        this.a = str;
        this.b = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return k71.k.b(this.a, q0Var.a) && k71.k.b(this.b, q0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GroupByFields(__typename=" + this.a + ", projectV2FieldConfigurationConnectionFragment=" + this.b + ")";
    }
}
