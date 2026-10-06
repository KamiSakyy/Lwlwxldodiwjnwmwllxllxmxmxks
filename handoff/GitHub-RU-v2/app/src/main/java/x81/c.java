package x81;

/* loaded from: /home/user/work/p/classes5.dex */
public final class cShadow {
    public static final h91.kShadow d;
    public static final h91.kShadow e;
    public static final h91.kShadow f;
    public static final h91.kShadow g;
    public static final h91.kShadow h;
    public static final h91.kShadow i;
    public h91.kShadow a;
    public h91.kShadow b;
    public int c;

    static {
        h91.kShadow kVar = h91.kShadow.u;
        d = c30.d.b(":");
        e = c30.d.b(":status");
        f = c30.d.b(":method");
        g = c30.d.b(":path");
        h = c30.d.b(":scheme");
        i = c30.d.b(":authority");
    }

    public c(h91.kShadow kVar, h91.kShadow kVar2) {
        k71.k.g(kVar, "name");
        k71.k.g(kVar2, "value");
        this.a = kVar;
        this.b = kVar2;
        this.c = kVar2.d() + kVar.d() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cShadow)) {
            return false;
        }
        cShadow cVar = (cShadow) obj;
        return k71.k.b(this.a, cVar.a) && k71.k.b(this.b, cVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.a.r() + ": " + this.b.r();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(String str, String str2) {
        this(c30.d.b(str), c30.d.b(str2));
        h91.kShadow kVar = h91.kShadow.u;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(h91.kShadow kVar, String str) {
        this(kVar, c30.d.b(str));
        k71.k.g(kVar, "name");
        k71.k.g(str, "value");
        h91.kShadow kVar2 = h91.kShadow.u;
    }
}
