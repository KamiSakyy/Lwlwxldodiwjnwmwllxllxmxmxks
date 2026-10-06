package i81;

import f0.b2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k81.c1;
import kotlinx.serialization.descriptors.SerialDescriptor;
import sy.w;
import w61.p;
import x61.m;
import x61.n;
import x61.u;
import x61.x;

/* loaded from: /home/user/work/p/classes5.dex */
public final class g implements SerialDescriptor, k81.l {
    public String a;
    public y9.a b;
    public int c;
    public List d;
    public HashSet e;
    public String[] f;
    public SerialDescriptor[] g;
    public List[] h;
    public boolean[] i;
    public Map j;
    public SerialDescriptor[] k;
    public p l;

    public g(String str, y9.a aVar, int i, List list, a aVar2) {
        k71.k.g(str, "serialName");
        this.a = str;
        this.b = aVar;
        this.c = i;
        this.d = aVar2.b;
        ArrayList arrayList = aVar2.c;
        this.e = m.D0(arrayList);
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f = strArr;
        this.g = c1.c(aVar2.e);
        this.h = (List[]) aVar2.f.toArray(new List[0]);
        this.i = m.z0(aVar2.g);
        k71.k.g(strArr, "<this>");
        h hVar = new h(3, new w8.p(7, strArr));
        ArrayList arrayList2 = new ArrayList(n.F(hVar, 10));
        s71.b it = hVar.iterator();
        while (true) {
            s71.b bVar = it;
            if (!bVar.t.hasNext()) {
                this.j = x.A(arrayList2);
                this.k = c1.c(list);
                this.l = w.t(new b2(17, this));
                return;
            }
            u uVar = (u) bVar.next();
            arrayList2.add(new w61.k(uVar.b, Integer.valueOf(uVar.a)));
        }
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        return this.a;
    }

    @Override // k81.l
    public final Set b() {
        return this.e;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean c() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        k71.k.g(str, "name");
        Integer num = (Integer) this.j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final y9.a e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (k71.k.b(this.a, serialDescriptor.a()) && Arrays.equals(this.k, ((g) obj).k)) {
                int f = serialDescriptor.f();
                int i2 = this.c;
                if (i2 == f) {
                    for (i = 0; i < i2; i++) {
                        SerialDescriptor[] serialDescriptorArr = this.g;
                        i = (k71.k.b(serialDescriptorArr[i].a(), serialDescriptor.j(i).a()) && k71.k.b(serialDescriptorArr[i].e(), serialDescriptor.j(i).e())) ? i + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f() {
        return this.c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String g(int i) {
        return this.f[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return ((Number) this.l.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List i(int i) {
        return this.h[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor j(int i) {
        return this.g[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean k(int i) {
        return this.i[i];
    }

    public final String toString() {
        return c1.n(this);
    }
}
