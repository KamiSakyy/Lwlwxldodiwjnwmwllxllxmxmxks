package f00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v0 {
    public String a;
    public y b;

    public v0(String str, y yVar) {
        this.a = str;
        this.b = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return k71.k.b(this.a, v0Var.a) && k71.k.b(this.b, v0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnProjectV2FieldCommon(__typename=" + this.a + ", projectV2FieldCommonFragment=" + this.b + ")";
    }
}
