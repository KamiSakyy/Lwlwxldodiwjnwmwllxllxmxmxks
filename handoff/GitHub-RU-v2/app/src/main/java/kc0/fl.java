package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fl {
    public final String a;
    public final bl b;
    public final String c;

    public fl(String str, bl blVar, String str2) {
        this.a = str;
        this.b = blVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fl)) {
            return false;
        }
        fl flVar = (fl) obj;
        return k71.k.b(this.a, flVar.a) && k71.k.b(this.b, flVar.b) && k71.k.b(this.c, flVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        bl blVar = this.b;
        return this.c.hashCode() + ((hashCode + (blVar == null ? 0 : blVar.hashCode())) * 31);
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
