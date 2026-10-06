package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ic implements aaShadow.v0 {
    public final lc a;
    public final mc b;
    public final String c;
    public final String d;

    public ic(lc lcVar, mc mcVar, String str, String str2) {
        this.a = lcVar;
        this.b = mcVar;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic)) {
            return false;
        }
        ic icVar = (ic) obj;
        return k71.k.b(this.a, icVar.a) && k71.k.b(this.b, icVar.b) && k71.k.b(this.c, icVar.c) && k71.k.b(this.d, icVar.d);
    }

    public final int hashCode() {
        lc lcVar = this.a;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((this.b.hashCode() + ((lcVar == null ? 0 : lcVar.hashCode()) * 31)) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(repository=");
        sb.append(this.a);
        sb.append(", search=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
