package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t3 {
    public final String a;

    public t3(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t3) && k71.k.b(this.a, ((t3) obj).a);
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
