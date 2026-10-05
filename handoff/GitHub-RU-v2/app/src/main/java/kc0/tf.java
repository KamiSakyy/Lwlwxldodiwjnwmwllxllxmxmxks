package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tf {
    public final List a;
    public final jg b;

    public tf(List list, jg jgVar) {
        this.a = list;
        this.b = jgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf)) {
            return false;
        }
        tf tfVar = (tf) obj;
        return k71.k.b(this.a, tfVar.a) && k71.k.b(this.b, tfVar.b);
    }

    public final int hashCode() {
        List list = this.a;
        return Boolean.hashCode(this.b.a) + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        return "Code(nodes=" + this.a + ", pageInfo=" + this.b + ")";
    }
}
