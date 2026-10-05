package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wr {
    public final vr a;
    public final String b;
    public final String c;

    public wr(vr vrVar, String str, String str2) {
        this.a = vrVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wr)) {
            return false;
        }
        wr wrVar = (wr) obj;
        return k71.k.b(this.a, wrVar.a) && k71.k.b(this.b, wrVar.b) && k71.k.b(this.c, wrVar.c);
    }

    public final int hashCode() {
        vr vrVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((vrVar == null ? 0 : vrVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(release=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
