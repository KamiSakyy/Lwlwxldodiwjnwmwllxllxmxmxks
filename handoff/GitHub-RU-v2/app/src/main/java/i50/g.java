package i50;

import com.github.rudroid.m0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public String a;
    public boolean b;
    public f c;
    public String d;

    public g(String str, boolean z, f fVar, String str2) {
        this.a = str;
        this.b = z;
        this.c = fVar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return k71.k.b(this.a, gVar.a) && this.b == gVar.b && k71.k.b(this.c, gVar.c) && k71.k.b(this.d, gVar.d);
    }

    public final int hashCode() {
        int e = x.i.e(this.a.hashCode() * 31, 31, this.b);
        f fVar = this.c;
        return this.d.hashCode() + ((e + (fVar == null ? 0 : fVar.hashCode())) * 31);
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
