package cs0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h {
    public String a;
    public c b;

    public h(String str, c cVar) {
        this.a = str;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k71.k.b(this.a, hVar.a) && k71.k.b(this.b, hVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        c cVar = this.b;
        return hashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        return "OnIssue(id=" + this.a + ", labels=" + this.b + ")";
    }
}
