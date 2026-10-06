package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class at implements aaShadow.v0 {
    public final ft a;
    public final String b;
    public final String c;

    public at(ft ftVar, String str, String str2) {
        this.a = ftVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof at)) {
            return false;
        }
        at atVar = (at) obj;
        return k71.k.b(this.a, atVar.a) && k71.k.b(this.b, atVar.b) && k71.k.b(this.c, atVar.c);
    }

    public final int hashCode() {
        ft ftVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((ftVar == null ? 0 : ftVar.hashCode()) * 31, this.b, 31);
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
