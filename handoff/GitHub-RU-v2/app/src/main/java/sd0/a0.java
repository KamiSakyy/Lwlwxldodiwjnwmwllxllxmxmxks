package sd0;

import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a0 {
    public final String a;
    public final List b;

    public a0(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return k71.k.b(this.a, a0Var.a) && k71.k.b(this.b, a0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return f4.o("OnMarkdownFileType(contentHTML=", this.a, ", markDownFileLines=", ")", this.b);
    }
}
