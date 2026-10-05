package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mn {
    public final String a;
    public final ln b;
    public final String c;

    public mn(String str, ln lnVar, String str2) {
        this.a = str;
        this.b = lnVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mn)) {
            return false;
        }
        mn mnVar = (mn) obj;
        return k71.k.b(this.a, mnVar.a) && k71.k.b(this.b, mnVar.b) && k71.k.b(this.c, mnVar.c);
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
