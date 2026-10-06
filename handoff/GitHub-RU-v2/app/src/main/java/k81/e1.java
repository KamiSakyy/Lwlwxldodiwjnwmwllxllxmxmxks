package k81;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: /home/user/work/p/classes5.dex */
public class e1 implements SerialDescriptor, l {
    public String a;
    public d0 b;
    public int c;
    public int d = -1;
    public String[] e;
    public List[] f;
    public boolean[] g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;

    public e1(String str, d0 d0Var, int i) {
        this.a = str;
        this.b = d0Var;
        this.c = i;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i3 = this.c;
        this.f = new List[i3];
        this.g = new boolean[i3];
        this.h = x61.s.r;
        w61.i iVar = w61.i.r;
        final int i4 = 0;
        this.i = sy.w.s(iVar, new j71.a(this) { // from class: k81.d1
            public final /* synthetic */ e1 s;

            {
                this.s = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, w61.h] */
            public final Object a() {
                KSerializer[] childSerializers;
                ArrayList arrayList;
                KSerializer[] typeParametersSerializers;
                switch (i4) {
                    case 0:
                        d0 d0Var2 = this.s.b;
                        return (d0Var2 == null || (childSerializers = d0Var2.childSerializers()) == null) ? c1.b : childSerializers;
                    case 1:
                        d0 d0Var3 = this.s.b;
                        if (d0Var3 == null || (typeParametersSerializers = d0Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(typeParametersSerializers.length);
                            for (KSerializer kSerializer : typeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return c1.c(arrayList);
                    default:
                        e1 e1Var = this.s;
                        return Integer.valueOf(c1.g(e1Var, (SerialDescriptor[]) e1Var.j.getValue()));
                }
            }
        });
        final int i5 = 1;
        this.j = sy.w.s(iVar, new j71.a(this) { // from class: k81.d1
            public final /* synthetic */ e1 s;

            {
                this.s = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, w61.h] */
            public final Object a() {
                KSerializer[] childSerializers;
                ArrayList arrayList;
                KSerializer[] typeParametersSerializers;
                switch (i5) {
                    case 0:
                        d0 d0Var2 = this.s.b;
                        return (d0Var2 == null || (childSerializers = d0Var2.childSerializers()) == null) ? c1.b : childSerializers;
                    case 1:
                        d0 d0Var3 = this.s.b;
                        if (d0Var3 == null || (typeParametersSerializers = d0Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(typeParametersSerializers.length);
                            for (KSerializer kSerializer : typeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return c1.c(arrayList);
                    default:
                        e1 e1Var = this.s;
                        return Integer.valueOf(c1.g(e1Var, (SerialDescriptor[]) e1Var.j.getValue()));
                }
            }
        });
        final int i6 = 2;
        this.k = sy.w.s(iVar, new j71.a(this) { // from class: k81.d1
            public final /* synthetic */ e1 s;

            {
                this.s = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, w61.h] */
            public final Object a() {
                KSerializer[] childSerializers;
                ArrayList arrayList;
                KSerializer[] typeParametersSerializers;
                switch (i6) {
                    case 0:
                        d0 d0Var2 = this.s.b;
                        return (d0Var2 == null || (childSerializers = d0Var2.childSerializers()) == null) ? c1.b : childSerializers;
                    case 1:
                        d0 d0Var3 = this.s.b;
                        if (d0Var3 == null || (typeParametersSerializers = d0Var3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(typeParametersSerializers.length);
                            for (KSerializer kSerializer : typeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return c1.c(arrayList);
                    default:
                        e1 e1Var = this.s;
                        return Integer.valueOf(c1.g(e1Var, (SerialDescriptor[]) e1Var.j.getValue()));
                }
            }
        });
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String a() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // k81.l
    public final Set b() {
        return this.h.keySet();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        k71.k.g(str, "name");
        Integer num = (Integer) this.h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public y9.a e() {
        return i81.k.e;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, w61.h] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, w61.h] */
    public boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof e1) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.a.equals(serialDescriptor.a()) && Arrays.equals((SerialDescriptor[]) this.j.getValue(), (SerialDescriptor[]) ((e1) obj).j.getValue())) {
                int f = serialDescriptor.f();
                int i2 = this.c;
                if (i2 == f) {
                    for (i = 0; i < i2; i++) {
                        i = (k71.k.b(j(i).a(), serialDescriptor.j(i).a()) && k71.k.b(j(i).e(), serialDescriptor.j(i).e())) ? i + 1 : 0;
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
        return this.e[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return x61.r.r;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean h() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
    public int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List i(int i) {
        List list = this.f[i];
        return list == null ? x61.r.r : list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor j(int i) {
        return ((KSerializer[]) this.i.getValue())[i].getDescriptor();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean k(int i) {
        return this.g[i];
    }

    public final void l(String str, boolean z) {
        k71.k.g(str, "name");
        int i = this.d + 1;
        this.d = i;
        String[] strArr = this.e;
        strArr[i] = str;
        this.g[i] = z;
        this.f[i] = null;
        if (i == this.c - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                hashMap.put(strArr[i2], Integer.valueOf(i2));
            }
            this.h = hashMap;
        }
    }

    public String toString() {
        return c1.n(this);
    }
}
