package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b1 {
    public final String a;

    public b1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1) && k71.k.b(this.a, ((b1) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnImageFileType(url=", this.a, ")");
    }
}
