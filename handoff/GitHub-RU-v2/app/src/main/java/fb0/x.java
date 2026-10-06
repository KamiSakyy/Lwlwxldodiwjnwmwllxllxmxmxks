package fb0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x {
    public final String a;
    public final String b;

    public x(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return k71.k.b(this.a, xVar.a) && k71.k.b(this.b, xVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("OnTeamDiscussion(url=", this.a, ", id=", this.b, ")");
    }
}
