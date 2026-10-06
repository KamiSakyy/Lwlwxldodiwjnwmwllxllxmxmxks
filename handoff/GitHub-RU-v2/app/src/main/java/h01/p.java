package h01;

import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p {
    public int a;
    public int b;

    public p(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.a == pVar.a && this.b == pVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return f4Shadow.h(this.a, this.b, "SubIssueProgress(totalIssues=", ", completedIssues=", ")");
    }
}
