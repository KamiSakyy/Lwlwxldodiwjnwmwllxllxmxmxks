package fz0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k {
    public final String a;
    public final a b;

    public k(String str, a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return k71.k.b(this.a, kVar.a) && k71.k.b(this.b, kVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnWorkflowRun(id=" + this.a + ", checkSuite=" + this.b + ")";
    }
}
