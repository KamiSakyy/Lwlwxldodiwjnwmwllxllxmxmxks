package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qy implements aaShadow.v0 {
    public final sy a;
    public final String b;
    public final String c;

    public qy(sy syVar, String str, String str2) {
        this.a = syVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qy)) {
            return false;
        }
        qy qyVar = (qy) obj;
        return k71.k.b(this.a, qyVar.a) && k71.k.b(this.b, qyVar.b) && k71.k.b(this.c, qyVar.c);
    }

    public final int hashCode() {
        sy syVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((syVar == null ? 0 : syVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(node=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
