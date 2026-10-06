package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class nz {
    public String a;
    public mz b;
    public gz c;
    public List d;
    public String e;

    public nz(String str, mz mzVar, gz gzVar, List list, String str2) {
        this.a = str;
        this.b = mzVar;
        this.c = gzVar;
        this.d = list;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nz)) {
            return false;
        }
        nz nzVar = (nz) obj;
        return k71.k.b(this.a, nzVar.a) && k71.k.b(this.b, nzVar.b) && k71.k.b(this.c, nzVar.c) && k71.k.b(this.d, nzVar.d) && k71.k.b(this.e, nzVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        mz mzVar = this.b;
        int hashCode2 = (hashCode + (mzVar == null ? 0 : mzVar.hashCode())) * 31;
        gz gzVar = this.c;
        int hashCode3 = (hashCode2 + (gzVar == null ? 0 : gzVar.hashCode())) * 31;
        List list = this.d;
        return this.e.hashCode() + ((hashCode3 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", ref=");
        sb.append(this.b);
        sb.append(", comparison=");
        sb.append(this.c);
        sb.append(", pullRequestTemplates=");
        sb.append(this.d);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.e, ")");
    }
}
