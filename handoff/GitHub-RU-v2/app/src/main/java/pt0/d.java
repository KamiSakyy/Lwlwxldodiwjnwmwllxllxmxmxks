package pt0;

import com.github.rudroid.m0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d {
    public final String a;
    public final boolean b;
    public final g c;
    public final Integer d;
    public final b e;

    public d(String str, boolean z, g gVar, Integer num, b bVar) {
        this.a = str;
        this.b = z;
        this.c = gVar;
        this.d = num;
        this.e = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k71.k.b(this.a, dVar.a) && this.b == dVar.b && k71.k.b(this.c, dVar.c) && k71.k.b(this.d, dVar.d) && k71.k.b(this.e, dVar.e);
    }

    public final int hashCode() {
        String str = this.a;
        int e = x.i.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        g gVar = this.c;
        int hashCode = (e + (gVar == null ? 0 : gVar.a.hashCode())) * 31;
        Integer num = this.d;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        b bVar = this.e;
        return hashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = m0.o("NewTreeEntry(path=", this.a, ", isGenerated=", ", submodule=", this.b);
        o.append(this.c);
        o.append(", lineCount=");
        o.append(this.d);
        o.append(", fileType=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}
