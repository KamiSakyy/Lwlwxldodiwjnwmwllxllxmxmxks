package ni0;

import aa.h0;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d implements h0 {
    public final String a;
    public final c b;

    public d(String str, c cVar) {
        this.a = str;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k.b(this.a, dVar.a) && k.b(this.b, dVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ProjectOwnerFragment(id=" + this.a + ", projects=" + this.b + ")";
    }
}
