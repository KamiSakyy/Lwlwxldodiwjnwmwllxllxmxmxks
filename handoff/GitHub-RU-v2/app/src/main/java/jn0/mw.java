package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mw {
    public final lw a;
    public final List b;

    public mw(lw lwVar, List list) {
        this.a = lwVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mw)) {
            return false;
        }
        mw mwVar = (mw) obj;
        return k71.k.b(this.a, mwVar.a) && k71.k.b(this.b, mwVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "Stargazers(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
}
