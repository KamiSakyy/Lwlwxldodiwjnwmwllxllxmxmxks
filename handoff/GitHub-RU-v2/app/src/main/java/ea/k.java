package ea;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import sy.d0;
import sy.f0;
import x61.m;
import x61.n;
import x61.v;
import x61.x;

/* loaded from: /home/user/work/p/classes.dex */
public final class k implements f {

    /* renamed from: r, reason: collision with root package name */
    public Object f22202r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f22203s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f22204t = new ArrayList();

    public static Object f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj2 != null) {
            if (obj instanceof List) {
                if (!(obj2 instanceof List)) {
                    throw new IllegalStateException(("Cannot merge " + obj + " with " + obj2).toString());
                }
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list.size() != list2.size()) {
                    throw new IllegalStateException(("Cannot merge " + obj + " with " + obj2).toString());
                }
                q71.g l = d0.l((Collection) obj);
                ArrayList arrayList = new ArrayList(n.F(l, 10));
                v it = l.iterator();
                while (((q71.f) it).f31001t) {
                    int nextInt = it.nextInt();
                    arrayList.add(f(list.get(nextInt), list2.get(nextInt)));
                }
                return arrayList;
            }
            if (obj instanceof Map) {
                if (!(obj2 instanceof Map)) {
                    throw new IllegalStateException(("Cannot merge " + obj + " with " + obj2).toString());
                }
                Map map = (Map) obj;
                Map map2 = (Map) obj2;
                LinkedHashSet<String> m = f0.m(map.keySet(), map2.keySet());
                ArrayList arrayList2 = new ArrayList(n.F(m, 10));
                for (String str : m) {
                    arrayList2.add(new w61.k(str, f(map.get(str), map2.get(str))));
                }
                return x.A(arrayList2);
            }
            if (!obj.equals(obj2)) {
                throw new IllegalStateException(("Cannot merge " + obj + " with " + obj2).toString());
            }
        }
        return obj;
    }

    @Override // ea.f
    public final f C(double d10) {
        r(Double.valueOf(d10));
        return this;
    }

    @Override // ea.f
    public final f I(String str) {
        k71.k.g(str, "value");
        r(str);
        return this;
    }

    @Override // ea.f
    public final f X(boolean z10) {
        r(Boolean.valueOf(z10));
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // ea.f
    public final f e() {
        j jVar = (j) this.f22204t.remove(r0.size() - 1);
        if (!(jVar instanceof i)) {
            throw new IllegalStateException("Check failed.");
        }
        r(((i) jVar).f22200a);
        return this;
    }

    @Override // ea.f
    public final String h() {
        String str;
        ArrayList arrayList = this.f22204t;
        ArrayList arrayList2 = new ArrayList(n.F(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            j jVar = (j) obj;
            if (jVar instanceof h) {
                str = String.valueOf(((h) jVar).f22199a.size());
            } else {
                if (!(jVar instanceof i)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = ((i) jVar).f22201b;
                if (str == null) {
                    str = "?";
                }
            }
            arrayList2.add(str);
        }
        return m.c0(arrayList2, ".", (String) null, (String) null, 0, (j71.c) null, 62);
    }

    @Override // ea.f
    public final f j() {
        this.f22204t.add(new i(new LinkedHashMap()));
        return this;
    }

    @Override // ea.f
    public final f k() {
        j jVar = (j) this.f22204t.remove(r0.size() - 1);
        if (!(jVar instanceof h)) {
            throw new IllegalStateException("Check failed.");
        }
        r(((h) jVar).f22199a);
        return this;
    }

    public final Object m() {
        if (this.f22203s) {
            return this.f22202r;
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // ea.f
    public final f n() {
        this.f22204t.add(new h(new ArrayList()));
        return this;
    }

    public final void r(Object obj) {
        j jVar = (j) m.f0(this.f22204t);
        if (!(jVar instanceof i)) {
            if (jVar instanceof h) {
                ((h) jVar).f22199a.add(obj);
                return;
            } else {
                this.f22202r = obj;
                this.f22203s = true;
                return;
            }
        }
        i iVar = (i) jVar;
        LinkedHashMap linkedHashMap = iVar.f22200a;
        String str = iVar.f22201b;
        if (str == null) {
            throw new IllegalStateException("Check failed.");
        }
        if (linkedHashMap.containsKey(str)) {
            linkedHashMap.put(str, f(linkedHashMap.get(str), obj));
        } else {
            linkedHashMap.put(str, obj);
        }
        iVar.f22201b = null;
    }

    @Override // ea.f
    public final f v0() {
        r(null);
        return this;
    }

    @Override // ea.f
    public final f value() {
        k71.k.g((Object) null, "value");
        r(null);
        return this;
    }

    @Override // ea.f
    public final f y(long j10) {
        r(Long.valueOf(j10));
        return this;
    }

    @Override // ea.f
    public final f y0(c cVar) {
        k71.k.g(cVar, "value");
        r(cVar);
        return this;
    }

    @Override // ea.f
    public final f z(int i) {
        r(Integer.valueOf(i));
        return this;
    }

    @Override // ea.f
    public final f z0(String str) {
        j jVar = (j) m.e0(this.f22204t);
        if (!(jVar instanceof i)) {
            throw new IllegalStateException("Check failed.");
        }
        i iVar = (i) jVar;
        if (iVar.f22201b != null) {
            throw new IllegalStateException("Check failed.");
        }
        iVar.f22201b = str;
        return this;
    }
}
