package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class be {
    public String a;
    public ae b;
    public String c;

    public be(String str, ae aeVar, String str2) {
        this.a = str;
        this.b = aeVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be)) {
            return false;
        }
        be beVar = (be) obj;
        return k71.k.b(this.a, beVar.a) && k71.k.b(this.b, beVar.b) && k71.k.b(this.c, beVar.c);
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
