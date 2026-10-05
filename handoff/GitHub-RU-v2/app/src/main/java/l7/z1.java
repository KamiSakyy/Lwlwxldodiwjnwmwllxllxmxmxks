package l7;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* loaded from: /home/user/work/p/classes.dex */
public class z1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28378a;

    /* renamed from: b, reason: collision with root package name */
    public int f28379b;

    /* renamed from: c, reason: collision with root package name */
    public int f28380c;

    /* renamed from: d, reason: collision with root package name */
    public int f28381d;

    /* renamed from: e, reason: collision with root package name */
    public int f28382e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f28383f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f28384g;

    public z1(int i) {
        this.f28378a = 1;
        this.f28379b = i;
        if (i <= 0) {
            y.a.c("maxSize <= 0");
            throw null;
        }
        this.f28383f = new aa.u(6);
        this.f28384g = new m90.c(9);
    }

    public void a() {
        View view = (View) no.a.g(1, (ArrayList) this.f28383f);
        v1 v1Var = (v1) view.getLayoutParams();
        this.f28380c = ((StaggeredGridLayoutManager) this.f28384g).f3085r.d(view);
        v1Var.getClass();
    }

    public void b() {
        ((ArrayList) this.f28383f).clear();
        this.f28379b = Integer.MIN_VALUE;
        this.f28380c = Integer.MIN_VALUE;
        this.f28381d = 0;
    }

    public Object c(Object obj) {
        k71.k.g(obj, "key");
        return null;
    }

    public void d(boolean z10, Object obj, Object obj2, Object obj3) {
        k71.k.g(obj, "key");
        k71.k.g(obj2, "oldValue");
    }

    public int e() {
        return ((StaggeredGridLayoutManager) this.f28384g).f3090w ? g(r0.size() - 1, -1) : g(0, ((ArrayList) this.f28383f).size());
    }

    public int f() {
        return ((StaggeredGridLayoutManager) this.f28384g).f3090w ? g(0, ((ArrayList) this.f28383f).size()) : g(r0.size() - 1, -1);
    }

    public int g(int i, int i10) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f28384g;
        int m = staggeredGridLayoutManager.f3085r.m();
        int i11 = staggeredGridLayoutManager.f3085r.i();
        int i12 = i10 > i ? 1 : -1;
        while (i != i10) {
            View view = (View) ((ArrayList) this.f28383f).get(i);
            int g7 = staggeredGridLayoutManager.f3085r.g(view);
            int d10 = staggeredGridLayoutManager.f3085r.d(view);
            boolean z10 = g7 <= i11;
            boolean z11 = d10 >= m;
            if (z10 && z11 && (g7 < m || d10 > i11)) {
                return w0.K(view);
            }
            i += i12;
        }
        return -1;
    }

    public Object h(Object obj) {
        Object put;
        k71.k.g(obj, "key");
        synchronized (((m90.c) this.f28384g)) {
            aa.u uVar = (aa.u) this.f28383f;
            uVar.getClass();
            Object obj2 = uVar.f682a.get(obj);
            if (obj2 != null) {
                this.f28381d++;
                return obj2;
            }
            this.f28382e++;
            Object c10 = c(obj);
            if (c10 == null) {
                return null;
            }
            synchronized (((m90.c) this.f28384g)) {
                aa.u uVar2 = (aa.u) this.f28383f;
                uVar2.getClass();
                put = uVar2.f682a.put(obj, c10);
                if (put != null) {
                    aa.u uVar3 = (aa.u) this.f28383f;
                    uVar3.getClass();
                    uVar3.f682a.put(obj, put);
                } else {
                    this.f28380c += n(obj, c10);
                }
            }
            if (put != null) {
                d(false, obj, c10, put);
                return put;
            }
            p(this.f28379b);
            return c10;
        }
    }

    public int i(int i) {
        int i10 = this.f28380c;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (((ArrayList) this.f28383f).size() == 0) {
            return i;
        }
        a();
        return this.f28380c;
    }

    public View j(int i, int i10) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f28384g;
        ArrayList arrayList = (ArrayList) this.f28383f;
        View view = null;
        if (i10 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f3090w && w0.K(view2) >= i) || ((!staggeredGridLayoutManager.f3090w && w0.K(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i11 = 0;
        while (i11 < size2) {
            View view3 = (View) arrayList.get(i11);
            if ((staggeredGridLayoutManager.f3090w && w0.K(view3) <= i) || ((!staggeredGridLayoutManager.f3090w && w0.K(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i11++;
            view = view3;
        }
        return view;
    }

    public int k(int i) {
        ArrayList arrayList = (ArrayList) this.f28383f;
        int i10 = this.f28379b;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (arrayList.size() == 0) {
            return i;
        }
        View view = (View) arrayList.get(0);
        v1 v1Var = (v1) view.getLayoutParams();
        this.f28379b = ((StaggeredGridLayoutManager) this.f28384g).f3085r.g(view);
        v1Var.getClass();
        return this.f28379b;
    }

    public Object l(Object obj, Object obj2) {
        Object put;
        k71.k.g(obj, "key");
        synchronized (((m90.c) this.f28384g)) {
            this.f28380c += n(obj, obj2);
            aa.u uVar = (aa.u) this.f28383f;
            uVar.getClass();
            put = uVar.f682a.put(obj, obj2);
            if (put != null) {
                this.f28380c -= n(obj, put);
            }
        }
        if (put != null) {
            d(false, obj, put, obj2);
        }
        p(this.f28379b);
        return put;
    }

    public Object m(Object obj) {
        Object remove;
        k71.k.g(obj, "key");
        synchronized (((m90.c) this.f28384g)) {
            aa.u uVar = (aa.u) this.f28383f;
            uVar.getClass();
            remove = uVar.f682a.remove(obj);
            if (remove != null) {
                this.f28380c -= n(obj, remove);
            }
        }
        if (remove != null) {
            d(false, obj, remove, null);
        }
        return remove;
    }

    public int n(Object obj, Object obj2) {
        int o5 = o(obj, obj2);
        if (o5 >= 0) {
            return o5;
        }
        String str = "Negative size: " + obj + '=' + obj2;
        k71.k.g(str, "message");
        throw new IllegalStateException(str);
    }

    public int o(Object obj, Object obj2) {
        k71.k.g(obj, "key");
        k71.k.g(obj2, "value");
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x007a, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void p(int i) {
        Object key;
        Object value;
        while (true) {
            synchronized (((m90.c) this.f28384g)) {
                try {
                    if (this.f28380c < 0 || (((aa.u) this.f28383f).f682a.isEmpty() && this.f28380c != 0)) {
                        break;
                    }
                    if (this.f28380c <= i || ((aa.u) this.f28383f).f682a.isEmpty()) {
                        break;
                    }
                    Set entrySet = ((aa.u) this.f28383f).f682a.entrySet();
                    k71.k.f(entrySet, "<get-entries>(...)");
                    Map.Entry entry = (Map.Entry) x61.m.V(entrySet);
                    if (entry == null) {
                        return;
                    }
                    key = entry.getKey();
                    value = entry.getValue();
                    aa.u uVar = (aa.u) this.f28383f;
                    uVar.getClass();
                    k71.k.g(key, "key");
                    uVar.f682a.remove(key);
                    this.f28380c -= n(key, value);
                } catch (Throwable th) {
                    throw th;
                }
            }
            d(true, key, value, null);
        }
    }

    public String toString() {
        String str;
        switch (this.f28378a) {
            case 1:
                synchronized (((m90.c) this.f28384g)) {
                    try {
                        int i = this.f28381d;
                        int i10 = this.f28382e + i;
                        str = "LruCache[maxSize=" + this.f28379b + ",hits=" + this.f28381d + ",misses=" + this.f28382e + ",hitRate=" + (i10 != 0 ? (i * 100) / i10 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public z1(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f28378a = 0;
        this.f28384g = staggeredGridLayoutManager;
        this.f28383f = new ArrayList();
        this.f28379b = Integer.MIN_VALUE;
        this.f28380c = Integer.MIN_VALUE;
        this.f28381d = 0;
        this.f28382e = i;
    }







}
