package qo;

/* loaded from: /home/user/work/p/classes3.dex */
public class e implements aa.v0 {
    public g a;
    public String b;
    public String c;

    public e(g gVar, String str, String str2) {
        this.a = gVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k71.k.b(this.a, eVar.a) && k71.k.b(this.b, eVar.b) && k71.k.b(this.c, eVar.c);
    }

    public final int hashCode() {
        g gVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((gVar == null ? 0 : gVar.hashCode()) * 31, this.b, 31);
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
