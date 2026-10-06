package bm;

import java.util.List;
import jo.f4Shadow;

/* loaded from: /home/user/work/p/classes3.dex */
public class s {
    public String a;
    public List b;

    public s(String str, List list) {
        k71.k.g(str, "query");
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return k71.k.b(this.a, sVar.a) && k71.k.b(this.b, sVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return f4.o("Expression(query=", this.a, ", tokens=", ")", this.b);
    }
}
