package iy0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t0 {
    public final String a;
    public final w b;

    public t0(String str, w wVar) {
        this.a = str;
        this.b = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return k71.k.b(this.a, t0Var.a) && k71.k.b(this.b, t0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnProjectV2FieldCommon(__typename=" + this.a + ", projectV2FieldCommonFragment=" + this.b + ")";
    }
}
