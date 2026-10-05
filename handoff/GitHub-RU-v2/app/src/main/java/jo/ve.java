package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ve implements aa.v0 {
    public final ye a;
    public final String b;
    public final String c;

    public ve(ye yeVar, String str, String str2) {
        this.a = yeVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ve)) {
            return false;
        }
        ve veVar = (ve) obj;
        return k71.k.b(this.a, veVar.a) && k71.k.b(this.b, veVar.b) && k71.k.b(this.c, veVar.c);
    }

    public final int hashCode() {
        ye yeVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((yeVar == null ? 0 : yeVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(topic=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
