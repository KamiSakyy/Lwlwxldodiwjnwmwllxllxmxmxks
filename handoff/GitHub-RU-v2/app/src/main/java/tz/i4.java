package tz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i4 {
    public String a;
    public o4 b;

    public i4(String str, o4 o4Var) {
        this.a = str;
        this.b = o4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4)) {
            return false;
        }
        i4 i4Var = (i4) obj;
        return k71.k.b(this.a, i4Var.a) && k71.k.b(this.b, i4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Iteration(__typename=" + this.a + ", projectV2IterationFragment=" + this.b + ")";
    }
}
