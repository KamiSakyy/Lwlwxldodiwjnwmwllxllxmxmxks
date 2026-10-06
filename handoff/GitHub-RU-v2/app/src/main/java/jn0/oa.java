package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class oa {
    public qa a;
    public List b;

    public oa(qa qaVar, List list) {
        this.a = qaVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oa)) {
            return false;
        }
        oa oaVar = (oa) obj;
        return k71.k.b(this.a, oaVar.a) && k71.k.b(this.b, oaVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "DiscussionCategories(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
