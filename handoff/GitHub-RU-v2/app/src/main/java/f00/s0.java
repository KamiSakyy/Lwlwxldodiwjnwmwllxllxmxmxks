package f00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s0 {
    public final String a;
    public final tz.h b;

    public s0(String str, tz.h hVar) {
        this.a = str;
        this.b = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return k71.k.b(this.a, s0Var.a) && k71.k.b(this.b, s0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "GroupByFields(__typename=" + this.a + ", projectV2FieldConfigurationConnectionFragment=" + this.b + ")";
    }
}
