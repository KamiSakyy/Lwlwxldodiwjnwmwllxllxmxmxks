package e40;

import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public String a;
    public e30.a b;

    public a(String str, e30.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.a, aVar.a) && k.b(this.b, aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return no.a.m("Actor(__typename=", this.a, ", actorFields=", this.b, ")");
    }
}
