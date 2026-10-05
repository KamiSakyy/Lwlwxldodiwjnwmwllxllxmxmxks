package androidx.compose.runtime;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class i1 implements d, l3.p {

    /* renamed from: r, reason: collision with root package name */
    public int f1675r;

    /* renamed from: s, reason: collision with root package name */
    public int f1676s;

    /* renamed from: t, reason: collision with root package name */
    public Object f1677t;

    public i1(l3.p pVar, int i, int i10) {
        this.f1677t = pVar;
        this.f1675r = i;
        this.f1676s = i10;
    }

    @Override // androidx.compose.runtime.d
    public void a(int i, Object obj) {
        ((d) this.f1677t).a(i + (this.f1676s == 0 ? this.f1675r : 0), obj);
    }

    @Override // androidx.compose.runtime.d
    public void b(Object obj) {
        this.f1676s++;
        ((d) this.f1677t).b(obj);
    }

    @Override // androidx.compose.runtime.d
    public void c() {
        ((d) this.f1677t).c();
    }

    @Override // androidx.compose.runtime.d
    public void d(j71.e eVar, Object obj) {
        ((d) this.f1677t).d(eVar, obj);
    }

    @Override // androidx.compose.runtime.d
    public void e(int i, int i10, int i11) {
        int i12 = this.f1676s == 0 ? this.f1675r : 0;
        ((d) this.f1677t).e(i + i12, i10 + i12, i11);
    }

    @Override // androidx.compose.runtime.d
    public void f(int i, int i10) {
        ((d) this.f1677t).f(i + (this.f1676s == 0 ? this.f1675r : 0), i10);
    }

    @Override // l3.p
    public int g(int i) {
        int g7 = ((l3.p) this.f1677t).g(i);
        if (i >= 0 && i <= this.f1676s) {
            s0.n1.c(g7, this.f1675r, i);
        }
        return g7;
    }

    @Override // androidx.compose.runtime.d
    public void h() {
        if (!(this.f1676s > 0)) {
            v.a("OffsetApplier up called with no corresponding down");
        }
        this.f1676s--;
        ((d) this.f1677t).h();
    }

    @Override // androidx.compose.runtime.d
    public void i(int i, Object obj) {
        ((d) this.f1677t).i(i + (this.f1676s == 0 ? this.f1675r : 0), obj);
    }

    @Override // androidx.compose.runtime.d
    public Object k() {
        return ((d) this.f1677t).k();
    }

    public x9.h l() {
        x9.h hVar = new x9.h();
        hVar.f34005a = this.f1675r;
        hVar.f34006b = this.f1676s;
        hVar.f34007c = (String) this.f1677t;
        return hVar;
    }

    @Override // l3.p
    public int m(int i) {
        int m = ((l3.p) this.f1677t).m(i);
        if (i >= 0 && i <= this.f1675r) {
            s0.n1.b(m, this.f1676s, i);
        }
        return m;
    }

    public synchronized int n() {
        PackageInfo packageInfo;
        if (this.f1675r == 0) {
            try {
                packageInfo = i21.b.a((Context) this.f1677t).f("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e5) {
                "Failed to find package ".concat(e5.toString());
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f1675r = packageInfo.versionCode;
            }
        }
        return this.f1675r;
    }

    public synchronized int o() {
        int i = this.f1676s;
        if (i != 0) {
            return i;
        }
        Context context = (Context) this.f1677t;
        PackageManager packageManager = context.getPackageManager();
        if (i21.b.a(context).f536a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            return 0;
        }
        Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
        intent.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.isEmpty()) {
            this.f1676s = 2;
            return 2;
        }
        this.f1676s = 2;
        return 2;
    }

    public i1(int i, int i10, j71.a aVar) {
        this.f1675r = i;
        this.f1676s = i10;
        this.f1677t = aVar;
    }

    public i1() {
        this.f1677t = new i1[256];
        this.f1675r = 0;
        this.f1676s = 0;
    }
}
