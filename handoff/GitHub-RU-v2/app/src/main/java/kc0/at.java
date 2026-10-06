package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class at {
    public ys a;
    public String b;
    public String c;

    public at(ys ysVar, String str, String str2) {
        this.a = ysVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof at)) {
            return false;
        }
        at atVar = (at) obj;
        return k71.k.b(this.a, atVar.a) && k71.k.b(this.b, atVar.b) && k71.k.b(this.c, atVar.c);
    }

    public final int hashCode() {
        ys ysVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((ysVar == null ? 0 : ysVar.hashCode()) * 31, this.b, 31);
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
