package er;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m {
    public String a;
    public String b;
    public String c;
    public z d;

    public m(String str, String str2, String str3, z zVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return k71.k.b(this.a, mVar.a) && k71.k.b(this.b, mVar.b) && k71.k.b(this.c, mVar.c) && k71.k.b(this.d, mVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int i = com.github.rudroid.copilot.h1.i((hashCode + (str == null ? 0 : str.hashCode())) * 31, this.c, 31);
        z zVar = this.d;
        return i + (zVar != null ? zVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", name=", this.b, ", avatarUrl=");
        o.append(this.c);
        o.append(", user=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
