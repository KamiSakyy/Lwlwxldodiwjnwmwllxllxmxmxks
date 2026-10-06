package uf0;

import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y {
    public String a;
    public ud0.a b;

    public y(String str, ud0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return k71.k.b(this.a, yVar.a) && k71.k.b(this.b, yVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ud0.a aVar = this.b;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return f4.p("Owner(__typename=", this.a, ", actorFields=", this.b, ")");
    }
}
