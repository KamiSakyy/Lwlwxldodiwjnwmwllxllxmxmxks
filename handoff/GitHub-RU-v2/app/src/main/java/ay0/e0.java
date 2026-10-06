package ay0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e0 {
    public final Double a;

    public e0(Double d) {
        this.a = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && k71.k.b(this.a, ((e0) obj).a);
    }

    public final int hashCode() {
        Double d = this.a;
        if (d == null) {
            return 0;
        }
        return d.hashCode();
    }

    public final String toString() {
        return "OnProjectV2GroupNumberValue(number=" + this.a + ")";
    }
}
