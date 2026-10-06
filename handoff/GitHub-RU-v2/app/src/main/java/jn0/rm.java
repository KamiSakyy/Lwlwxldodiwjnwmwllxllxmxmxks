package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class rm implements aaShadow.v0 {
    public wm a;
    public String b;
    public String c;

    public rm(wm wmVar, String str, String str2) {
        this.a = wmVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rm)) {
            return false;
        }
        rm rmVar = (rm) obj;
        return k71.k.b(this.a, rmVar.a) && k71.k.b(this.b, rmVar.b) && k71.k.b(this.c, rmVar.c);
    }

    public final int hashCode() {
        wm wmVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((wmVar == null ? 0 : wmVar.hashCode()) * 31, this.b, 31);
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
