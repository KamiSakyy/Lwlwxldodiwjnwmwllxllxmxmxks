package py0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s {
    public u a;
    public List b;

    public s(u uVar, List list) {
        this.a = uVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return k71.k.b(this.a, sVar.a) && k71.k.b(this.b, sVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "IssueTypes(pageInfo=" + this.a + ", nodes=" + this.b + ")";
    }
    public Object N() { return null; }
    public Object S(Object p1, Object p2) { return null; }
    public Object V() { return null; }
    public Object g0() { return null; }
    public Object k(Object p1) { return null; }
    public Object l() { return null; }
    public Object n0(Object p1) { return null; }
    public Object q(Object p1) { return null; }
    public Object q0() { return null; }
    public Object S = null;
    public Object T = null;
    public Object S(int p1, boolean p2) { return null; }
    public Object q(boolean p1) { return null; }
}
