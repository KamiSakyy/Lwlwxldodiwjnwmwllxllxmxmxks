package l7;

import android.graphics.Rect;
import android.view.View;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class h0 {

    /* renamed from: a, reason: collision with root package name */
    public int f28139a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f28140b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f28141c;

    public h0(String str, int i, String str2) {
        this.f28139a = i;
        this.f28140b = str;
        this.f28141c = str2;
    }

    public static h0 b(w0 w0Var, int i) {
        if (i == 0) {
            return new g0(w0Var, 0);
        }
        if (i == 1) {
            return new g0(w0Var, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract void a(v7.a aVar);

    public abstract void c(v7.a aVar);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o(View view);

    public abstract int p(View view);

    public abstract void q(int i);

    public abstract void r(v7.a aVar);

    public abstract void s(v7.a aVar);

    public abstract void t(v7.a aVar);

    public abstract void u(v7.a aVar);

    public abstract c21.h0 v(v7.a aVar);

    public h0(w0 w0Var) {
        this.f28139a = Integer.MIN_VALUE;
        this.f28141c = new Rect();
        this.f28140b = w0Var;
    }

    public h0(u5.h hVar) {
        this.f28139a = 0;
        this.f28141c = new u5.c();
        this.f28140b = hVar;
    }


    public static  n(Object... a) {
        return null;
    }

    public static  d(Object... a) {
        return null;
    }

    public static  g(Object... a) {
        return null;
    }

    public static  m(Object... a) {
        return null;
    }
}
