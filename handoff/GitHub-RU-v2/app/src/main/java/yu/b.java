package yu;

import gv.u;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public String a;
    public u b;

    public b(String str, u uVar) {
        this.a = str;
        this.b = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k71.k.b(this.a, bVar.a) && k71.k.b(this.b, bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FileType1(__typename=" + this.a + ", fileTypeFragment=" + this.b + ")";
    }
}
