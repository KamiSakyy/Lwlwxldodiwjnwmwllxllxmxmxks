package g40;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o {
    public final String a;

    public o(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && k71.k.b(this.a, ((o) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnImageFileType1(url=", this.a, ")");
    }
}
