package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kr implements aa.v0 {
    public final nr a;
    public final String b;
    public final String c;

    public kr(nr nrVar, String str, String str2) {
        this.a = nrVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kr)) {
            return false;
        }
        kr krVar = (kr) obj;
        return k71.k.b(this.a, krVar.a) && k71.k.b(this.b, krVar.b) && k71.k.b(this.c, krVar.c);
    }

    public final int hashCode() {
        nr nrVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((nrVar == null ? 0 : nrVar.hashCode()) * 31, this.b, 31);
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
