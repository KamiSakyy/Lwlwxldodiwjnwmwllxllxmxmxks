package cq;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o4 {
    public final String a;
    public final List b;

    public o4(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4)) {
            return false;
        }
        o4 o4Var = (o4) obj;
        return k71.k.b(this.a, o4Var.a) && k71.k.b(this.b, o4Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return jo.f4.o("OnMarkdownFileType(contentHTML=", this.a, ", markDownFileLines=", ")", this.b);
    }
}
