package m10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vc {
    public final int a;
    public final int b;

    public vc(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vc)) {
            return false;
        }
        vc vcVar = (vc) obj;
        return this.a == vcVar.a && this.b == vcVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return jo.f4.h(this.a, this.b, "DiffLineRange(end=", ", start=", ")");
    }
}
