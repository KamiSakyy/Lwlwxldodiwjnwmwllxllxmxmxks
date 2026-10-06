package pz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r9 {
    public int a;
    public int b;

    public r9(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9)) {
            return false;
        }
        r9 r9Var = (r9) obj;
        return this.a == r9Var.a && this.b == r9Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return jo.f4Shadow.h(this.a, this.b, "DiffLineRange(end=", ", start=", ")");
    }
}
