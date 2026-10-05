package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r0 {
    public final String a;
    public final u b;

    public r0(String str, u uVar) {
        this.a = str;
        this.b = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return k71.k.b(this.a, r0Var.a) && k71.k.b(this.b, r0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FileType1(__typename=" + this.a + ", fileTypeFragment=" + this.b + ")";
    }
}
