package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class im {
    public String a;
    public hm b;
    public String c;

    public im(String str, hm hmVar, String str2) {
        this.a = str;
        this.b = hmVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof im)) {
            return false;
        }
        im imVar = (im) obj;
        return k71.k.b(this.a, imVar.a) && k71.k.b(this.b, imVar.b) && k71.k.b(this.c, imVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", pinnedDiscussions=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
