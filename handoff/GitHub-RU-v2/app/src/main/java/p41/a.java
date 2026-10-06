package p41;

import i4.u;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public String a;
    public Set b;
    public Set c;
    public int d;
    public int e;
    public d f;
    public Set g;

    public a(String str, Set set, Set set2, int i, int i2, d dVar, Set set3) {
        this.a = str;
        this.b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = dVar;
        this.g = Collections.unmodifiableSet(set3);
    }

    public static u a(Class cls) {
        return new u(cls, new Class[0]);
    }

    public static u b(o oVar) {
        return new u(oVar, new o[0]);
    }

    public static a c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(o.a(cls));
        for (Class cls2 : clsArr) {
            m71.a.n(cls2, "Null interface");
            hashSet.add(o.a(cls2));
        }
        return new a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new c5.b(17, obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }

}
