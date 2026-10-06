package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xv implements aaShadow.v0 {
    public ew a;
    public String b;
    public String c;

    public xv(ew ewVar, String str, String str2) {
        this.a = ewVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xv)) {
            return false;
        }
        xv xvVar = (xv) obj;
        return k71.k.b(this.a, xvVar.a) && k71.k.b(this.b, xvVar.b) && k71.k.b(this.c, xvVar.c);
    }

    public final int hashCode() {
        ew ewVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((ewVar == null ? 0 : ewVar.hashCode()) * 31, this.b, 31);
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
