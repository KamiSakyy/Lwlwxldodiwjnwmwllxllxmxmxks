package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ra {
    public final String a;
    public final oa b;
    public final String c;

    public ra(String str, oa oaVar, String str2) {
        this.a = str;
        this.b = oaVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ra)) {
            return false;
        }
        ra raVar = (ra) obj;
        return k71.k.b(this.a, raVar.a) && k71.k.b(this.b, raVar.b) && k71.k.b(this.c, raVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", discussionCategories=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
