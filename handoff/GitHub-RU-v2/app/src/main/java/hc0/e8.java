package hc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e8 {
    public int a;
    public int b;

    public e8(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8)) {
            return false;
        }
        e8 e8Var = (e8) obj;
        return this.a == e8Var.a && this.b == e8Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return jo.f4.h(this.a, this.b, "DiffLineRange(end=", ", start=", ")");
    }
}
