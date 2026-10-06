package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ya {
    public final wa a;
    public final String b;
    public final String c;
    public final String d;

    public ya(wa waVar, String str, String str2, String str3) {
        this.a = waVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ya)) {
            return false;
        }
        ya yaVar = (ya) obj;
        return k71.k.b(this.a, yaVar.a) && k71.k.b(this.b, yaVar.b) && k71.k.b(this.c, yaVar.c) && k71.k.b(this.d, yaVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(owner=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
