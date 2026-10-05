package x6;

import android.os.Bundle;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class l0 {
    public static final f0 Companion = new f0();

    /* renamed from: b, reason: collision with root package name */
    public static final e f33856b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f33857c;

    /* renamed from: d, reason: collision with root package name */
    public static final d f33858d;

    /* renamed from: e, reason: collision with root package name */
    public static final d f33859e;

    /* renamed from: f, reason: collision with root package name */
    public static final e f33860f;

    /* renamed from: g, reason: collision with root package name */
    public static final d f33861g;

    /* renamed from: h, reason: collision with root package name */
    public static final d f33862h;
    public static final e i;

    /* renamed from: j, reason: collision with root package name */
    public static final d f33863j;

    /* renamed from: k, reason: collision with root package name */
    public static final d f33864k;
    public static final e l;
    public static final d m;

    /* renamed from: n, reason: collision with root package name */
    public static final d f33865n;

    /* renamed from: o, reason: collision with root package name */
    public static final e f33866o;

    /* renamed from: p, reason: collision with root package name */
    public static final d f33867p;

    /* renamed from: q, reason: collision with root package name */
    public static final d f33868q;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f33869a;

    static {
        boolean z10 = false;
        f33856b = new e(z10, 2);
        int i10 = 4;
        f33857c = new e(z10, i10);
        boolean z11 = true;
        f33858d = new d(z11, i10);
        f33859e = new d(z11, 5);
        f33860f = new e(z10, 3);
        f33861g = new d(z11, 6);
        f33862h = new d(z11, 7);
        i = new e(z10, 1);
        f33863j = new d(z11, 2);
        f33864k = new d(z11, 3);
        int i11 = 0;
        l = new e(z10, i11);
        m = new d(z11, i11);
        f33865n = new d(z11, 1);
        f33866o = new e(z11, 5);
        f33867p = new d(z11, 8);
        f33868q = new d(z11, 9);
    }

    public l0(boolean z10) {
        this.f33869a = z10;
    }

    public abstract Object a(String str, Bundle bundle);

    public abstract String b();

    public Object c(Object obj, String str) {
        return d(str);
    }

    public abstract Object d(String str);

    public abstract void e(Bundle bundle, String str, Object obj);

    public String f(Object obj) {
        return String.valueOf(obj);
    }

    public boolean g(Object obj, Object obj2) {
        return k71.k.b(obj, obj2);
    }

    public final String toString() {
        return b();
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class d<T1,T2,T3,T4> {
        public d() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class e<T1,T2,T3,T4> {
        public e() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class f0<T1,T2,T3,T4> {
        public f0() {
        }
    }
}
