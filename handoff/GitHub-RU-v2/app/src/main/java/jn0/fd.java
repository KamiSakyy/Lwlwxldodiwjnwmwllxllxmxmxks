package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fd implements aaShadow.v0 {
    public kd a;
    public String b;
    public String c;

    public fd(kd kdVar, String str, String str2) {
        this.a = kdVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd)) {
            return false;
        }
        fd fdVar = (fd) obj;
        return k71.k.b(this.a, fdVar.a) && k71.k.b(this.b, fdVar.b) && k71.k.b(this.c, fdVar.c);
    }

    public final int hashCode() {
        kd kdVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((kdVar == null ? 0 : kdVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(repository=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
