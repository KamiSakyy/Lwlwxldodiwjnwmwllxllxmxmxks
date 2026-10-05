package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ay {
    public final zx a;
    public final String b;
    public final String c;

    public ay(zx zxVar, String str, String str2) {
        this.a = zxVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ay)) {
            return false;
        }
        ay ayVar = (ay) obj;
        return k71.k.b(this.a, ayVar.a) && k71.k.b(this.b, ayVar.b) && k71.k.b(this.c, ayVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(owner=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
