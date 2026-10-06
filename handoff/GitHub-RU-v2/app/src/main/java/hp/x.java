package hp;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xShadow {
    public String a;
    public w b;

    public x(String str, w wVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xShadow)) {
            return false;
        }
        xShadow xVar = (xShadow) obj;
        return k71.k.b(this.a, xVar.a) && k71.k.b(this.b, xVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        w wVar = this.b;
        return hashCode + (wVar == null ? 0 : wVar.hashCode());
    }

    public final String toString() {
        return "Resource(__typename=" + this.a + ", onPullRequest=" + this.b + ")";
    }
}
