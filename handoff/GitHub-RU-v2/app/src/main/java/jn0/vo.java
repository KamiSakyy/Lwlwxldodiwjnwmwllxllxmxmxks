package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vo {
    public final to a;
    public final String b;
    public final String c;

    public vo(to toVar, String str, String str2) {
        this.a = toVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vo)) {
            return false;
        }
        vo voVar = (vo) obj;
        return k71.k.b(this.a, voVar.a) && k71.k.b(this.b, voVar.b) && k71.k.b(this.c, voVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("User(organizations=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
