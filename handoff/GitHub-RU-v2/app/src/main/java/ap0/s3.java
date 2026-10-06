package ap0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s3 {
    public String a;
    public List b;

    public s3(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3)) {
            return false;
        }
        s3 s3Var = (s3) obj;
        return k71.k.b(this.a, s3Var.a) && k71.k.b(this.b, s3Var.b);
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
