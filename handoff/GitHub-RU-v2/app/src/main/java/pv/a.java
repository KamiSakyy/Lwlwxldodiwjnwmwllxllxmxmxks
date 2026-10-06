package pv;

import com.github.rudroid.m0;
import k71.k;
import m10.z00;
import x.i;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public final String a;
    public final boolean b;
    public final b c;
    public final z00 d;

    public a(String str, boolean z, b bVar, z00 z00Var) {
        this.a = str;
        this.b = z;
        this.c = bVar;
        this.d = z00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.a, aVar.a) && this.b == aVar.b && k.b(this.c, aVar.c) && this.d == aVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + i.e(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder o = m0.o("ReactionGroup(__typename=", this.a, ", viewerHasReacted=", ", reactors=", this.b);
        o.append(this.c);
        o.append(", content=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
