package x;

import androidx.datastore.preferences.protobuf.y0;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: /home/user/work/p/classes.dex */
public final class e extends q0 implements Map {

    /* renamed from: u, reason: collision with root package name */
    public y0 f33543u;

    /* renamed from: v, reason: collision with root package name */
    public b f33544v;

    /* renamed from: w, reason: collision with root package name */
    public d f33545w;

    public e() {
        super(0);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        y0 y0Var = this.f33543u;
        if (y0Var != null) {
            return y0Var;
        }
        y0 y0Var2 = new y0(2, this);
        this.f33543u = y0Var2;
        return y0Var2;
    }

    public final boolean j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i = this.f33610t;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.f33610t;
    }

    @Override // java.util.Map
    public final Set keySet() {
        b bVar = this.f33544v;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.f33544v = bVar2;
        return bVar2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f33610t);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        d dVar = this.f33545w;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(this);
        this.f33545w = dVar2;
        return dVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(q0 q0Var) {
        super(0);
        int i = q0Var.f33610t;
        b(this.f33610t + i);
        if (this.f33610t != 0) {
            for (int i10 = 0; i10 < i; i10++) {
                put(q0Var.f(i10), q0Var.i(i10));
            }
        } else if (i > 0) {
            x61.l.w(0, 0, i, q0Var.f33608r, this.f33608r);
            x61.l.x(0, 0, i << 1, q0Var.f33609s, this.f33609s);
            this.f33610t = i;
        }
    }

    public static  get(Object... a) {
        return null;
    }

    public static  put(Object... a) {
        return null;
    }

    public static  values(Object... a) {
        return null;
    }

    public static  clear(Object... a) {
        return null;
    }

    public static  remove(Object... a) {
        return null;
    }

    public static  isEmpty(Object... a) {
        return null;
    }

    public static  containsKey(Object... a) {
        return null;
    }

    public static  keySet(Object... a) {
        return null;
    }
}
