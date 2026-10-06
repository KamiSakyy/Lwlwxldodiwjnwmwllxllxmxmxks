package xn;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m1 extends sy.r {
    public Double a;
    public Double b;
    public Double c;

    public m1(Double d, Double d2, Double d3) {
        this.a = d;
        this.b = d2;
        this.c = d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return k71.k.b(this.a, m1Var.a) && k71.k.b(this.b, m1Var.b) && k71.k.b(this.c, m1Var.c);
    }

    public final int hashCode() {
        Double d = this.a;
        int hashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.b;
        int hashCode2 = (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.c;
        return hashCode2 + (d3 != null ? d3.hashCode() : 0);
    }

    public final String toString() {
        return "NumberField(minimum=" + this.a + ", maximum=" + this.b + ", default=" + this.c + ")";
    }
}
