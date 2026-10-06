package e01;

import java.util.List;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public List a;
    public List b;

    public a(List list, List list2) {
        this.a = list;
        this.b = list2;
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
        return "ApolloFileChanges(addition=" + this.a + ", deletions=" + this.b + ")";
    }
}
