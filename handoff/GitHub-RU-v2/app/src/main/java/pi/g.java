package pi;

import w61.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g implements e {
    public final d a;
    public final byte b;
    public final byte c;
    public final byte d;

    public g(d dVar, byte b, byte b2, byte b3) {
        this.a = dVar;
        this.b = b;
        this.c = b2;
        this.d = b3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a == gVar.a && this.b == gVar.b && this.c == gVar.c && this.d == gVar.d;
    }

    @Override // pi.e
    public final d getValue() {
        return this.a;
    }

    public final int hashCode() {
        return Byte.hashCode(this.d) + ((Byte.hashCode(this.c) + ((Byte.hashCode(this.b) + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        String a = r.a(this.b);
        String a2 = r.a(this.c);
        String a3 = r.a(this.d);
        StringBuilder sb = new StringBuilder("ANSIRGBColorCode(value=");
        sb.append(this.a);
        sb.append(", r=");
        sb.append(a);
        sb.append(", g=");
        return x.i.k(sb, a2, ", b=", a3, ")");
    }
}
