package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ex {
    public cx a;
    public List b;

    public ex(cx cxVar, List list) {
        this.a = cxVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex)) {
            return false;
        }
        ex exVar = (ex) obj;
        return k71.k.b(this.a, exVar.a) && k71.k.b(this.b, exVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Repositories1(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
