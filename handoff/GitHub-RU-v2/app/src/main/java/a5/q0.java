package a5;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class q0 {

    /* renamed from: r, reason: collision with root package name */
    public int f466r;

    /* renamed from: s, reason: collision with root package name */
    public int f467s;

    /* renamed from: t, reason: collision with root package name */
    public int f468t;

    /* renamed from: u, reason: collision with root package name */
    public Object f469u;

    public q0() {
        if (e50.k.s == null) {
            e50.k.s = new e50.k(1);
        }
    }

    public int a(int i) {
        if (i < this.f468t) {
            return ((ByteBuffer) this.f469u).getShort(this.f467s + i);
        }
        return 0;
    }

    public void b() {
        if (((y61.e) this.f469u).y != this.f468t) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public void e() {
        while (true) {
            int i = this.f466r;
            y61.e eVar = (y61.e) this.f469u;
            if (i >= eVar.w || eVar.t[i] >= 0) {
                return;
            } else {
                this.f466r = i + 1;
            }
        }
    }

    public void f(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f467s) {
            d(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f467s) {
            tag = c(view);
        } else {
            tag = view.getTag(this.f466r);
            if (!((Class) this.f469u).isInstance(tag)) {
                tag = null;
            }
        }
        if (g(tag, obj)) {
            View.AccessibilityDelegate e5 = c1.e(view);
            b bVar = e5 == null ? null : e5 instanceof a ? ((a) e5).f361a : new b(e5);
            if (bVar == null) {
                bVar = new b();
            }
            c1.p(view, bVar);
            view.setTag(this.f466r, obj);
            c1.i(view, this.f468t);
        }
    }

    public abstract boolean g(Object obj, Object obj2);

    public boolean hasNext() {
        return this.f466r < ((y61.e) this.f469u).w;
    }

    public void remove() {
        y61.e eVar = (y61.e) this.f469u;
        b();
        if (this.f467s == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        eVar.c();
        eVar.l(this.f467s);
        this.f467s = -1;
        this.f468t = eVar.y;
    }







}
