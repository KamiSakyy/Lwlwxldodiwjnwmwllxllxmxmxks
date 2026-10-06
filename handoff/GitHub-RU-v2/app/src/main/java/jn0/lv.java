package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class lv {
    public final jv a;
    public final String b;
    public final String c;

    public lv(jv jvVar, String str, String str2) {
        this.a = jvVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lv)) {
            return false;
        }
        lv lvVar = (lv) obj;
        return k71.k.b(this.a, lvVar.a) && k71.k.b(this.b, lvVar.b) && k71.k.b(this.c, lvVar.c);
    }

    public final int hashCode() {
        jv jvVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((jvVar == null ? 0 : jvVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(gitObject=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
