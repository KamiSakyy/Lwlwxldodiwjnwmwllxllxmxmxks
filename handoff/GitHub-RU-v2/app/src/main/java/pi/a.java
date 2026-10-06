package pi;

import jo.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a implements e {
    public d a;
    public i b;
    public boolean c;

    public a(d dVar, i iVar, boolean z) {
        this.a = dVar;
        this.b = iVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
    }

    @Override // pi.e
    public final d getValue() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ANSIBasicColorCode(value=");
        sb.append(this.a);
        sb.append(", color=");
        sb.append(this.b);
        sb.append(", bright=");
        return f4.s(sb, this.c, ")");
    }
}
