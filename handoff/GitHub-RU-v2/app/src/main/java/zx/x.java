package zx;

import dw.t4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x {
    public final String a;
    public final yw.b b;
    public final t4 c;
    public final dw.c d;

    public x(String str, yw.b bVar, t4 t4Var, dw.c cVar) {
        this.a = str;
        this.b = bVar;
        this.c = t4Var;
        this.d = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return k71.k.b(this.a, xVar.a) && k71.k.b(this.b, xVar.b) && k71.k.b(this.c, xVar.c) && k71.k.b(this.d, xVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "OnIssue(__typename=" + this.a + ", subscribableFragment=" + this.b + ", repositoryNodeFragmentIssue=" + this.c + ", issueProjectV2ItemsFragment=" + this.d + ")";
    }
}
