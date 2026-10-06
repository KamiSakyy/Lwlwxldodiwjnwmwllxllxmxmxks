package yi;

import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j {
    public int a;
    public String b;
    public List c;
    public boolean d;
    public boolean e;
    public boolean f;

    public j(int i, String str, List list, boolean z, boolean z2, boolean z3) {
        this.a = i;
        this.b = str;
        this.c = list;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.List] */
    public static j a(j jVar, String str, ArrayList arrayList, int i) {
        int i2 = jVar.a;
        if ((i & 2) != 0) {
            str = jVar.b;
        }
        String str2 = str;
        ArrayList arrayList2 = arrayList;
        if ((i & 4) != 0) {
            arrayList2 = jVar.c;
        }
        ArrayList arrayList3 = arrayList2;
        boolean z = (i & 8) != 0 ? jVar.d : true;
        boolean z2 = (i & 16) != 0 ? jVar.e : true;
        boolean z3 = (i & 32) != 0 ? jVar.f : true;
        k71.k.g(str2, "itemGId");
        k71.k.g(arrayList3, "columnIds");
        return new j(i2, str2, arrayList3, z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.a == jVar.a && k71.k.b(this.b, jVar.b) && k71.k.b(this.c, jVar.c) && this.d == jVar.d && this.e == jVar.e && this.f == jVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + x.i.e(x.i.e(f1.e.c(this.c, h1.i(Integer.hashCode(this.a) * 31, this.b, 31), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder n = x.i.n(this.a, "ItemUpdate(itemId=", ", itemGId=", this.b, ", columnIds=");
        h1.C(n, this.c, ", isCreation=", this.d, ", isDestroyed=");
        return m0.m(n, this.e, ", isDenormalized=", this.f, ")");
    }
}
