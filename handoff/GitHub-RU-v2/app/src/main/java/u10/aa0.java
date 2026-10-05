package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class aa0 implements aa.v0 {
    public final ba0 a;

    public aa0(ba0 ba0Var) {
        this.a = ba0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aa0) && k71.k.b(this.a, ((aa0) obj).a);
    }

    public final int hashCode() {
        ba0 ba0Var = this.a;
        if (ba0Var == null) {
            return 0;
        }
        return ba0Var.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }



}
