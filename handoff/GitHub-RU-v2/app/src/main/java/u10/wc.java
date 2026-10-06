package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wc {
    public final String a;
    public final String b;
    public final c30.j c;

    public wc(String str, String str2, c30.j jVar) {
        this.a = str;
        this.b = str2;
        this.c = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wc)) {
            return false;
        }
        wc wcVar = (wc) obj;
        return k71.k.b(this.a, wcVar.a) && k71.k.b(this.b, wcVar.b) && k71.k.b(this.c, wcVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Organization(__typename=", this.a, ", id=", this.b, ", organizationNameAndAvatar=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
