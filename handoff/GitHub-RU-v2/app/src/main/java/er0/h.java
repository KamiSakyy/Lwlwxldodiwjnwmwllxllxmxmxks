package er0;

import com.github.rudroid.m0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h {
    public String a;
    public boolean b;
    public g c;
    public String d;

    public h(String str, boolean z, g gVar, String str2) {
        this.a = str;
        this.b = z;
        this.c = gVar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k71.k.b(this.a, hVar.a) && this.b == hVar.b && k71.k.b(this.c, hVar.c) && k71.k.b(this.d, hVar.d);
    }

    public final int hashCode() {
        int e = x.i.e(this.a.hashCode() * 31, 31, this.b);
        g gVar = this.c;
        return this.d.hashCode() + ((e + (gVar == null ? 0 : gVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = m0.o("Discussion(id=", this.a, ", viewerCanUpvote=", ", answerChosenBy=", this.b);
        o.append(this.c);
        o.append(", __typename=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
