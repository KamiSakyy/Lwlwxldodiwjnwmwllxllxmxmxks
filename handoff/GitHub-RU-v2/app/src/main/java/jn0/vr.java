package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vr {
    public final sr a;
    public final String b;
    public final String c;

    public vr(sr srVar, String str, String str2) {
        this.a = srVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vr)) {
            return false;
        }
        vr vrVar = (vr) obj;
        return k71.k.b(this.a, vrVar.a) && k71.k.b(this.b, vrVar.b) && k71.k.b(this.c, vrVar.c);
    }

    public final int hashCode() {
        sr srVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((srVar == null ? 0 : srVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Release(mentions=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
