package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ki implements aa.v0 {
    public final li a;
    public final String b;
    public final String c;

    public ki(li liVar, String str, String str2) {
        this.a = liVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ki)) {
            return false;
        }
        ki kiVar = (ki) obj;
        return k71.k.b(this.a, kiVar.a) && k71.k.b(this.b, kiVar.b) && k71.k.b(this.c, kiVar.c);
    }

    public final int hashCode() {
        li liVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((liVar == null ? 0 : liVar.hashCode()) * 31, this.b, 31);
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
