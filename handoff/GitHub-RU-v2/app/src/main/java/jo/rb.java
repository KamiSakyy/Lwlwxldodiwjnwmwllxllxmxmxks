package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class rb implements aaShadow.v0 {
    public sb a;
    public String b;
    public String c;

    public rb(sb sbVar, String str, String str2) {
        this.a = sbVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rb)) {
            return false;
        }
        rb rbVar = (rb) obj;
        return k71.k.b(this.a, rbVar.a) && k71.k.b(this.b, rbVar.b) && k71.k.b(this.c, rbVar.c);
    }

    public final int hashCode() {
        sb sbVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((sbVar == null ? 0 : sbVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(discussionCategory=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
