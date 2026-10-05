package rz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o0 {
    public final String a;
    public final tz.c b;

    public o0(String str, tz.c cVar) {
        this.a = str;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return k71.k.b(this.a, o0Var.a) && k71.k.b(this.b, o0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ProjectsV2(__typename=" + this.a + ", projectV2ConnectionFragment=" + this.b + ")";
    }
}
