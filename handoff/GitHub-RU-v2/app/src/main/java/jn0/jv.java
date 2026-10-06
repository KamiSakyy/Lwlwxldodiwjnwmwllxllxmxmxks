package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jv {
    public final String a;
    public final kv b;
    public final kw0.a c;

    public jv(String str, kv kvVar, kw0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = kvVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jv)) {
            return false;
        }
        jv jvVar = (jv) obj;
        return k71.k.b(this.a, jvVar.a) && k71.k.b(this.b, jvVar.b) && k71.k.b(this.c, jvVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        kv kvVar = this.b;
        int hashCode2 = (hashCode + (kvVar == null ? 0 : kvVar.hashCode())) * 31;
        kw0.a aVar = this.c;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GitObject(__typename=");
        sb.append(this.a);
        sb.append(", onTree=");
        sb.append(this.b);
        sb.append(", nodeIdFragment=");
        return f1.e.n(sb, this.c, ")");
    }
}
