package la0;

import aa.h0;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c implements h0 {
    public final String a;
    public final a b;
    public final b c;

    public c(String str, a aVar, b bVar) {
        k.g(str, "__typename");
        this.a = str;
        this.b = aVar;
        this.c = bVar;
    }

    public static c a(c cVar, a aVar, b bVar) {
        String str = cVar.a;
        cVar.getClass();
        k.g(str, "__typename");
        return new c(str, aVar, bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k.b(this.a, cVar.a) && k.b(this.b, cVar.b) && k.b(this.c, cVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        a aVar = this.b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        b bVar = this.c;
        return hashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        return "DiscussionVotableFragment(__typename=" + this.a + ", onDiscussion=" + this.b + ", onDiscussionComment=" + this.c + ")";
    }
    public static final Object a = null;
    public static final Object f = null;
}
