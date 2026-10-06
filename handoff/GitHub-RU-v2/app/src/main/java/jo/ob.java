package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ob {
    public String a;
    public lb b;
    public String c;

    public ob(String str, lb lbVar, String str2) {
        this.a = str;
        this.b = lbVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ob)) {
            return false;
        }
        ob obVar = (ob) obj;
        return k71.k.b(this.a, obVar.a) && k71.k.b(this.b, obVar.b) && k71.k.b(this.c, obVar.c);
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
