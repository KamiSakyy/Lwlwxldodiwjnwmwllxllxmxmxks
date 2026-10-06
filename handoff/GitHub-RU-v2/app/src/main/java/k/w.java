package k;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import x.q0;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public Object f27535a;

    /* renamed from: b, reason: collision with root package name */
    public Object f27536b;

    public w(Context context) {
        this.f27535a = context;
    }

    public void j() {
        b9.d dVar = (b9.d) this.f27535a;
        if (dVar != null) {
            try {
                ((z) this.f27536b).B.unregisterReceiver(dVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f27535a = null;
        }
    }

    public abstract IntentFilter l();

    public abstract int[] m(int i);

    public abstract int n();

    public MenuItem o(MenuItem menuItem) {
        if (!(menuItem instanceof u4.a)) {
            return menuItem;
        }
        u4.a aVar = (u4.a) menuItem;
        if (((q0) this.f27536b) == null) {
            this.f27536b = new q0(0);
        }
        MenuItem menuItem2 = (MenuItem) ((q0) this.f27536b).get(aVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        p.s sVar = new p.s((Context) this.f27535a, aVar);
        ((q0) this.f27536b).put(aVar, sVar);
        return sVar;
    }

    public int[] p(int i, int i10) {
        if (i < 0 || i10 < 0 || i == i10) {
            return null;
        }
        int[] iArr = (int[]) this.f27536b;
        iArr[0] = i;
        iArr[1] = i10;
        return iArr;
    }

    public String q() {
        String str = (String) this.f27535a;
        if (str != null) {
            return str;
        }
        k71.k.m("text");
        throw null;
    }

    public abstract void r();

    public abstract int[] s(int i);

    public void t() {
        j();
        IntentFilter l = l();
        if (l.countActions() == 0) {
            return;
        }
        if (((b9.d) this.f27535a) == null) {
            this.f27535a = new b9.d(3, this);
        }
        ((z) this.f27536b).B.registerReceiver((b9.d) this.f27535a, l);
    }

    public w() {
        this.f27536b = new int[2];
    }

    public w(String str, String str2) {
        this.f27535a = str;
        this.f27536b = str2;
    }

    public w(z zVar) {
        this.f27536b = zVar;
    }
    public w(String p1, String p2) {
    }
}
