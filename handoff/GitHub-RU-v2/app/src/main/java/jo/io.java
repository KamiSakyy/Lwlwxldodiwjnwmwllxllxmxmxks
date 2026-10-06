package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class io {
    public String a;
    public eo b;
    public String c;

    public io(String str, eo eoVar, String str2) {
        this.a = str;
        this.b = eoVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io)) {
            return false;
        }
        io ioVar = (io) obj;
        return k71.k.b(this.a, ioVar.a) && k71.k.b(this.b, ioVar.b) && k71.k.b(this.c, ioVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        eo eoVar = this.b;
        return this.c.hashCode() + ((hashCode + (eoVar == null ? 0 : eoVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", issueOrPullRequest=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
