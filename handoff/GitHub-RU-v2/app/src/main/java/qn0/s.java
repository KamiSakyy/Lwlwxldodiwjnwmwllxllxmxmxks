package qn0;

/* loaded from: /home/user/work/p/classes4.dex */
public class s implements aa.v0 {
    public u a;
    public String b;
    public String c;

    public s(u uVar, String str, String str2) {
        this.a = uVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return k71.k.b(this.a, sVar.a) && k71.k.b(this.b, sVar.b) && k71.k.b(this.c, sVar.c);
    }

    public final int hashCode() {
        u uVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((uVar == null ? 0 : uVar.hashCode()) * 31, this.b, 31);
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
