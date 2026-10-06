package hp;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n {
    public String a;
    public k b;

    public n(String str, k kVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return k71.k.b(this.a, nVar.a) && k71.k.b(this.b, nVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        k kVar = this.b;
        return hashCode + (kVar == null ? 0 : kVar.hashCode());
    }

    public final String toString() {
        return "Resource(__typename=" + this.a + ", onPullRequest=" + this.b + ")";
    }
}
