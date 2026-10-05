package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bf {
    public final String a;
    public final String b;
    public final ye c;
    public final kw0.a d;

    public bf(String str, String str2, ye yeVar, kw0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = yeVar;
        this.d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bf)) {
            return false;
        }
        bf bfVar = (bf) obj;
        return k71.k.b(this.a, bfVar.a) && k71.k.b(this.b, bfVar.b) && k71.k.b(this.c, bfVar.c) && k71.k.b(this.d, bfVar.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        ye yeVar = this.c;
        int hashCode = (i + (yeVar == null ? 0 : yeVar.hashCode())) * 31;
        kw0.a aVar = this.d;
        return hashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("RepoObject(__typename=", this.a, ", oid=", this.b, ", onCommit=");
        o.append(this.c);
        o.append(", nodeIdFragment=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
