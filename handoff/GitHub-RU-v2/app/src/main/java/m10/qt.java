package m10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class qt {
    public final aa1.b a;
    public final aa1.b b;
    public final aa1.b c;
    public final aa1.b d;
    public final aa1.b e;

    public qt(aa1.b bVar, aa1.b bVar2, aa1.b bVar3, aa1.b bVar4, aa1.b bVar5, int i) {
        int i2 = i & 1;
        aa1.b bVar6 = aa.t0.d;
        bVar = i2 != 0 ? bVar6 : bVar;
        bVar2 = (i & 2) != 0 ? bVar6 : bVar2;
        bVar3 = (i & 4) != 0 ? bVar6 : bVar3;
        bVar4 = (i & 8) != 0 ? bVar6 : bVar4;
        bVar5 = (i & 16) != 0 ? bVar6 : bVar5;
        this.a = bVar;
        this.b = bVar2;
        this.c = bVar3;
        this.d = bVar4;
        this.e = bVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qt)) {
            return false;
        }
        qt qtVar = (qt) obj;
        return k71.k.b(this.a, qtVar.a) && k71.k.b(this.b, qtVar.b) && k71.k.b(this.c, qtVar.c) && k71.k.b(this.d, qtVar.d) && k71.k.b(this.e, qtVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + f1.e.a(this.d, f1.e.a(this.c, f1.e.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder u = jo.f4.u("ProjectV2FieldValue(date=", this.a, ", iterationId=", this.b, ", number=");
        f1.e.w(u, this.c, ", singleSelectOptionId=", this.d, ", text=");
        return f1.e.k(u, this.e, ")");
    }

    public Object e;
}
