package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n4 {
    public final String a;

    public n4(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n4) && k71.k.b(this.a, ((n4) obj).a);
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
