package tz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g4 {
    public final String a;
    public final o4 b;

    public g4(String str, o4 o4Var) {
        this.a = str;
        this.b = o4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4)) {
            return false;
        }
        g4 g4Var = (g4) obj;
        return k71.k.b(this.a, g4Var.a) && k71.k.b(this.b, g4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CompletedIteration(__typename=" + this.a + ", projectV2IterationFragment=" + this.b + ")";
    }
}
