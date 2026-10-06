package fn;

import f11.b;
import k71.k;
import oa.j;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public j a;
    public b b;

    public a(j jVar, b bVar) {
        k.g(jVar, "user");
        k.g(bVar, "authRequest");
        this.a = jVar;
        this.b = bVar;
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
        return "UserScopedAuthRequest(user=" + this.a + ", authRequest=" + this.b + ")";
    }

}
