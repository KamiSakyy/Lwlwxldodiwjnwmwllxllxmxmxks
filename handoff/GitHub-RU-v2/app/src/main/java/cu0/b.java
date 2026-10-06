package cu0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b {
    public String a;
    public String b;

    public b(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k71.k.b(this.a, bVar.a) && k71.k.b(this.b, bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("PullRequest(id=", this.a, ", __typename=", this.b, ")");
    }
    public Object b(Object p1, Object p2, Object p3) { return null; }
}
