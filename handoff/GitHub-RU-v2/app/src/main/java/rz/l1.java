package rz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l1 {
    public String a;
    public tz.c b;

    public l1(String str, tz.c cVar) {
        this.a = str;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return k71.k.b(this.a, l1Var.a) && k71.k.b(this.b, l1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AllProjectsV2(__typename=" + this.a + ", projectV2ConnectionFragment=" + this.b + ")";
    }
}
