package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p4 {
    public String a;

    public p4(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p4) && k71.k.b(this.a, ((p4) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnPdfFileType(url=", this.a, ")");
    }
}
