package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class oe {
    public final String a;
    public final ne b;
    public final String c;

    public oe(String str, ne neVar, String str2) {
        this.a = str;
        this.b = neVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oe)) {
            return false;
        }
        oe oeVar = (oe) obj;
        return k71.k.b(this.a, oeVar.a) && k71.k.b(this.b, oeVar.b) && k71.k.b(this.c, oeVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Topic(id=");
        sb.append(this.a);
        sb.append(", repositories=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
