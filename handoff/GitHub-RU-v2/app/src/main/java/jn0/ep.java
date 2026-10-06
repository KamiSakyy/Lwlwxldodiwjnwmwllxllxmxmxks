package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ep {
    public final String a;
    public final dp b;
    public final String c;

    public ep(String str, dp dpVar, String str2) {
        this.a = str;
        this.b = dpVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ep)) {
            return false;
        }
        ep epVar = (ep) obj;
        return k71.k.b(this.a, epVar.a) && k71.k.b(this.b, epVar.b) && k71.k.b(this.c, epVar.c);
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
