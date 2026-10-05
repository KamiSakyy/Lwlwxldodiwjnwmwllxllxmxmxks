package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class na implements aa.v0 {
    public final ra a;
    public final String b;
    public final String c;

    public na(ra raVar, String str, String str2) {
        this.a = raVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na)) {
            return false;
        }
        na naVar = (na) obj;
        return k71.k.b(this.a, naVar.a) && k71.k.b(this.b, naVar.b) && k71.k.b(this.c, naVar.c);
    }

    public final int hashCode() {
        ra raVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((raVar == null ? 0 : raVar.hashCode()) * 31, this.b, 31);
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
