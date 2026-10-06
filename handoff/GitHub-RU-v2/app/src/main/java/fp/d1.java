package fp;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d1 {
    public String a;
    public hp.u b;

    public d1(String str, hp.u uVar) {
        this.a = str;
        this.b = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return k71.k.b(this.a, d1Var.a) && k71.k.b(this.b, d1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Node1(__typename=" + this.a + ", subagentFragment=" + this.b + ")";
    }
}
