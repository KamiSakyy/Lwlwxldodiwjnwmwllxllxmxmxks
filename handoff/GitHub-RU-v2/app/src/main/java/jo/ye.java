package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ye {
    public String a;
    public xe b;
    public String c;

    public ye(String str, xe xeVar, String str2) {
        this.a = str;
        this.b = xeVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ye)) {
            return false;
        }
        ye yeVar = (ye) obj;
        return k71.k.b(this.a, yeVar.a) && k71.k.b(this.b, yeVar.b) && k71.k.b(this.c, yeVar.c);
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
