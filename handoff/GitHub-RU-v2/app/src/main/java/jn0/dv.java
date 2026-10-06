package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class dv implements aaShadow.v0 {
    public ev a;
    public String b;
    public String c;

    public dv(ev evVar, String str, String str2) {
        this.a = evVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dv)) {
            return false;
        }
        dv dvVar = (dv) obj;
        return k71.k.b(this.a, dvVar.a) && k71.k.b(this.b, dvVar.b) && k71.k.b(this.c, dvVar.c);
    }

    public final int hashCode() {
        ev evVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((evVar == null ? 0 : evVar.hashCode()) * 31, this.b, 31);
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
