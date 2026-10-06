package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wi0 {
    public String a;
    public cq.m b;

    public wi0(String str, cq.m mVar) {
        this.a = str;
        this.b = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi0)) {
            return false;
        }
        wi0 wi0Var = (wi0) obj;
        return k71.k.b(this.a, wi0Var.a) && k71.k.b(this.b, wi0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CopilotConsumptiveUser(__typename=" + this.a + ", copilotConsumptiveUser=" + this.b + ")";
    }
    public wi0(String p1, Object p2) {
    }
}
