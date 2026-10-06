package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yi0 {
    public String a;
    public cq.o b;

    public yi0(String str, cq.o oVar) {
        this.a = str;
        this.b = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi0)) {
            return false;
        }
        yi0 yi0Var = (yi0) obj;
        return k71.k.b(this.a, yi0Var.a) && k71.k.b(this.b, yi0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CopilotLimitedUser(__typename=" + this.a + ", copilotLimitedUser=" + this.b + ")";
    }
    public yi0(String p1, Object p2) {
    }
}
