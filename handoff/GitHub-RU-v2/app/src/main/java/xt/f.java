package xt;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f {
    public d a;
    public String b;

    public f(d dVar, String str) {
        this.a = dVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return k71.k.b(this.a, fVar.a) && k71.k.b(this.b, fVar.b);
    }

    public final int hashCode() {
        d dVar = this.a;
        return this.b.hashCode() + ((dVar == null ? 0 : dVar.hashCode()) * 31);
    }

    public final String toString() {
        return "OnIssue1(duplicateOf=" + this.a + ", id=" + this.b + ")";
    }
}
