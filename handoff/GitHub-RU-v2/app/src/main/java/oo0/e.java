package oo0;

import com.github.rudroid.m0;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e {
    public boolean a;
    public String b;

    public e(String str, boolean z) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && k.b(this.b, eVar.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return m0.f("PageInfo(hasNextPage=", ", endCursor=", this.b, ")", this.a);
    }
    public Object a(Object p1, Object p2, Object p3) { return null; }
}
